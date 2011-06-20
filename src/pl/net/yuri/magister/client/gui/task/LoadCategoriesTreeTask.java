package pl.net.yuri.magister.client.gui.task;

import pl.net.yuri.magister.soap.AllegroWebApiPortType;
import pl.net.yuri.magister.soap.CatInfoType;
import pl.net.yuri.magister.soap.holders.ArrayOfCatsHolder;
import pl.net.yuri.magister.soap.util.ServiceHolder;
import pl.net.yuri.magister.soap.util.Util;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.xml.rpc.holders.IntHolder;
import javax.xml.rpc.holders.LongHolder;
import javax.xml.rpc.holders.StringHolder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Class for loading categories. It downloads categories information, each time downloading 100 categories.
 * After downloading, it creates TreeModel, which can be used to build categories tree view in GUI.
 * This class extends SwingWorker. This way it can be invoked in background and allows for attaching property change
 * listeners. This way GUI can track whether task progress is updated or task state has changed.
 *
 * @author Jerzy Czopek
 * @version 1.0
 */
public class LoadCategoriesTreeTask extends SwingWorker<TreeModel, Void> {

    @Override
    protected TreeModel doInBackground() throws Exception {
        TreeModel model;
        AllegroWebApiPortType port = ServiceHolder.getInstance();

        StringHolder versionString = new StringHolder();
        LongHolder versionKey = new LongHolder();
        IntHolder categoriesCountHolder = new IntHolder();

        ArrayList<CatInfoType> categories;
        port.doGetCatsDataCount(Util.getCountryCode(), 0, Util.getWebApiKey(), categoriesCountHolder, versionKey, versionString);

        int portionSize = 500;
        int categoriesCount = categoriesCountHolder.value;

        categories = new ArrayList<CatInfoType>(categoriesCount);
        int elementCounter = 0;
        int offset = 0;
        setProgress(0);
        /*
       Download categories, each time updating progress
        */
        while (elementCounter < categoriesCount) {
            ArrayOfCatsHolder categoriesHolder = new ArrayOfCatsHolder();
            port.doGetCatsDataLimit(Util.getCountryCode(), 0, Util.getWebApiKey(), offset, portionSize,
                    categoriesHolder, versionKey, versionString);

            categories.addAll(Arrays.asList(categoriesHolder.value));

            elementCounter += categoriesHolder.value.length;
            offset++;
            int progress = (int) (100 * ((double) elementCounter / (double) categoriesCount));
            setProgress(progress);
        }

        HashMap<Integer, DefaultMutableTreeNode> childrenMap = new HashMap<Integer, DefaultMutableTreeNode>();
        childrenMap.put(0, new DefaultMutableTreeNode(new CategoryInfoTypeHolder(new CatInfoType(0, "Kategorie", -1, 0))));
        for (CatInfoType cat : categories) {
            CategoryInfoTypeHolder holder = new CategoryInfoTypeHolder(cat);
            DefaultMutableTreeNode node = new DefaultMutableTreeNode(holder);
            childrenMap.put(holder.getCategoryId(), node);
        }

        for (CatInfoType cat : categories) {
            DefaultMutableTreeNode parent = childrenMap.get(cat.getCatParent());
            DefaultMutableTreeNode child = childrenMap.get(cat.getCatId());
            parent.insert(child, cat.getCatPosition());
        }

        model = new DefaultTreeModel(childrenMap.get(0));
        setProgress(100);

        return model;
    }
}


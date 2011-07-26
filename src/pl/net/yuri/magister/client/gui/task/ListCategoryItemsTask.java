package pl.net.yuri.magister.client.gui.task;


import pl.net.yuri.magister.soap.AllegroWebApiPortType;
import pl.net.yuri.magister.soap.SearchResponseType;
import pl.net.yuri.magister.soap.holders.ArrayOfCatInfoStructHolder;
import pl.net.yuri.magister.soap.holders.ArrayOfSearchResponseHolder;
import pl.net.yuri.magister.soap.util.ServiceHolder;
import pl.net.yuri.magister.soap.util.Util;

import javax.swing.*;
import javax.xml.rpc.holders.IntHolder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListCategoryItemsTask extends SwingWorker<List<SearchResponseType>, Void> {

    private int categoryId;

    public ListCategoryItemsTask(int categoryId) {

        this.categoryId = categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    protected List<SearchResponseType> doInBackground() throws Exception {
        ArrayList<SearchResponseType> resultList = null;

        AllegroWebApiPortType port = ServiceHolder.getInstance();

        ArrayOfSearchResponseHolder items = new ArrayOfSearchResponseHolder();

        port.doShowCat(Util.getSessionHolder().value, categoryId, -1, -1, null, null, 1, null, 0,
                50, 0, new ArrayOfCatInfoStructHolder(), new ArrayOfCatInfoStructHolder(), new ArrayOfCatInfoStructHolder(),
                new IntHolder(), new IntHolder(), items);

        resultList = new ArrayList<SearchResponseType>();

        resultList.addAll(Arrays.asList(items.value));
        //resultList.trimToSize();

        return resultList;  //To change body of implemented methods use File | Settings | File Templates.
    }
}

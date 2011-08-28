package pl.net.yuri.magister.client.gui.task;

import pl.net.yuri.magister.soap.CatInfoType;

/**
 * Wrapper class for {@code CatInfoType} preventing from unauthorized changes in category info type objects.
 * This class creates new CatInfoType from passed parameters or copies given {@code CatInfoType} object.
 * It also provides same set of get methods as {@code CatInfoType}, with more readable names.
 */
public class CategoryInfoTypeHolder {
    private final CatInfoType value;

    CategoryInfoTypeHolder(CatInfoType value) {
        this(value.getCatId(), value.getCatName(), value.getCatParent(), value.getCatPosition());
    }

    CategoryInfoTypeHolder(int catId, String catName, int catParent, int catPosition) {
        this.value = new CatInfoType(catId, catName, catParent, catPosition);
    }

    public String getCategoryName() {
        return value.getCatName();
    }

    public int getCategoryId() {
        return value.getCatId();
    }

    public int getCategoryParent() {
        return value.getCatParent();
    }

    public int getCategoryPosition() {
        return value.getCatPosition();
    }

    @Override
    public String toString() {
        return value.getCatName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CategoryInfoTypeHolder)) return false;

        CategoryInfoTypeHolder holder = (CategoryInfoTypeHolder) o;

        if (!value.equals(holder.value)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + value.hashCode();
        return hash;
    }
}

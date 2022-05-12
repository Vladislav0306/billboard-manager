public class BillboardManager {
    private int findLast;
    private Billboard[] items = new Billboard[0];

    public BillboardManager(int findLast) {
        this.findLast = findLast;
    }

    public BillboardManager() {
        this.findLast = 10;
    }

    public void save(Billboard item) {
        int length = items.length + 1;
        Billboard[] tmp = new Billboard[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public Billboard[] findAll() {
        return items;
    }

    public Billboard findById(int id) {
        for (Billboard billboard : items) {
            if (billboard.getId() == id) {
                return billboard;
            }
        }
        return null;
    }

    public Billboard[] removeById(int id) {
        int length = items.length - 1;
        Billboard[] tmp = new Billboard[length];
        int index = 0;
        for (Billboard item : items) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }
        }
        return tmp;
    }

    public Billboard[] removeAll() {
        return new Billboard[0];
    }

    public Billboard[] findLast() {
        Billboard[] draftResult = new Billboard[findLast];
        int counter = 0;
        for (int i = 0; i < findLast; i++) {
            int index = items.length - i - 1;
            if (items[index] != null) {
                draftResult[counter] = items[index];
                counter += 1;
            }
        }
        Billboard[] result = new Billboard[counter];
        System.arraycopy(draftResult, 0, result, 0, counter);
        return result;
    }

    public Billboard[] getLastAdd() {
        int billboardLength = items.length;
        if (billboardLength < findLast) {
            findLast = billboardLength;
        }
        Billboard[] customFilm = new Billboard[findLast];
        for (int i = 0; i < customFilm.length; i++) {
            int result = findLast - i - 1;
            customFilm[i] = items[result];
        }
        return customFilm;
    }

}

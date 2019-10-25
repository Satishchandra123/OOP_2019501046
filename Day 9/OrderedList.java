public class OrderedList extends AbstractList {
    
    public void add(int item) {
        list[size++] = item;
        if (size == list.length) {
            list = resize(list); //try just resize(list)
        }
        int temp;
        for (int i = 0; i < size - 1; i++) {
            if (list[i] > list[i + 1]) {
                temp = list[i];
                list[i] = list[i + 1];
                list[i + 1] = temp;
            }
        }
    }
}
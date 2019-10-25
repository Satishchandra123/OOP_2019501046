/**
 * 
 */

public class List extends AbstractList {
    public List() {
        super();
    }
    public List(int capacity) {
        super(capacity);
    }
    public void add(int item) {
        if (size == list.length) {
            resize(); 
        }
        list[size++] = item;
        
    }

    // inserting an element at given index
    public void add(int index, int item) {
        // TODO
        // Your code goes here.
        if (index < size && index >= 0) {
            if (size == list.length) {
                resize();
            }
            size++;
            for (int i = size - 1; i > index; i--) {
                list[i] = list[i - 1];
            }
            list[index] = item;
        }
        
    }

    /**
     * This method adds all the items of the arr to this list.
     * @param arr is an array of items that should be added to 
     * this list.
     */
    public void addAll(int[] arr ){
        // TODO
        // Your code goes here.
        for (int i = 0; i < arr.length; i++) {
            add(arr[i]);
        }
    }

    /**
     * Appends all of the elements in the specified list to the end of this list, or
     * it will be added in order if the list is OrderedList, in the order that
     * they are returned by the specified list's Iterator.
     * 
     * @param lst list containing elements to be added to this list.
     */
    public void addAll(List lst) {
        // TODO
        // Your code goes here.
        for (int i = 0; i < lst.size; i++) {
            add(lst.list[i]);
        }
    }

}
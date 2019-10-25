/**
 * 
 */

public class OrderedList extends AbstractList {
    /*
     * The add method does what the name suggests.
     * Add an int item to the list.
     * The assumption is to store the item at the end of the list
     * What is the end of the list?
     * Is it the same as the end of the array?
     * Think about how you can use the size variable to add item
     * to the list.
     * 
     * The method returns void (nothing)
     */
    public void add(int item) {
        //Inserts the specified element at the end of the list.
        // TODO
        // Your code goes here....
            list[size++] = item;
            if (size == list.length) {
                resize(); 
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

    public int rank(int item) {
        int lo = 0, hi = size-1; 
        while (lo <= hi) { 
            int mid = lo + (hi - lo) / 2;
            if      (item < list[hi]) hi = mid - 1; 
            else if (item > list[lo]) lo = mid + 1; 
            else return mid; 
        } 
        return lo;
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
}
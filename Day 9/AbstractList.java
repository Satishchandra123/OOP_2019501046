import java.util.Arrays;

public abstract class AbstractList implements ListInterface{
    int[] list;
    int size;

    AbstractList() {
        list = new int[10];
        size = 0;
    }
    
    /**
     * This method returns the number of elements in this list.
     * if list is empty, then it returns 0 by default.
     * @return the number of elements in this list.
     */
     public int size(){
        return size;
    }

    /**
     * Returns an item at a particular index from this list.
     */
    public int get(int index){
        if (index < size && index >= 0) {
        return list[index]; // to be visited again
        }
        return -1;
    }

    /**
     * This method returns the index of an item. If the item is not
     * present in the list, then return -1.
     * @param item to be used to find the index.
     * @return the index of the element if present, -1 otherwise.
     */
    public int indexOf(int item){
        for (int i = 0; i < size; i++) {
            if (list[i] == item) { // to be visited again
                return i;
            }
        }
        return -1;
    }

    /**
     * This method returns true if the item is present in this list.
     * If the item is not present, then return false.
     * @param item to be used to find whether it is present in this
     * list.
     * @return true if item is present in this list and false otherwise.
     */
    public boolean contains(int item) {
        for (int i = 0; i < size; i++) {
            if (list[i] == item) {
                return true;
            }
        }
        return false;
    }

    /**
     * This method will remove the element at a particular index.
     * Think of once you remove the element, there will be a empty
     * space.
     *
     * Now move all the items to the left by one position.
     *
     * Please see the comemnts in Assignment - 2 for more details
     * in Polymorphism and Abstract Data Type.
     *
     * @param item to be removed from a particular index in this list.
     */
    public void remove(int index) {
        if(index < size) {
        for (int i = index; i < size - 1; i++) {
            list[i] = list[i + 1];
        }
        list[size - 1] = 0;
        size--;
      }
    }

    /**
     * This method will store the elements of the array in a list format.
     * @return string in a list format [1,2,3]
     */
    public String toString() {
        String s = "[";
        for (int i = 0; i < size - 1; i++) {
            s += list[i] + ",";
        }
        s += list[size - 1] + "]";
        return s;
    }

    /**
     * This method resizes the array by 2 times.
     * @param arr the array that needs to be resized.
     */
    public int[] resize(int[] arr) {
        return Arrays.copyOf(arr, 2*size); // try void method
    }
}
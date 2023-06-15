package Algoritmy_and_Structury_dannyh;

public class Binary_Search {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[] {1,2,3,5,5,7,54}, 3));
    }
    public static int binarySearch(int[] a, int key) {
        int low = 0;
        int high = a.length - 1;

        while(low <= high) {
            int middle = low + (high - low) / 2;

            if(key < a[middle]) {
                high = middle - 1;
            } else if (key > a[middle]) {

                    low = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}

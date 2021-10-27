import java.util.*;

public class BinarySearch {
    public static void binarySearch(int search, int array[]) {
        int first = 0;
        int last = array.length - 1;
        if (first <= last) {
            int middle = (first + last) / 2;
            if (search > middle) {
                first = middle + 1;
            } else if (search < middle) {
                last = middle - 1;
            } else {
                System.out.println("Element " + search + " exist in index " + middle);
            }
        } else {
            System.out.println("Element does not exist in array");
        }
    }

    public static void main(String[] args) // main method
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n = in.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the Element of the Array");
        for (int i = 0; i < array.length; i++)
            array[i] = in.nextInt();

        System.out.println("Input your search key");
        Scanner a = new Scanner(System.in);

        int search = a.nextInt();
        binarySearch(search, array);

    }
}

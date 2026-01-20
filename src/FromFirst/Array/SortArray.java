import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, -1, 0, 77, 30};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        
        Integer[] arr2 = {2, 4, 1, -1, 0, 77, 30};
        Arrays.sort(arr2, Comparator.reverseOrder());
        System.out.println(Arrays.toString(arr2));
    }
}

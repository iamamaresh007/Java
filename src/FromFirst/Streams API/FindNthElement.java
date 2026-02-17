import java.util.Arrays;
import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1, 5, 3, 6};
        int position = 3;
        
        int nthElement = Arrays.stream(arr).skip(position - 1).findFirst().orElse(-1);
        
        System.out.println(nthElement);
    }
}

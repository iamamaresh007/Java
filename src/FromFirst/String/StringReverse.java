class Main {
    public static void main(String[] args) {
        String str = "abp";
        char[] arr = str.toCharArray();
        int i = 0, j = arr.length-1;
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(arr);
    }
}

// System.out.println(new StringBuilder(str).reverse().toString());

/*public class StringPrograms {

 public static void main(String[] args) {
  String str = "123";

  System.out.println(reverse(str));
 }

 public static String reverse(String in) {
  if (in == null)
   throw new IllegalArgumentException("Null is not valid input");

  StringBuilder out = new StringBuilder();

  char[] chars = in.toCharArray();

  for (int i = chars.length - 1; i >= 0; i--)
   out.append(chars[i]);

  return out.toString();
 }

} */

import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        String input ="Success";
        
        Map<Character, Long> res = input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        /*Step-by-step explanation
        i) input.chars()
           Produces an IntStream of the UTF-16 code units from the string "success".
           For "success", this yields the sequence of code points for: s, u, c, c, e, s, s.

        ii) .mapToObj(c -> (char) c)
            Converts each int code unit into a Character object by casting to char, resulting in a Stream<Character>.

        iii) .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
              Groups the characters by their value (i.e., groups all the same characters together).
              For each group, Collectors.counting() counts how many times that character appears.
              Returns a Map<Character, Long> where the key is the character and the value is the count.

        iv)  System.out.println(frequency) - Prints the resulting frequency map.*/
        
        System.out.println("Frequency of each characters are ---> " + res);
    }
}

import java.util.*;

class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Stream", "API", "is", "powerfull");
        
        String result = words.stream().reduce("", (s1, s2) -> s1 + " " + s2).trim();
        /*How it works
        i) words.stream()
        Creates a stream over the list: "Stream", "API", "is", "powerful".
        
        ii) reduce("", (s1, s2) -> s1 + " " + s2)
        Uses the 2-arg reduce(identity, accumulator):

        Identity: "" (empty string). This is the starting value.
        Accumulator: (s1, s2) -> s1 + " " + s2 combines the running result (s1) with the next word (s2), inserting a space.

        The combination proceeds like this:
        Start with s1 = ""
        Combine with "Stream" → "" + " " + "Stream" = " Stream"
        Combine with "API" → " Stream" + " " + "API" = " Stream API"
        Combine with "is" → " Stream API is"
        Combine with "powerful" → " Stream API is powerful"

        Notice the leading space introduced by the empty identity.

        iii) .trim() - Removes the unwanted leading space (and any trailing spaces), producing the exact string:*/
        
        System.out.println("Final string is ~~~> " + result);
        
    }
}

class Main {
    public static void main(String[] args) {
        String str = "Hello Amaresh";
        System.out.println(str.replace(" ", ""));
        System.out.println(str.replaceAll("\\s", "")); 
        //using replaceAll("\\s", "") because it removes all types of whitespace such as spaces, tabs, and newlines.
        //“replace() is faster than replaceAll() because it doesn’t use regex.”
    }
}

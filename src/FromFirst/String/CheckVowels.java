class Main {
    public static void main(String[] args) {
    String str = "abcde";
    System.out.println("Result is " + checkVowel(str));
    }
     public static boolean checkVowel(String string) {
       return string.toLowerCase().matches(".*[aeiou].*");
    }
}

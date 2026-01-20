class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        String input = "abp";
        System.out.println(checkPalindromeString(input));
    }
    
    public static boolean checkPalindromeString(String str) {
        boolean result = true;
        int length = str.length();
        char[] arr = str.toCharArray();
        for(int i = 0; i < length / 2; i++) {
            if(arr[i] != arr[length - i - 1]) {  // if(str.charAt(i) != str.charAt(length - i - 1))
                result = false;
            }
        }
        return result;
    }
}

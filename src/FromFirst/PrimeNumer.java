class Main {
    public static void main(String[] args) {
        int num1 = 71;
        System.out.println(isPrimeNumer(num1));
    }
    
    public static boolean isPrimeNumer(int num) {
        if(num == 0 || num == 1) {
            return false;
        }
        if(num == 2) {
            return true;
        }
        
        for(int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        return true;
    }
}

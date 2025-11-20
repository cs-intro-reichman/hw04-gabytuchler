public class Primes {
    public static void main(String[] args) {
        printPrimesUpTo(30); 
    }

    public static void printPrimesUpTo(int n) {
        if (n < 2) {
            System.out.println("אין מספרים ראשוניים.");
            return;
        }                
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); 
    }
    
    public static boolean isPrime(int number) {
        for (int j = 2; j * j <= number; j++) {
                        if (number % j == 0) {
                return false; 
            }
        }
        return true; 
    }

    
}


        
    

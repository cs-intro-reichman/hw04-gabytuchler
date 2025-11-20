public class Primes {
    public static void main(String[] args) {
    if (args.length == 0) {
        return; 
    }
    int n = Integer.parseInt(args[0]); 
    printPrimesUpTo(n); 
}

    public static void printPrimesUpTo(int n) {
        if (n < 2) {
            System.out.println("אין מספרים ראשוניים.");
            return;
        }

        System.out.println("Prime numbers up to " + n + ":");
        int primeCount = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                primeCount++;
            }
        }
         double percentage = ((double)primeCount / n) * 100.0;
        
        int roundedPercentage = (int)Math.round(percentage);

        System.out.println("There are " + primeCount + " primes between 2 and " + n + 
                           " (" + roundedPercentage + "% are primes)");
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


        
    

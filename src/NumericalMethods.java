public class NumericalMethods {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void isPolindrom(int number){
        int reversedNumber = 0, remainder, originalNumber;
        originalNumber = number;

        // Tersini tapaq
        while (number != 0) {
            remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }

        // Polindrom kontrol
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " pol-dir");
        } else {
            System.out.println(originalNumber + " pol-deyil");
        }
    }
    }
}

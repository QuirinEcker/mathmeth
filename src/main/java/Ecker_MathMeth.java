import java.util.Scanner;

public class Ecker_MathMeth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value1;
        int value2;

        System.out.print("Geben Sie Wert 1 ein:");
        value1 = scanner.nextInt();

        System.out.print("Geben Sie Wert 2 ein:");
        value2 = scanner.nextInt();

        System.out.printf("%d + %d = %d \n", value1, value2, add(value1, value2));
        System.out.printf("%d - %d = %d \n", value1, value2, sub(value1, value2));
        System.out.printf("%d / %d = %d \n", value1, value2, div(value1, value2));
        System.out.printf("%d * %d = %d \n", value1, value2, mult(value1, value2));

        System.out.println();
        System.out.print("Geben Sie eine mehrstellige Zahl ein:");
        value1 = scanner.nextInt();

        System.out.printf("Ziffernsumme von %d ist %d \n", value1, digitSum(value1));
        //System.out.printf("Die Binär Zahl von %d ist %d \n", value1, bin(value1));
        System.out.printf("Der wert %d ist umgedreht %d \n", value1 , exchangeNumbers(value1));
        System.out.printf("Die Fakultaet von %d ist %d \n", value1, fakulaet(value1));

        System.out.println(dec(value1));

    }

    public static int add(int value1, int value2) {
        int equal;

        equal = value1 + value2;
        return equal;
    }

    public static int sub(int value1, int value2) {
        int equal;

        equal = value1 - value2;
        return equal;
    }

    public static int mult(int value1, int value2) {
        int equal;

        equal = value1 * value2;
        return equal;
    }

    public static int div(int value1, int value2) {
        int equal;

        equal = value1 / value2;
        return equal;
    }

    public static int hoch(int value1, int value2) {
        int equal;

        equal = (int) Math.pow(value1, value2);
        return equal;
    }

    public static int digitSum(int value1) {
        int equal = 0;

        while (value1 > 0) {
            equal += value1 % 10;
            value1 /= 10;
        }
        return equal;
    }

    public static int exchangeNumbers(int value1) {

        int calculatingNumber;
        int digitCount = 0;
        int equal = 0;
        int digit;
        int pow = 1;

        calculatingNumber = value1;

        while (calculatingNumber > 0) {
            pow = (int) (Math.pow(10, digitCount));

            digitCount++;
            calculatingNumber /= 10;
        }

        calculatingNumber = value1;

        for (int i = digitCount; i > 0; i--) {
            digit = calculatingNumber % 10;
            calculatingNumber /= 10;

            equal += digit * pow;
            pow /= 10;
        }

        return equal;
    }

    public static int fakulaet(int value1) {
        int equal;
        int multiplyer = 0;

        equal = value1;

        for (int i = value1; i > 1; i--){
            multiplyer = (i-1);
            equal = equal * multiplyer;

        }
        return equal;
    }

    public static int bin(int value1) {

        int decimal;
        int res = 0;
        int zweierPotenz = 1;

        do {
            if (value1 > 0){
                decimal = value1;
                zweierPotenz = 1;
                do {
                    res = decimal / zweierPotenz;
                    if (res > 1) {
                        zweierPotenz = zweierPotenz * 2;
                    }
                } while (res > 1);

                while (zweierPotenz >= 1){
                    res = decimal / zweierPotenz;
                    decimal = decimal % zweierPotenz;
                    zweierPotenz /= 2;
                }
            }
            value1--;
        } while (value1 != 0);
        return res;
    }

    public  static int dec(int value1) {
        int currentDigit = 0;
        int currentPot = 1;
        int decNumber = 0;

        while(value1 > 0){
            currentDigit = value1 % 10;

            if (currentDigit > 0) {
                decNumber += currentPot;
            }
            currentPot = currentPot * 2;
            value1 /= 10;
        }
        return decNumber;
    }
}
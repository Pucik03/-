import java.security.PublicKey;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число");

        int number = scanner.nextInt();

        if (number < 1 || number > 3999) {
            System.out.print("Число должно быть от 1 до 3999");
        } else {
            String romanNumber = toRoman(number);
            System.out.println("Римское число: " + romanNumber);
        }

    }
    public static String toRoman(int number) {
        StringBuilder result = new StringBuilder();

        int thousands = number / 1000;
        result.append(convertThousands(thousands));

        int hundreds = (number % 1000) / 100;
        result.append(convertHundreds(hundreds));

        int tens = (number % 100) / 10;
        result.append(convertTens(tens));

        int ones = number % 10;
        result.append(convertOnes(ones));

        return result.toString();
    }

    private static String convertThousands(int digit) {
        return switch (digit) {
            case 1 -> "M";
            case 2 -> "MM";
            case 3 -> "MMM";
            default -> "";
        };
    }

    private static String convertHundreds(int digit) {
        return switch (digit) {
            case 1 -> "C";
            case 2 -> "CC";
            case 3 -> "CCC";
            case 4 -> "CD";
            case 5 -> "D";
            case 6 -> "DC";
            case 7 -> "DCC";
            case 8 -> "DCCC";
            case 9 -> "CM";
            default -> "";
        };
    }

    private static String convertTens(int digit) {
        return switch (digit) {
            case 1 -> "X";
            case 2 -> "XX";
            case 3 -> "XXX";
            case 4 -> "XL";
            case 5 -> "L";
            case 6 -> "LX";
            case 7 -> "LXX";
            case 8 -> "LXXX";
            case 9 -> "XC";
            default -> "";
        };
    }

    private static String convertOnes(int digit) {
        return switch (digit) {
            case 1 -> "I";
            case 2 -> "II";
            case 3 -> "III";
            case 4 -> "IV";
            case 5 -> "V";
            case 6 -> "VI";
            case 7 -> "VII";
            case 8 -> "VIII";
            case 9 -> "IX";
            default -> "";

        };
    }   }

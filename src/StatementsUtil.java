import java.util.Scanner;

public class StatementsUtil {

    /**
     * 1. Checks whether the given integer is even or odd.
     *
     * @param x the integer to check
     * @return {@code true} if x is even, {@code false} if x is odd
     */
    public static boolean isEven(int x) {
        return x % 2 == 0;
    }

    /**
     * 2. Checks whether the given integer is positive or negative.
     * Zero is neither positive nor negative.
     *
     * @param x the integer to check
     * @return "positive", "negative" or "zero"
     */
    public static String checkSign(int x) {
        if (x > 0) {
            return "positive";
        } else if (x < 0) {
            return "negative";
        }
        return "zero";
    }

    /**
     * 3. Checks whether x is in (5, 8) or in (15, 20), both bounds exclusive.
     *
     * @param x the integer to check
     * @return {@code true} if (x > 5 and x < 8) or (x > 15 and x < 20)
     */
    public static boolean isInRanges(int x) {
        return (x > 5 && x < 8) || (x > 15 && x < 20);
    }

    /**
     * 4. Checks whether x is divisible by both 5 and 7 without a remainder.
     *
     * @param x the integer to check
     * @return {@code true} if x is divisible by 5 and by 7
     */
    public static boolean isDivisibleBy5And7(int x) {
        return x % 5 == 0 && x % 7 == 0;
    }

    /**
     * 5. Checks whether the second digit of a three-digit number is 7.
     * Example: 974 -> true, 846 -> false.
     *
     * @param x a three-digit integer
     * @return {@code true} if the second digit is 7
     */
    public static boolean isSecondDigitSeven(int x) {
        int y = x / 10;
        y %= 10;
        return y == 7;
    }

    /**
     * 6. Checks whether the point (x, y) lies inside the circle with
     * center K(0, 5). The radius is not given in the task, so it is
     * passed as a parameter. A point on the circle is considered inside.
     *
     * @param x      the x coordinate of the point
     * @param y      the y coordinate of the point
     * @return {@code true} if the point is inside (or on) the circle
     */
    public static boolean isInsideCircle(double x, double y) {
        return x * x + (y - 5) * (y - 5) <= 25.0;
    }

    /**
     * 7. Finds the largest of three numbers.
     *
     * @param a the first number
     * @param b the second number
     * @param c the third number
     * @return the largest of a, b and c
     */
    public static int max3(int a, int b, int c) {

        return Math.max(a, Math.max(b, c));
    }

    /**
     * 8. Checks whether the given year is a leap year.
     * A year is leap if divisible by 4, except years divisible by 100,
     * which are leap only if also divisible by 400.
     *
     * @param year the year to check
     * @return {@code true} if the year is a leap year
     */
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    /**
     * 11. Prints the numbers from 1 to 200 to the console.
     */
    public static void print1To200() {
        for (int i = 1; i <= 200; i++) {
            System.out.println(i);
        }
    }

    /**
     * 12. Prints the first digit of the given number.
     *
     * @param x the number whose first digit is printed
     */
    public static void printFirstDigit(int x) {
        x = Math.abs(x);
        while (x >= 10) {
            x /= 10;
        }
        System.out.println(x);
    }

    /**
     * 13. Given int x = 1 and int y = 0, while x &lt; 5 and y &lt; 10
     * prints the expression x + y. In each iteration x and y are
     * incremented so that the loop terminates.
     */
    public static void printWhileSum() {
        int x = 1;
        int y = 0;
        while (x < 5 && y < 10) {
            System.out.println(x + y);
            x++;
            y++;
        }
    }

    /**
     * 14. Prints a square made of '*' symbols to the console.
     *
     * @param size the side length of the square
     */
    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * 15. Reads N from the console and calculates the sum of all numbers
     * in the range [1, N] that are divisible by 5.
     *
     * @return the sum of numbers divisible by 5 in [1, N]
     */
    public static int sumDivisibleBy5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N:");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
        return sum;
    }

    /**
     * 16. Calculates the product of all two-digit even numbers in [1, N].
     * If there are no such numbers, returns 1 (empty product).
     * Uses long, since the product grows very quickly.
     *
     * @param n the upper bound of the range
     * @return the product of two-digit even numbers in [1, N]
     */
    public static long productOfTwoDigitEvens(int n) {
        long product = 1;
        for (int i = 10; i <= n && i <= 99; i++) {
            if (i % 2 == 0) {
                product *= i;
            }
        }
        return product;
    }

    /**
     * 17. Among the consecutive numbers [1, N] finds the largest and the
     * smallest elements and calculates their arithmetic mean.
     *
     * @param n the upper bound of the range (n &gt;= 1)
     * @return the arithmetic mean of the smallest and largest elements
     */
    public static double minMaxAverage(int n) {
        int min = 1;
        int max = 1;
        for (int i = 1; i <= n; i++) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        double average = (min + max) / 2.0;
        System.out.println("min = " + min + ", max = " + max + ", average = " + average);
        return average;
    }

    /**
     * 18. Calculates the sum of digits of a five-digit integer.
     *
     * @param x a five-digit integer
     * @return the sum of the digits of x
     */
    public static int sumOfDigits(int x) {
        x = Math.abs(x);
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }
}
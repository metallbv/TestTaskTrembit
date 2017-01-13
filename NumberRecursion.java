
// Выведите целые числа от 9 до 0 при помощи рекурсии

public class NumberRecursion {

    public static void main(String[] args) {

        int numberFrom = 9;
        int numberTo = 0;

        printNumber(numberFrom, numberTo);

    }

    private static void printNumber(int numberFrom, int numberTo) {
        if (numberFrom >= numberTo) {
            System.out.println(numberFrom);
            printNumber(--numberFrom, numberTo);
        }
    }

}

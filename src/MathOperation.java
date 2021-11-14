import java.awt.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
Write a class MathOperation which accepts 5 integers through command line.
Create an array using these parameters. Loop through the array and obtain the sum and average of all the elements and display the result.
Various exceptions that may arise like ArithmeticException, NumberFormatException, and so on should be handled.
 */
public class MathOperation {
    public static void main(String[] args) {
        int size = args.length;

        for (int i = 0; i < size; i++)
            if (args[i].charAt(args[i].length() - 1) == ',')
                args[i] = args[i].replace(",", "");

        //System.out.println(Arrays.toString(args));

        int[] arr = new int[size];

        int sum = 0;
        double avg = 0;

        try {
            for (int i = 0; i < size; i++)
                arr[i] = Integer.parseInt(args[i]);

            for (int i = 0; i < size; i++)
                sum += arr[i];

            avg = sum / size;
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException");
        }

        System.out.println("sum: " + sum);
        System.out.println("avg: " + avg);
    }
}
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    Integer[] numbers = new Integer[3];



        for (int i = 0; i < 3; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers, Collections.reverseOrder());

        System.out.println("A:   B:   C: \n" + Arrays.toString(numbers));

    }

}

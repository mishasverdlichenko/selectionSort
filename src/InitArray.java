import java.util.Scanner;

public class InitArray {

    public int[] initArr(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array lenght: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("\nInsert array element: ");

        for (int i = 0; i < size; i++) {
            System.out.printf("Write the value of the %s element: ", i + 1);
            array[i] = scanner.nextInt();
        }
        return array;
    }
}

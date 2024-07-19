public class Main {
    public static void main(String[] args) {

        InitArray init = new InitArray();
        ArrayOutput print = new ArrayOutput();
        SelectionSort sort = new SelectionSort();

        int[] myArray = init.initArr();

        System.out.println("\nArray before sort: ");

        print.printArray(myArray);
        sort.selectionSort(myArray);

        System.out.println("\nArray after sort: ");

        print.printArray(myArray);
    }
}

public class Main {
    public static void main(String[] args) {

        InitArray init = new InitArray();
        ArrayOutput print = new ArrayOutput();
        SelectionSort sort = new SelectionSort();

        int[] myArray = init.initArr();

        System.out.println("Array before sort: ");

        print.printArray(myArray);
        sort.selectionSort(myArray);

        System.out.println("Array after sort: ");

        print.printArray(myArray);
    }
}

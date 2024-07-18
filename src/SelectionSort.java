public class SelectionSort {

    public void selectionSort(int[] array) {
        int n = array.length;
        int minIndex;
        int temp;

        for (int i = 0; i < n -1; i++) {
            minIndex = i;
            for (int j = i +1; j < n; j++) {
                if(array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }

    }
}

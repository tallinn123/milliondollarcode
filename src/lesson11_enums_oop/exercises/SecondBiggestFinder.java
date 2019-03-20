package lesson11_enums_oop.exercises;

public class SecondBiggestFinder {
    public int[] sorAnArrayFromBiggestToSnallest(int[]arr) {
        for (int i = 0; 1 < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }

        }
        return arr;
    }

        public static void main(String[] args) {

            int arr []= {10,20,430,470,502,512,510,550,203,850};
            SecondBiggestFinder secondBiggestFinder = new SecondBiggestFinder();
            int [] sortedArray = secondBiggestFinder.sorAnArrayFromBiggestToSnallest(arr);

            System.out.println("Result: " +sortedArray[1]);
    }
}
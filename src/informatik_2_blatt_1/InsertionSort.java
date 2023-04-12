import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {


        System.out.println("AverageCase:" + Arrays.toString(generateAverageCase(10)));
        System.out.println("BestCase:" + Arrays.toString(generateBestCase(10)));
        System.out.println("WorstCase:" + Arrays.toString(generateWorstCase(10)));
        System.out.println("Analyse");
        analyzeTimeComplexity();


    }


    public static int[] sort(int[] unsortedArray) {
        for (int j = 2; j < unsortedArray.length; j++) {
//            System.out.println(j);
            int tmp = unsortedArray[j];
//            System.out.println(tmp);

            int i = j - 1;

            while (unsortedArray[i] > tmp && i > 0) {
                unsortedArray[i + 1] = unsortedArray[i];
                i--;
            }

            unsortedArray[i + 1] = tmp;
//            System.out.println(i);
//            System.out.println(Arrays.toString(unsortedArray));

        }

        return unsortedArray;

    }


    /**
     * @param n Länge der zu erstellenden Array
     * @return int[]
     */
    public static int[] generateAverageCase(int n) {

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.toIntExact(Math.round(Math.random() * 10));
        }

        return arr;
    }


    public static int[] generateBestCase(int n) {
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        return arr;
    }

    public static int[] generateWorstCase(int n) {
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr.length - i;
        }

        return arr;
    }


    public static void analyzeTimeComplexity() {
        int maxLength = 50000;
        int steps = 5000;
        int i = 0;


        while (i < maxLength) {

            long timeStartWorst = System.currentTimeMillis();
            sort(generateWorstCase(i));
            long timeEndWorst = System.currentTimeMillis();

            long timeStartAverage = System.currentTimeMillis();
            sort(generateAverageCase(i));
            long timeEndWAverage = System.currentTimeMillis();

            long timeStartBest = System.currentTimeMillis();
            sort(generateBestCase(i));
            long timeEndBest = System.currentTimeMillis();

            System.out.println("n; worst case(ms); average case(ms); best case(ms)");
            System.out.println(i + "; " + (timeEndWorst - timeStartWorst) +"; "+(timeEndWAverage - timeStartAverage)+"; " + (timeEndBest - timeStartBest));

            i = i + steps;
        }


    }


}
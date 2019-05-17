package optianaltask;

import java.util.Random;

public class FourthTask {

    private static Random random = new Random();

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int arr[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = random.nextInt(10);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int[][] sortByRows(int arr[][]){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i].length - j -1; k++) {
                    if (arr[i][k] > arr[i][k + 1]) {
                        int temp = arr[i][k];
                        arr[i][k] = arr[i][k + 1];
                        arr[i][k + 1] = temp;
                    }
                }
            }

        }
        return arr;
    }

    public static void sortByColumns(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr.length - k; k++) {
                    if (arr[k][j] > arr[k+1][j]) {
                        int temp = arr[k][j];
                        arr[k][j] = arr[k+1][j];
                        arr[k+1][j] = temp;
                    }
                }
            }

        }
    }

    public static int sumBetweenFirstSecondPlusNumbers(int arr[][]) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length -1; j++) {
                if (count == 1 && arr[i][j-1] >0 &&arr[i][j+1] > 0) {
                    sum += arr[i][j];
                }
                if (arr[i][j] > 0) {
                    count++;
                }
            }
            count = 0;
        }
        return sum;
    }
}

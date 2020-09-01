import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        int m = 10;

        int[][] arr = new int[n][m];

        for(int[]aArr : arr){//Инициализация через foreach
            Arrays.fill(aArr, 0);// Заполнение массива одинаковыми значениями
        }

        arr[0][0] = 1;
        arr[0][m - 1] = 1;
        arr[n - 1][0] = 1;
        arr[n-1][m - 1] = 1;

        for(int[] aArr : arr){
            for(int abArr : aArr){
                System.out.print(abArr);
            }
            System.out.println();
        }
    }
}

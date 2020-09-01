import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] mas = new int[4][4];

        int k = 2;
        int p = 0;

        Random r = new Random();

        for(int i = 0;i < mas.length;i++){
            for(int j = 0; j < mas[i].length;j++){
                mas[i][j] = r.nextInt(100);
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }

        for(int i = 0; i < mas.length;i++){
            System.out.print("k строка - " + mas[k][i] + "; ");
        }
        System.out.println();
        for(int i = 0; i < mas.length;i++){
            System.out.print(" p столбец - " + mas[i][p] + "; ");
        }

    }
}

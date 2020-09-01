import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int m = 4, n = 4;
        int[][] mas = new int[m][n];

        Random r = new Random();
        for(int i = 0; i < mas.length; i++){
            for(int j = 0; j < mas[i].length; j++){
                mas[i][j] = r.nextInt(100);
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("------------------");

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(i % 2 == 0){
                    System.out.print(mas[i][j] + " ");
                }else{
                    System.out.print(mas[i][n - j - 1] + " ");
                }
            }
            System.out.println();
        }
    }
}

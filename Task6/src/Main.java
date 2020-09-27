public class Main {
    public static void main(String[] args) {
        int n = 6;
        int[][] mas = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0) || (j == 0) || (i == n - 1) || (j == n - 1)) {
                    mas[i][j] = 1;
                    System.out.print(mas[i][j] + " ");
                } else {
                    mas[i][j] = 0;
                    System.out.print(mas[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}

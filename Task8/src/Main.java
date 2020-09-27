public class Main {
    public static void main(String[] args) {
        
        int n = 6;
        int[][] mas = new int[n][n];

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (j < n - i) {
                    mas[i][j] = j + i + 1;
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
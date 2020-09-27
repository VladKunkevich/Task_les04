public class Main {
    public static void main(String[] args) {

        int n = 4;
        int c = 0;
        double[][] mas = new double[n][n];

        for (int i = 0; i < mas.length; i++) {
            mas[0][i] = Math.random() * 20;
            System.out.printf("[%6.2f]", mas[0][i]);
        }
        System.out.println();
        System.out.println();
        System.out.println("Действительная квадратная матрица: ");
        System.out.println();
        for (int i = 0; i < mas.length; i++) {
            c++;
            System.out.print(c);
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = Math.pow(mas[0][j], c);
                System.out.printf("[%9.2f]", mas[i][j]);
            }
            System.out.println();
        }
    }
}

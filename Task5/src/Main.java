public class Main {
    public static void main(String[] args) {
        int n = 8;
        int[][] arr = new int[n][n];

        for(int i = 0; i < n;i++){
            for(int j = 0;j < n;j++){
                if (n - i - 1 == j){
                    arr[i][j] = i + j;
                    System.out.print(arr[i][j] + " ");
                }else{
                    arr[i][j] = 0;
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}

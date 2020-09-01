public class Main {
    public static void main(String[] args) {
        int[][] arr = {{1,1,1,1},
                       {2,2,2,2},
                       {3,3,3,3},
                       {4,4,4,4}};

        int sum = 0;

        for(int i = 0;i < arr.length;i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] > 0)
                    sum += arr[i][j];
            }
            System.out.println(i + " " + sum);
        }
    }
}

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[10][20];
        int s = 0;
        Random r = new Random();
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = r.nextInt(15) + 1;
            }
        }

        for(int i = 0; i < arr.length;i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
                if(arr[i][j] == 5) s = s + 1;
            }
            if(s >= 3)
                System.out.println(" - В строке " + i + " цифра 5 встречается три и более раз");
            else
                System.out.println(" - В строке " + i + " цифра 5 встречается реже");
            System.out.println();
        }
    }
}

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] mas = new int[4][4];

        Random rand = new Random();
        for(int i = 0;i < mas.length; i++){
            for(int j = 0; j < mas[i].length;j++){
                mas[i][j] = rand.nextInt(1000);
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }

        boolean isPrinted = false;
        for(int i = 0; i < mas.length;i++){
            int temp = 0;
            int x = i;
            for(int j = 0; j < mas[i].length;j++){
                int y = j;
                while(x >= 0 && y < mas.length){
                    isPrinted = false;
                    temp+=mas[x--][y++];
                }
                if(!isPrinted){
                    System.out.print(temp + " , ");
                    isPrinted = true;
                }
            }


        }
    }
}

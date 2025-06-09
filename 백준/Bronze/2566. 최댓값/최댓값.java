import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] arr = new int [9][9];
        int a = arr[0][0];
        String b = "1 1";



        for(int i = 0 ; i < 9 ; i++){
            for(int j = 0 ; j < 9 ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0 ; i < 9 ; i++){
            for(int j = 0 ; j < 9 ; j++){
                if(arr[i][j] > a){
                    a = arr[i][j];
                    b = (i+1) + " " + (j+1);
                }
            }
        }

        System.out.println(a);
        System.out.println(b);


    }
}
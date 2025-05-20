import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int [] sumArr  = new int [a];
        for(int i=0;i < sumArr.length ; i++){
            int b = sc.nextInt();
            int c = sc.nextInt();
            sumArr[i] = b+c;
        }

        for(int i=0;i<sumArr.length;i++){
            System.out.println(sumArr[i]);
        }


    }
}

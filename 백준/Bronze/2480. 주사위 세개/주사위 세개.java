import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int n = a;
        int cnt = 0;
        int check = 0;

        if(a == b){
            cnt ++;
            check = a;
        }

        if(b == c){
            cnt ++;
            check = b;
        }
        if(a == c){
            cnt ++;
            check = c;
        }

        if(cnt == 3){
            System.out.println((a*1000) + 10000);
        }else if(cnt == 0){

            if(n < b){
                n = b;
            }
            if(n < c){
                n = c;
            }
            System.out.println(n * 100);
        }else if(cnt == 1){
            System.out.println(1000 + (check * 100));
        }


    }
}

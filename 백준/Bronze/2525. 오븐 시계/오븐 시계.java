import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int n = 0;
        if(b+c >= 60){
             n = (b+c) / 60;
        }

       if(b + c >= 60){
           b = (b+c) % 60;

       }//if end
        else{
            b = b + c;
       }

        a = a + n;
        if(a > 23){
            a = a - 24;
        }


        System.out.println(a + " " + b);

    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(b - 45 == 0){
            b = 0;
        } else if (b - 45 > 0) {
            b = b - 45;
        } else if(b - 45 < 0) {
            b = 60 - Math.abs(b - 45);

            if (a == 0) {
                a = 23;
            } else {
                a = a - 1;
            }
        }
        System.out.println(a + " " +b);

    }
}

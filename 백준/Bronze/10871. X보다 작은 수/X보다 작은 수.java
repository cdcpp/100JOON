import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int chk = sc.nextInt();

        int [] arr = new int[n];
        String b = "";
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if(chk > arr[i]) {
                b += arr[i] + " ";
            }
        }
        System.out.println(b);
        sc.close();



    }
}
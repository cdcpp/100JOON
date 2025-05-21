import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sumPrice = sc.nextInt();
        int n = sc.nextInt();

        int sumCheck = 0;
        for(int i=0;i<n;i++){
            int price = sc.nextInt();
            int count = sc.nextInt();

            sumCheck += price*count;
        }

        if(sumPrice == sumCheck){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        


    }
}

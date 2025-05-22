import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt() / 4;
        String name = "";

        for(int i = 0; i < n; i ++){
            name += "long ";
        }

        System.out.println(name + "int");
    }
}

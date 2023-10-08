import java.util.Scanner;

public class TestaFatorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Fatorial de: ");
        int num = sc.nextInt();

        int fatorial = 1;

        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }
        System.out.println(fatorial);
    }
}

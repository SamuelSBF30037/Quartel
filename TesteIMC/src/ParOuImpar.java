import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int número = sc.nextInt();

        if (número % 2 == 0) {
            System.out.println(String.format("O número: %d é par", número));
        } else {
            System.out.printf("O número: %d é ímpar\n", número);
        }

        sc.close();
    }
}















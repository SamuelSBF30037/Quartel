import java.util.Scanner;

public class Cachorro {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("PulaQuanto:\n");
        float pulaquanto = scanner.nextInt();        
        String cachorro = "Stiveeee";
        //System.out.println("Stive");

        if (pulaquanto < 50) {
            System.out.println("Seu cachorro\n" + cachorro + "\nPula Baixo");
        } else if (pulaquanto >=50 || pulaquanto >=80) {
           System.out.println("Seu cachorro\n" + cachorro + "\nPula Normal"); 
        } else  {
           System.out.println("Seu cachorro\n" + cachorro + "\nPula Alto");
           System.out.println("");
        }
       scanner.close();

    }
}


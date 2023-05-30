import java.util.Scanner;

public class TiposDoTriangulo {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

            System.out.println("Digite o Tamanho do L1: ");
        float L1 = sc.nextInt();
                  System.out.println("Digite o Tamanho do L2: ");
            float L2 = sc.nextInt();
               System.out.println("Digite o Tamanho do L3: ");
        float L3 = sc.nextInt();
      
                
       if ((L1 == L2) & (L2 == L3)) {
          System.out.println("O Seu Triangulo e Equilátero");
       } else if ((L1 == L2) & (L2 != L3)) {
        System.out.println("O Seu Triangulo e Isósceles");
      }  else if ((L1 != L2) & (L2 != L3) & (L1 != L3)) {
        System.out.println("O Seu Triangulo e Escaleno");
        System.out.println("xxxxxxx----******************----xxxxxxxxxxxxxx");
              sc.close();
    }
}
}
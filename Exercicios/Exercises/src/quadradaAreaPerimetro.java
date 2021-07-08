import java.util.Scanner;

/*Usuário insere o valor do lado do quadrado e 
  calcula a área(Lado *LAdo )
e o perimetro(4* Lado ) do Quadrado */
public class quadradaAreaPerimetro {
  public static void main(String[] args) {
    double lado;
    Scanner sc  = new Scanner (System.in);
    System.out.println("System working....");
    System.out.println("Calculo de área e Perimetro de um  quadrado: ");
    System.out.print("\nInsira o tamanho do lado do quadrado: ");
      lado= sc.nextDouble();
      double area = (lado * lado);
      double perimetro = 4* lado;
      System.out.printf("\nÁrea:%.2f"+ "\nPerímetro: %.2f", area ,perimetro);
      System.out.println("\n\nSystem stoped...");
      sc.close();
  }
}

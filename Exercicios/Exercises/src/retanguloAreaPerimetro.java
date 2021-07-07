/*Usuário insere os valores da altura(height)
e da base(base) e calcula a área(height * base)
e o perimetro(2*(height*base)) do retângulo */
import java.util.Scanner;
public class retanguloAreaPerimetro {
  public static void main(String[] args) {
    double height, base;
    Scanner sc  = new Scanner (System.in);
    System.out.println("System working....");
    System.out.println("Calculo de área e Perimetro de um retângulo: ");
    System.out.print("\nInsira o tamanho da altura do Retângulo: ");
      height = sc.nextDouble();
      System.out.print("\nInsira o tamanho da base do Retângulo: ");
      base = sc.nextDouble();
      double area = base *height;
      double perimetro = 2*(base + height);
      System.out.printf("\nÁrea:%.2f"+ "\nPerimetro: %.2f", area ,perimetro);
      sc.close();
  }
}

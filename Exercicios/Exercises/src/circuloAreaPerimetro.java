import java.util.Scanner;

/*Usuário insere o valor do raio e 
  calcula a área(pi * raio^2 )
e o perimetro(2*pi*raio) do circulo */
public class circuloAreaPerimetro {
  public static void main(String[] args) {
    double raio;
    Scanner sc  = new Scanner (System.in);
    System.out.println("System working....");
    System.out.println("Calculo de área e Perimetro de um Círculo: ");
    System.out.print("\nInsira o tamanho do raio: ");
      raio = sc.nextDouble();
      double area = Math.PI * (raio*raio);
      double perimetro = 2*Math.PI * raio;
      System.out.printf("\nÁrea:%.2f"+ "\nPerímetro: %.2f", area ,perimetro);
      System.out.println("\n\nSystem stoped...");
      sc.close();
  }
}

import java.util.Scanner;

/*Usuário insere os valores dos lados do trinagulo 
e calculo o perimetro(Soma dos lados ) do triângulo */
public class trianguloPerimetro {
  public static void main(String[] args) {
    Scanner sc   = new Scanner(System.in);
    double perimetro = 0;
    double lado;
    System.out.println("System working....");
    System.out.println("Calculo perimetro de um  triângulo:\n");
    for (int i = 1; i <=3; i++) {
      System.out.print(i+"#,Digite o tamanho da lateral: ");
      lado =  sc.nextDouble();
      perimetro += lado;
    }
    System.out.println("\nPerimetro do triângulo: "+ perimetro);
    System.out.println("\nSystem stoped...");
    sc.close();
  }
}

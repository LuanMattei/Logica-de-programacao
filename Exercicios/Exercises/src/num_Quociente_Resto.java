import java.util.InputMismatchException;
import java.util.Scanner;

/* Programa recebe dois valores do úsario e recebe o quociente e o resto da equação */
public class num_Quociente_Resto {
  public static void main(String[] args) {
    int num = 0, div  = 0;
    System.out.println("System working....");
    Scanner sc  = new Scanner(System.in);
    double quociente , resto ;
    System.out.print("Insira o valor inteiro  do numerador: ");
      try {
       num = sc.nextInt();
        System.out.print("\nInsira o valor inteiro  do divisor: ");
       div = sc.nextInt();
      } catch (InputMismatchException e) {
        System.out.println("\nInsira um número inteiro");
      }
      try {
        quociente = num / div; resto = num %div;
        System.out.println("\n Quociente: "+ quociente + "\n resto: "+ resto);
      } catch (ArithmeticException e) {
        System.out.println("\nNão divida por 0");
      }
      System.out.println("\nSystem stoped...");
    sc.close();
  }
}

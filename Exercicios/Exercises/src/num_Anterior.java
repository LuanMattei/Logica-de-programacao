import java.util.Scanner;

/*Úsuario digita valor inteiro e o sistema retorna o numero anterior */
public class num_Anterior {
  public static void main(String[] args) {
    System.out.println("System working....");
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite um valor inteiro: ");
    int num = sc.nextInt();
    System.out.println("Numero inserido="+num+",anterior="+ (num -1));
    sc.close();
  }
}

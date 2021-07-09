import java.util.Scanner;

/*Sistema converte o numero inteiro digitado pelo úsuario para binario */
public class IntParaBinario {
  public static void main(String[] args) {
    Integer num ;
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite um inteiro: ");
    num = sc.nextInt();
    if( num != 32){
      System.out.println("Valor em binario "+ Integer.toBinaryString(num));
    }
    else{
      System.out.println("Digite um número diferente de 32");
    }
    sc.close();
  }
}

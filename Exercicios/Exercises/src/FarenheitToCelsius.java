import java.util.Scanner;

/*Úsuario do sistema irá digitar uma temperatura em FARENHEIT e 
será convertido em celsius através da formula(c = 5/9 *(F-32)*/
public class FarenheitToCelsius {
  public static void main(String[] args) {
    System.out.println("System working....\n");
    Scanner sc =  new Scanner(System.in);
    System.out.print("Digite a temperatura em FARENHEIT: ");
    double farenheit = sc.nextDouble();
    double celsius =(farenheit-32) *5/9  ;
    System.out.printf("\nTempetatura em CELSIUS:.%1f ",celsius);
    System.out.println("\n\nSystem stoped...");
    sc.close();
  }
}

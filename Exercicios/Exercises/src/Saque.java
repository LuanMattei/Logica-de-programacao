/* */
import java.util.Scanner;

public class Saque {
  public static void main(String[] args) {
    int valor ;
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite o valor à ser sacado: ");
    valor = sc.nextInt();
    if(valor >0){
      int qtDe100 = valor/100;
      valor -= qtDe100*100;
      int qtDe50 = valor/50;
     valor -= qtDe50*50;
     int qtDe20 = valor/20;
     valor -= qtDe20*20;
      int qtDe10 =valor/10;
      valor -= qtDe10*10;
      int qtDe5 = valor/5;
      valor -= qtDe5*5;
      int qtDe1 = valor/1;
      System.out.printf("%d Nota(s) de\t100\n%d Nota(s) de\t50 "+
      "\n%d Nota(s) de\t20 \n%d Nota(s) de\t10"+
      "\n%d Nota(s) de\t5 \n%d Nota(s) de\t1 "
      ,qtDe100,qtDe50,qtDe20,qtDe10,qtDe5,qtDe1);
    }
    else{
      System.out.println("Não é possível  sacar valor negativos");
    }
    sc.close();
  }
}

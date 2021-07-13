import java.util.Scanner;

public class Combinacao{
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    if (n<=12 && n>=1) {
      for (int i =1; i <=6; i++) {
        for (int j = 6; j >=1; j--) {
          if (i+j == n) {
            System.out.println(String.format("%d %d",i,j));
          }
        }
      }
    } else {
      System.out.println("Insira um valor inteiro menor que 12");
    }
   
    sc.close();
    }
  }


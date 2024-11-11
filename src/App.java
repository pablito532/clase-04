import java.util.Scanner;
public class App {
    public static void main(String[] args) {
      var entrada = new Scanner(System.in);
      int num,j = 0;
      do { 
          System.out.println("Ingrese un numero entero impar ");
          num = entrada.nextInt();
      } while (num % 2 == 0);

       for(int i = 1; i <= num;i++){
         if(i % 2 != 0){
             while(j < i){
                System.out.print(" * ");
                j++;
            }
            j = 0;
             System.out.println("");
        }
      }
    }
  }       
import java.util.Scanner;
public class calculator{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("=== Simple calculator ===");
    System.out.println("Enter the first number: ");
    int x = input.nextInt();
    System.out.println("Enter the second number: ");
    int y = input.nextInt();

    System.out.print(" Enter operand (+,-,/,*,%,^): ");
    char operation = input.next().charAt(0);
    boolean validOperation = true;

    switch (operation) {
        case'+':
        System.out.print(x + "+"+ y+ "=" + (x+y));
        break;
        case'-':
        System.out.print(x+ "-" +y+ "="+ (x-y));
        break;
        case'*':
        System.out.print(x+ "*" +y+ "="+(x*y));
        break;
        case'/':
        if(x != 0){
          System.out.print(x+ "/" +y+ "=" + (x/y));
        } else{
          System.out.println("Error: cannot divide by zero");
        }
        break;
        
        case'%':
        System.out.print(x+ "%" +y+ "=" +(x%y));
        break;

        case'^':
        System.out.print(+x+ "^" +y+ "=" + Math.pow(x,y));
        break;

      default:
        System.out.println("Invalid operation!");
        validOperation = false;
    }
    input.close();
  }
  }

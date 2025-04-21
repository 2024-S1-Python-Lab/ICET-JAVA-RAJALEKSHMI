import arithmetic.*; 
import java.util.Scanner; 
public class TestArithmetic  
{ 
    public static void main(String[] args)  
    { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the first number: "); 
        double num1 = sc.nextDouble(); 
        System.out.print("Enter the second number: "); 
        double num2 = sc.nextDouble(); 
        Addition addObj = new Addition(num1, num2); 
        Subtraction subObj = new Subtraction(num1, num2);   
        Multiplication mulObj = new Multiplication(num1, num2); 
        Division divObj = new Division(num1, num2); 
        System.out.println("Addition: " + addObj.add()); 
        System.out.println("Subtraction: " + subObj.sub()); 
        System.out.println("Multiplication: " + mulObj.mul()); 
        System.out.println("Division: " + divObj.div()); 
    } 
} 
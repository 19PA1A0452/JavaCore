import java.util.Scanner;  

public class Demomax{
	public static void main(String s[]){
           Scanner in = new Scanner(System.in);

           System.out.println("Enter the number:");
           int a = in.nextInt();
           int i = 1;  
           do{
               System.out.println(a + " * " + i + " = "+a * i);  
              
           } 
           while(i<=a){
               System.out.print(i +" ");   
               i=i+2;
           }
                
              
        }
}
    
           
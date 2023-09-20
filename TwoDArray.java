import java.util.Scanner;
public class TwoDArray{
    public static void main(String args[]){
       int n,p;
       Scanner in = new Scanner(System.in);
       n=in.nextInt();
       p=in.nextInt();
       int values =1;
       int array[][] = new int[n][p];
       System.out.println("Enter the array elements");
       for (int i =0;i<n;i++){
             for(int j=0;j<p;j++){
                  array[i][j]=values;
                  values++;
             }
       }
      for (int i =0;i<n;i++){
           for(int j=0;j<p;j++){
               System.out.println(array[i][j]);
           }
      System.out.println();
      }
}
}
import java.util.*;
class Ar1{
    public static void main(String args[]){
       ArrayList<String> list =new ArrayList<String>();//creating array list
       list.add("Usha");//Adding object into arraylist
       list.add("Srikanth");
       list.add("Sindhuja");
       list.add("Praneetha");
       //Traversing list through iterator 
       Iterator itr = list.iterator();
       while(itr.hasNext()){
         System.out.println(itr.next());
       }
   }
}

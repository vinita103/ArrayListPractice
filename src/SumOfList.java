import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {

    static ArrayList<Integer> numbers = new ArrayList<>();
    
    public static void main(String[] args) {

    Scanner user = new Scanner(System.in);
           
        
     System.out.println("Enter a number");

    //  creating while loop 
    // loop stops when input is 0
    // it prints the statement with sum
                  
       
     while(true){
           
       int  num = user.nextInt();
      
      if ( num == 0){
       
      System.out.println(numbers + " were the items in the list. The sum of that list is: " + getSum());
            
      break;
      
      } else{
      
      numbers.add(num);

      }

    }
 }

//    creating method to getSum 

    public static int getSum() {
                
        int sum = 0;

        for (int i = 0; i < numbers.size(); i++){
              
        sum += numbers.get(i);

    }
        return sum;
        
    }

}

     

    
    
    


    
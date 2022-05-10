import java.util.ArrayList;
import java.util.Scanner;


public class IndexOfInteger {
    
    public static void main(String[] args) {

    Scanner user = new Scanner(System.in);
           
    ArrayList<Integer> numbers = new ArrayList<>();

     System.out.println("Enter a number");
                  
    while(true) {
        int num = user.nextInt();
       
        if (num == 0) {

            System.out.println("Done entering integers into the list");
            System.out.println("What number are you looking for in the list?");
             num = user.nextInt();

          
            System.out.println( num + " is at index " + numbers.indexOf(num));
                    
            break;              

        } else {
            numbers.add(num);
        }
    }
    
    }

}

    

    
    
import java.util.ArrayList;
import java.util.Scanner;


public class HowLarge {
    
    public static void main(String[] args) {

    Scanner user = new Scanner(System.in);
           
    ArrayList<String> inputs = new ArrayList<>();

               
    while(true) {
        String input = user.nextLine();
       
        if (input.isEmpty()) {

            System.out.println("The total amount of items in the list was: " + inputs.size());
            
            break;

        }else{
            inputs.add(input);
        }
    }
    
    }

    
}
 
    


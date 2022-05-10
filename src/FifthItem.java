import java.util.ArrayList;
import java.util.Scanner;

public class FifthItem {

    public static void main(String[] args) {

    Scanner user = new Scanner(System.in);
           
    ArrayList<String> inputs = new ArrayList<>();

               
    while(true) {
        String input = user.nextLine();
       
        if (input.isEmpty()) {

            System.out.println("The Fifth item in the list is: " + inputs.get(4));
                 
            
            break;
        }else{
            inputs.add(input);
        }
    }
    
    }

    
}
 



    


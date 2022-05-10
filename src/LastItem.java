import java.util.ArrayList;
import java.util.Scanner;


public class LastItem {
    
    public static void main(String[] args) {

    Scanner user = new Scanner(System.in);
           
    ArrayList<String> inputs = new ArrayList<>();

     
                  
    while(true) {
        String input = user.nextLine();
       
        if (input.isEmpty()) {

            System.out.println("The last item in the list is: " + inputs.get(inputs.size()-1));
            
            break;

        }else{
            inputs.add(input);
        }
    }
    
    }
    

    
}
 

// public class LastItem
// {
// 	public static void main(String arg[])	
// 	{
	    
        
//         Scanner sc=new Scanner(System.in);
// 	    System.out.println("Enter the number of elements in an Array");
// 	    int n=sc.nextInt();
// 	    int a[]=new int[n];  
// 	    System.out.println("Enter "+n+" array elements ");  
// 	    for(int i=0;i<n;i++)
// 	    {  
// 	      a[i]=sc.nextInt();
//             }
//   	    System.out.println("Last elment of an array is "+LastElement(a));
// 	}
// 	static int LastElement(int a[])
// 	{
// 	    if(a.length==0)
// 	    {
// 		System.out.println("Array is Empty");
// 	        return 0;
// 	    }
// 	    return a[a.length-1];	
// 	}
// }
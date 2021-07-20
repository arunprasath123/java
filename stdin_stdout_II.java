package trial;
import java.io.*;
import java.util.*;

public class stdin_stdout_II {


	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int in = scan.nextInt();
	        double d = scan.nextDouble();
	        try{
	            String str = scan.nextLine();
	        }
	        catch (NumberFormatException r){
	            
	        }
	        String str = scan.nextLine();
	        System.out.println("String: " + str);
	        System.out.println("Double: " + d);
	        System.out.println("Int: " + in);
	    }
	    }

}

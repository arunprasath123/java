package trial;
import java.io.*;
import java.util.*;
public class static_initializer_block {


	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner sc = new Scanner(System.in);
	        int one = sc.nextInt();
	        int two = sc.nextInt(); 
	        if(one <=0 || two <=0){
	            System.out.println("java.lang.Exception: Breadth and height must be positive");
	        }
	        else{
	            int area = one *two;
	            System.out.println(area);
	        
	        }
	    }
	}

package trial;
import java.io.*;
import java.util.*;

public class end_of_file {


	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        
	        Scanner sc = new Scanner(System.in);
	        int st=0;
	        String str;
	        for(int i=1;sc.hasNext();i++)
	        {
	            str = sc.nextLine();
	            System.out.println(i + " "+ str);
	            if(str.equals('.'))
	            {
	                sc.close();
	                break;
	            }
	            
	        }
	    }
	}



package trial;
import java.util.*;
import java.io.*;
public class loops_II {
	    public static void main(String []argh){
	        Scanner in = new Scanner(System.in);
	        int t=in.nextInt();
	        
	        for(int i=0;i<t;i++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	            int f=0;
	            int k=1;
	            for(int j=1;j<=n;j++){
	                f +=(k*b);
	                System.out.print(f +a+ " ");
	                k*=2;
	            }
	            System.out.println("");
	        }
	        in.close();
	    }
	}



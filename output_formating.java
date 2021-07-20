package trial;
import java.util.Scanner;
public class output_formating {
	    public static void main(String[] args) {
	            Scanner sc=new Scanner(System.in);
	            System.out.println("================================");
	            for(int i=0;i<3;i++){
	                String s1=sc.next();
	                int x=sc.nextInt();
	                //Complete this line
	                int t=s1.length()+3;
	                System.out.print(s1);
	                for(int j=0;j<18-t;j++){
	                    System.out.print(" ");
	                }
	                if(x<10){
	                    System.out.print('0');
	                    System.out.print('0');
	                    System.out.println(x);    
	                }
	                else if(x<100){
	                    System.out.print('0');
	                    System.out.println(x);                                      
	                }
	                else{
	                System.out.println(x);
	                }
	            }
	            System.out.println("================================");

	    }
	}




}

package expertise;
import java.util.*;
public class sorting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the range: ");
		int n = sc.nextInt();
		int ar[] = new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("enter the number");
			ar[i] = sc.nextInt();
		}
		int temp=0;
		for(int a = 0;a<ar.length;a++) {
			for(int b=a+1;b<ar.length;b++) {
				if(ar[a] > ar[b]) {
					temp = ar[b];
					ar[b] = ar[a];
					ar[a] = temp;
				}
			}
		}
		System.out.println("ascending to descending ");
		for(int j:ar) {
			System.out.print(j + " ");
			}
		}

}

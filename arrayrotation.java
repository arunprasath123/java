package expertise;
import java.util.*;
//left rotation
public class arrayrotation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the range: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
 		System.out.println("enter the numbers: ");
		for(int a =0; a<n;a++) {
			arr[a] = sc.nextInt();
		}
		System.out.println("enter the position for split: ");
		int s = sc.nextInt();
		leftrotation(arr,s);
		rightrotation(arr,s);
	}
	public static void leftrotation(int[] arr, int sp) {
		int temp=0;
		int l = arr.length-1;
		int k=1;
		while(k <= sp) {
			temp = arr[0];
			for(int i=0;i<=l;i++) {
				try {
				arr[i] = arr[i+1];
				}
				catch (ArrayIndexOutOfBoundsException e) {
				e.getStackTrace();
				}
			}
			arr[l]=temp;
			k++;
		}
		}
	public static void rightrotation(int[] arr, int s) {
	int temp=0;
	int k=1;
	int l = arr.length;
	while(k<=s) {
		temp = arr[l-1];
		for(int i = l-1 ;i>=0 ; i++) {
			try {
			arr[i] = arr[i-1];
			}
			catch (ArrayIndexOutOfBoundsException e) {
				e.getStackTrace();
			}
		}
		arr[0] = temp;
		k++;
	}
	for(int j:arr) {
		System.out.println(j);
	}
	}
}

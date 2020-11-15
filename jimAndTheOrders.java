	
import java.util.Scanner;

	
	
	public class jimAndTheOrders {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a,b;
		int key[]=new int[n];
		int value[]=new int[n];
		for(int i=0;i<n;i++) {
			a=sc.nextInt();
			b=sc.nextInt();
			key[i]=i+1;
			value[i]=a+b;
		}
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1;j++) {
				if(value[j]>value[j+1]) {
					int temp=key[j];
					int temp1=value[j];
					value[j]=value[j+1];
					key[j]=key[j+1];
					key[j+1]=temp;
					value[j+1]=temp1;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(key[i]+" ");
		}
	}
	}

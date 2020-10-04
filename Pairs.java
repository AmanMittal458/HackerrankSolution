import java.util.Arrays;
import java.util.Scanner;
public class Pairs {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	long k=sc.nextLong();
	int b[]=new int[n];
	for(int i=0;i<n;i++){
		b[i]=sc.nextInt();
	}
	Arrays.sort(b);
	int count=0;
	for(int i=n-1;i>=0;i--){
		for(int j=i-1;j>=0;j--){
			if(b[i]-b[j]==k){
				count++;
				break;
				
			}
		}
	}
	System.out.println(count);
}
}

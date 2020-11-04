import java.util.Scanner;

public class CircularArrayRotation {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int k=sc.nextInt();
	k=k%n;
	int q=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++) {
		a[(i+k)%n]=sc.nextInt();
	}
	int ans;
	for(int i=0;i<q;i++) {
		ans=sc.nextInt();
		System.out.println(a[ans]);
	}
}
}

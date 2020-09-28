import java.util.Scanner;

public class JumpingOnTheClouds {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int k=sc.nextInt();
	int a[]=new int[k];
	for(int i=0;i<k;i++) {
		a[i]=sc.nextInt();
	}
	int d=0,e=d+1,f=e+1,jump=0;
	while(d<k-2) {
		if(a[f]==0) {
			jump++;
			d=f;
			e=d+1;
			f=e+1;
		}else {
			jump++;
			d=e;
			e=d+1;
			f=e+1;
		}
	}
	if(d!=k-1)
	System.out.println(jump+1);
	else {
		System.out.println(jump);
	}
}
}

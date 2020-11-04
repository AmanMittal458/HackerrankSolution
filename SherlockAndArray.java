import java.util.Scanner;

public class SherlockAndArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t>0) {
		int n=sc.nextInt();
		int sum[]=new int[n];
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			if(i==0) {
				sum[0]=a[0];
			}else {
				sum[i]=sum[i-1]+a[i];
			}
		}
		System.out.println(calculate(a,sum,n));
		t--;
	}
}
static String calculate(int a[],int sum[],int n) {
	int total=sum[n-1];
for(int i=0;i<n;i++) {
	if(i==0) {
		if(total-a[i]==0) {
			return "YES";
		}
	}else {
		if(sum[i-1]==(total-sum[i])) {
			return "YES";
		}
	}
}
return "NO";
}
}

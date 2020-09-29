import java.util.Scanner;

public class MaximizingXor {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int l=sc.nextInt();
	int r=sc.nextInt();
	int ans=-32768;
	for(int i=l;i<=r;i++) {
		for(int j=i;j<=r;j++) {
			if(ans<(i^j)) {
				ans=(i^j);
			}
		}
	}
	System.out.println(ans);
}
}

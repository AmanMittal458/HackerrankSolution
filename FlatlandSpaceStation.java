import java.util.Arrays;
import java.util.Scanner;


public class FlatlandSpaceStation {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();
	int s[]=new int[m];
	int ans[]=new int[n];
	for(int i=0;i<m;i++){
		s[i]=sc.nextInt();
	}
	if(n==m) {
		System.out.println(0);
	}else {
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(i==0) {
					ans[j]=(int)Math.abs(s[i]-j);
				}else {
					if(ans[j]>(int)Math.abs(s[i]-j)) {
						ans[j]=(int)Math.abs(s[i]-j);
					}
				}
			}
		}
		Arrays.sort(ans);
		System.out.println(ans[ans.length-1]);
	}
	
}
}

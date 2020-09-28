import java.util.Scanner;

public class ACMICPCTeam {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();
	int a[]=new int[m];
	String s[]=new String[n];
	for(int i=0;i<n;i++) {
		s[i]=sc.next();
	}
	for(int i=0;i<n-1;i++) {
		for(int j=i+1;j<n;j++) {
			int count=0;
			count=check(s[i],s[j]);
			a[count-1]++;
		}
	}
	for(int i=m-1;i>=0;i--) {
		if(a[i]>0) {
			System.out.println(i+1);
			System.out.println(a[i]);
			break;
		}
	}
}
static int check(String a,String b) {
	int count=0;
	for(int i=0;i<a.length();i++) {
		if(a.charAt(i)=='1' || b.charAt(i)=='1') {
			count++;
		}
	}
	return count;
}
}

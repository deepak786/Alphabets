import java.util.Scanner;
class K{
	public static void main(String args[]){
System.out.println("Enter Length");
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int m=n/2;
	for(int i=0;i<=m;i++){
		System.out.print("*");
		for(int j=m-1;j>=i;j--){
		   System.out.print(" ");
}
	System.out.println("*");
}
	//System.out.println("*");
	for(int i=0;i<m;i++){
		System.out.print("*");
		for(int j=0;j<=i;j++){
		   System.out.print(" ");
}
	System.out.println("*");
}
}
}
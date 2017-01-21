import java.util.Scanner;
class H{
	public static void main(String args[]){
	System.out.println("Enter the number");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
	    	int m=n/2;
	for(int i=0;i<n;i++){
		System.out.print("*");
	   for(int j=0;j<m;j++){
		if(i==m){
		   System.out.print("*");
}else{
		   System.out.print(" ");
}
}
		System.out.print("*");
		System.out.println();
}
}
}
import java.util.Scanner;
class J{
	public static void main(String args[]){
System.out.println("Enter Length");
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int m=n/2;
	for(int i=0;i<n;i++){
	   for(int j=0;j<m;j++){
		if(i==0 || i==(n-1)){
		   System.out.print("*");
}else{
		   System.out.print(" ");
}
}
		if(i!=n-1){
			System.out.print("*");
}
		System.out.println();
}
}
}
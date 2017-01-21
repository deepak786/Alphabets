class A1{
	public static void main(String args[]){
int n=Integer.parseInt(args[0]);
int m=n/2;
	System.out.print(" ");
	for(int i=0;i<4;i++){
         System.out.print("*");
	}
         System.out.println();
	for(int k=0;k<n;k++){
	 System.out.print("*");
		if(k==m){
		for(int i=0;i<4;i++){
                System.out.print("*");
	          }
		}else{
	 for(int i=0;i<4;i++){
                System.out.print(" ");
	}
}
	System.out.println("*");
	}
}
}
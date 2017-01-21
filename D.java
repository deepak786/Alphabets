class D{
	public static void main(String args[]){

	int n=Integer.parseInt(args[0]);
	int m=n/2;
	 for(int i=0;i<n;i++){
	    System.out.print("*");
	     if(i==0 || i==n-1){
		for(int k=0;k<m;k++){
		   System.out.print("*");
}
}else{
		for(int k=0;k<m;k++){
		   System.out.print(" ");
}
	 	System.out.print("*");
}
		System.out.println();
}
}
}
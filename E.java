class E{
	public static void main(String args[]){
int n=Integer.parseInt(args[0]);
int m=n/2;
	for(int i=0;i<n;i++){
		System.out.print("*");
	   if(i==0 || i==m || i==n-1){
		 if(i==0 || i==n-1){
   for(int j=0;j<m;j++){
		   System.out.print("*");
}
}else{
   for(int j=0;j<m-1;j++){
		   System.out.print("*");
}
}
}
	System.out.println();
}
}
}


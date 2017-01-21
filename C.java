class C{
	public static void main(String args[]){

int n=Integer.parseInt(args[0]);
int m=n/2;
		for(int i=1;i<=n;i++){
			if(i==1 || i==n){
                          System.out.print(" ");
			  for(int j=1;j<=m;j++){
				System.out.print("*");
}
}else{
		System.out.print("*");
}
		System.out.println();
}
}
}
class B{
	public static void main(String args[]){
int n=Integer.parseInt(args[0]);
int m=(1+n)/2;

		for(int i=1;i<=n;i++){
			System.out.print("*");
			if(i==1 || i==m || i==n){
			for(int j=1;j<=m-1;j++){
				System.out.print("*");
}
}else{
			for(int j=1;j<=m-1;j++){
				System.out.print(" ");
}
			System.out.print("*");
}
			System.out.println();
}
}
}
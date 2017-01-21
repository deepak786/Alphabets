class A{
	public static void main(String args[]){
int i;
int n=Integer.parseInt(args[0]);
		for(i=0;i<n;i++){
			int m=n/2;
			for(int j=n-1;j>i;j--){
				System.out.print(" ");
			}
			if(i!=0){
				System.out.print("*");
				}
			for(int k=0;k<2*i-1;k++){
				
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
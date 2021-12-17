class LeftPascal{
    public static void main(String[] args){
        int i,j,k,n=20;
        for(i=0;i<n;i++){
            for(j=i;j<n;j++){
                System.out.print(" ");
            }
            for(k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println("");
        }

        for(i=n;i>0;i--){
            for(j=i;j<=n;j++){
                System.out.print(" ");
            }
            for(k=1;k<i;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
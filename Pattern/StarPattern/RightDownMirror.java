class RightDownMirror{
    public static void main(String[] args){
        int i,j,n=8;
        for(i=n;i>=1;i--){
            for(j=n;j>i;j--){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
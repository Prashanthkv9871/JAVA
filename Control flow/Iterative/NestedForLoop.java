public class NestedForLoop{
    public static void main(String[] args){
        int arr[][] = {{2,7,9},{3,6,1},{7,4,2}};

        for(int i=0;i<=arr.length-1;i++){
            for(int j=0;j<=arr.length-1;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
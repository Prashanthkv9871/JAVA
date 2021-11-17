public class ArrayDemo{
    public static void main(String[] args){
        int[] anArray;

        //allocates memory for 5 integers
        anArray = new int[10];

        //initiate first element
        anArray[0] = 100;
        anArray[1] = 200;
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;

        System.out.println("Element at Index 0 : "+ anArray[0]);
        System.out.println("Element at Index 1 : "+ anArray[1]);
        System.out.println("Element at Index 2 : "+ anArray[2]);
        System.out.println("Element at Index 3 : "+ anArray[3]);
        System.out.println("Element at Index 4 : "+ anArray[4]);

    }
}
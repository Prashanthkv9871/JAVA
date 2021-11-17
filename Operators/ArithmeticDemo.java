public class ArithmeticDemo{
    public static void main(String[] args){
        int result = 1+2;
        //result is now 3
        System.out.println("1 + 2 = "+ result);
        int Original_result = result;

        result = result - 1;
        //result now is 2
        System.out.println(Original_result + " - 1 = " +result);
        Original_result = result;

        result = result * 2;
        //result now is 4
        System.out.println(Original_result + " * 2 = " +result);
        Original_result = result;

        result = result / 2;
        //result now is 2
        System.out.println(Original_result + " / 2 = " +result);
        Original_result = result;

        result = result + 8;
        //result now is 2
        System.out.println(Original_result + " + 8 = " +result);
        Original_result = result;

        result = result % 7;
        //result now is 2
        System.out.println(Original_result + " % 7 = " +result);
    }
}
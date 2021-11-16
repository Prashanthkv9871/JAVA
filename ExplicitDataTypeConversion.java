public class ExplicitDataTypeConversion{
	public static void main(String[] args) {
		double a=50.50;
		System.out.println("Double Representation "+ a);
		
		float f = (float)a;
		System.out.println("Float Repreaentation "+ f);

        long b = (long)a;
		System.out.println("Float Repreaentation "+ b);

        int c = (int)b;
		System.out.println("Float Repreaentation "+ c);
	}
}
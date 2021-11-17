public class NonPrimitivedataTypes{
	public static void main(String args[]) {
		String str1 = "Test1";
		System.out.println("String is:"+str1);
		
		String str2 = new String("Test2");
		System.out.println("Another String:"+str2);
		
		int arr[];
		arr = new int[2];
		arr[0] = 2;
		arr[1] = 5;
		//arr[2] = 2;
		
		System.out.println(arr);
		System.out.println(arr[0]);
	}
	
}
public class instanceOf {
		public static void main(String[] args)
		{	
			String s = "Hello";
			boolean ok = s instanceof String;
			if(ok) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
}

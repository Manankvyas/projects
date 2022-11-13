package typesofsearches;

public class palindrome {

	public static void main(String[] args) {
		String p1 = "2552";
		String p2 = "";
		for(int i=p1.length()-1;i>=0;i--)
		{
			p2 = p2+p1.charAt(i);
		}
		System.out.println(p2);
		if(p2.equals(p1))
		{
			System.out.println("it is palindrome");
		}
		else
		{
			System.out.println("no it is not");
		}

	}

}

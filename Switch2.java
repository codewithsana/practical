package controlstatement;

public class Switch2 {
	public static void main(String args[])
	{
		char ch='a';
		switch(ch)
		{
		case 'd':
			System.out.println("first case executed");
			break;
		case 'e':
			System.out.println("second case executed");
			break;
		case 'a':
			System.out.println("third case executed");
			break;
		case 'f':
			System.out.println("fourth case executed");
			break;
			default:System.out.println("invalid number");
			
		}
	}
}

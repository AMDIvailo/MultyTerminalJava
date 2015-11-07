import java.util.Scanner;

public class core {
	public static void main(String[] args)
	{
		System.out.println("Core Loaded!");
		Scanner scan = new Scanner(System.in);
		while(1 == 1)
		{
			String command = scan.nextLine();
			if(command.equals("help"))
			{
				System.out.println("This is help");
			}
			else
			{
				System.out.println("There is no such command!");
			}
		}
		
	}

}

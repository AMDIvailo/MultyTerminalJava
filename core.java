import java.util.Scanner;
import commands.commands;

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
				commands.help();
			}
			else if(command.equals("exit"))
			{
				System.out.println("Exited!");
				break;
			}
			else
			{
				System.out.println("There is no such command!");
			}
		}
		
	}

}

import java.util.Scanner;

public class TicTacToe1
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		TicTacToeCond ttt=new TicTacToeCond();

		char value='X';
		int r,c;

		while(!(ttt.result('X')|ttt.result('O')|ttt.isFull()))
		{
			ttt.displayBoard();	
			System.out.println("Enter where you want to Enter-(row,column)");
			r = keyboard.nextInt();
			c = keyboard.nextInt();

			if(!ttt.isValid(r,c))
			{
				System.out.println("Please enter valid value");
				continue;
			}

			// if(placeValue(r,c,value))
			// {
			// 	continue;
			// }

			if(ttt.placeValue(r,c,value)==false)
			{
				System.out.println("That place already occupied.Enter another value");
				continue;
			}

			if ( value == 'X' )
				value = 'O';
			else
				value = 'X';
			if(ttt.result('X'))
		{
			System.out.println("X is winner");
		}

		else if(ttt.result('O'))
		{
			System.out.println("O is winner");
		}

		else if(ttt.isFull())
		{
			System.out.println("DRAW ");
		}

		}

		
	
	}
		

}

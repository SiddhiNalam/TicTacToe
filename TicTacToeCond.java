public class TicTacToeCond
{
	char board[][];

	public TicTacToeCond()
	{
		board = new char[3][3];
		

		for ( int r=0; r<3; r++ )
			for ( int c=0; c<3; c++ )
				board[r][c] = ' ';
	} 

	public void displayBoard()
	{
		System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
		System.out.println("    --+-+--");
		System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
		System.out.println("    --+-+--");
		System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
		System.out.println("     0 1 2 ");

	}

	public boolean placeValue(int r,int c,char v)
	{
		if(board[r][c]==' ')
		{
			board[r][c]=v;
			return true;
		}

		else
		{
			return false;
		}
	}

	public boolean isValid(int r,int c)
	{
		if ( 0 <= r && r <= 2 && 0 <= c && c <= 2 )
			return true;
		else
			return false;
	}

	public boolean result(char p)
	{

		if(board[0][0]==p)
		{
			if(board[0][1]==p)
			{
				if(board[0][2]==p)
				{
					return true;
				}
			}
			if(board[1][1]==p)
			{
				if(board[2][2]==p)
				{
					return true;
				}
			}
			
		}

		if(board[1][0]==p)
		{
			if(board[1][1]==p)
			{
				if(board[1][2]==p)
				{
					return true;
				}
			}
		}

		if(board[2][0]==p)
		{
			if(board[2][1]==p)
			{
				if(board[2][2]==p)
				{
					return true;
				}
			}
		}

		if(board[0][0]==p)
		{
			if(board[1][0]==p)
			{
				if(board[2][0]==p)
				{
					return true;
				}
			}
		}

		if(board[0][1]==p)
		{
			if(board[1][1]==p)
			{
				if(board[2][1]==p)
				{
					return true;
				}
			}
		}
		if(board[0][2]==p)
		{
			if(board[1][2]==p)
			{
				if(board[2][2]==p)
				{
					return true;
				}
			}

			if(board[1][1]==p)
			{
				if(board[2][0]==p)
				{
					return true;
				}
			}
		}

		return false;
			

	}

	public boolean isFull()
	{
		for(int i=0;i<3;i++)
		{
			for (int j=0;j<3 ;j++ ) 
			{
				if(board[i][j]==' ')
				{
					return false;
				}	
			}
		}

		return true;
	}




}
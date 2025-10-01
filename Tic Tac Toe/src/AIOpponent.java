
public class AIOpponent
	{
		
		public static void aiMove() 
		{
			
			int randomRow =  (int)(Math.random()*3);
			int randomCol =  (int)(Math.random()*3);
			
			// if space is blank
			Board.board[randomRow][randomCol] = "O";
			// else call aimove again
		}
	}

public class PlayGame
	{
		public static void main(String[] args)
			{
				Board.prepareBoard();
				Board.displayBoard();
				boolean stillPlaying = true;
				int moveCounter = 0;
				while (stillPlaying) 
					{
					
					Player.askForMove();
					Board.isWonGame();
					Board.displayBoard();
					moveCounter++;
					
					if (moveCounter != 5)
						{
							AIOpponent.aiMove();
							Board.isWonGame();
							Board.displayBoard();
							
						}
					else 
						{
							stillPlaying = false;
							
						}
					
					

					}
			}
	}

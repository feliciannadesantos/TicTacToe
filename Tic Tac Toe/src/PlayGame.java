public class PlayGame
	{
		public static void main(String[] args)
			{
				Board.prepareBoard();
				Board.displayBoard();
				boolean stillPlaying = true;
				while (stillPlaying) 
					{
					Player.askForMove();
					Board.isWonGame();
					Board.displayBoard();
					AIOpponent.aiMove();
					Board.displayBoard();
					Board.isWonGame();

					}
			}
	}

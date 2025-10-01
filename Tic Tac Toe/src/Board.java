
public class Board
	{
		static String[][] board = new String [3][3];
		static void displayBoard()
			{
				
				System.out.println("   1   2   3");
				System.out.println(" -------------");
				System.out.println("A| "+ board[0][0] + " | " + board[0][1] + " | " + board[0][2] + " | ");
				System.out.println(" -------------");
				System.out.println("B| "+ board[1][0] + " | " + board[1][1] + " | " + board[1][2] + " | ");
				System.out.println(" -------------");
				System.out.println("C| "+ board[2][0] + " | " + board[2][1] + " | " + board[2][2] +" | ");
				System.out.println(" -------------");
				
			}
		static void prepareBoard()
			{
				for (int row = 0; row < board.length; row++)
					{
						for(int col = 0; col < board[0].length; col++)
							{
								board[row][col] = " ";
							}
					}
			}
		public static void isWonGame()
			{
			if ((board[0][0].equals(board[0][1]) && board[0][1].equals(board[0][2]) && !board[0][1].equals(" ")) ||
				(board[1][0].equals(board[1][1]) && board[1][1].equals(board[1][2]) && !board[1][1].equals(" ")) ||
				(board[2][0].equals(board[2][1]) && board[2][1].equals(board[2][2]) && !board[2][1].equals(" ")) ||
				(board[0][0].equals(board[1][0]) && board[1][0].equals(board[2][0]) && !board[1][0].equals(" ")) ||				
				(board[0][1].equals(board[1][1]) && board[1][1].equals(board[2][1]) && !board[1][1].equals(" ")) ||
				(board[0][2].equals(board[1][2]) && board[1][2].equals(board[2][2]) && !board[1][2].equals(" ")) ||
				(board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]) && !board[1][1].equals(" ")) ||
				(board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]) && !board[1][1].equals(" ")))
				{
				System.out.println("The game is over!");
				System.exit(0);
				}
			}
	}

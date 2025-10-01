import java.util.Scanner;

public class Opponent
	{
		static Scanner userStringInput = new Scanner(System.in);
		 public static void askForMove2() 
			 {
				 System.out.println("Make a move");
		      String move = userStringInput.nextLine();
			  
			  if (move.equals("A1"))
				 {
					 Board.board[0][0] = "O";
				 }
			  else if (move.equals("A2"))
				  {
					  Board.board[0][1] = "O";
				  }
			  else if (move.equals("A3"))
				  {
					  Board.board[0][2] = "O";
				  }
			  else if (move.equals("B1"))
				  {
					  Board.board[1][0] = "O";
				  }
			  else if (move.equals("B2"))
				  {
					  Board.board[1][1] = "O";
				  }
			  else if (move.equals("B3"))
				  {
					  Board.board[1][2] = "O";
				  }
			  else if (move.equals("C1"))
				  {
					  Board.board[2][0] = "O";
				  }
			  else if (move.equals("C2"))
				  {
					  Board.board[2][1] = "O";
				  }
			  else if (move.equals("C3"))
				  {
					  Board.board[2][2] = "O";
				  }
		     }
	}

	

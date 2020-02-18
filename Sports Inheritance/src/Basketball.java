
public class Basketball extends Sports
	{
		public String typeOfShoes;

		public int amountOfPoints;

		public Basketball(String ball, String playerName, String typeOfShoes, int amountOfPoints) 

		{

			super(ball, playerName);

			{

				typeOfShoes = typeOfShoes;

				amountOfPoints = amountOfPoints;

			}

		}

		public void setPoints(int p)

		{

			amountOfPoints = p;

		}

		public void movesBall()

		{

			System.out.println(playerName + " just bounce passed the basketball!");

		}

		public void scoresPoints()

		{

			System.out.println(playerName + " just hit a free throw, his last points of the game, getting him to a total of " + amountOfPoints);

		}

		public void celebrates()

		{

			System.out.println(playerName + " gathers with his team to celebrate after they set a state record for points in a game!");

		}
	}

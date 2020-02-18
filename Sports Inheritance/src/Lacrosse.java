
public class Lacrosse extends Sports
	{
		public String typeOfShoes;

		public int goalsScored;

		public Lacrosse(String ball, String playerName, String typeOfShoes, int goalsScored) 

		{

			super(ball, playerName);

			{

				typeOfShoes = typeOfShoes;

				goalsScored = goalsScored;

			}

		}

		public void setGoals(int g)

		{

			goalsScored = g;

		}

		public void movesBall()

		{

			System.out.println(playerName + " just cleared the ball up the field");

		}

		public void scoresPoints()

		{

			System.out.println(playerName + " just dodged and got to the open field to score a goal!");

		}

		public void celebrates()

		{

			System.out.println(playerName + " gathers with his team to celebrate after they wiped the other team off the field!");

		}
	}

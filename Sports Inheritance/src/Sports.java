
public class Sports
	{
		public String ball;

		public String playerName;

		public Sports(String ball, String playerName)

		{

			this.ball = ball;

			this.playerName = playerName;

		}

		public void movesBall()

		{

			System.out.println(playerName + " just had such a nice pass!");

		}

		public void needsEquipment()

		{

			System.out.println(playerName + " will always need to bring a " + ball);

		}


	}

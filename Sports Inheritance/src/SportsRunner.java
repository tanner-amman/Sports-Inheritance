
public class SportsRunner
	{
		public static void main(String[] args) 

			{

				Basketball bball = new Basketball("Basketball", "John", "sneakers", 24);

				Lacrosse lax = new Lacrosse("Lacrosse ball", "Sebastian", "cleats", 4);

				bball.needsEquipment();

				bball.movesBall();

				bball.celebrates();

			

				lax.needsEquipment();

				lax.movesBall();

				lax.celebrates();

		
			}
	}

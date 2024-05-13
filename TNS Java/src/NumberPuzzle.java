
public class NumberPuzzle {
	private int number;
	
	public NumberPuzzle (int number)
	{
		this.number = number;
	}
	public int solvepuzzle()
	{
		if(number < 10 || number > 99)
		{
			System.out.println("Invalid number");
			return 0;
		}
		if (number > 50) 
		{
			int digit1 = number / 10;
			int digit2 = number % 10;
			return digit1 - digit2;
		} 
		else
		{
		 int reversedNumber = (number % 10) * 10 +(number / 10);
		 int digit1 = reversedNumber / 10;
		 int digit2 = reversedNumber % 10;
		 return digit1 - digit2;
		 }
	}
}


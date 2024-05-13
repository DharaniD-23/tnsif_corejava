import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Scanner scanner =new Scanner (System.in);
	    System.out.println("Enter the number");
	    int num = scanner.nextInt();
	    NumberPuzzle puzzle = new NumberPuzzle(num);
System.out.println(puzzle.solvepuzzle());
scanner.close();
	}
}



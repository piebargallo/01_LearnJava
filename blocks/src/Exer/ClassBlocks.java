package Exer;

public class ClassBlocks {

	public static void main(String[] args) {
		int number = 4;
		// Bloc If(alternatiu)
		if(number > 40) {
			number = number -50;
			// bloc else
		} else {
			// Bloc While(Iteratiu)
			while(number > 0) {
			System.out.println(number);
			number = number -1;
			} // End bloc while
		} // End bloc else
	} // End bloc if

} // End driver

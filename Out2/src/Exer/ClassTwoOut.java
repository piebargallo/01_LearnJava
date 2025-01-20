package Exer;

public class ClassTwoOut {

	public static void main(String[] args) {
		// Mètode prinf
		// Hello! 53 89.70 -> afegeix un 0 
		// perquè 89.7 tingui dos decimals
		System.out.printf("Hello! %d %.2f \n", 53, 89.7);
		// Hello! 053 -> afegeix un 0 perquè 53 tingui 3 digits, si no
		// posem el 0 en %03d imprimiria un espai en blanc
		System.out.printf("Hello! %03d \n", 53);
		// eps| 53|89.70 -> el número 53 ocupa una amplada de 6 caràcters
		System.out.printf("%s|%6d|%.2f \n", "eps", 53, 89.7);
		// Hello|53 | -> 53 ocupa 4 posicions i està alienat a l´esquerra (ho indiquem amb un -);
		System.out.printf("Hello|%-4d| \n", 53);
	}

}

// Output
// Hello! 53 89,70 
// Hello! 053 
// eps|    53|89,70 
// Hello|53  | 

package by.epam.jb24.less03.htask1_6;
import java.util.Scanner;

public class LastDigit {
	
    private static int GetKbdInt( Scanner asc, String amsg) {
    	int v_int = 0;
    	
    	System.out.print( amsg +": ");
    	if (asc.hasNextInt()) {
    		v_int = asc.nextInt();
    	};
    	return v_int;
    }
    
    private static int ParseNumber( int a_num ) {
    	int poslZifra = a_num % 10;
		
		switch (poslZifra) {
		case 0:
		    return 0;		
		case 1:
			return 1;		
		case 2:
			return 4;			
		case 3:
			return 9;			
		case 4:
			return 6;
		case 5:
			return 5;			
		case 6:
			return 6;			
		case 7:
			return 9;			
		case 8:
			return 4;			
		case 9:
			return 1;			
		default:			
			return -1;
		}
    }
    
	public static void main(String[] args) {
		int number = 0;
				
		number = GetKbdInt( new Scanner(System.in), "Введите число");
		int poslZifraKv = ParseNumber( number);
		if (poslZifraKv >= 0) {
			System.out.println("Последняя цифра квадрата числа '" + number + "' равняется '" + poslZifraKv + "'");
		} else {
		    System.out.println("Что-то не то с программой.");
		}
	}	
}

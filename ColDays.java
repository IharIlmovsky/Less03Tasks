package by.epam.jb24.less03.htask1_7;

import java.util.Scanner;

public class ColDays {

    private static int GetKbdInt( Scanner asc, String amsg) {
    	int v_int = 0;
    	
    	System.out.print( amsg +": ");
    	if (asc.hasNextInt()) {
    		v_int = asc.nextInt();
    	};
    	return v_int;
    }

    private static int CalcNumberOfDays ( int a_month, int a_year) {
    	
		switch (a_month) {
	    case 1:
	    case 3:
	    case 5:
	    case 7:
	    case 8:
	    case 10:
	    case 12:
	    	return 31;	    	
	    case 2:
	    	if (a_year % 4 == 0) {
	    	return 29;
	    	} else {
	    	return  28;
	    	}	    	
	    case 4:
	    case 6:
	    case 9:
	    case 11:
	    	return 30;	    	
	    }
		return 0;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int year = 0, month = 0, col_day = 0;
		
		year = GetKbdInt(sc, "Введите год");
		System.out.print(": ");
		month = GetKbdInt(sc, "Введите номер месяца");
		col_day = CalcNumberOfDays( month, year);

		System.out.println("Количество дней равно - " + col_day);
		System.out.println(" ColDays() finished");
	}
}

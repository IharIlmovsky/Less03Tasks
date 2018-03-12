package by.epam.jb24.less03.htask1_8;
import java.util.Scanner;

public class Line01 {

	private static int GetKbdInt( Scanner asc, String amsg) {
    	int v_int = 0;
    	
    	System.out.print( amsg +": ");
    	if (asc.hasNextInt()) {
    		v_int = asc.nextInt();
    	};
    	return v_int;
    }
	
	private static int GetLastDigit ( int a_num) {
		return a_num % 10;
	}
	
	private static boolean IsEvenNumb( int a_digit) {
		return  a_digit % 2 == 0;
	}
	
	public static void main(String[] args) {
		
		int number = GetKbdInt(new Scanner(System.in), "������� ����������� ����������� �����");
		if (number == 0) { 
			  System.out.println("���� ��������� ������ ������.");
			  return;
		} else {
		while (number != 0) {		    
		    if (IsEvenNumb( GetLastDigit(number))) {
		    	System.out.println("� ����� ���� ������ �����.");
		        return;
		    } else {
		    	number = number / 10;
		    }
		}
		System.out.println("� ����� ��� ������ ����.");
		}
		System.out.println("Line01() finished");
	}
}

package by.epam.jb24.less03.htask3;
import java.util.Scanner;
import java.lang.Math;


public class CalcFuncLess03Task3 {

	private static double GetKbdValue( Scanner asc, String amsg) {
    	double v_val = Double.NaN;
    	String  vstr;
    	
    	while( v_val != Double.NaN ) {
    		System.out.print( amsg + ": ");
    		vstr = asc.nextLine();
    		try {     			
    			v_val = Double.parseDouble( vstr);
    			return v_val;
    	    } catch(NumberFormatException e) {
    	    	System.out.printf("\n �������� '%s' �� �������� ��� 'x'\n", vstr); 
    	    };
    	}
    	return v_val;
    }

	public static void main(String[] args) {		
		double y = Double.NaN, x;		
		
		x = GetKbdValue( new Scanner(System.in), "������� �������� ��������� 'X'");
		if (x <= -3) {
			y = 9;
		} else {
			if (x > 3) {
				y = (1 / (x*x + 1));				
			}
		}
		if (y != Double.NaN) {
			System.out.printf(" ������� ������� ����� '%10.3f' ��� �������� ��������� 'x:%.3f' \n", y,x);
		} else {
			System.out.printf(" ������� ������� ������������ ��� �������� ��������� 'x:%.3f' \n", x);
		}
		System.out.println("\n CalcFuncLess03Task3() finished");
	}

}

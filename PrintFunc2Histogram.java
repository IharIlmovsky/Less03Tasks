package by.epam.jb24.less03.htask2;
import java.util.Scanner;
import java.lang.Math;

public class PrintFunc2Histogram {
	//public static double a, b, h = 0; 
	
	private static double GetKbdValue( Scanner asc, String amsg, String val_name) {
    	double v_val = Double.NaN;
    	String  vstr;
    	
    	while( v_val != Double.NaN ) {
    		System.out.print( amsg + " '" + val_name + "': ");
    		vstr = asc.nextLine();
    		try { 
//    			System.out.println();
    			v_val = Double.parseDouble( vstr);
    		/*  switch(val_name) {
    			  case "a": a = v_val;
    			  case "b": b = v_val;
    			  case "h": h = v_val;
    			} */    			    			
    			return v_val;
    	    } catch(NumberFormatException e) {
    	    	System.out.printf("\n �������� '%s' ������� ��� '%s', \n", vstr, val_name); 
    	    };
    	}
    	return v_val;
    }
	
	public static double CalcFunc (double ax) {

		return (Math.tan(ax / 2) * 2) + 1;
	}
	
	public static void PrintHistogramm(double a, double b, double step) {
		double y; // function value
		double vx; // current x value 
		
		vx =  a;
		System.out.println("\n ������ �������� �������:");
		while (vx <b ) {
			y = CalcFunc (vx); 
			System.out.printf("��������: '%7.2f' ��������: '%12.4f' \n", vx, y);
			vx = vx + step;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b, h = 0;
		Scanner sc = new Scanner(System.in);
				
		a = GetKbdValue( sc, "������� �������� ��� ���������", "a");
		b = GetKbdValue( sc, "������� �������� ��� ���������", "b");
		h = GetKbdValue( sc, "������� �������� ��� ���������", "h");
		PrintHistogramm(a, b, h);
		System.out.println("\n PrintFunc2Histogram() finished");	
	}
}

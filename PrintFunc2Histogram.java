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
    	    	System.out.printf("\n значение '%s' неверно для '%s', \n", vstr, val_name); 
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
		System.out.println("\n печать значений функции:");
		while (vx <b ) {
			y = CalcFunc (vx); 
			System.out.printf("аргумент: '%7.2f' значение: '%12.4f' \n", vx, y);
			vx = vx + step;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b, h = 0;
		Scanner sc = new Scanner(System.in);
				
		a = GetKbdValue( sc, "Введите значение для параметра", "a");
		b = GetKbdValue( sc, "Введите значение для параметра", "b");
		h = GetKbdValue( sc, "Введите значение для параметра", "h");
		PrintHistogramm(a, b, h);
		System.out.println("\n PrintFunc2Histogram() finished");	
	}
}

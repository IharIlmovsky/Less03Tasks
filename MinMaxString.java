package by.epam.jb24.less03.htask1_5;
import java.util.Scanner;

public class MinMaxString {	
	public static String max = "", min = ""; 
			
    private static String GetString( Scanner asc, int a_numb) {
    	String vstr = "";
    	
    	System.out.printf("Type string #%d: > ", a_numb+1 );
    	if (asc.hasNextLine()) {
    	   vstr = asc.nextLine();
    	};
    	return vstr;
    };
    
    private static boolean IsStringLonger(String astr, int a_maxlength) {

	    return astr.length() > a_maxlength;
    }

    private static boolean IsStringLess(String astr, int a_min_length) {
    	
    	    return (astr.length() < a_min_length); 
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		Scanner sc = new Scanner(System.in);		
		//String max = "", min = "", str = "";		
		String str = "";
		
		for (int i = 0; i < n; i++) {
		    str = GetString(sc, i);
		    if (i == 0) {
		        min = str;
		    }
		    if (IsStringLonger(str, max.length())) {
		      max = str;
		    } else 
		    if (IsStringLess(str, min.length())) {
		      min = str;
		    }
		};
		System.out.println("max string = " + max + " length=" + max.length());
		System.out.println("min string = " + min + " length=" + min.length());
		System.out.println(" MinMaxString() finished");
	}
}
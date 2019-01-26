
public class Problem {
	
	/*public boolean posNeg(int a, int b, boolean negative) {
		  if (negative) {
		    return (a < 0 && b < 0);
		  }
		  else {
		    return ((a < 0 && b > 0) || (a > 0 && b < 0));
		  }
		}*/
	
	/*public String missingChar(String str, int n) {  
	    String front = str.substring(0, n);
	    String back = str.substring(n+1, str.length());
	    return front + back;
	}*/
	
	
	public String missing(String str,int n) {
		
		String u=str.substring(0,1);
		String v=str.substring(n-1,str.length());
		
		String wString=u+ str.substring(n-3,str.length()) + str.substring(n-2,str.length()) +v;
	    
		return wString;
	}


}

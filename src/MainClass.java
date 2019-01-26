import java.awt.print.Printable;
import java.util.Collections;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map.Entry;

public class MainClass {

	public static void main(String[] args) {
		
		
		/*
		   HashMap<String,Integer> hm=new HashMap<String,Integer>();  
		   
		    System.out.println("Initial list of elements: ");  
		      hm.put("Amit",100);    
		      hm.put("Vijay",200);    
		      hm.put("Rahul",300);  */
		
		
		/* HashMap<String,Integer>value=new HashMap<String, Integer>();
	        value.put("jone", 50);
	        value.put("rony", 60);
	        value.put("karim", 30);
	        value.put("rahim", 50);
	        value.put("ujjal", 60);
	        int maxValueInMap=(Collections.max(value.values()));

	        for (Entry<String, Integer> entry : value.entrySet()) { 
	        	
	            if (entry.getValue()==maxValueInMap) {
	                System.out.println(entry.getKey());     // Print the key with max value
	            }
	        }*/
		
		
		int arr[] = { 14, 46, 47, 86, 92, 52, 48, 36, 66, 85 };
		int largest = arr[0];
		int secondLargest = arr[0];
		
		
		System.out.println("The given array is:" );
		
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[0]+"\t");
		}
		
		
		for (int i = 0; i < arr.length; i++) {
 
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
 
			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];
 
			}
		}
 
		System.out.println("\nSecond largest number is:" + secondLargest);
 
	}
	        
	        
	        
		      
		      
		      
		      
		      
		
	//Problem problem=new Problem();
	/*Boolean boolean1=problem.posNeg(-4, -7,true);
	System.out.println(boolean1);
	
		String str1= " hellow";
		String hello=str1.substring(0,7).trim();
		System.out.println(hello);
		
		String pString=problem.missingChar("jone", 1);
		System.out.println(pString);
		*/
		//String resultt=problem.missing("jone", 3);
		//System.out.println(resultt);
		
	}
	


		
		/*NewClass OBJ=new NewClass();
		
		int arrayr[]=OBJ.myArray();
		for (int i : arrayr) {
			
			
		}*/
		
		
		/*Object mix[]={8376,"jone",847.4848,'j',858};
		
		OBJ.myArray(mix);
*/
	


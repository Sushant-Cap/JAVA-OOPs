//The for-each loop is used to traverse array or collection in Java.
//It is easier to use than simple for loop because we don't 
//need to increment value and use subscript notation.

//It works on the basis of elements and not the index. 
//It returns element one by one in the defined variable.



//Java For-each loop example which prints the  
//elements of the array 

//package java_fundamentals;
//public class For_Each {  
//public static void main(String[] args) {  
//  //Declaring an array  
//  int arr[]={12,23,44,56,78};  
//  //Printing array using for-each loop  
//  for(int i:arr){  
//      System.out.println(i);  
//  }  
//}  

package java_fundamentals;
public class For_Each{
	public static void main (String[] args) {
		int arr[]= {1,2,3,4,5,66,77};
		for (int i:arr) {
			System.out.println(i);
		}
	}
	
}
//make 1st push
/******************************************************************************* 
 * Author: Muhammad Aqil Danish bin Yusoff 
 * Program Name: StudentInformationSystem
 * Description: To do the GitHub
 * Date: 28 October 2026 
 * Modified Date: None 
 * Version: 1.0 
 *******************************************************************************/ 
package studentinformationsystem; // Declare the package name

// Declare the public class 
public class StudentInformationSystem {

    // Declare the main method 
    public static void main(String[] args) {
        
        //Display the string text 
        System.out.println("Name: Muhammad Aqil Danish bin Yusoff ");
        System.out.println("Student ID: S87290");
        
        // Put the mark
        int mark1 = 20, mark2 = 70;
        // Calculate total mark
        int total = mark1 + mark2; 
        System.out.println("Total mark: " + total); // Display total mark
        
        // Check if the total mark excellent or not 
        if (total >= 80){
            // Display Excellent result
            System.out.println("Result: Excellent");
        }else if (total >= 50){
            // Display good result 
            System.out.println("Result: Good");
        }else {
            // Display result 
            System.out.println("Need More Improvement!");
            
          
        }
                
                
    } 
    
}

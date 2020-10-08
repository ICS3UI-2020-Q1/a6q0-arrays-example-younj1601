import java.util.Scanner;
/**
 *Array example
 * @author Jackson
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
   //scanner for input
   Scanner input = new Scanner(System.in);
   //variable type[] name = new variable_type[size]

   //create an array for grades to be stored
   double[] grades = new double[5];

   //get grades from user and store them in the array
   for(int i = 0; i < grades.length; i++){
     System.out.println("Please enter grade " + (i + 1));
     grades[i] = input.nextDouble();
   }
    double sum = 0;
    
    //add up all of the grades into sum
    for(int i = 0; i < grades.length; i++){
      sum = sum + grades[i];
    }

    //determine the average age and let the user know
    double average = sum/grades.length;
    System.out.println("Your average grade is " + average);

  }
}

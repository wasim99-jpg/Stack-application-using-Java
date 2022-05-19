
/**
 * Write a description of class StudentApp here.
 * 
 * @author Zulaile Mabni
 * @version (a version number or a date)
 */
import java.util.*;
public class StudentApp
{
    public static void main( String args[] )
    {
        MyStack objStack = new MyStack();  // Step 1: create the Stack object
        Scanner in = new Scanner (System.in);

        // Step 2: Input data for object
        String name;
        int prt, num,stuId;;
        double cgpa;
        
        System.out.println(" How many students? ");
        num = in.nextInt();
            
        for (int i = 0; i < num; i++)
        {
            System.out.println(" Enter name:");
            name = in.next();
            System.out.println(" Enter id:");
            stuId= in.nextInt();
            System.out.println(" Enter part:");
            prt = in.nextInt();
            System.out.println(" Enter score:");
            cgpa = in.nextDouble();
             
            // Step 3: Create and store data into object
            Student stud = new Student (name, stuId, prt, cgpa);
       
            // Step 4: insert object at front into stack
            objStack.push(stud);
        }
            objStack.display();
           
            // Complete the Exercises:
            //Calculate and display the total and average scores
            //Display the details of student who achieved the highest score
           
       
    }
}

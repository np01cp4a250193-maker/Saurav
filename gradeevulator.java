import java.util.Scanner;
/**
 * Write a description of class Gradeevaluator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class gradeevulator
{
  public static void main(String[]args)
  {
      Scanner input=new Scanner(System.in);
      System.out.print("Enter your numeric grade");
      float grade=input.nextFloat();
      String Status= (grade>=40)?"Pass":"Fail";
      System.out.println(Status);
      
      
      
  }
  
  
}
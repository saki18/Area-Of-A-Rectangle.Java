/**     ___  ___       ___   _____       ___   _   _    _  
*      /   |/   |     /   | /  ___/     /   | | | / /  | | 
*     / /|   /| |    / /| | | |___     / /| | | |/ /   | | 
*    / / |__/ | |   / / | | \___  \   / / | | | |\ \   | | 
*   / /       | |  / /  | |  ___| |  / /  | | | | \ \  | | 
*  /_/        |_| /_/   |_| /_____/ /_/   |_| |_|  \_\ |_| 
*
* 
*/
package areaofrectangle;
/**
 *
 * @author Masaki Takahashi
 * Course Name: CITP 190 
 * Source: AreaOfRectangle.java
 * Project Name: Workbook 2-1
 * Description: Calculate the area of the rectangle. You must press y/Y to 
 * continue. 
 */
import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args) {
    String choice = "y";
while (choice.equalsIgnoreCase("y"))
{
//Welcome statement to the user.
System.out.println("Welcome to the Area and Perimeter Calculator");
System.out.println();

//Get length from the user.
Scanner sc = new Scanner(System.in);
System.out.print("Enter length: ");
double length = sc.nextDouble();

//Get width from the user.
Scanner sd = new Scanner(System.in);
System.out.print("Enter width: ");
double width = sd.nextDouble();

//Calculate the area and display it to the user.
double area = length * width;
System.out.println("Area: " + area);

//Calculate the perimeter and display it to the user.
double perimeter = 2 * width + 2 * length;
System.out.println("Perimeter: " + perimeter);

//See if the user wants to continue.
System.out.print("Continue? (Y/N): ");
choice = sc.next();
System.out.println();
}
    }    
}

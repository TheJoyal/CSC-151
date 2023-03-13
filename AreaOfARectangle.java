// Calculate the area of a rectangle using JOptionPane
// Nick Joyal
// 1/23/2023

package area.of.a.rectangle;
import javax.swing.JOptionPane;

public class AreaOfARectangle
{
        public static String input;
        public static String name;
        public static double length;
        public static double width;
        public static double area;
    
    public static void main(String[] args)

    {
        //String input;
        //String name;
        //double length;
        //double width;
        //double area;
          getName();
          getLength();
          getWidth();
          displayArea();
    }
        
        public static void getName()
        {
        name = JOptionPane.showInputDialog("Hello! What is your name?");
        }
        
        public static void getLength()
        {
                input = JOptionPane.showInputDialog("Enter Length");
                length = Integer.parseInt(input);
        }
        
        public static void getWidth()
        {
        input = JOptionPane.showInputDialog("Enter Width");
        
        width = Integer.parseInt(input);
        }
        
        public static void displayArea()
        {
        area = length * width;
        
        JOptionPane.showMessageDialog(null,
                                      "Hello " + name + "! The area of your rectangle is " + area);
        }
// TODO code application logic here
    
    
}

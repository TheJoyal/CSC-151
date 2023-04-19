// CSC 151
// Calculate the area of a rectangle using JOptionPane
// Nick Joyal
// 1/23/2023

package area.of.a.rectangle;
import javax.swing.DefaultBoundedRangeModel;
import javax.swing.JOptionPane;

public class AreaOfARectangle
{
        public static String input;
        public static String name;
        public static String shape;
        public static double length;
        public static double width;
        public static double area;
    
        public static String type;
        public static String Shape1;
        public static String Shape2;
        public static String formula;
        public static double answer;
    public static void main(String[] args)

    {
        //String input;
        //String name;
        //double length;
        //double width;
        //double area;
          getName();
          getType();
          getShape1();
          getFormula();
          getLength();
          getWidth();
          displayArea();
    }
        
        public static void getName()
        {
         name = JOptionPane.showInputDialog("Hello! What is your name?");
        }

        public static void getType()
        {
            String[] choices = { "2D", "3D"};
            String input = (String) JOptionPane.showInputDialog(null, "Choose your type of shape",
                "Choose your type of shape", JOptionPane.QUESTION_MESSAGE, null, // Use
                                                                                     // default
                                                                                     // icon
                choices, // Array of choices
                choices[0]); // Initial choice
            System.out.println(input);
            type = input;
        
        
        switch(type)
        {
        case "2D":
          getShape1();
          break;
        
        case "3D":
          getShape2();
          break;
        
        Default:        
            getShape1();
        }
        }


        public static void getShape1()
        {
            String[] choices = { "Circle", "Square", "Rectangle", "Parallelogram", "Trapezoid"};
            String input = (String) JOptionPane.showInputDialog(null, "Choose your shape",
                "Choose your shape", JOptionPane.QUESTION_MESSAGE, null, // Use
                                                                                     // default
                                                                                     // icon
                choices, // Array of choices
                choices[0]); // Initial choice
            System.out.println(input);
            Shape1 = input;
            
            switch(Shape1)
            {
                case "Circle":
                    getFormula();
                    break;
                    
                case "Square":
                    getFormula();
                    break;
                            
                case "Rectangle":
                    getFormula();
                    break;
                    
                case "Parallelogram":
                    getFormula();
                    break;
                    
                case "Trapezoid":
                    getFormula();
                    break;
                    
                default:
                    getFormula();
            }
        
        }

        // add switch here for shape1 choices

        public static void getShape2()
        {
            String[] choices = { "Rectangular Solid", "Cube", "Right Circular Cylinder", "Sphere", "Right Circular Cone", "Pyramid", "Right Circular Cone Frustun"};
            String input = (String) JOptionPane.showInputDialog(null, "Choose your shape",
                "Choose your shape", JOptionPane.QUESTION_MESSAGE, null, // Use
                                                                                     // default
                                                                                     // icon
                choices, // Array of choices
                choices[0]); // Initial choice
            System.out.println(input);  
            Shape2 = input;
            
            switch (Shape2)
            {
                case "Rectangular Solid":
                        getFormula();
                break;
                
                case "Cube":
                        getFormula();
                break;
                
                case "Right Circular Cylinder":
                        getFormula();
                break;
                
                case "Sphere":
                        getFormula();
                break;
                
                case "Right Circular Cone":
                        getFormula();
                break;
                
                case "Pyramid":
                        getFormula();   
                break;
                
                case "Right Circular Cone Frustun":
                        getFormula();
                break;
                
                default: 
                        getFormula();
            }
        }

        
        // add switch here for shape2 choces


        public static void getFormula()
        {
            String[] choices = { "Area", "Circumference", "Diameter", "Radius"};
            String input = (String) JOptionPane.showInputDialog(null, "Choose your formula",
                "Choose your formula", JOptionPane.QUESTION_MESSAGE, null, // Use
                                                                                     // default
                                                                                     // icon
                choices, // Array of choices
                choices[0]); // Initial choice
            System.out.println(input);
            formula = input;
            
            switch(formula)
        {
            case "Area":
            getLength();
            getWidth();
            displayArea();
            break;
            
            case "Circumference":
            
                break;

            case  "Diameter":
            
                break;

            case "Radius":
            
                break;
        }
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
                                      "Hello " + name + "! The " + formula + "of your " + shape + "is " + answer);
        }
// TODO code application logic here
    
    
}

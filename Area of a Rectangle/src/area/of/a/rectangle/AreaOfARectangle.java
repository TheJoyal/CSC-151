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
        public static double height;
        public static double area;
        public static double circumference;
        public static double diameter;
        public static double radius;
        public static double volume;
        public static double surfaceArea;
        
        
    
        public static String type;
        public static String Shape2D;
        public static String Shape3D;
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
          getShape2D();
          getShape3D();
          //getFormula();
          getFormulaC();
          getFormulaS();
          getFormulaR();
          getFormulaP();
          getFormulaT();
          getLength();
          getWidth();
          getHeight();
          getRadius();
          displayArea();
          getCircumference();
          getDiameter();
          getRadius();
          getVolume();
          getSurfaceArea();
          displayCircumference();
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
          getShape2D();
          break;
        
        case "3D":
          getShape3D();
          break;
        
        Default:        
            getShape2D();
        }//end switch
        }//end getType()


        public static void getShape2D()
        {
            String[] choices = { "Circle", "Square", "Rectangle", "Parallelogram", "Trapezoid"};
            String input = (String) JOptionPane.showInputDialog(null, "Choose your shape",
                "Choose your shape", JOptionPane.QUESTION_MESSAGE, null, // Use
                                                                                     // default
                                                                                     // icon
                choices, // Array of choices
                choices[0]); // Initial choice
            System.out.println(input);
            Shape2D = input;
            
            
            
            switch(Shape2D)
            {
                case "Circle":
                    getFormulaC();
                    break;
                    
                case "Square":
                    getFormulaS();
                    break;
                            
                case "Rectangle":
                    getFormulaR();
                    break;
                    
                case "Parallelogram":
                    getFormulaP();
                    break;
                    
                case "Trapezoid":
                    getFormulaT();
                    break;
                    
                default:
                    getFormula();
            }//end switch
        
        }//end getShape1

        // add switch here for shape1 choices

        public static void getShape3D()
        {
            String[] choices = { "Rectangular Solid", "Cube", "Right Circular Cylinder", "Sphere", "Right Circular Cone", "Pyramid", "Right Circular Cone Frustun"};
            String input = (String) JOptionPane.showInputDialog(null, "Choose your shape",
                "Choose your shape", JOptionPane.QUESTION_MESSAGE, null, // Use
                                                                                     // default
                                                                                     // icon
                choices, // Array of choices
                choices[0]); // Initial choice
            System.out.println(input);  
            Shape3D = input;
            
            switch (Shape3D)
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
            }//end switch
        }//end getShape2

        
        // add switch here for shape2 choces


        public static void getFormulaC()
        {
            String[] choices = { "Circumference", "Diameter", "Radius"};
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
                case "Circumference":
                    getCircumference();
                    getType();
                    break;
                    
                case "Radius":
                    getRadius();
                    getType();
            }
        }
            
            public static void getFormulaS()
        {
            String[] choices = { "Area"};
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
                    getType();
                    break;
                    
            }
        }
            
            public static void getFormulaR()
        {
            String[] choices = { "Area"};
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
                    getType();
                    break;
                    
            }
        }
        
            
            public static void getFormulaP()
        {
            String[] choices = { "Area"};
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
                    getType();
                    break;
                    
            }
        }
            
            
            public static void getFormulaT()
        {
            String[] choices = { "Area"};
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
                    getType();
                    break;
                    
            }
        }
        
        
        /*public static void getFormula()
        {
            String[] choices = { "Area", "Circumference", "Diameter", "Radius", "Volume"};
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
            getType();
            break;
            
            case "Circumference":
            getCircumference();
            displayCircumference();
            getType();

            case  "Diameter":
            getDiameter();
            getType();
                break;

            case "Radius":
            getRadius();
            getType();
                break;
                
            case "Volume":
                getType();
                break;
        
            default:
                getType();
            
            }//end switch
        }//end getFormula() */
        

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
        
        public static void getCircumference()
        {
           int radius1;
            input = JOptionPane.showInputDialog("Enter Radius");
            radius1 = Integer.parseInt(input);
            circumference = 2 * 3.14 * radius1;
            displayCircumference();
        }
        
        public static void getDiameter()
        {
            int radius2;
            input = JOptionPane.showInputDialog("Enter Radius");
            radius2 = Integer.parseInt(input);
            diameter = 2 * radius2;
        }
        
        public static void getRadius()
        {
            int circumference1;
            input = JOptionPane.showInputDialog("Enter Circumference");
            circumference1 = Integer.parseInt(input);
            radius = circumference1 / 2 * 3.14;
            displayRadius();
        }
        
        public static void getVolume();
        {
            if(formula == "Rectangular Solid")
            {
                volume = length * width * height; 
            }//end if
            
            if(formula == "Cube")
            {
                
            }//end if
            
            if(formula == "Right Circular Cylinder")
            {
                
            }//end if
            
            if(formula == "Sphere")
            {
                
            }//end if
            
            if(formula == "Right Circular Cone")
            {
                
            }//end if
            
            if(formula == "Rectangular Pyramid")
            {
                
            }//end if
            
            if(formula == "Right Circular Cone Frustum")
            {
                
            }//end if
            
            public static void getSurfaceArea();
        {
            if(formula == "Rectangular Solid")
            {
                volume = length * width * height; 
            }//end if
            
            if(formula == "Cube")
            {
                
            }//end if
            
            if(formula == "Right Circular Cylinder")
            {
                
            }//end if
            
            if(formula == "Sphere")
            {
                
            }//end if
            
            if(formula == "Right Circular Cone")
            {
                
            }//end if
            
            if(formula == "Rectangular Pyramid")
            {
                
            }//end if
            
            if(formula == "Right Circular Cone Frustum")
            {
                
            }//end if
            
            JOptionPane.showMessageDialog(null,
                "Hello " + name + " The Volume of your Rectangular Solid is "+ volume);
        }
        
        public static void displayArea()
        {
         area = length * width;
         JOptionPane.showMessageDialog(null,
                 "Hello " + name + " The Area of your shape is "+ area);
        }
        
        public static void displayRadius()
        {
            JOptionPane.showMessageDialog(null,
                     "Hello " + name + " The Radius of your shape is " + radius);
        }
         
       // TODO: If statement to dictate which shape name is displayed when the answer is given
        public static void displayCircumference()
        {
            JOptionPane.showMessageDialog(null,
                    "Hello " + name + " The Circumference of your shape is " + circumference);
        }
        /*
        {
         JOptionPane.showMessageDialog(null,
                                      "Hello " + name + "! The " + formula + "of your " + Shape1 + "is " + answer);
        }
*/
// TODO code application logic here
    
    
 }
}

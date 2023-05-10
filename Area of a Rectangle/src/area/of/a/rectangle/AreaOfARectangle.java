// CSC 151
// Calculate the area of a rectangle using JOptionPane
// Nick Joyal
// 1/23/2023



// TODO: Add the rest of the formulas for the 3d shapes and make them their own classes.

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
          getFormulaTR();
          getFormulaRS();
          getFormulaCU();
          getFormulaRC();
          getFormulaSP();
          getFormulaRCC();
          getFormulaPY();
          getFormulaRCCF();
          getLength();
          getWidth();
          getHeight();
          getRadius();
          displayArea();
          displayAreaS();
          displayAreaP();
          displayAreaT();
          displayAreaTR();
          displayPerimeterS();
          displayPerimeterR();
          displayPerimeterT();
          displayPerimeterTR();
          getCircumference();
          getDiameter();
          getRadius();
          //getVolume();
          //getSurfaceArea();
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
        
        default:        
            getShape2D();
        }//end switch
        }//end getType()


        public static void getShape2D()
        {
            String[] choices = { "Circle", "Square", "Rectangle", "Parallelogram", "Trapezoid", "Triangle"};
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
                    
                case "Triangle":
                    getFormulaTR();
                    
                default:
                    getFormulaR();
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
                        getFormulaRS();
                break;
                
                case "Cube":
                        getFormulaCU();
                break;
                
                case "Right Circular Cylinder":
                        getFormulaRC();
                break;
                
                case "Sphere":
                        getFormulaSP();
                break;
                
                case "Right Circular Cone":
                        getFormulaRCC();
                break;
                
                case "Pyramid":
                        getFormulaPY();   
                break;
                
                case "Right Circular Cone Frustun":
                        getFormulaRCCF();
                break;
                
                default: 
                        getFormulaRS();
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
            String[] choices = { "Area", "Perimeter"};
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
                    displayAreaS();
                    getType();
                    break;
                    
                case "Perimeter":
                    getLength();
                    displayPerimeterS();
                    getType();
                    
                    
            }
        }
            
            public static void getFormulaR()
        {
            String[] choices = { "Area", "Perimeter"};
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
                    
                case "Perimeter":
                    getLength();
                    getWidth();
                    displayPerimeterR();
                    getType();
            }
        }
        
            
            public static void getFormulaP()
        {
            String[] choices = { "Area", "Perimeter"};
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
                    getHeight();
                    displayAreaP();
                    getType();
                    break;
                    
                case "Perimeter":
                    getLength();
                    getWidth();
                    displayPerimeterR();
                    getType();
            }
        }
            
            
            public static void getFormulaT()
        {
            String[] choices = { "Area", "Perimeter"};
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
                    displayAreaT();
                    getType();
                    break;
                    
                case "Perimeter":
                    displayPerimeterT();
                    getType();
                    
            }
        }
            
            public static void getFormulaTR()
        {
            String[] choices = { "Area", "Perimeter"};
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
                    displayAreaTR();
                    getType();
                    break;
                    
                case "Perimeter":
                    displayPerimeterTR();
                    getType();
                    
            }
        }
            
            public static void getFormulaRS()
        {
            String[] choices = { "Volume", "Surface Area"};
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
                case "Volume":
                    getLength();
                    getWidth();
                    getHeight();
                    volume = length * width * height;
                JOptionPane.showMessageDialog(null,
                "Hello " + name + " The Volume of your Rectangular Solid is "+ volume);
                    getType();
                    
                case "Surface Area":
                    double surfaceArea;
                input = JOptionPane.showInputDialog("Enter Length");
                length = Integer.parseInt(input);
                input = JOptionPane.showInputDialog("Enter Width");
                width = Integer.parseInt(input);
                input = JOptionPane.showInputDialog("Enter Height");
                height = Integer.parseInt(input);
                
                
                surfaceArea = 2 * length * height + 2 * width * height + 2 * width * length; 
                
                JOptionPane.showMessageDialog(null,
                 "Hello " + name + " The Surface Area of your shape is "+ surfaceArea);
                    getType();
            }
        }
            
            public static void getFormulaCU()
        {
            String[] choices = { "Volume", "Surface Area"};
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
                case "Volume":
                    double side;
                    input = JOptionPane.showInputDialog("Enter Side");
                    side = Integer.parseInt(input);
                    
                    volume = side * side * side;
                    
                    JOptionPane.showMessageDialog(null,
                 "Hello " + name + " The Volume of your cube is "+ volume);
                    getType();
                    break;
                         
                case "Surface Area":
                    double surfaceArea;
                    
                    input = JOptionPane.showInputDialog("Enter Side");
                    side = Integer.parseInt(input);
                    
                    surfaceArea = 6 * side * 6 * side;
                    
                    JOptionPane.showMessageDialog(null,
                 "Hello " + name + " The Surface Area of your cube is "+ surfaceArea);
                    getType();
         }
        }
            public static void getFormulaRC()
        {
            String[] choices = { "Volume", "Surface Area"};
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
                case "Volume":
                    double volume, radius, height;
                    
                    input = JOptionPane.showInputDialog("Enter Radius");
                    radius = Integer.parseInt(input);
                    input = JOptionPane.showInputDialog("Enter Height");
                    height = Integer.parseInt(input);
                    
                    volume = 3.14 * radius *radius * height;
                    
                    JOptionPane.showMessageDialog(null,
                 "Hello " + name + " The Volume of your Right Circular Cylinder is "+ volume);
                    getType();
                    
                    break;
                    
                case "Surface Area":
                    double surfaceArea;
                    
                    input = JOptionPane.showInputDialog("Enter Radius");
                    radius = Integer.parseInt(input);
                    input = JOptionPane.showInputDialog("Enter Height");
                    height = Integer.parseInt(input);
                    
                    surfaceArea = 2 * 3.14 * radius * height + 2 * 3.14 * radius * radius;
                    
                    JOptionPane.showMessageDialog(null,
                 "Hello " + name + " The Surface Area of your Right Circular Cylinder is "+ surfaceArea);
                    getType();
                    
                    
            }
            
            }
            public static void getFormulaSP()
        {
            String[] choices = { "Volume", "Surface Area"};
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
                case "Volume":
                    double radius;
                    
                    input = JOptionPane.showInputDialog("Enter Radius");
                    radius = Integer.parseInt(input);
                    
                    volume = 1.33 * 3.14 * radius *radius * radius;
                    
                    JOptionPane.showMessageDialog(null,
                 "Hello " + name + " The Volume of your Sphere is "+ volume);
                    getType();
                    
                    break;
                    
                case "Surface Area":
                    input = JOptionPane.showInputDialog("Enter Radius");
                    radius = Integer.parseInt(input);
                    
                    surfaceArea = 4 * 3.14 * radius *radius;
                    
                    JOptionPane.showMessageDialog(null,
                 "Hello " + name + " The Surface Area of your Sphere is "+ surfaceArea);
                    getType();
                    
            }
        }
        
        public static void getFormulaRCC()
        {
            String[] choices = { "Volume", "Surface Area"};
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
                case "Volume":
                  double radius, height;
                  
                  input = JOptionPane.showInputDialog("Enter Radius");
                    radius = Integer.parseInt(input);
                    input = JOptionPane.showInputDialog("Enter Height");
                    height = Integer.parseInt(input);
                  
                  volume = 0.33 * 3.14 * radius * radius * height;
                  
                  JOptionPane.showMessageDialog(null,
                 "Hello " + name + " The Volume of your Right Circular Cone is "+ volume);
                    getType();
                    break;
                    
                case "Surface Area":
                    
                    input = JOptionPane.showInputDialog("Enter Radius");
                    radius = Integer.parseInt(input);
                    input = JOptionPane.showInputDialog("Enter Height");
                    height = Integer.parseInt(input);
                    
                    surfaceArea = 3.14 * radius * (Math.sqrt(radius * radius + height * height));
                    
                    JOptionPane.showMessageDialog(null,
                 "Hello " + name + " The Surface Area of your Right Circular Cone is "+ surfaceArea);
                    getType();
            }
        }
        
        public static void getFormulaPY()
        {
            String[] choices = { "Volume"};
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
                case "Volume":
                    double length, width, height;
                    
                    input = JOptionPane.showInputDialog("Enter Length");
                    length = Integer.parseInt(input);
                    input = JOptionPane.showInputDialog("Enter Width");
                    width = Integer.parseInt(input);
                    input = JOptionPane.showInputDialog("Enter Height");
                    height = Integer.parseInt(input);
                    
                    volume = 0.33 * length * width * height;
                    
                    JOptionPane.showMessageDialog(null,
                 "Hello " + name + " The Volume of your Pyramid is "+ volume);
                    getType();
                    break;
                    
            }
        }
        
        public static void getFormulaRCCF()
        {
            String[] choices = { "Volume", "Surface Area"};
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
                case "Volume":
                    double radiusT, radiusB, height, side;
                    
                    input = JOptionPane.showInputDialog("Enter Top Radius");
                    radiusT = Integer.parseInt(input);
                    input = JOptionPane.showInputDialog("Enter Bottom Radius");
                    radiusB = Integer.parseInt(input);
                    input = JOptionPane.showInputDialog("Enter Side");
                    side = Integer.parseInt(input);
                    input = JOptionPane.showInputDialog("Enter Height");
                    height = Integer.parseInt(input);
                    
                    volume = 3.14 * (radiusT * radiusB + + radiusB * radiusB) * height / 3;
                            
                    JOptionPane.showMessageDialog(null,
                 "Hello " + name + " The Volume of your Right Circular Cone Frustum is "+ volume);
                    getType();
                    break;
                    
                case "Surface Area":
                    double surfaceArea;
                    input = JOptionPane.showInputDialog("Enter Top Radius");
                    radiusT = Integer.parseInt(input);
                    input = JOptionPane.showInputDialog("Enter Bottom Radius");
                    radiusB = Integer.parseInt(input);
                    input = JOptionPane.showInputDialog("Enter Side");
                    side = Integer.parseInt(input);
                    
                    surfaceArea = 3.14 * side * (radiusB + radiusT);
                    
                    JOptionPane.showMessageDialog(null,
                 "Hello " + name + " The Surface Area of your Right Circular Cone Frustum is "+ surfaceArea);
                    getType();
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
        
        public static void getHeight()
        {
         input = JOptionPane.showInputDialog("Enter Height");
        
         height = Integer.parseInt(input);
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
        
        /*public static void getVolume()
        {
            if(formula == "Rectangular Solid")
            {
                volume = length * width * height;
                JOptionPane.showMessageDialog(null,
                "Hello " + name + " The Volume of your Rectangular Solid is "+ volume);
        
                
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
        }
            
            public static void getSurfaceArea()
        {
            if(formula == "Rectangular Solid")
            {
                double surfaceArea;
                input = JOptionPane.showInputDialog("Enter Length");
                length = Integer.parseInt(input);
                input = JOptionPane.showInputDialog("Enter Width");
                width = Integer.parseInt(input);
                input = JOptionPane.showInputDialog("Enter Height");
                height = Integer.parseInt(input);
                
                
                surfaceArea = 2 * length * height + 2 * width * height + 2 * width * length; 
                
                JOptionPane.showMessageDialog(null,
                 "Hello " + name + " The Surface Area of your shape is "+ area);
                
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
        }*/
            
           // JOptionPane.showMessageDialog(null,
             //   "Hello " + name + " The Volume of your Rectangular Solid is "+ volume);
        //}
        
        public static void displayArea()
        {
         area = length * width;
         JOptionPane.showMessageDialog(null,
                 "Hello " + name + " The Area of your shape is "+ area);
        }
        
        public static void displayAreaP()
        {
         area = length * height;
         JOptionPane.showMessageDialog(null,
                 "Hello " + name + " The Area of your shape is "+ area);
        }
        
        public static void displayAreaT()
        {
         double base1, base2;
           getHeight();
         input = JOptionPane.showInputDialog("Enter Base 1");
            base1 = Integer.parseInt(input);
         input = JOptionPane.showInputDialog("Enter Base 2");
            base2 = Integer.parseInt(input);
         
            area = 0.5 * height * (base1 + base2);
            
         JOptionPane.showMessageDialog(null,
                 "Hello " + name + " The Area of your shape is "+ area);
        }
        
        public static void displayAreaTR()
        {
            double base;
            input = JOptionPane.showInputDialog("Enter Height");
            height = Integer.parseInt(input);
            input = JOptionPane.showInputDialog("Enter Base");
            base = Integer.parseInt(input);
            area = 0.5 * base * height;
            
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
        
        public static void displayPerimeterS()
        {
            double perimeter;
            perimeter = length * 4;
            
            JOptionPane.showMessageDialog(null,
                    "Hello " + name + " The Perimeter of your shape is " + perimeter);
        }
        
        public static void displayPerimeterR()
        {
            double perimeter;
            perimeter = length * 2 + width * 2;
            
            JOptionPane.showMessageDialog(null,
                    "Hello " + name + " The Perimeter of your shape is " + perimeter);
        }
        
        public static void displayPerimeterT()
        {
            double perimeter, side1, side2, base1, base2;
            
            input = JOptionPane.showInputDialog("Enter Side 1");
            side1 = Integer.parseInt(input);
         input = JOptionPane.showInputDialog("Enter Side 2");
            side2 = Integer.parseInt(input);
            input = JOptionPane.showInputDialog("Enter Base 1");
            base1 = Integer.parseInt(input);
         input = JOptionPane.showInputDialog("Enter Base 2");
            base2 = Integer.parseInt(input);
            
            perimeter = side1 + side2 + base1 + base2;
            
            JOptionPane.showMessageDialog(null,
                    "Hello " + name + " The Perimeter of your shape is " + perimeter);
        }
        
        public static void displayPerimeterTR()
        {
            double perimeter, side1, side2, base;
            input = JOptionPane.showInputDialog("Enter Side 1");
            side1 = Integer.parseInt(input);
            input = JOptionPane.showInputDialog("Enter Side 2");
            side2 = Integer.parseInt(input);
            input = JOptionPane.showInputDialog("Enter Base");
            base = Integer.parseInt(input);
            perimeter = side1 + side2 + base;
            
            JOptionPane.showMessageDialog(null,
                    "Hello " + name + " The Perimeter of your shape is " + perimeter);
            
        }
        
        
        public static void displayAreaS()
        {
            area = length * length;
            JOptionPane.showMessageDialog(null,
                    "Hello " + name + " The Area of your Square is " + area);
        }
        /*
        {
         JOptionPane.showMessageDialog(null,
                                      "Hello " + name + "! The " + formula + "of your " + Shape1 + "is " + answer);
        }
*/
// TODO code application logic here
    
    
 }


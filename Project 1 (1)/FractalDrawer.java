import java.awt.Color; 
//Colors for the program

import java.util.Scanner;
// Scanner method for user input

// FractalDrawer class draws a fractal of a shape indicated by user input
public class FractalDrawer {
        private double totalArea=0;  // member variable for tracking the total area

    public FractalDrawer() {

    }  // constructor


    // drawFractal creates a new Canvas object
    // and determines which shapes to draw a fractal by calling appropriate helper function
    // drawFractal returns the area of the fractal
    public double drawFractal(String type) {  
        
        // Creates a blank canvas
        Canvas can = new Canvas();
        
        // Checks the entered input to determine the fractal shape
        if (type.equals("Circle") || type.equals("circle")){  
            drawCircleFractal(150,400,400,Color.cyan,can,7);
        }
        else if (type.equals("Triangle") || type.equals("triangle")){   
            drawTriangleFractal(200, 300, 300, 600, Color.green, can, 7);

        }
        else if (type.equals("Rectangle")|| type.equals("rectangle")){   
            drawRectangleFractal(200, 350, 300, 200, Color.magenta, can, 7);
        }
        // Returns the user the total area of the fractal
        return totalArea; 

    }

    
    // drawTriangleFractal draws a triangle fractal using recursive techniques
    public void drawTriangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level){
        
        // base case for the recursive technique(Stops after n levels are created)
        if (level == 0 ){   
            return;
        } Triangle tri = new Triangle(x,y,width,height);
        tri.setColor(c); 

        //Calculates total area for all the triangles
        totalArea+=tri.calculateArea(); 
        
        
        //This accesses the empty canvas we created to draw the triangles
        can.drawShape(tri);
    

        // Creates a smaller triangle recursively on the bottom left point of the previous triangle
        drawTriangleFractal(width/2,height/2, x-(width/2), y, Color.green, can, level-1);
        
        // Creates a smaller triangle recursively on the bottom right point of the previous triangle
        drawTriangleFractal(width/2, height/2,x+(width), y, Color.blue, can, level-1);
        
        // Creates a smaller triangle recursively on the top point of the previous triangle
        drawTriangleFractal(width/2, height/2,x+(width/4), y-(height), Color.magenta, can, level-1);




    }




    // drawCircleFractal draws a circle fractal using recursive techniques
    public void drawCircleFractal(double radius, double x, double y, Color c, Canvas can, int level) {
        
        // Creates a base case for the recursive technique(Stops after n levels are created)
        if (level == 0 ){ 
            return;
        } Circle cir = new Circle(radius,x,y); // Creates a new Circle
        cir.setColor(c); 
    
        //This accesses the empty canvas we created to draw the Circles
        can.drawShape(cir);
    
        //Calculates total area for all the Circles
        totalArea+=cir.calculateArea(); 
        
        // Creates a smaller circle recursively on the bottom left point of the previous circle
        drawCircleFractal(radius/2, x-radius, y+radius, Color.green, can, level-1); 
       
        // Creates a smaller circle recursively on the top right point of the previous circle
        drawCircleFractal(radius/2, x+radius, y-radius, Color.yellow, can, level-1);
        
        // Creates a smaller circle recursively on the top left point of the previous circle
        drawCircleFractal(radius/2, x-radius, y-radius, Color.magenta, can, level-1);
       
        // Creates a smaller circle recursively on the bottom right point of the previous circle
        drawCircleFractal(radius/2, x+radius, y+radius, Color.blue, can, level-1);
    
    }




    // drawRectangleFractal draws a rectangle fractal using recursive techniques
    public void drawRectangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level) {
        
        // base case for the recursive technique(Stops after n levels are created)
        if (level == 0 ){ 
            return;
        } Rectangle rect = new Rectangle(width,height,x,y);
        rect.setColor(c);

        //This accesses the empty canvas we created to draw the rectangles
        can.drawShape(rect);

        totalArea+=rect.calculateArea();//Calculates total area for all the rectangles

        // Creates a smaller rectangle recursively on the bottom left point of the previous rectangle
        drawRectangleFractal(width/2,height/2, x-width/2, y+height, Color.cyan, can, level-1);
    
        // Creates a smaller rectangle recursively on the bottom right point of the previous rectangle
        drawRectangleFractal(width/2, height/2,x+width, y+height, Color.blue, can, level-1);

        // Creates a smaller rectangle recursively on the top left point of the previous rectangle
        drawRectangleFractal(width/2, height/2,x-width/2, y-height/2, Color.green, can, level-1);

        // Creates a smaller rectangle recursively on the top right point of the previous rectangle
        drawRectangleFractal(width/2, height/2,x+width, y-height/2, Color.red, can, level-1);
    }


    // Outputs the question for the user to choose one of the shapes
    public static void main(String[] args){ 
        System.out.println("Enter one of the following shapes to create a fractal: Circle, Rectangle or Triangle:"); 
        Scanner myScanner = new Scanner(System.in);
        String input = myScanner.nextLine();
       
        // Creates the FractalDrawer object using the user's input
        FractalDrawer objectdrawer = new FractalDrawer();
        double totalArea = objectdrawer.drawFractal(input);
        
        // Prints out the total area for the shapes
        System.out.println("Total area of all shapes: " + totalArea);
        myScanner.close();


    }
}

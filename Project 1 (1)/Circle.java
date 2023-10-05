import java.awt.Color;

public class Circle{
    private Color color;
    private double xpos;
    private double ypos;
    private double radius;
    
    public Circle(double radius, double xpos, double ypos){
        this.xpos = xpos;
        this.ypos = ypos;
        this.radius = radius;
    }

    public double calculatePerimeter(){
        return 2*3.14*radius ;
    }

    public double calculateArea(){
        return 3.14*radius*radius ;
    }

    public double getRadius(){
        return radius;
    }

    public double getXPos(){
        return xpos;
    }

    public double getYPos(){
        return ypos;
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color color){
        this.color = color;

    }
    
    public void setPos(double xposition, double yposition){
        this.xpos = xposition;
        this.ypos = yposition;
    }
    
}


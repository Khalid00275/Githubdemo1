import java.awt.Color;

public class Rectangle{
    private Color color;
    private double height;
    private double width;
    private double xpos;
    private double ypos;
    
    public Rectangle(double width, double height, double xpos, double ypos ){
        this.xpos = xpos;
        this.ypos = ypos;
        this.height = height;
        this.width = width;
    }  

    public double calculatePerimeter(){
        return 2*height + 2*width;
    } 

    public double calculateArea(){
        return height * width;
    }

    public void setColor(Color color){
        this.color = color;
    }

    
    public void setPos(double xposition, double yposition){
        this.xpos = xposition;
        this.ypos = yposition;
    }

    public void setHeight(double Height){
        this.height = Height;
    }

    public void setWidth(double Width){
        this.width = Width;
    }

    public Color getColor(){
        return color;
    }

    public double getHeight(){
        return height;
    }

    public double getXPos(){
        return xpos;
    }

    public double getYPos(){
        return ypos;
    }

    public double getWidth(){
        return width;
    }
}

import java.awt.Color;

public class Triangle {
    private double xpos;
    private double ypos;
    private double width;
    private double height;
    private Color color;

    public Triangle(double xpos, double ypos, double width, double height) {
        this.xpos = xpos;
        this.ypos = ypos;
        this.width = width;
        this.height = height;
    }

    public double calculatePerimeter() {
        // For an isosceles triangle, we'll approximate the perimeter as 2 * base + height
        return 2 * Math.sqrt((this.width+this.width)/ 4 + this.height + this.height) + this.width;
    }

    public double calculateArea() {
        // For an isosceles triangle, area = (1/2) * base * height
        return 0.5 * width * height;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setPos(double xpos, double ypos) {
        this.xpos = xpos;
        this.ypos = ypos;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Color getColor() {
        return color;
    }

    public double getXPos() {
        return xpos;
    }

    public double getYPos() {
        return ypos;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}


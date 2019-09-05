package Blebleble;

public class Rectangle {
    public double width;
    public double height;
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return this.height*this.width;
    }
    public double getPerimeter(){
        return (this.height+this.width)*2;
    }
    public String display(){
        return ("Rectangle{"+ "width= "+width+", height= "+height+"}");
    }

}

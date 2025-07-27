package ooppractice;
abstract class s1{
     public abstract double area();
}
class Circle extends s1{
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }
     public double area(){
       return Math.PI*radius*radius;
     }
 }
 class Rectangle extends s1{
    private double length,width;
    public  Rectangle(double length,double width){
        this.length=length;
        this.width=width;

    }
    public double area(){
        return length*width;
    }
 }
 class Triangle extends s1{
    private double  breadth,height;
    public Triangle(double breadth,double height){
        this.breadth=breadth;
        this.height=height;
    }
    public double area(){
       return 0.5*breadth*height;
    }
 }
public class Shape {
    public static void main(String[] args) {
s1[]areaarray={
    new Circle(2),
            new Rectangle(2,2),
            new Triangle(2,2)
        };
for(s1 sh:areaarray){

    System.out.println("Area : "+sh.area());
}
    }
}

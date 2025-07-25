// base of encapsulation and constructor
package ooppractice;
class Car{
    // private instance variable
    private String carname;
    private String modelname;
    private int year;
    //constructors to intialize value
    public Car(String carname,String modelname,int year) {
        this.carname=carname;
        this.modelname=modelname;
        this.year=year;
    }
    // method to print the car detail
    public void display(){
        System.out.println("CarName : "+carname);
        System.out.println("modelname : "+modelname);
        System.out.println("Year : "+ year);
    }
}
public class oop1{
    public static void main(String[] args) {
        Car obj=new Car("Toyato","T2",2015);
        obj.display();


    }
}

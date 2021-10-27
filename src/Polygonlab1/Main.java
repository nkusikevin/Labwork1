package Polygonlab1;
import java.util.*;
interface polygon
{
    abstract void getName();
    abstract void getNumberOfSides();
    abstract void totalIntAngleSum();
}

class Quadrilateral{
    Quadrilateral(){
        System.out.println("HELLO WORLD");
    };
    Quadrilateral( String name){
        System.out.println(name);
    }
    Quadrilateral(String user ,String type){
        System.out.println("user is:" +user);
        System.out.println("Type is :" +type);

    }

    public int getArea(int a ,int b){
        System.out.println("Area is :"+a*b);
        return a*b;
    }
}
class Square extends Quadrilateral{
    public Square( int a , int b){
        super("Square");
        super.getArea(a,b);
    }
};
class Rectangle extends Quadrilateral{
public Rectangle(){
    super(" kevin","rectangle");
}
};
class trapezium implements polygon{
    int n;
    public void getName( String name){
        System.out.println("Name : " +name);
    }

    public void  getNumberOfSides(int number){
     this.n =number;
    }

    public int totalIntAngleSum( int sides){
        return (sides-2)*180;
    }

}

public class Main {

    public static void main(String[] args) {
        int a ,b ;
        Scanner sec = new Scanner(System.in);
        System.out.println("Enter value of A and B");
        a = sec.nextInt();
        b = sec.nextInt();
        Square sq = new Square(a,b);
	    Rectangle rec = new Rectangle();
        rec.getArea( a,b);

        lastM();
    }

    public static void lastM(){
        System.out.println("thank you !!!");
    }
}

package Anudip;

public class Shapes {
double pi=3.14;   //assigning pi value
	
    void display() {
        System.out.println("Shapes defined ");
    }
}
//Circle inherits from shape
class Circle extends Shapes {
    int r=5;
    void print() {
    	System.out.println("Circle is created");
    }

    void area() {
        System.out.println("Area of circle: " + (pi*r*r));
    }
    void perimeter() {
    	System.out.println("Perimeter of circle "+ (2*pi*r));
    }
}




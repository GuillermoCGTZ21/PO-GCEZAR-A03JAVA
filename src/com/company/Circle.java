package com.company;

public class Circle extends Shape {
protected double radius;

public Circle(){
    super ();
    this.radius = 0.0;
    }

public Circle (double radius, String color, boolean filled){
    super (color, filled);
    this.radius = radius;
    }
public double getRadius(){
    return this.radius;
    }
public void setRadius(double radius){
    this.radius = radius;
    }
@Override
public double getArea(){
    return 3.1416 * Math.pow(this.radius, 2);
}
@Override
public double getPerimeter(){
    return 3.1416 * (2*radius);
}
@Override
public String toString(){
   String relleno;
   if(this.filled)relleno = "está relleno\n"; else relleno = "no está relleno\n";
   return "El círculo es color" + this.color + relleno;
}

}


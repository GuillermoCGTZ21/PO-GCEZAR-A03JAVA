package com.company;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

public Rectangle(){
    super();
    this.width = 0.00;
    this.length = 0.00;
}
public Rectangle (double width, double length, String color, boolean filled){
    super(color, filled);
    this.width = width;
    this.length = length;
    }
public double getWidth (){
    return this.width;
}
public void setWidth (double width){
    this.width = width;
}
public double getLength(){
    return this.length;
    }
public void setLenght(double length){
    this.length = length;
    }
@Override
public double getArea(){
    return width * length;
    }
@Override
public double getPerimeter(){
    return (2*width)+(2*length);
    }
@Override
public String toString(){
    String relleno;
    if(this.filled)relleno = "está relleno\n"; else relleno = "no está relleno\n";
    return "El rectángulo es de color: " + this.color + relleno;

}
}




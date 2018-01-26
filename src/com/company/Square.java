package com.company;

public abstract class Square extends Rectangle{
protected double side;


public Square(double side){
    this.side = 0.0;

}
public Square(double side, double width, double lenght, String color, boolean filled){
    super (width,lenght,color,filled);
    this.side = side;
    }
public double getSide(){
    return this.side;
}
public void setSide(double side){
    this.side = side;
    }
public void setWidht(double side){
    this.width = side;
}
public void setLength(double side){
    this.length = side;
}
public String toString(){
    String relleno;
    if(this.filled)relleno = "está relleno\n"; else relleno = "no está relleno\n";
    return "El rectángulo es de color: " + this.color + relleno;
    }
}



public class Circle {
    private double radius=1.0;
    private String color= "yellow";

    public Circle(){
    }
    public Circle(double radius, String color){
        this.radius=radius;
        this.color=color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPerimeter(){
        return this.radius*2*3.14;
    }
    public double getArea(){
        return  this.radius*this.radius*3.14;
    }

    @Override
    public String toString(){
        return "The Radius of Circle: "+this.radius+ " and color: "+ this.color+
                " Area: "+ getArea()+ " Perimeter: "+getPerimeter();
    }
}

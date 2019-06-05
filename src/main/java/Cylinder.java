public class Cylinder extends Circle{
    private double height;

    public Cylinder(){
    }
    public Cylinder(double radius, String color, double height){
        super(radius, color);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double volume(){
        return super.getArea()*this.height;
    }

    public double allArea(){
        return super.getPerimeter()*this.height +2*super.getArea();
    }

    @Override
    public String toString(){
        return "The height of Cylinder: "+getHeight()+ " and Color "+ super.getColor()+ " Volume: "+ volume()+
                " All Area: "+ allArea()+" ,which is subclass of "+ super.toString();
    }
}

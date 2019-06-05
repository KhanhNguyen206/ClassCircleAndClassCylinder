public class UseClass {
    public static void main(String[] args) {
        Circle circle=new Circle(2,"blue");

        Cylinder cylinder=new Cylinder(2.0, "green", 5);

        System.out.println(circle.toString());
        System.out.println(cylinder.toString());
    }
}

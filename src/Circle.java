public class Circle extends Shape{
    protected double radius;
    private final double PI = Math.PI;

    public Circle(double radius){
        this.radius = radius;
    }
    public Circle (double radius, double height){
        this.radius = radius;
        this.height = height;
    }
    public double getArea(){
        //double area = PI * this,radius * this.radius;
        double area = PI * Math.pow(this.radius, 2); // initializing value in a parent class variable
        return area; // reference tp parent class variable
    }
    @Override
    public void displayShapeName() {
        System.out.println("Drawing a Circle of radius " + this.radius);
    }
    /** Returns a self-descriptive string */
    @Override
    public String toString() {
        return "Circle[ radius = " + radius + super.toString() + "]";
    }
}

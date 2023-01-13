package dmit2015.model;

public class Circle {

    private double radius;

    public double getRadius() {
        return radius;
    }

//    public void setRadius(double radius) throws Exception {
//        if(radius <= 0)
//        {
//            throw new Exception("Radius must be positive non-zero number");
//        }
//        this.radius = radius;
//    }


    public void setRadius(double radius) {
        if(radius <= 0)
        {
            throw new RuntimeException("Radius must be positive non-zero number");
        }
        this.radius = radius;
    }

    public  Circle()
    {
        setRadius(1);
    }
    public Circle(double radius) {
        setRadius(radius);
    }


    public double Area()
    {
        return Math.PI * radius * radius;
    }
    public double Perimiter()
    {
        return 2 * Math.PI * radius;
    }

    public static void main (String[] args)
    {
        Circle circle1 = new Circle();
        System.out.printf("The radius of circle1 is %s \n", circle1.getRadius());
        System.out.printf("The area of circle1 is %.5f \n", circle1.Area());
        System.out.printf("The perimeter of circle1 is %.2f \n ", circle1.Perimiter());

        circle1.setRadius(5);
        System.out.printf("The radius of circle1 is %s \n", circle1.getRadius());
        System.out.printf("The area of circle1 is %.5f \n", circle1.Area());
        System.out.printf("The perimeter of circle1 is %.2f \n ", circle1.Perimiter());
    }

}

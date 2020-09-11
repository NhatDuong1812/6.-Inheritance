package BT_1;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {}

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "Đây là hình trụ có chiều cao: " + getHeight() + " với thể tích là: " + getVolume() + " kế thừa từ lớp hình tròn: " + super.toString();
    }

    public static void main(String[] args) {
        Cylinder btCylinder = new Cylinder();
        System.out.println(btCylinder);

        btCylinder = new Cylinder(4.2);
        System.out.println(btCylinder);

        btCylinder = new Cylinder(4.2, 2.4, "pink");
        System.out.println(btCylinder);
    }
}

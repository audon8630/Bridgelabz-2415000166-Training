class Circle {
    double radius;
    public double area() {
        return Math.PI * radius * radius;
    }
    public double circumference() {
        return 2 * Math.PI * radius;
    }
    public void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area());
        System.out.println("Circumference: " + circumference());
    }
    public static void main(String[] args) {
        Circle c = new Circle();
        c.radius = 5;
        c.display();
    }
}
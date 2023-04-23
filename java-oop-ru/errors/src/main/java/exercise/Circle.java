package exercise;

// BEGIN
class Circle {
    private Point center;
    private int radius;
    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }
    public double getSquare() throws NegativeRadiusException {
        if (getRadius() < 0) {
            throw new NegativeRadiusException("Не удалось посчитать площадь");
        }
        return Math.PI * Math.pow(radius, 2);
    }
}
// END

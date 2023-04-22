package exercise;

// BEGIN
class Segment {
    private Point beginPoint;
    private Point endPoint;
    public Segment(Point p1, Point p2) {
        this.beginPoint = p1;
        this.endPoint = p2;
    }
    public Point getBeginPoint() {
        return this.beginPoint;
    }
    public Point getEndPoint() {
        return this.endPoint;
    }
    public Point getMidPoint() {
        var x = (this.beginPoint.getX() + this.endPoint.getX()) / 2;
        var y = (this.beginPoint.getY() + this.endPoint.getY()) / 2;
        return new Point(x, y);
    }
}
// END

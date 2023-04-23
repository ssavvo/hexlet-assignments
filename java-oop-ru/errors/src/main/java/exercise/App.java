package exercise;

// BEGIN
class App {
    public static void printSquare(Circle circle) {
        try {
            int radius = (int) Math.round(circle.getSquare());
            System.out.println(radius);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Вычисление окончено");
        }
    }
}
// END

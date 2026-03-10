public class Runner {
    public static void main(String[] args) {
        Student student1 = new Student("George", 4, 280);
        System.out.println(student1);

        System.out.println();

        Box b1 = new Box(10);
        Box b2 = new Box(10, 5, 20);

        System.out.println(b1);
        System.out.println();
        System.out.println(b2);

        System.out.println();

        Shape shape = new Shape();
        b1.addToShape(shape);

        Box shapeBox = shape.getBox();
        System.out.println(shapeBox);
    }
}
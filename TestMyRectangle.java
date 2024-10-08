public class TestMyRectangle {
    public static void main(String[] args) {
        System.out.println("Testing MyRectangle class...\n");

       
        MyRectangle rectangle1 = new MyRectangle(4, 3, 7, 9);
        System.out.println("Rectangle 1: " + rectangle1);

        
        System.out.println("Top Left: " + rectangle1.getTopLeft());
        System.out.println("Bottom Right: " + rectangle1.getBottomRight());

        
        System.out.println("Width: " + rectangle1.getWidth());
        System.out.println("Height: " + rectangle1.getHeight());

        
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());

       
    }}
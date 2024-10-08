public class TestMyLine {
    public static void main(String[] args) {
        System.out.println("Testing MyLine class...\n");

        MyLine line1 = new MyLine();
        System.out.println("Default line: " + line1);

        
        MyLine line2 = new MyLine(1, 2, 4, 6);
        System.out.println("Line with points (1, 2) and (4, 6): " + line2);

        
        System.out.println("Begin Point: " + line2.getBeginPoint());
        System.out.println("End Point: " + line2.getEndPoint());

        
        System.out.println("Length of line: " + line2.getLength());

        
        System.out.println("Gradient of line: " + line2.getGradient());

        
        line2.setBeginPoint(0, 0);
        System.out.println("After changing begin point: " + line2);

        
        line2.setEndPoint(5, 5);
        System.out.println("After changing end point: " + line2);

        
        System.out.println("New length of line: " + line2.getLength());
        System.out.println("New gradient of line: " + line2.getGradient());
    }
}

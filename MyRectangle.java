public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    
    public MyRectangle(int x1, int y1, int x2, int y2) {
        this(new MyPoint(x1, y1), new MyPoint(x2, y2));
    }

    
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    
    public MyPoint getTopLeft() {
        return topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    
    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

   
    public int getTopLeftX() {
        return topLeft.getX();
    }

    public int getTopLeftY() {
        return topLeft.getY();
    }

    public int getBottomRightX() {
        return bottomRight.getX();
    }

    public int getBottomRightY() {
        return bottomRight.getY();
    }

    
    public int getWidth() {
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    public int getHeight() {
        return Math.abs(bottomRight.getY() - topLeft.getY());
    }

    
    public int getArea() {
        return getWidth() * getHeight();
    }

    public int getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    @Override
    public String toString() {
        return String.format("MyRectangle[topLeft=%s, bottomRight=%s]", topLeft, bottomRight);
    }
}

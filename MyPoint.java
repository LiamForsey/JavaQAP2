public class MyPoint {
    private int x;
    private int y;

    
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    
    public MyPoint() {
        this(0, 0);
    }

    
    public int getX() {
        return x;
    }

    
    public int getY() {
        return y;
    }

    
    public void setX(int x) {
        this.x = x;
    }

    
    public void setY(int y) {
        this.y = y;
    }

    
    public double distance(MyPoint other) {
        return Math.sqrt(Math.pow(other.getX() - this.x, 2) + Math.pow(other.getY() - this.y, 2));
    }

    @Override
    public String toString() {
        return "MyPoint(" + x + ", " + y + ")"; 
    }
}

public class MyLine {
    private MyPoint beginPoint;
    private MyPoint endPoint;

    public MyLine(int x1, int y1, int x2, int y2) {
        this.beginPoint = new MyPoint(x1, y1);
        this.endPoint = new MyPoint(x2, y2);
    }

    
    public MyLine() {
        this(0, 0, 0, 0);
    }

   
    public MyPoint getBeginPoint() {
        return beginPoint;
    }

    
    public MyPoint getEndPoint() {
        return endPoint;
    }

    
    public void setBeginPoint(int x, int y) {
        beginPoint.setX(x);
        beginPoint.setY(y);
    }

    
    public void setEndPoint(int x, int y) {
        endPoint.setX(x);
        endPoint.setY(y);
    }

    
    public double getLength() {
        return beginPoint.distance(endPoint);
    }

    
    public double getGradient() {
        int xDiff = endPoint.getX() - beginPoint.getX();
        int yDiff = endPoint.getY() - beginPoint.getY();
        return Math.atan2(yDiff, xDiff);
    }

    @Override
    public String toString() {
        return "MyLine[begin=" + beginPoint + ", end=" + endPoint + "]";
    }
}

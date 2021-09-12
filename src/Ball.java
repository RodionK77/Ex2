
public class Ball {
    private double x;
    private double y;

    Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    Ball() {
        this.x = 0;
        this.y = 0;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }

    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void move(double xDisp, double yDisp){
        x+=xDisp;
        y+=yDisp;
    }
    public String toString() {
        return "Ball @ ("+this.x+", "+this.y+").";
    }
}

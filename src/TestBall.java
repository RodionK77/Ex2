public class TestBall {
    public static void main(String []args){
        Ball b = new Ball(100, 100);
        System.out.println(b);
        b.move(30, 15);
        System.out.println(b);
    }
}

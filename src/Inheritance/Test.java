package Inheritance;


public class Test {
    public static void main(String[] args) {
        ColorPointDTO cp = new ColorPointDTO();

        cp.set(2, 4);
        cp.setColor("Red");
        cp.showPoint();

        BlackPointDTO bp = new BlackPointDTO();

        bp.set(4, 2);
        bp.setBlackYn(true);
        bp.showPoint();
    }
}

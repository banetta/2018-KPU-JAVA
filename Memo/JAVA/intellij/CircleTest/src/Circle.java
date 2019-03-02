public class Circle {
    public int radius = 0;
    public Point center; // Point ���� ������ �ʵ�� ����Ǿ� �ִ�.

    // 생성자
    public Circle() {
        center = new Point(0, 0);
    }

    public Circle(int r) {
        center = new Point(0, 0);
        radius = r;
    }

    public Circle(Point p, int r) {
        center = p;
        radius = r;
    }
}

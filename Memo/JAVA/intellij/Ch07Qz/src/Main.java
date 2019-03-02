public class Main {

    public static void main(String[] args) {
	// write your code here

        Box box1 = new Box();
        box1.length = 3;
        box1.height = 3;
        box1.width = 3;
        Box box2 = new Box();
        box2.height = 4;
        box2.width = 4;
        box2.height = 4;

        if (box1.surface() > box2.surface()){
            System.out.print("면적 크기 순 : ");
            System.out.print("("+box1.surface()+", "+box1.width+", " +box1.length+", "+box1.height+"), ");
            System.out.println("("+box2.surface()+", "+box2.width+", " +box2.length+", "+box2.height+")");
        }
        else {
            System.out.print("면적 크기 순 : ");
            System.out.print("("+box2.surface()+", "+box2.width+", " +box2.length+", "+box2.height+"), ");
            System.out.println("("+box1.surface()+", "+box1.width+", " +box1.length+", "+box1.height+")");
        }

        if (box1.volume() > box2.volume()){
            System.out.print("면적 크기 순 : ");
            System.out.print("("+box1.volume()+", "+box1.width+", " +box1.length+", "+box1.height+"), ");
            System.out.println("("+box2.volume()+", "+box2.width+", " +box2.length+", "+box2.height+")");
        }
        else {
            System.out.print("면적 크기 순 : ");
            System.out.print("("+box2.volume()+", "+box2.width+", " +box2.length+", "+box2.height+"), ");
            System.out.println("("+box1.volume()+", "+box1.width+", " +box1.length+", "+box1.height+")");
        }

    }
}

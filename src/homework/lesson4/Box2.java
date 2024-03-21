package homework.lesson4;

public class Box2 {
    double width;
    double height;
    double depth;

    Box2(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    Box2() {
        width = -1;
        height = -1;
        depth = -1;
    }
    Box2(double len) {
        width = height = depth = len;
    }
    double volume() {
        return width * height * depth;
    }

    public static class OverloadCons {
        public static void main(String[] args) {
            Box mybox1 = new Box(10,20,15);
            Box mybox2 = new Box(9,9,8);
            Box mycube = new Box(7, 8, 9);
            Box myclone = new Box(7,5,3);
            double vol;
            vol = mybox1.volume();
            System.out.println("Ծավալ mybox1 հավասար է " + vol);

            vol = mybox2.volume();
            System.out.println("Ծավալ mybox2 հավասար է " + vol);

            vol = mycube.volume();
            System.out.println("Քուբի ծավալը հավասար է " + vol);
            vol = myclone.volume();
            System.out.println("Կլոնի ծավալը հավասար է " + vol);
        }
    }
}
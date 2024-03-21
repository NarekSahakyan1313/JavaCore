package homework.lesson4;

class OverloadDemo {
    void test (int i, int i1) {
        System.out.println("Պարամետրերը բացակայում են");
    }
    void test (double a) {
        System.out.println("Ներքին զանգի փոխակերպում " + " test(double) a: " + a);

    }

    public static class Overload2 {
        public static void main(String[] args) {
            OverloadDemo ob = new OverloadDemo();
            int i = 88;
            ob.test(10, 20);
            ob.test(10, 20);
            ob.test(i);
            ob.test(123.2);

        }
    }
}
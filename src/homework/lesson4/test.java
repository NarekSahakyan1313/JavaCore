package homework.lesson4;

class Test {
    void Test(int a) {
        System.out.println("a: " + a);
    }

    void Test(int a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }

    static double Test(double a) {
        System.out.println("double a: " + a);
        return a * a;
    }

    static class Overload {
        public void main(String[] args) {
            new OverloadDemo();
            double result;
            new Test();
            new Test();
            new Test();
            result = Test(123.25);
            System.out.println("զանգի արդյունքը ob.test(123.25): " + result);

        }


    }
}
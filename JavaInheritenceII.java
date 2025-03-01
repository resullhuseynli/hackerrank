public class JavaInheritenceII {
    public static void main(String[] args) {

        Adder adder = new Adder();
        System.out.print(adder.add(22,20) + " ");
        System.out.print(adder.add(10,3) + " ");
        System.out.print(adder.add(10,10));
    }
}

class Arithmetic {

    int add(int a, int b) {
        return a+b;
    }
}

class Adder extends Arithmetic {
    Adder() {
        System.out.println("My superclass is: Arithmetic");
    }
}

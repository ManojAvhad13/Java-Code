class UsingFinal {
    private int value;

    public UsingFinal() {
        this.value = 0;
    }

    public UsingFinal(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "UsingFinal [value=" + value + "]";
    }
}

class UsingFinalMethod {
    public void normalMethod() {
        System.out.println("Normal Method in UsingFinalMethod");
    }

    public final void finalMethod() {
        System.out.println("Final Method in UsingFinalMethod");
    }
}

class Child extends UsingFinalMethod {
    @Override
    public void normalMethod() {
        System.out.println("Normal Method in Child");
    }

    // You don't need to override finalMethod as it's final in the parent class
}

public class FinalDemo {
    public static void main(String[] args) {
        // used to declare local constant
        final int number;
        // System.out.println(number);
        number = 10;
        System.out.println(number);
        // number=78;

        UsingFinal obj = new UsingFinal();

        System.out.println(obj);

        UsingFinal objOne = new UsingFinal(1220);

        System.out.println(objOne);
        UsingFinal objTwo = new UsingFinal(500);

        System.out.println(objTwo);

        UsingFinal objThree = new UsingFinal(1000);

        System.out.println(objThree);

        System.out.println("------------------------");
        UsingFinalMethod parent = new UsingFinalMethod();
        parent.normalMethod();
        parent.finalMethod();

        Child child = new Child();
        child.normalMethod();
        child.finalMethod();
    }
}

package OOPs;

public class class_object {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // created a pen object p1
        // color
        p1.setColor("Blue");
        System.out.println(p1.color); // use . operator access object function or properties

        p1.setTip(5);
        System.out.println(p1.tip);
    }
}

class Pen { // in java class name first letter is always capital
    // properties + functions
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

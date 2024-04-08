package OOPs;

public class getter_setter {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // created a pen object p1
        // color
        p1.setColor("Blue");
        System.out.println(p1.getColor());

        p1.setTip(5);
        System.out.println(p1.getTip());

        p1.setColor("Yellow");
        System.out.println(p1.getColor());
    }
}

class Pen {
    private String color;
    int tip;

    // Getter
    String getColor() {
        return this.color; // this keyword is used to refer to the currebt object
    }

    int getTip() {
        return this.tip;
    }

    // Setter
    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int newTip) {
        this.tip = newTip;
    }
}

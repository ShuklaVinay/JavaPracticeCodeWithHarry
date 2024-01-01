class Base{
    public int x;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        System.out.println("i am in base & setting the value of x");
        this.x = x;
    }
}

class Derived{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println("I am in derived and setting value of y");
        this.y = y;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        //creating object of base class
        Base b=new Base();
        b.setX(10);
        System.out.println(b.getX());

        //creating object of derived class
        Derived d=new Derived();
        d.setY(50);
        System.out.println(d.getY());
    }
}

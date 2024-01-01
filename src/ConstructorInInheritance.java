class Base1{

    Base1(){
        System.out.println("I am base class constructor");
    }
    Base1(int x){
        System.out.println("I am Base class constructor with value of x="+x);
    }
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class Derived1 extends Base1{

    Derived1(){
        System.out.println("I am derived class constructor");
    }
    Derived1(int x,int y){
        super(x);
        System.out.println("I am Derived class constructor with value of y="+y);
    }
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
class DerivedChild extends Derived1{
    DerivedChild(){
        System.out.println("I am DerivedChild constructor");
    }
    DerivedChild(int x,int y,int z){
        super(x ,y);
        System.out.println("I am DerivedChild constrictor with value of z="+z);
    }
}

public class ConstructorInInheritance {
    public static void main(String[] args) {
        //Base1 b=new Base1();
        //Derived1 d=new Derived1();
        DerivedChild dc=new DerivedChild(10,20,30);

    }
}

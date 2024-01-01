class GrandParent{
    public void print()
    {
        System.out.println("GrandParent's print()");
    }
}
class Parent extends GrandParent
{
    public void print()
    {
        super.print();
        System.out.println("Parent's print()");
    }
}
class Child extends Parent{
    public void print(){
        super.print();
        System.out.println("Child's print");
    }
}

public class InheritanceMain {
    public static void main(String[] args) {
        Child ch=new Child();
        ch.print();
    }
}

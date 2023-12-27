//create a class Cylinder and use getter & setter to sets its radius and height
class Cylinder {
   private int radius;
   private int height;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }
}

public class MyCylinder {
    public static void main(String[] args) {
        Cylinder cl=new Cylinder();
        cl.setRadius(20);
        cl.setHeight(10);
        System.out.println(cl.getRadius());
        System.out.println(cl.getHeight());

    }
}
//calculate surface and volume of the Cylinder
class Cylinder1
{
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double volume()
    {
        return Math.PI*radius*radius*height;
    }
    public  double surface()
    {
        return 2*Math.PI*radius*height+2*Math.PI*radius*radius;
    }
}


public class CylSurVolume {
    public static void main(String[] args) {
        Cylinder1 cyl=new Cylinder1();
        cyl.setRadius(12);
        cyl.setHeight(14);
        System.out.println(cyl.getRadius());
        System.out.println(cyl.getHeight());
        double v=cyl.volume();
        double a=cyl.surface();
        System.out.println("Volume of the cylinder :"+v);
        System.out.println("Surface of the cylinder:"+a);


    }
}

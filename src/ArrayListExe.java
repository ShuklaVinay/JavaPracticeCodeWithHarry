import java.util.ArrayList;

public class ArrayListExe {
    public static void main(String[] args) {
        ArrayList<Integer> as=new ArrayList<>(10);
        as.add(88);
        as.add(90);
        as.add(60);
        as.add(89);
        ArrayList<Integer> al = new ArrayList<>(as);
        al.add(12);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        al.add(60);
        al.add(70);
        for(int i=0;i<al.size();i++)
        {
            System.out.print(al.get(i)+" ");
        }
    }
}

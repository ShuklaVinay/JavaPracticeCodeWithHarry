import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class PracticeSetAdvancedJava {
    public static void main(String[] args) {

        //q.1
        System.out.println("Question-1.");
        ArrayList<String> al=new ArrayList<>();
        al.add("vinay");
        al.add("bau");
        al.add("deepak");
        al.add("pravin");
        al.add("akshay");
        al.add("ram");
        al.add("shyam");
        for(String s:al)
        {
            System.out.print(s+" ");
        }
        System.out.println();

        //q.2
        System.out.println("Question-2.");
        Date d=new Date();
        System.out.println(d.getHours()+":"+ d.getMinutes()+":"+d.getSeconds());

        //q.3
        System.out.println("Question-3.");
        Calendar c=Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+ c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

        //q.4
        System.out.println("Question-4.");
        LocalDateTime dt=LocalDateTime.now();
        //System.out.println(dt);
        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy--E  H:m a ");
        String myDate= dt.format(df);
        System.out.println(myDate);

        //q.5
        System.out.println("Question-5.");
        HashSet<Integer> hs=new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(3);
        hs.add(4);
        hs.add(4);
        hs.add(5);
        hs.add(5);
        hs.add(6);
        hs.add(6);
        System.out.print(hs+" ");
        System.out.println();

    }
}

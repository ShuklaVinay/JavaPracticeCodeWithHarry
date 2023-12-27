//constructor - parameterised cons & cons overloading .
class MyEmployee
{
 private  int id;
 private String name;

 public MyEmployee()
 {
     id=123;
     name="vinay shukla";
 }
public MyEmployee(int myId,String myName)
{
    id=myId;
    name=myName;
}
public MyEmployee(String fName){
     name=fName;
}
 public void setId(int i)
 {
     this.id=i;
 }

    public void setName(String name) {
        this.name = name;
    }
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
}

public class Constructor {
    public static void main(String[] args) {
        MyEmployee me=new MyEmployee();
        MyEmployee me1=new MyEmployee(12,"shukla");
        MyEmployee me2=new MyEmployee("vinay");
        System.out.println(me.getId());
        System.out.println(me.getName());
        System.out.println(me1.getId());
        System.out.println(me1.getName());
        System.out.println(me2.getName());
    }

}

public class Main {
    public static void main(String[] args) {
        Student st=new Student();


        st.setName(st.getName());
        //System.out.println("Name:"+" "+st.getName());
        try {
            st.setRollNumber(1);
            System.out.println("Rollnumber:"+" "+st.getRollNumber());
        }
        catch (Exception e)
        {
            System.out.println("enter valid rollnumber");
        }


    }
}

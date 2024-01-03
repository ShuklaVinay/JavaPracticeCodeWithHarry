public class UserAccountMain {
    public static void main(String[] args) {
        Account ac=new Account();
        ac.setAccNo(1234543211);
        ac.setName("Vinay Shukla");
        ac.setEmail("vinay@gmail.com");
        ac.setMonNo(902621231);
        ac.setAmount(10000);
        System.out.println("Account No.-"+ac.getAccNo()+"\n"+"User Name-"+ ac.getName()+"\n"+"Email-"+ac.getEmail()+"\n"+"Mob No.-"+ac.getMonNo()+"\n"+"Amount-"+ac.getAmount());
    }
}

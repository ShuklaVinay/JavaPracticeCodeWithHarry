public class Account {
    private long accNo;
    private String name,email;
    private int monNo;
    private float amount;
    public long getAccNo()
    {
        return accNo;
    }
    public void setAccNo(long accNo)
    {
        this.accNo=accNo;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email=email;
    }
    public int getMonNo()
    {
        return monNo;
    }
    public void setMonNo(int monNo)
    {
        this.monNo=monNo;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}

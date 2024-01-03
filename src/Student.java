import java.util.Scanner;
public class Student {
    private String name;
    private int rollNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;
        while (!isValid) {
            System.out.print("Enter a Name: ");
            name=scanner.nextLine();
            if (containsOnlyNonNumeric(name)) {
                System.out.println("Name : " + name);
                isValid = true;
            } else {
                System.out.println("Invalid Name. Please enter a Name without numbers.");
            }
        }
    }

    public static boolean containsOnlyNonNumeric(String str) {
        return str.matches("[^0-9]+");
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber)throws IllegalArgumentException {
        if (rollNumber<0)
        {
            throw new IllegalArgumentException("Invalid rollNumber!");
        }
        this.rollNumber = rollNumber;
    }
}

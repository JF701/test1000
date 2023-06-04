package test;
import java.util.Scanner;//import scanner

public class personType {
    private static personType instance = null;

    private String firstName; //Variable declaration
    private String lastName;//Variable declaration
    private String middleName;//Variable declaration

    //constructor
    private personType(String firstName, String lastName, String middleName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }
//create and return an instance of personType class
    public static personType getInstance(String firstName, String lastName, String middleName) {
        if (instance == null) {
            instance = new personType(firstName, lastName, middleName);
        }
        return instance;
    }
//set the value of firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
//set the value of lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
//set the value of middleName
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFullName() {
        return firstName + " " +  middleName + " " + lastName;
    }

    //gets users input then displays on console
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the person's name below");
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Middle Name: ");
        String middleName = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();
        personType person = personType.getInstance(firstName, lastName, middleName);
        scanner.close();
        System.out.println("\nPerson's Name: " + person.getFullName());
    }
}
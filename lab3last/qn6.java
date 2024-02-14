// Parent class
class Father {
    String lastName;

    Father(String lastName) {
        this.lastName = lastName;
    }

    void work() {
        System.out.println("Father is working hard to support the family.");
    }

    void displayInfo() {
        System.out.println("Last Name: " + lastName);
    }
}

// Child class inheriting from Father
class Son extends Father {
    String firstName;

    Son(String firstName, String lastName) {
        super(lastName);
        this.firstName = firstName;
    }

    void playFootball() {
        System.out.println("Son is playing football.");
    }

    //Override
    void displayInfo() {
        System.out.println("First Name: " + firstName);
        super.displayInfo();
    }
}

public class qn6 {
    public static void main(String[] args) {
        Son son = new Son("Rasuli", "Omari");
        son.displayInfo(); // Displaying son's information
        son.work(); // Son can access father's work method
        son.playFootball(); // Son's specific method
    }
}
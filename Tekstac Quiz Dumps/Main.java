class Employee {
    static {
        System.out.println("Employee static block");
    }
    
    Employee() {
        System.out.println("Employee constructor");
    }
}

class Manager {
    static {
        System.out.println("Manager static block");
    }
    
    Manager() {
        System.out.println("Manager constructor");
    }
}

public class Main {
    public static void main(String[] args) {
        Manager obj = new Manager();
    }
}

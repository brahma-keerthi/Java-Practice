import java.util.Scanner;

class emp{
    private String name;
    private int salary;

    void setName(String namel){
        name = namel;
    }
    void setSalary(int salaryl){
        salary = salaryl;
    }

    void printName(){
        System.out.println("The name is "+ name);
    }
    void printSalary(){
        System.out.println("The salary is " + this.salary);
    }
}

public class prob1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        emp e = new emp();

        int choice, salary;
        String name;

        for(;;){
            System.out.println("1.Set name\n2.Set salary\n3.Print name\n4.Print salary\nEnter the choice>> ");
            choice = sc.nextInt();
            switch (choice){
            case 1:
                System.out.println("ENter the name>> ");
                name = sc.next();
                e.setName(name);
                break;

            case 2:
                System.out.println("Enter the salary>> ");
                salary = sc.nextInt();
                e.setSalary(salary);
                break;

            case 3:
                e.printName();
                break;

            case 4:
                e.printSalary();
                break;

            default:
                break;
        }
    }

    
}
}
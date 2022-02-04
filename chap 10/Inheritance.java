class Employee{
    String name;
    int salary;

    void set(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
    void work(){
        System.out.println("I am working...");
    }

    void get(){
        System.out.println("Name >> " + name);
        System.out.println("Salary >> " + salary);
    }
}

class Programmer extends Employee{
    void work(){
        System.out.println("I am programming...");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Programmer pro = new Programmer();
    
        emp.set("Virat", 65000);
        emp.work();
        emp.get();
        
        pro.set("Rohit", 34000);
        pro.work();
        pro.get();
    }

}

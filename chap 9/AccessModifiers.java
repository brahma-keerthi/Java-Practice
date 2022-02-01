// 4 types of Access Modifiers
// 1. Default   2. Public   3. Private   4. Protected

public class AccessModifiers {
    static class Employee{
        int empId;  // This is default
        public String name; // This public
        private int salary; // This is private

        Employee(int empId, String name, int salary){// Constructor
            this.empId = empId;
            this.name = name;
            this.salary = salary;
        }

        Employee(){  // Constructor overloading

        }

        void setSalary(int n){
            salary = n;
        }

        int getSalary(){
            return salary;
        }
    }
    public static void main(String[] args) {
        // Employee emp = new Employee();
        // emp.empId = 34532;
        // emp.name = "Raju";
        // emp.setSalary(25000);

        Employee emp = new Employee(34564, "Raju", 25000);
        System.out.println("Employee Details>> ");
        System.out.println("The Employee name is " + emp.name);
        System.out.println("The Employee Id is " + emp.empId);
        System.out.println("The Employee Salary is " + emp.getSalary());
    }
}

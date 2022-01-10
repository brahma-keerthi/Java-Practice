class obj {
    int salary;
    String company;
}

public class base {
    public static void main(String[] args) {
        obj n = new obj();
        n.salary = 25000;
        n.company = "Google";
        System.out.println(n.salary);
        System.out.println(n.company);

        obj m = new obj();
        m.salary = 50000;
        m.company = "Microsoft";
        System.out.println(m.salary);
        System.out.println(m.company);
    }
}

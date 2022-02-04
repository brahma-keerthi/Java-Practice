// Parent object = new Child();

class Parent{
    Parent(){
        System.out.println("This is Parent");
    }
    void greet(){
        System.out.println("Morning..... by Parent");
    }

    void ask(){
        System.out.println("Parent Class");
    }
}

class Child extends Parent{
    Child(){
        System.out.println("This is Child");
    }
    void greet(){
        System.out.println("Greeting.... by Child");
    }

    void tell(){
        System.out.println("child Class");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Parent ob = new Child(); // Creates constructor of both the classes
        ob.ask(); //--> Parent members
        ob.greet();// -> Child member is called

        // ob.tell();  // ---> error because Child class members are not accessible
    }
}

// NOTES::
//             ##$$$ Parent OBJ = new Child();
//     *** Constructor of both classes is created
//     *** All the members of parent is accessible
//     *** No members of Child is accessible
//     ### Only OVERRIDED methods of child is Accessible 
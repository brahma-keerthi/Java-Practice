public class StringMet {
    public static void main(String[] args) {
        // when the string functions are called, the original string does not change but a copy of the string is created

        String name = "Harry";
        // System.out.println(name.length()); // gives the lenght of string

        // System.out.println(name.toLowerCase()); //converts string to lower case

        // System.out.println(name.toUpperCase()); //converst strig to Upper case

        // String bene = "   gaand   ";
        // System.out.println(bene.trim()); //Deletes all spaces after and before the word

        // System.out.println(name.substring(3)); // prints all elements after 3 index
        
        // System.out.println(name.substring(2, 4)); //prints all elements after 2 to 3 4 is not included

        // System.out.println(name.replace('r', 'p'));  //replaces r with p in the string

        // System.out.println(name.startsWith("ha")); // its boolean type which tells whether string starts with ha 

        // System.out.println(name.endsWith("y"));  // its boolean type which tell whether string endswith y

        // System.out.println(name.charAt(3)); //returns char at index 3

        System.out.println(name.indexOf("H")); //returns index of h
    }
}

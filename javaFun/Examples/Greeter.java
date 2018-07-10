// public class HelloWorld {   //The filename HAS TO BE THE SAME! A the class name.-> file HelloWorld.java and class HellowWorld.class
//     public static void main(String[] args) {    //('main'-> this is a **METHOD**) (void -> not doing anything or )
//         System.out.print("Hello World"); // "Hello World" -> this in an **ARGUMENT**
//         //(return "Hello World" -> if return then change line 2 to (public static String main (String[] args) {) 
//     }
// }


public class Greeter {
    public String greet(String name){
        return createGreeting(name); 
    }
    public String greet(){
        return createGreeting("World");
    }

    public String greet(String firstName, String lastName){
        System.out.println("We are about to greet " + firstName);
        return createGreeting(firstName + " " + lastName);
    }

    private String createGreeting(String toBeGreeted){
        return "Greeting " + toBeGreeted + ", welcome to coding dojo";
    }
    public static void testGreeting(String name){
        System.out.println("This is a test of static method, " + name);
    }
}



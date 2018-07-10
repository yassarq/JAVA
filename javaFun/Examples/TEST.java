// import java.util.Scanner;

// import org.w3c.dom.ls.LSException;

// **Length - Strings have a method to determine their length.**
// public class TEST {
//     public static void main(String[] args) {
//         String ninja = "Coding Dojo is Awesome!";
//         int length = ninja.length();
//         System.out.println( "String Length is : " + length );
//      }
// }

// **Concatenate: A String method that allows two strings to be squashed together. Since each string is immutable, this results in a brand new string.**
// public class TEST {
//     public static void main(String[] args) {
//         String string1 = "My name is ";
//         String string2 = "Michael";
//         String string3 = string1.concat(string2);
//         System.out.println(string3);
//         // will output My name is Michael
//      }
// }

// **Format: Another way of concatenating strings!
// public class TEST {
//     public static void main(String[] args) {
//         String ninja = String.format("Hi %s, you owe me $%.2f !", "Jack", 25.0);
//         System.out.println(ninja);
//         // Will print out Hi Jack, you owe me $25.00 !
//         // Where %s is expecting a string
//         // And %.2f is expecting a float data type. The value 2 will just place two values to right of the decimal point.
//     }
// }        

// **IndexOf: The indexOf method searches left-to-right inside the given string for a "target" string. The indexOf() method returns the index number where the target string is first found or -1 if the target is not found.

// public class TEST {
//     public static void main(String[] args) {
//         String ninja = "Welcome to Coding Dojo!";
//         int a = ninja.indexOf("Coding"); // a is 11
//         int b = ninja.indexOf("co"); // b is 3
//         int c = ninja.indexOf("pizza"); // c is -1, "pizza" is not found
//     }
// }        

// **Trim: The trim() method removes any trailing or leading white spaces from the string.
// public class TEST {
//     public static void main(String[] args) {
//         String sentence = "   spaces everwhere!   ";
//         System.out.println(sentence.trim());
//     }
// }        

// **Uppercase and Lowercase: The String class provides methods to lowercase and uppercase strings.
// public class TEST {
//     public static void main(String[] args) {
//         String a = "HELLO";
//         String b = "world";
//         System.out.println(a.toLowerCase()); // hello
//         System.out.println(b.toUpperCase()); // WORLD
//     }
// }     

// **Equality: We can compare the equality of a string in two ways. Do they refer to the exact same object, or do they have the same exact sequence of characters.
// public class TEST {
//     public static void main(String[] args) {
//         String a = new String("word");
//         String b = new String("word");
//         System.out.println(a == b); // false. not the same exact object.
//         System.out.println(a.equals(b)); // true. same exact characters.   
//     }
// }        

// public class TEST {
//     public String fizzBuzz(int number) {
//         // fizzbuzz logic here
//         boolean defenderGuarding = true;
//         boolean closeToBasket = true;
//         if(defenderGuarding == true) {
//             System.out.println("Pass The Ball");
//         } else if(closeToBasket == true) {
//             System.out.println("Shoot The Ball");
//         } else {
//             System.out.println("Dribble The Ball");
//         }
//     }
// }


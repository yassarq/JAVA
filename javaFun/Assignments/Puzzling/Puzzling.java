import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.*;
public class Puzzling {
    // Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. 
    // Print the sum of all numbers in the array. Also have the function return 
    // an array that only includes numbers that are greater than 10 
    // (e.g. when you pass the array above, it should return an array with 
    // the values of 13,25,32)\

    // public static void main(String[] args) {
    //     int[] arr = {3,5,1,2,7,9,8,13,25,32};
    //     int sum = 0;
    //     ArrayList<Integer> newarr = new ArrayList<Integer>();
    //     for(int num : arr){
    //         sum += num;
    //         if(num>10){
    //             newarr.add(num);
    //         }
    //     }
    //     System.out.println("Sum: "+sum);
    //     System.out.println(newarr);
    // }

    // Create an array with the following values: Nancy, Jinichi, Fujibayashi, 
    // Momochi, Ishikawa. Shuffle the array and print the name of each person. Have 
    // the method also return an array with names that are longer than 5 characters.
//     public static void main(String[] args) {
//         String[] arr ={"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
//         int name = 0;
//         ArrayList<String> newarr = new ArrayList<String>();
//         for(String word : arr){
//             System.out.println(word);
//             name++;
//             if(word.length()>5){
//                 newarr.add(word);
//             }
//         } 
//         System.out.println("LongName: "+name);
//         System.out.println(newarr);
//     }

    // Create an array that contains all 26 letters of the alphabet 
    // (this array must have 26 values). Shuffle the array and display 
    // the last letter of the array. Have it also display the first 
    // letter of the array. If the first letter in the array is a vowel, 
    // have it display a message

    // To shuffle a collection, you can use the shuffle method of the 
    // Collections class. Collections Class documentation

//     public static void main(String[] args) {
//         char[] alpha={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
//         Random rand = new Random();
//         // Collections.shuffle(alpha);
//         int randnum;
//         char temp;

//         for(int i = 0; i < alpha.length;i++){
//             randnum = rand.nextInt(alpha.length);
//             temp = alpha[i];
//             alpha[i] = alpha[randnum];
//             alpha[randnum]= temp; 
//             }
//             if(alpha[0] == 'a' || alpha[0] == 'e' || alpha[0] == 'i' || alpha[0] == 'o' || alpha[0] == 'u') {
//                 System.out.println("First letter is a vowel!");
//             }
//             else{
//                 System.out.println("First letter: "+alpha[0]);
//             }
//             System.out.println("Last letter: "+alpha[alpha.length-1]);
//         }

        // Generate and return an array with 10 random numbers between 55-100.

        // To get a random integer, you can use the nextInt method of the Random class. Random Class documentation

        // ● Generate and return an array with 10 random numbers between 55-100 and have it be sorted (showing the smallest number in the beginning). Display all the numbers in the array. Next, display the minimum value in the array as well as the maximum value.
        // (To sort a collection, you can use the sort method of the Collections class.)
        // public static void randArr(){
//             ArrayList<Interger> arr = new ArrayList<Integer();
//             Random r = new Random();
//             for(int x = 0; x < 10; x++){
//                 arr.add(55 + r.nextInt(46));
//                 Collections.sort(arr);
//             System.out.println(arr);
//             System.out.println(arr.get(0));
//             System.out.println(arr.get(arr.size() - 1));
//             }
//         }
        
//         // ● Create a random string that is 5 characters long.
        
//         // ● Generate an array with 10 random strings that are each 5 characters long
//         public static void randStringArray(){
//             String[] arr = new String[10];
//             for(int x = 0; x < 10; x++)
//                 arr[x] = randString();
            
//             System.out.println(Arrays.toString(arr));
//         }s
// }
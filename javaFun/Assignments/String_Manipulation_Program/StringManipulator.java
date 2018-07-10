//Tasks:
//Create a StringManipulator class that implements the following methods:

// String trimAndConcat(String, String): Trim both input strings and then concatenate 
//them. Return the new string. Feel free to use the trim method of the String class.
public class StringManipulator {
    public String trimAndConcat(String firstString, String secondString){ 
        return firstString.trim()+secondString.trim();
    }
// Integer getIndexOrNull(String, char): Get the index of the character and 
// return either the index or null. If the character appears multiple times, 
// return the first index. Feel free to use the indexOf method of the String class.
    public Integer getIndexOrNull(String  fullString, char findChar){
        Integer x = fullString.indexOf(findChar);
        if( x == -1){
            return null;
        }
        return x;
    }
// Integer getIndexOrNull(String, String): Get the index of the start of the substring 
// and return either the index or null. Feel free to use the indexOf method of the String class.
    public Integer getIndexOrNull(String fullString, String findString){
        Integer x = fullString.indexOf(findString);
        if( x == -1){
            return null;
        }
        return x;
    } 
// String concatSubstring(String, int, int, String): Get a substring using a 
// starting and ending index, and concatenate that with the second string input 
// to our method. Feel free to use the substring method of the String class.
    public String concatSubstring(String firstString, int start, int end, String secondString){
        return firstString.substring(start,end)+secondString;
    }
}

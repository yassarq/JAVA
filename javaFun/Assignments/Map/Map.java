import java.util.HashMap;
import java.util.*;
public class Map {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<>();
        trackList.put("DAMN", "HUMBLE");
        trackList.put("After Laughter", "Hard Times");
        trackList.put("FUTURE", "Mask Off");
        trackList.put("Flicker", "Slow Hands");

        String name = trackList.get("Twinkle Twinkle little star");
        System.out.println(name);
        Set lyrics = trackList.entrySet();
        System.out.println("Track: Lyrics");
        System.out.println("");

        // get the keys by using keySet method
        Set<String> values = trackList.keySet();
        for(String String1 : values) {
            System.out.println(String1);
            System.out.println(trackList.get(String1));
        }

    }
}
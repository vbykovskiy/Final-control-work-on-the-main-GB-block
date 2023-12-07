import java.util.ArrayList;

public class CheckLength {
    public static String checkLength(String[] array) {
        ArrayList<String> resultArray = new ArrayList<>();    
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() <= 3) {
                resultArray.add(array[i]);
            }
        }
    return resultArray.toString();
    }
}
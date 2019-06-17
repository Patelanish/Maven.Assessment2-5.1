package rocks.zipcode.assessment2.fundamentals;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2) {

        String Concatentate = string1.concat(string2);
        return Concatentate;
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) {

        StringBuilder reverseStringBuilder = new StringBuilder(string1);
        String reverse = reverseStringBuilder.reverse().toString();
        return reverse;
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {

     return concatentate(reverse(string1), reverse(string2));
    }


    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {
        String result = "";
        char [] stringToChars = string.toCharArray();
        char [] charRemove = charactersToRemove.toCharArray();
        List <Character> listOfCharsToRemove = new ArrayList<>();
        for (int i = 0; i < charRemove.length; i++){
            listOfCharsToRemove.add(charRemove[i]);

        }for (int i = 0; i < stringToChars.length; i++){
            if (!listOfCharsToRemove.contains(stringToChars[i])){
                result += stringToChars[i];
            }
        }


        return result;
    }



    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {
        return removeCharacters(reverse(string), charactersToRemove);
    }
}

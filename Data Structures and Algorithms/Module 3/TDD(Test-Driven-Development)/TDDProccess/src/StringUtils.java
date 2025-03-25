public class StringUtils {

    public String reverseString(String word) {
        if(word.isEmpty())
            return word;

        StringBuilder stringBuilder = new StringBuilder(word);

        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}

import java.util.ArrayList;
import java.util.List;

public class RegexManager {

    public String deleteWordsWithMoreVowels(String str){
        String[] words = str.split("\\s+");
        List<String> keep = new ArrayList<>();
        for (String word : words) {
            int numberOfSpecialSymbols = word.length()-word.replaceAll("([\\.\\?!,])","").length();
            int numberOfConsonants = word.replaceAll("(?i:[aeiou])","").length() - numberOfSpecialSymbols;
            if (word.length()-numberOfConsonants <= numberOfConsonants) {
                keep.add(word);
            }
        }
        StringBuilder res = new StringBuilder();
        keep.forEach(s -> res.append(s).append(" "));
        return res.toString();
    }
}

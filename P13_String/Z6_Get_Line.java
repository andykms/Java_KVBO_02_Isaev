import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Z6_Get_Line {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        List<String> words = new ArrayList<>();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        String line = fileReader.readLine();
        fileReader.close();

        String[] splitWords = line.split(" ");
        for (String word : splitWords) {
            words.add(word);
        }

        System.out.println(getLine(words));
    }

    public static StringBuilder getLine(List<String> words) {
        if (words == null || words.isEmpty()) {
            return new StringBuilder();
        }

        StringBuilder result = new StringBuilder();
        result.append(words.get(0));
        words.remove(0);

        while (!words.isEmpty()) {
            String lastWord = result.toString().toLowerCase();
            for (int i = 0; i < words.size(); i++) {
                String nextWord = words.get(i).toLowerCase();
                if (lastWord.charAt(lastWord.length() - 1) == nextWord.charAt(0)) {
                    result.append(" ").append(words.get(i));
                    words.remove(i);
                    break;
                }
            }
        }

        return result;
    }
}
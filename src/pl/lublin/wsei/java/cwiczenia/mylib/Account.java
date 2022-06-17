package pl.lublin.wsei.java.cwiczenia.mylib;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class Account {

    private String name;


    /*
    public static String capitalize(String aStr)
    {
        String[] tokens = StringUtils.split(aStr);
        for(int i = 0; i < tokens.length; i++)
            tokens[i] = StringUtils.capitalize(tokens[i]);
        return StringUtils.join(tokens,' ');
    }


    public void setName(String name) {
        this.name = capitalize(name);
    }
*/

    public void setName(String name) {
        String[] tokens = StringUtils.split(name);
        for(int i = 0; i < tokens.length; i++)
            tokens[i] = StringUtils.capitalize(tokens[i]);
        this.name = StringUtils.join(tokens,' ');
   }

    public String getName() {
        return name;
    }


    private static String ukrAlphabet = "абвгдеєжзиіїйклмнопрстуфхцчшщьюя";
    private static String translitRepl[] = {"a","b","v","g","d","e","je","zh","z","y","i","ji", "j",
            "k","l","m","n","o","p","r","s","t","u","f","h","c",
            "ch","sh","shh","'","ju","ja"};

    Map<Character, String> translit = new HashMap<>();
    {
        translit.put('а', "a");
        translit.put('б', "b");
        translit.put('в', "v");
        // ...
        translit.put('ж', "zh");
        // and so on
    }


    public String transliterate(String input) {
        char[] c = input.toCharArray();
        StringBuilder output = new StringBuilder();
        for (char ch : c) {
            output.append(translit.containsValue(ch) ? translit.get(ch) : String.valueOf(ch));
        }
        return output.toString();
    }

}


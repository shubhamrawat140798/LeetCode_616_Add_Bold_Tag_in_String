package embolden;

import java.util.List;

public class Embolden {
    public static String embolden(String string, List<String> subString){
        String resultString="";
        // for counting occurance of the substring
        boolean[] flagForString = new boolean[string.length()];

        int indexOfSubString=0;
        for(indexOfSubString=0;indexOfSubString<subString.size();indexOfSubString++) {
            for (int i = 0; i < string.length(); i++) {
                String elementOfSubString = subString.get(indexOfSubString);
                //int lenghtOfSubStringElement= elementOfSubString.length();
                if (i + elementOfSubString.length() <= string.length()) {
                    if (string.substring(i, i + elementOfSubString.length()).equals(elementOfSubString)) {
                        for (int indexOfFlagForString = i; indexOfFlagForString < i + elementOfSubString.length(); indexOfFlagForString++) {
                            flagForString[indexOfFlagForString] = true;
                        }
                    }
                }

            }
        }
        // for storing result
        for (int i = 0; i < string.length();i++) {
            if (flagForString[i]== true) {
                resultString += "<b>";
                while (i < string.length() && flagForString[i] == true) {
                    resultString += string.charAt(i);
                    i++;
                }
                resultString+="</b>";
            }
            else
                resultString+= (string.charAt(i));
        }

        return resultString;
    }
}

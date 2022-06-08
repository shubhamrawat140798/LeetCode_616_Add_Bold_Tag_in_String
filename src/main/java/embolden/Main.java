package embolden;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String string = "abcdedfg";
        List<String> subString= new ArrayList<>(Arrays.asList("bc","ed"));
        // function call
        String result= Embolden.embolden(string,subString);
        System.out.println(result);
    }
}

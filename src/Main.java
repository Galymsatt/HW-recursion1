import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static List<String> addStar(List<String> strings) {
        strings.replaceAll(n -> n + "*");
        return strings;
    }





    public static void main(String[] args) {

        List<String> str = new ArrayList<>(Arrays.asList("qwer", "sdfdg", "vcbv"));

        System.out.print(addStar(str));

    }
}

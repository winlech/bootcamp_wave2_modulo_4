package Aula_2.TM;

public class StringUtil {

    public static String rpad (String s, char c, int n) {
        StringBuilder sb = new StringBuilder(s);
        for (int i=0; i<n; i++)
            sb.insert(sb.length(), c);
        return sb.toString();
    }

    public static String rtrim (String s) {
        return s.replaceAll("\\s+$", "");
    }

    public static String ltrim (String s) {
        return s.replaceAll("^\\s+", "");
    }

    public static String trim(String s) {
        return s.trim();
    }

    public static int indexOfN (String s, char c, int n) {
        int index = 0;
        int counter = 0;
        while (counter != n) {
            index = s.indexOf(c, index + 1);
            if (index == -1)
                return index;
            counter++;
        }
        return index;
    }
}

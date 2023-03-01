import java.util.*;
public class Prob2 {
    public static int countMatches(String s1, String s) {

        return s.split(s, -1).length - 1;
    }

    public static void main(String[] args) {
        String s1 = "ce";
        String s = "Marius, de ce nu l-ai ajutat pe George? Era de datoria ta sa vezi ce poti face.\"";
        int ct = 0, pos = 0;
        StringTokenizer st = new StringTokenizer(s, ": , . - ? ");
        int count = countMatches(s, s1);
        System.out.println(count);
        while (st.hasMoreTokens())
            if(str.nextToken().equals(s1))
                ct++;
        {
            String aux = st.nextToken();
            if(aux.equals(s1))
                System.out.println(aux);

        }

    }
}

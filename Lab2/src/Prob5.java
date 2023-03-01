import java.util.*;
public class Prob5 {
    public static void main(String[] args) {
        String text = "Un terorist avea o bomba";
        String cuvinte[] = new String[2];
        cuvinte[0] = "terorist";
        cuvinte[1] = "bomba";
        Prob5 obiect = new Prob5();
        boolean rezultat;
        rezultat = obiect.suspect(text, cuvinte);
        if(rezultat)
            System.out.println("Text suspect");
        else
            System.out.println("Nimic suspect");
        String new_text = obiect.cenzura(text, cuvinte);
        System.out.println(new_text);
    }
    public boolean suspect(String text, String[] cuvinte){
        for(int i = 0; i < cuvinte.length; i++)
            if(text.indexOf(cuvinte[i], 0) != -1)
                return true;
        return false;
    }

    public String cenzura(String text, String[] cuvinte){
        int i, j;
        String cuv = new String();
        String new_text = new String();
        char[] cuv_nou = new char[10];
        for(i = 0; i < cuvinte.length; i++) {
            cuv = cuvinte[i];
            cuv_nou[0] = cuv.charAt(0);
            for (j = 1; j < cuv.length() - 1; j++)
                cuv_nou[j] = '*';
            cuv_nou[j] = cuv.charAt(j);
            if(i == 0)
                new_text = text.replace(cuv, String.copyValueOf(cuv_nou, 0, cuv.length()));
            else
                new_text = new_text.replace(cuv, String.copyValueOf(cuv_nou, 0, cuv.length()));
        }
        return new_text;

    }
}

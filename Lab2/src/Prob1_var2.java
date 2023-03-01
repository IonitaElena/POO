public class Prob1_var2 {
    public static int countMatches(String s, String s1) {
        int index = 0, count = 0;
        while (index < s.length()-1) {
            String aux = s.substring(index, index + 2);
            if (aux.equals(s1))
                count++;
            index = index + 1;
        }

        return count;
    }

    public static void main(String[] args) {

        String s1 = "si";
        String s = "sir1 si cu sir2 fac un sir3";
        int count = countMatches(s, s1);
        System.out.println(count);
    }
}

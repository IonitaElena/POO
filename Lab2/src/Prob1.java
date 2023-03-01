public class Prob1 {
    public static int countMatches(String s, String s1) {

        int index = 0, count = 0;
        while (true) {
            index = s.indexOf(s1, index);
            if (index != -1) {
                count++;
                index += s1.length();
            } else {
                break;
            }
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


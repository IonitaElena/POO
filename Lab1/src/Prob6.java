public class Prob6 {
    public static void main(String args[]){
        System.out.println(verificare(6));
    }

    public static boolean verificare(int n){
        boolean contor=true;
        for(int i=2;i<=n/2;i++){
            if(n%i == 0) {
                contor = false;
                break;
            }
        }
        return contor;
}
}

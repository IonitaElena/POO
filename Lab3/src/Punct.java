import java.lang.Math;
public class Punct {
    private int x,y;
    public Punct(){
        this.x=0;
        this.y=0;
    }

    public int getX() {
        return x;
    }
    public void setX(int x){
        this.x=x;
    }
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punct(" + "x=" + x + ", y=" + y + ')';
    }
    public double distance(int x, int y){
        int dif1= this.x-x;
        int dif2= this.y-y;
        double sum = dif1*dif1 + dif2*dif2;
        return Math.sqrt(sum);

    }
    public double distance(Punct p1){

        int dif1= this.x-p1.x;
        int dif2= this.y-p1.y;
        double sum = dif1*dif1 + dif2*dif2;
        return Math.sqrt(sum);
    }
    public static void main(String[] args) {
        Punct A =new Punct();
        Punct B= new Punct();
        A.setX(1);
        A.setY(2);
        B.setX(-1);
        B.setY(3);
        System.out.println(A);
        System.out.println(B);
        System.out.println(A.distance(B));
        //System.out.println(A.distance(-1,3));
        System.out.println(B.distance(1,2));
    }
}

package P1;

public class Binding {
        public static void main(String args[]) {
            Hero h1 = new Warrior(), h2 = new Ninja();
            Hero h3 = new Rogue();
            BadLuck bl = new StormFire();
            bl.execute(h1);
            bl.execute(h2);
            bl.execute(h3);
        }
    }
    abstract class Hero{
    abstract void executed();
}
    class  Warrior extends Hero{
     void execute(){
         System.out.println("P1.Warrior");
    }

        @Override
        void executed() {

        }
    }
    class Ninja extends Hero{
        void execute(){
            System.out.println("P1.Ninja");
    }

        @Override
        void executed() {

        }
    }
    class Rogue extends Hero {
            void execute() {
                System.out.println("Rouge");
        }

        @Override
        void executed() {

        }
    }
    abstract class BadLuck {
        abstract void execute(Hero h);
        abstract void execute(Warrior w);
        abstract void execute(Ninja n);
        abstract void execute(Rogue r);
}
class StormFire extends BadLuck{
    void execute(Hero h){
        h.executed();
    }

    @Override
    void execute(Warrior w) {
        w.execute();
    }

    @Override
    void execute(Ninja n) {
        n.execute();
    }

    @Override
    void execute(Rogue r) {
        r.execute();
    }
}

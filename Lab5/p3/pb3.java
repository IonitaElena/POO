
//import java.util.*;
//    class NumarNegativ extends Exception{
//        public NumarNegativ(){
//            super("S-a introdus un nr. neg,");
//        }
//    }
//    public class pb3 {
//
//        public static void myRead(Vector v) throws NumarNegativ {
//            Scanner myObj = new Scanner(System.in);
//            System.out.println("Introduceti numerele:");
//            int nr;
//            for (int i = 0; i >= 0; i++) {
//                nr = myObj.nextInt();
//                if (nr > 0) {
//                    v.add(nr);
//                } else {
//                    throw new NumarNegativ();
//                }
//            }
//        }
//
//        public static void main(String[] args) {
//            Vector v = new Vector();
//            try {
//                myRead(v);
//            } catch (NumarNegativ e) {
//                e.printStackTrace();
//            } finally {
//                System.out.println(v);
//                System.out.println(Collections.max(v));
//            }
//        }
//    }


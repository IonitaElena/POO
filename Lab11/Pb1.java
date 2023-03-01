package Lab11;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class Pb1 extends JFrame {
    private JList lista;

    public Pb1(Vector<Book> input){
        super("Pb1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(100,100));
        setLayout(new FlowLayout());

        lista = new JList(input);
        add(new JScrollPane(lista));
        setVisible(true);
        pack();
    }

    public static void main(String[] args) {
        int i;
        Vector<Book> input =new Vector();
        for(i=0;i<20;i++){
            input.add(new Book("Carte"+ (i+1),"Autor"+ (i+1),""));

        }
        Pb1 p1= new Pb1(input);
    }
}

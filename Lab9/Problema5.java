import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

class Problema5 extends JFrame implements ActionListener
{
    JButton buton;
    ArrayList<Color> culori;
    Problema5()
    {
        super("Problema5");
        setSize(new Dimension(100,100));
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buton=new JButton("Apasama");
        buton.setMnemonic(KeyEvent.VK_C);
        buton.setOpaque(true);
        buton.setBorderPainted(false);
        buton.setEnabled(true);
        buton.addActionListener(this);
        add(buton);
        culori = new ArrayList<>();
        culori.add(Color.BLACK);
        culori.add(Color.BLUE);
        culori.add(Color.CYAN);
        culori.add(Color.DARK_GRAY);
        culori.add(Color.GRAY);
        culori.add(Color.GREEN);
        culori.add(Color.LIGHT_GRAY);
        culori.add(Color.MAGENTA);
        culori.add(Color.ORANGE);
        culori.add(Color.PINK);
        culori.add(Color.RED);
        culori.add(Color.WHITE);
        culori.add(Color.YELLOW);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() instanceof JButton)
        {
            Random rand = new Random();
            buton.setForeground(culori.get(rand.nextInt(culori.size())));
            buton.setBackground(culori.get(rand.nextInt(culori.size())));
        }
       
    }
    public static void main(String args[])
    {
        Problema5 pb5 = new Problema5();
    }
}
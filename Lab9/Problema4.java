import java.awt.*;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class Problema4 extends JFrame implements ChangeListener
{
    JSlider red, green, blue;
    JTextField camp;
    Problema4()
    {
        super("Problema 4");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        camp= new JTextField(50);
        camp.setEditable(false);
        red=new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
        green=new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
        blue=new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
        JPanel rb=new JPanel();
        rb.setLayout(new GridLayout(3,1));
        rb.add(red);
        rb.add(green);
        rb.add(blue);
        add(camp, BorderLayout.CENTER);
        add(rb, BorderLayout.NORTH);
        red.addChangeListener(this);
        green.addChangeListener(this);
        blue.addChangeListener(this);
        camp.setText("(0,0,0)");
        camp.setBackground(new Color(0,0,0));
        camp.setHorizontalAlignment(SwingConstants.CENTER);
        pack();
        setVisible(true);
    }
    @Override
    public void stateChanged(ChangeEvent e) 
    {
        camp.setText("("+red.getValue()+", "+green.getValue()+", "+blue.getValue()+")");
        Color culoare = new Color(red.getValue(), green.getValue(),blue.getValue());
        camp.setBackground(culoare);
    }
    public static void main(String args[]) 
    {
        Problema4 pb4 = new Problema4();
    }
    
}
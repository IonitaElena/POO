import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.Paths;
import java.util.Scanner;

import javax.swing.*;

class Problema6 extends JFrame implements ActionListener
{
    JTextField pajiste;
    JButton buton;
    JScrollPane panou;
    Problema6(File fisier)
    {
        super("Problema6");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        buton=new JButton("Apasama");
        pajiste=new JTextField(50);
        pajiste.setText(fisier.getAbsolutePath());
        panou=new JScrollPane();
       // panou.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        //panou.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        buton.addActionListener(this);
        add(buton,BorderLayout.NORTH);
        add(panou,BorderLayout.CENTER);
        pack();
        setLocationByPlatform(true);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() instanceof JButton)
        {
            try
            {
                String s="";
                Scanner in = new Scanner(Paths.get(pajiste.getText()));
                while(in.hasNextLine())
                {
                    s+=in.nextLine();
                    s+="\n";
                }
                setTitle(pajiste.getText());
                JTextArea zona = new JTextArea(45,50);
                zona.append(s);
                zona.setEditable(false);
                panou.setViewportView(zona);
                revalidate();
                repaint();
                pack();

            }catch(Exception exp)
            {
                exp.printStackTrace();
            }
        }   
    }
    public static void main(String args[]) throws IOException
    {
        File fd= new File("E:\\VSCode\\Anul II\\POO\\laburi\\lab10\\Problema5.java");
        if(fd.exists() && !fd.isDirectory())
        {
            Problema6 pb6 = new Problema6(fd);
        }
        else throw new IOException("Fisierul este invalid.\n");
    }
}
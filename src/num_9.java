
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.awt.*;

public class num_9 extends JFrame{
    int a = 10;
    int b = 10;
    int C = 10;
    Container c = getContentPane();

    JPanel pan1 = new JPanel();
    JPanel pan2 = new JPanel();
    JPanel pan3 = new JPanel();
    JPanel pan4 = new JPanel();

    JLabel  lab1 = new JLabel("Welcome, Hot Coffee!!");
    JButton btn1 = new JButton("Black Coffee");
    JButton btn2 = new JButton("Sugar Coffee");
    JButton btn3 = new JButton("Dabang Coffee");
    JButton btn4 = new JButton("Reset");

    JProgressBar bar1 = new JProgressBar(JProgressBar.VERTICAL,0, 10);
    JProgressBar bar2 = new JProgressBar(JProgressBar.VERTICAL,0, 10);
    JProgressBar bar3 = new JProgressBar(JProgressBar.VERTICAL,0, 10);
    JProgressBar bar4 = new JProgressBar(JProgressBar.VERTICAL,0, 10);
    JProgressBar bar5 = new JProgressBar(JProgressBar.VERTICAL,0, 10);

    JLabel cup = new JLabel("Cup");
    JLabel coffee = new JLabel("Coffee");
    JLabel water = new JLabel("Water");
    JLabel sugar = new JLabel("Sugar");
    JLabel cream = new JLabel("Cream");


    public num_9(){
        setTitle("Open Challenge 14");

        //c.setLayout(null);
        pan1.setSize(30, 30);
        pan1.setBackground(Color.MAGENTA);
        pan1.add(lab1, BorderLayout.CENTER);
        c.add(pan1, BorderLayout.NORTH);

        bar1.setValue(a); //cup
        bar1.setPreferredSize(new Dimension(50,120));
        pan2.add(bar1,BorderLayout.CENTER);

        bar2.setValue(a); //coffee
        bar2.setPreferredSize(new Dimension(50,120));
        pan2.add(bar2,BorderLayout.CENTER);

        bar3.setValue(a); //water
        bar3.setPreferredSize(new Dimension(50,120));
        pan2.add(bar3,BorderLayout.CENTER);

        bar4.setValue(b); //sugar
        bar4.setPreferredSize(new Dimension(50,120));
        pan2.add(bar4,BorderLayout.CENTER);

        bar5.setValue(C); //cream
        bar5.setPreferredSize(new Dimension(50,120));
        pan2.add(bar5,BorderLayout.CENTER);
        c.add(pan2,BorderLayout.CENTER);

        pan4.add(cup);
        pan4.add(coffee);
        pan4.add(water);
        pan4.add(sugar);
        pan4.add(cream);
        pan1.add(pan4,BorderLayout.CENTER);

        btn1.setSize(120,30);
        btn1.addActionListener(new myactionlistener());
        pan3.add(btn1);

        btn2.setSize(120,30);
        btn2.addActionListener(new myactionlistener());
        pan3.add(btn2);

        btn3.setSize(120,30);
        btn3.addActionListener(new myactionlistener());
        pan3.add(btn3);

        btn4.setSize(120,30);
        btn4.addActionListener(new myactionlistener());
        pan3.add(btn4);

        c.add(pan3, BorderLayout.SOUTH);
        setSize(600,420);
        setVisible(true);
    }
    class myactionlistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton f=(JButton)e.getSource();
            if(f == btn1){
                a--;
                bar1.setValue(a);
                bar2.setValue(a);
                bar3.setValue(a);
                JOptionPane.showMessageDialog(null,"뜨거워요. 즐거운 하루 ...");
            }
            else if(f == btn2){
                a--;
                b--;
                bar1.setValue(a);
                bar2.setValue(a);
                bar3.setValue(a);
                bar4.setValue(b);
                JOptionPane.showMessageDialog(null,"뜨거워요. 즐거운 하루 ...");
            }
            else if(f == btn3){
                a--;
                C--;
                bar1.setValue(a);
                bar2.setValue(a);
                bar3.setValue(a);
                bar5.setValue(C);
                JOptionPane.showMessageDialog(null,"뜨거워요. 즐거운 하루 ...");
            }
            else if(f == btn4){
                a = 10;
                b = 10;
                C = 10;
                bar1.setValue(a);
                bar2.setValue(a);
                bar3.setValue(a);
                bar4.setValue(b);
                bar5.setValue(C);
            }
            else if(a==0){
                JOptionPane.showMessageDialog(null,"부족한 것이 있습니다. 채워주세요.");
            }
        }
    }



    public static void main(String args[]){
        new num_9();
    }
}

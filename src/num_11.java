import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.*;
import java.awt.*;

public class num_11 extends JFrame {
    int count = 0;
    JLabel[] num = new JLabel[10];

    public void restart(Container p){
        count = 0;
        for(int i = 0; i< num.length; i++) {
            Point P = new Point((int) (Math.random() * 300), (int) (Math.random() * 300));
            num[i].setLocation(P);
            num[i].setSize(50, 50);
            p.add(num[i]);
        }
    }
    public num_11(){
        Container c = getContentPane();
        c.setLayout(null);

        for(int i = 0; i< num.length; i++){
            num[i] = new JLabel (Integer.toString(i));

            Point P = new Point((int)(Math.random()*300),(int)(Math.random()*300));
            num[i].setLocation(P);
            num[i].setSize(50,50);
            c.add(num[i]);

            num[i].addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    JLabel mouse = (JLabel)e.getSource();
                    if(count == Integer.parseInt(mouse.getText())){
                        mouse.setSize(0,0);
                        count++;
                        if(count == 10){
                            restart(c);
                        }
                    }
                }
            });
        }
        setTitle("Ten 레이블 클릭");
        setSize(400,400);
        setVisible(true);
    }

    public interface MouseListener extends EventListener{

    }

    public static void main(String args[]){
        new num_11();
    }
}

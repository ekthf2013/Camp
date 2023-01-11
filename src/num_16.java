import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class num_16 extends JFrame {
    Container c = getContentPane();
    int first, last, answer;
    JLabel lbl1 = new JLabel("첫 번째 값: ");
    JLabel lbl2 = new JLabel("두 번째 값: ");
    JTextField txt1 = new JTextField();
    JTextField txt2 = new JTextField();
    JTextField txt3 = new JTextField();
    JButton btn1 = new JButton("계산");

    public num_16(){

        c.setLayout(null);

        lbl1.setBounds(30,20,100,20);
        c.add(lbl1);
        lbl2.setBounds(30,60,100,20);
        c.add(lbl2);

        txt1.setBounds(100,20,50,20);
        c.add(txt1);

        txt2.setBounds(100,60,50,20);
        c.add(txt2);

        txt3.setBounds(250,60,60,20);
        txt3.setText("정답");
        c.add(txt3);

        thread1 calculate = new thread1(first,last);

        btn1.setBounds(170,40,60,20);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first = Integer.parseInt(txt1.getText());
                last = Integer.parseInt(txt2.getText());
                calculate.start();
            }
        });
        c.add(btn1);

        setTitle("계산 스레드");
        setSize(400,200);
        setVisible(true);
    }

    class thread1 extends Thread{
        int a , b;
        thread1(int a, int b) {
            this.a = a;
            this.b =b;
        }
        public void run() {
            try{
                answer = a + b;
                txt3.setText((Integer.toString(answer)));
                c.add(txt3);
                System.out.println("계산완료");
            }catch (Exception e){
                e.printStackTrace();;
            }
        }
    }

    public static void main(String args[]){
        new num_16();
    }
}

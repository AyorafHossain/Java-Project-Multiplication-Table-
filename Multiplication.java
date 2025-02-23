import javax.swing.*;
import java.awt.Container;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Multiplication extends JFrame {
    private Container c;
    private  JLabel l1,l2;
    private  JTextField tf;
    private JButton b;
    private JTextArea ta;
    private ImageIcon img;
    private Font font;

    Multiplication(){
        font = new Font("Arial", Font.BOLD, 20);
        c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        img=new ImageIcon(getClass().getResource("img2.jpg"));
        l1=new JLabel(img);
        l1.setBounds(20,10,img.getIconWidth(),img.getIconHeight());
        c.add(l1);
        l2=new JLabel("Enter any numer:");
        l2.setFont(font);
        l2.setBounds(20,200,250,50);
        l2.setForeground(Color.MAGENTA);
        c.add(l2);


        tf=new JTextField();
        tf.setBounds(230,200,90,50);
        tf.setBackground(Color.GREEN);
        tf.setHorizontalAlignment(JTextField.CENTER);
        tf.setFont(font);
        c.add(tf);
        tf.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String value=tf.getText();
                if(value.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Please give an  numer!");
                }
                else {
                    ta.setText("");
                    int a=Integer.parseInt(tf.getText());
                    for(int i=1;i<=10;i++){
                        int result=a*i;
                        String r=String.valueOf(result);
                        String n=String.valueOf(a);
                        String increm=String.valueOf(i);
                        ta.append(n+"X"+increm+"="+r+"\n");

                    }
                }

            }
        });



        b=new JButton("clear");
        b.setBounds(230,260,90,50);
        b.setBackground(Color.WHITE);
        b.setFont(font);
        c.add(b);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                ta.setText("");
                tf.setText("");
            }

        });


        ta=new JTextArea();
        ta.setBounds(20,350,300,300);
        ta.setBackground(Color.GREEN);
        ta.setFont(font);
        c.add(ta);



    }

    public static void main(String[] args) {
       Multiplication frame = new Multiplication();
       frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setTitle("Multiplication");
       frame.setBounds(300, 20, 360, 700);


    }
}

import java.awt.*;
import java.awt.event.*;

class maxAwt extends Frame {
    TextField t1, t2, t3;
    Label la1, la2, la3, la4;
    Button b1, b2;

    maxAwt() {
        setTitle("Maximum of 3 Numbers");
        setLayout(null); 

        la1 = new Label("Enter 1st No:");
        la1.setBounds(100, 45, 145, 20);
        t1 = new TextField();
        t1.setBounds(100, 70, 145, 20);

        la2 = new Label("Enter 2nd No:");
        la2.setBounds(100, 100, 145, 20);
        t2 = new TextField();
        t2.setBounds(100, 125, 145, 20);

        la3 = new Label("Enter 3rd No:");
        la3.setBounds(100, 155, 145, 20);
        t3 = new TextField();
        t3.setBounds(100, 180, 145, 20);

        la4 = new Label(""); 
        la4.setBounds(100, 210, 200, 20);

        b1 = new Button("Max");
        b1.setBounds(100, 250, 70, 40);
        b2 = new Button("Exit");
        b2.setBounds(180, 250, 70, 40);

        add(la1); add(t1);
        add(la2); add(t2);
        add(la3); add(t3);
        add(la4);
        add(b1); add(b2);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(t1.getText());
                    int b = Integer.parseInt(t2.getText());
                    int c = Integer.parseInt(t3.getText());

                    int max = Math.max(a, Math.max(b, c));
                    la4.setText("MAXIMUM = " + max);
                } catch (NumberFormatException ex) {
                    la4.setText("Please enter valid numbers!");
                }
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        setSize(400, 350);
        setVisible(true);
    }

    public static void main(String[] args) {
        new maxAwt();
    }
}

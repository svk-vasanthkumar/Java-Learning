import java.awt.*;
import java.awt.event.*;

class Counter extends Frame {

    TextField display;
    
    Button inc,dec, reset ;
    
    Counter(){

            display = new TextField("0");
            display.setBounds(160,50,100,33);
            
            inc = new Button("Inc");
            inc.setBounds(30,90,100,30);
            inc.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    int num = Integer.parseInt(display.getText());
                    display.setText(String.valueOf(++num));
                }
            });

            dec = new Button("dec");
            dec.setBounds(300,90,100,30);
            dec.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    int num = Integer.parseInt(display.getText());
                    display.setText(String.valueOf(--num));
                }
            });
            
            
            

            reset = new Button("Rest");
            reset.setBounds(160,90,100,30);
            reset.addActionListener(new ActionListener(){

                public void actionPerformed(ActionEvent e){

                    display.setText("0");

                }});

            add(display);
            add(inc);
            add(dec);
            add(reset);

            setTitle("Counter");
            setSize(500,300);
            setLayout(null);
            setVisible(true);

    }


    public static void main (String... args){
        new Counter();

    }
    
}

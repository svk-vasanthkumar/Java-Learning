import java.awt.*;
import java.awt.event.*;

class Counter extends Frame {

    TextField display;
    
    Button inc, reset ;
    
    Counter(){

            display = new TextField("0");
            display.setBounds(100,50,100,33);
            
            inc = new Button("Inc");
            inc.setBounds(30,90,100,30);
            inc.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    int num = Integer.parseInt(display.getText());
                    display.setText(String.valueOf(++num));
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
            add(reset);

            setTitle("Counter");
            setSize(300,300);
            setLayout(null);
            setVisible(true);

    }


    public static void main (String... args){
        new Counter();

    }
    
}

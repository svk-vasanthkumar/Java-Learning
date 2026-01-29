 import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 public class AwtForm {

AwtForm(){
        Frame f = new Frame("Form"); 

        Label email = new Label("Enter Email:");
         email.setBounds(50,50,100,30);
        TextField inputemail = new TextField();
        inputemail.setBounds(150,50,100,30);

        Label name = new Label("Enter Name");
        name.setBounds(50,100,100,30);
        TextField inputname = new TextField();
        inputname.setBounds(150,100,100,30);

        Label passcode = new Label("passcode:");
        passcode.setBounds(50,150,100,30);
        TextField inpasscode = new TextField();
        inpasscode.setBounds(150,150,100,30);

        Button btn = new Button("Submit");
        btn.setBounds(90,200,100,40);
        ActionListener btnlis = new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                System.out.println(inputemail.getText());
                System.out.println(inputname.getText());
                System.out.println(inpasscode.getText());
                
              
            }
        };
        btn.addActionListener(btnlis);




        f.add(email);
        f.add(inputemail);
        f.add(name);
        f.add(inputname);
        f.add(passcode);
        f.add(inpasscode);
        f.add(btn);

       f.setLayout(null);
        f.setVisible(true);
        f.setSize(300,300);  
}

    public static void main (String... args){
        new AwtForm();


    }
    
}

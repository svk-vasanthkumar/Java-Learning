import java.awt.*;
class AwtLayout{

    AwtLayout(){

     Frame f = new Frame();
     Button btn = new Button("Submit");

     f.add(btn);
     f.setVisible(true);
     f.setLayout(null);
     f.setSize(200,150);
     btn.setBounds(50,50,100,40);

    }

  

    public static void main(String... args){
 
        new AwtLayout();



    }
}
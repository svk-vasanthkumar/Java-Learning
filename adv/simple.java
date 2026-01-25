import java.awt.*;
class simple {
simple(){
    Frame f = new Frame("Svk App");
    Button btn = new Button("Click me SVK");
    f.add(btn);

    f.setVisible(true);
    f.setLayout(new FlowLayout());
    f.setSize(100,100);
    
    
}


public static void main(String... args){
    new simple();
   
    

} 
}
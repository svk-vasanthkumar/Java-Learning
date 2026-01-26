import java.awt.*;
class AwtCmpt{

    AwtCmpt(){
        Frame f = new Frame();
        Label l = new Label("enter name");
        TextField tf = new TextField("enter email");
        TextArea ta = new TextArea("describe your words");
        Checkbox cb = new Checkbox("java");
        Choice c = new Choice();
        c.add("python");
        c.add("java");
        List li = new List();
        li.add("vs code");
        li.add("cursor");
        Button btn2 = new Button("Submit");
        Scrollbar btn = new Scrollbar();

        f.add(l);
        f.add(tf);
        f.add(ta);
        f.add(cb);
        f.add(c);
        f.add(li);
        f.add(btn);
        f.add(btn2);

        f.setLayout( new FlowLayout());
        f.setVisible(true);
        f.setSize(200,200);
    }
    
    public static void main(String... args){
        new AwtCmpt();
    }



}
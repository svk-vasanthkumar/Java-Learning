import java.awt.*;
import java.awt.event.*;

class Calculater extends Frame implements ActionListener {

    TextField display;

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn00, dot, equal, add, sub, mul, div, clear;

    Calculater(){

    display = new TextField("");
    display.setBounds(110,60,150,35);

    clear = new Button("Del");
    clear.setBounds(300,60,50,30);
    clear.addActionListener(this);


    btn7 = new Button("7");
    btn7.setBounds(30,130,50,50);
    btn7.addActionListener(this);

    

    btn8 = new Button("8");
    btn8.setBounds(100,130,50,50);
    btn8.addActionListener(this);

    btn9 = new Button("9");
    btn9.setBounds(170,130,50,50);
    btn9.addActionListener(this);

    add = new Button("+");
    add.setBounds(250,130,50,50);
    add.addActionListener(this);



    btn4 = new Button("4");
    btn4.setBounds(30,200,50,50);
    btn4.addActionListener(this);

    btn5 = new Button("5");
    btn5.setBounds(100,200,50,50);
    btn5.addActionListener(this);

    
    btn6 = new Button("6");
    btn6.setBounds(170,200,50,50);
    btn6.addActionListener(this);

    sub = new Button("-");
    sub.setBounds(250,200,50,50);
    sub.addActionListener(this);



    btn1 = new Button("1");
    btn1.setBounds(30,270,50,50);
    btn1.addActionListener(this);

    btn2 = new Button("2");
    btn2.setBounds(100,270,50,50);
    btn2.addActionListener(this);
    
    btn3 = new Button("3");
    btn3.setBounds(170,270,50,50);
    btn3.addActionListener(this);

    mul = new Button("*");
    mul.setBounds(250,270,50,50);
    mul.addActionListener(this);



    btn00 = new Button("00");
    btn00.setBounds(30,350,50,50);
    btn00.addActionListener(this);

    btn0 = new Button("0");
    btn0.setBounds(100,350,50,50);
    btn0.addActionListener(this);

    dot = new Button(".");
    dot.setBounds(170,350,50,50);
    dot.addActionListener(this);

    div = new Button("/");
    div.setBounds(250,350,50,50);
    div.addActionListener(this);


    equal = new Button("=");
    equal.setBounds(30,420,285 ,50);
    equal.addActionListener(this);


    



    add(display);
    add(btn9);
    add(btn8);
    add(btn7);
    add(add);
    add(btn6);
    add(btn5);
    add(btn4);
    add(sub);
    add(btn3);
    add(btn2);
    add(btn1);
    add(mul);
    add(btn00);
    add(btn0);
    add(dot);
    add(div);
    add(equal);
    add(clear);


    setSize(385,500);
    setLayout(null);
    setVisible(true);



    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btn7){
            String exp = display.getText();
            exp += "7";
            display.setText(exp);
        }
        if(e.getSource()==btn8){
            String exp = display.getText();
            exp += "8";
            display.setText(exp);

        }
        if(e.getSource()==btn9){
            String exp= display.getText();
            exp += "9";
            display.setText(exp);

        }
        if(e.getSource()==btn4){
            String exp = display.getText();
            exp += "4";
            display.setText(exp);
        }
        if(e.getSource()==btn5){
            String exp = display.getText();
            exp += "5";
            display.setText(exp);

        }
        if(e.getSource() == btn6){
            String exp = display.getText();
            exp += "6";
            display.setText(exp);
        }
        if(e.getSource() == btn1){
            String exp = display.getText();
            exp += "1";
            display.setText(exp);
        }
        if(e.getSource() == btn2){
            String exp = display.getText();
            exp += "2";
            display.setText(exp);

        }
        if(e.getSource()==btn3){
            String exp = display.getText();
            exp += "3";
            display.setText(exp);
        }
        if(e.getSource()== clear){
            String exp = display.getText();
            exp = "";   
        display.setText(exp);
        }
        if(e.getSource() == add){
            String exp = display.getText();
            exp += "+";
            display.setText(exp);
        }
        if(e.getSource() == btn0){
            String exp = display.getText();
            exp += "0";
            display.setText(exp);
        }
        if(e.getSource()==btn00){
            String exp = display.getText();
            exp += "00";
            display.setText(exp);

        }
        if(e.getSource() ==dot){
            String expp= display.getText();
            expp += ".";
            display.setText(expp);
            
        }
        if(e.getSource() == sub){
            String expp = display.getText();
            expp += "-";
            display.setText(expp);
        }
        if(e.getSource() == mul){
            String expp = display.getText();
            expp += "*";
            display.setText(expp);
        }
        if(e.getSource() == div){
            String expp = display.getText();
            expp += "/";
            display.setText(expp);
        }




        if (e.getSource() == equal){
            int a,b;
            char opt;
            String exp = display.getText();
            String temA="",temB="";

            for(int i=0; i<exp.length();i++){
                if(Character.isDigit(exp.charAt(i))){
                    temA += exp.charAt(i);
                }
                else{
                    opt = exp.charAt(i); 
                    break;
                }
            } 

           int i = 0;
           temB = exp.substring(i++);
            a = Integer.parseInt(temA);
            b = Integer.parseInt(temB);

            switch (opt){
                case '+':
                   int result = a+b;
                    break;

                case '-':
                    int result1 = a-b;
                    break;

                case '*':
                    float result2 = a*b;
                    break;
                case '/':
                int result3 = a/b;
                break;



            }
            display.setText(String.valueOf());

 
        }

    }

      





    public static void main(String... args){
        new Calculater();


    }
    
    
}

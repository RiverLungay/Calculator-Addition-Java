package javaapplication1; // change "javaapplication1" according to your project name
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;




public class JavaApplication1 {// change "JavaApplication1" according to your project name
    public static void main(String[] args) throws Exception {  
//Instances
    JFrame x= new JFrame("Your World");
    JButton b1= new JButton("1");
    JButton b2= new JButton("2");
    JButton b3= new JButton("3");
    JButton b4= new JButton("4");
    JButton b5= new JButton("5");
    JButton b6= new JButton("6");
    JButton b7= new JButton("7");
    JButton b8= new JButton("8");
    JButton b9= new JButton("9");
    JButton b0= new JButton("0");
    JButton bplus= new JButton("+");
    JButton bequals= new JButton("=");


    
    JTextField t1= new JTextField("");
    
  
  
    JTextField v1= new JTextField("0");
    JLabel operation= new JLabel("operation");



    x.setSize(250,450);
    x.setLayout(null);
    x.setVisible(true);
    x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    //buttons
    b1.setBounds(10,80,50,50);
    b2.setBounds(65,80,50,50);
    b3.setBounds(120,80,50,50);
    b4.setBounds(10,135,50,50);
    b5.setBounds(65,135,50,50);
    b6.setBounds(120,135,50,50);
    b7.setBounds(10,190,50,50);
    b8.setBounds(65,190,50,50);
    b9.setBounds(120,190,50,50);
    b0.setBounds(10,245,50,50);
    bplus.setBounds(65,245,50,50);
    bequals.setBounds(120,245,50,50);
    
    t1.setBounds(10,20,100,40);
    v1.setBounds(10,470,100,40);
    operation.setBounds(150,470,100,40);
   

    
//enter_number
    b1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){

            t1.setText(t1.getText() + "1");
         }
 });
     b2.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
             t1.setText(t1.getText() + "2");
            
        }

    });
     b3.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
             t1.setText(t1.getText() + "3");
        }

    });
     b4.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){

            t1.setText(t1.getText() + "4");
         }
 });
     b5.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
             t1.setText(t1.getText() + "5");
        }

    });
     b6.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
             t1.setText(t1.getText() + "6");
        }

    });
    b7.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){

            t1.setText(t1.getText() + "7");
         }
 });
     b8.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
             t1.setText(t1.getText() + "8");
        }

    });
     b9.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
             t1.setText(t1.getText() + "9");
        }

    });
     b0.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
             t1.setText(t1.getText() + "0");
        }

     });
    bplus.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
        String val= t1.getText();
        String val2= v1.getText();
        
        float n1= Float.parseFloat(val);
        float n2= Float.parseFloat(val2);
        String total= String.valueOf(n1+n2);
        
        v1.setText(total);
       
        t1.setText("");
        operation.setText("plus");
       
        }

    });
      bequals.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent e){
         
            String val= t1.getText();
            String val2= v1.getText();
            String operate= operation.getText();
            float n1= Float.parseFloat(val);
            float n2= Float.parseFloat(val2);
            
            
           if (operate.equals("plus")){


            String result= String.valueOf(n1+n2);
            t1.setText(result);
            v1.setText("0");
            operation.setText("enter1");}
     
     }
 });

//
    x.add(b1);
    x.add(b2);
    x.add(b3);
    x.add(b4);
    x.add(b5);
    x.add(b6);
    x.add(b7);
    x.add(b8);
    x.add(b9);
    x.add(b0);
    x.add(bplus);
    x.add(bequals);
   
   
    x.add(t1);
    x.add(v1);
    x.add(operation);
    
  

    


    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appletcalculadora;

import java.awt.*;
import java.awt.event.*;

public class AppletCalculadora extends Frame implements ActionListener {
   Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18;
   TextField t1;
   Panel p1,p2;
   private String result;
   private double var;
   private int n;
   private int identif;

    public int getIdentif() {
        return identif;
    }

    public void setIdentif(int identif) {
        this.identif = identif;
    }

    
     
   

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public double getVar() {
        return var;
    }

    public void setVar(double var) {
        this.var = var;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
   
   
    
    public AppletCalculadora(){
        setLayout(new GridLayout(2,1)); 
    p1 = new Panel (new BorderLayout());
    p2 = new Panel(new GridLayout(6,3,10,10));     
    t1 = new TextField();
    b1 = new Button("1");
    b2 = new Button("2");
    b3 = new Button("3");
    b4 = new Button("4");
    b5 = new Button("5");
    b6 = new Button("6");
    b7 = new Button("7");
    b8 = new Button("8");
    b9 = new Button("9");
    b10 = new Button(".");
    b11 = new Button("0");
    b12 = new Button("CE");
    b13 = new Button("+");
    b14 = new Button("-");
    b15 = new Button("=");
    b16 = new Button("*");
    b17 = new Button("/");
    b18 = new Button("C");
    p1.add(t1, BorderLayout.NORTH);
    p2.add(b1);
    p2.add(b2);
    p2.add(b3);
    p2.add(b4);
    p2.add(b5);
    p2.add(b6);
    p2.add(b7);
    p2.add(b8);
    p2.add(b9);
    p2.add(b10);
    p2.add(b11);
    p2.add(b12);
    p2.add(b13);
    p2.add(b14);
    p2.add(b15);
    p2.add(b16);
    p2.add(b17);
    p2.add(b18);
    add(p1); 
    add(p2);
    t1.setEditable(false);
    
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
    b6.addActionListener(this);
    b7.addActionListener(this);
    b8.addActionListener(this);
    b9.addActionListener(this);
    b10.addActionListener(this);
    b11.addActionListener(this);
    b12.addActionListener(this);
    b13.addActionListener(this);
    b14.addActionListener(this);
    b15.addActionListener(this);
    b16.addActionListener(this);
    b17.addActionListener(this);
    b18.addActionListener(this);
    setVisible(true);
    setSize(300,300);
    }
    
    public void actionPerformed(ActionEvent e) {  
        
        
         
        if(e.getSource()==b1){  
          result +=  "1";  
          t1.setText(result);
        }else if(e.getSource()==b2){  
              result +=  "2";  
          t1.setText(result);
        }else if(e.getSource()==b3 ){
           result +=  "3";  
          t1.setText(result);
        }else if(e.getSource()==b4 ){
          result +=  "4";  
          t1.setText(result);           
        }else if(e.getSource()==b5 ){
         result +=  "5";  
          t1.setText(result);
        }else if(e.getSource()==b6 ){
        result +=  "6";  
          t1.setText(result);
        }else if(e.getSource()==b7 ){
        result +=  "7";  
          t1.setText(result);
        }else if(e.getSource()==b8 ){
        result +=  "8";  
          t1.setText(result);
        }else if(e.getSource()==b9 ){
        result +=  "9";  
          t1.setText(result);
        }else if(e.getSource()==b10 ){
        if (n>=1) {
        t1.setText(result);
        }   else {
        result += ".";
            t1.setText(result);
            n=1;
        }
        
        }else if(e.getSource()==b11 ){
            result += "0";
            t1.setText(result);
        }else if(e.getSource()==b12 ){
        result = "";
        t1.setText(result);
        }else if(e.getSource()==b13 ){
        var += Double.parseDouble(result);
        result= "";
        n=0;
        identif = 1;
        t1.setText(result);
        }else if(e.getSource()==b14 ){
            
            if (var==0){
            var = Double.parseDouble(result);
            }else{
            var = var - Double.parseDouble(result);}
        result= "";
        n=0;
        identif = 2;
        t1.setText(result);
        
        }else if(e.getSource()==b15 ){
            if (identif == 1){
            var += Double.parseDouble(result);
            }else if (identif == 2){
            var =var - Double.parseDouble(result);
            }else if (identif == 3){
            var *= Double.parseDouble(result);
            }else if (identif == 4){
                if (Double.parseDouble(result) == 0){
                 result = "E";
                 }else{
            var /= Double.parseDouble(result);}
            
            }
            
            result=String.valueOf(var);
            t1.setText(result);
            n=0;
            identif=0;
            
        }else if(e.getSource()==b16 ){
            
            if (var == 0){
            var = Double.parseDouble(result);
            }else{
            var *= Double.parseDouble(result);}
        result= "";
        n=0;
        identif = 3;
        t1.setText(result);
        
        }else if(e.getSource()==b17 ){
             if (var == 0){
            var = Double.parseDouble(result);
            }else{
                 if (Double.parseDouble(result) == 0){
                 result = "E";
                 }else{
            var /= Double.parseDouble(result);}
             }
        result= "";
        n=0;
        identif=4;
        t1.setText(result);
        
        }else if(e.getSource()==b18 ){
            var = 0;
            result= "";
            n=0;
        t1.setText(result);
        
        }
         
         
            
        } 
    
    
    public static void main(String[] args) {
        AppletCalculadora f = new AppletCalculadora();
        f.setResult("");
        f.setVar(0);
        f.setN(0);
        f.setIdentif(0);
    }
    
}

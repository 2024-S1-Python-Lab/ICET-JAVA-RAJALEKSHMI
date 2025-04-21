import java.awt.*;
import java.awt.event.*;
class CalcAwt extends WindowAdapter implements ActionListener
{ 
 Frame f;
 Label l1;
 Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
 Button badd, bsub, bmult, bdiv, bcalc, bpts;
 double xd;
 double num1,num2,check;
 CalcAwt() 
 {
 f= new Frame("MY CALCULATOR"); 
l1=new Label(); 
l1.setBackground(Color.LIGHT_GRAY); 
l1.setBounds(50,50,250,50); 
b7=new Button("7"); b7.setBounds(50,120,50,50); 
b4=new Button("4"); b4.setBounds(50,180,50,50);
b1=new Button("1"); b1.setBounds(50,240,50,50);
b0=new Button("0"); b0.setBounds(50,300,50,50);
b8=new Button("8"); b8.setBounds(120,120,50,50);
b5=new Button("5"); b5.setBounds(120,180,50,50);
b2=new Button("2"); b2.setBounds(120,240,50,50);
bpts=new Button("."); bpts.setBounds(120,300,50,50);
b9=new Button("9"); b9.setBounds(190,120,50,50);
b6=new Button("6"); b6.setBounds(190,180,50,50);
b3=new Button("3"); b3.setBounds(190,240,50,50);
bcalc=new Button("="); bcalc.setBounds(190,300,50,50);
bdiv=new Button("/"); bdiv.setBounds(260,120,50,50);
bmult=new Button("*"); bmult.setBounds(260,180,50,50);
 bsub=new Button("-"); bsub.setBounds(260,240,50,50);
badd=new Button("+"); badd.setBounds(260,300,50,50);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b0.addActionListener(this);
bpts.addActionListener(this);
badd.addActionListener(this);
bsub.addActionListener(this);
bmult.addActionListener(this);
bdiv.addActionListener(this);
bcalc.addActionListener(this);
f.addWindowListener(this); 
f.add(l1); f.add(b1); f.add(b2); f.add(b3); 
f.add(b4); f.add(b5); f.add(b6); f.add(b7);
f.add(b8); f.add(b9); f.add(b0); 
 f.add(badd); f.add(bsub); f.add(bmult); f.add(bdiv); 
f.add(bcalc); f.add(bpts); 
 f.setSize(360,400); f.setLayout(null); f.setVisible(true);
 }
 public void windowClosing(WindowEvent e) 
 { f.dispose(); }
 public void actionPerformed(ActionEvent e)
 {
 String z, zt;
 if (e.getSource()==b1) 
 {
zt=l1.getText();
z=zt+"1";
l1.setText(z);
}
if(e.getSource()==b2)
{
zt=l1.getText();
z=zt+"2";
l1.setText(z);
}
if (e.getSource()==b3)
{
zt=l1.getText();
z=zt+"3";
l1.setText(z);
}
if (e.getSource()==b4)
{
zt=l1.getText();
z=zt+"4";
l1.setText(z);
}
if (e.getSource()==b5)
{
zt=l1.getText();
z=zt+"5";
l1.setText(z);
}
if (e.getSource()==b6)
{
zt=l1.getText();
z=zt+"6";
l1.setText(z);
}
if (e.getSource()==b7)
 {
zt=l1.getText();
z=zt+"7";
l1.setText(z);
}
if (e.getSource()==b8)
{
zt=l1.getText();
z=zt+"8";
l1.setText(z);
}
if (e.getSource()==b9)
{
zt=l1.getText();
z=zt+"9";
l1.setText(z);
}
if (e.getSource()==b0)
{
zt=l1.getText();
z=zt+"0";
l1.setText(z);
}
if (e.getSource()==bpts) 
{ 
zt=l1.getText();
z=zt+".";
l1.setText(z);
}
if (e.getSource()==badd) 
{ 
 try
 { 
 num1=Double.parseDouble(l1.getText()); 
 }
 catch(NumberFormatException f)
 {
l1.setText("Invalid Format");
return;
 }
 z =" ";
 l1.setText(z);
 check=1;
 }
if(e.getSource()==bsub) 
{ 
 try
 { num1=Double.parseDouble(l1.getText()); }
 catch(NumberFormatException f)
 {
l1.setText("Invalid Format");
return;
 }
 z="";
 l1.setText(z);
 check=2;
 }
 if(e.getSource()==bmult) 
 { 
 try
 { num1=Double.parseDouble(l1.getText()); }
 catch(NumberFormatException f)
 {
 l1.setText("Invalid Format");
 return;
 }
 z="";
 l1.setText(z);
 check=3;
 } 
 if(e.getSource()==bdiv) 
 { 
 try
 { num1=Double.parseDouble(l1.getText()); 
 }
 
 catch(NumberFormatException f)
 {
 l1.setText("Invalid Format");
 return;
 }
 z="";
 l1.setText(z);
 check=4;
 }
 if(e.getSource()==bcalc) 
 {
 try
 { num2=Double.parseDouble(l1.getText()); }
 catch(Exception f)
 {
 l1.setText("ENTER NUMBER FIRST");
 return;
 }
 
 if(check==1)
 xd =num1+num2;
 if(check==2)
 xd =num1-num2;
 if(check==3)
 xd =num1*num2;
 if(check==4)
 xd =num1/num2;
 if(check==5)
 xd =num1%num2;
 l1.setText(String.valueOf(xd));
 }
 }
 public static void main(String args[])
 {
new CalcAwt();
 }
}

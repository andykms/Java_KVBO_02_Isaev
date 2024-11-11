import java.awt.*;
import java.awt.event.*;


public class Z1_Calculator {
  public static void main(String[] args) {
      Frame f=new Frame("Calculator");
      final TextField num1=new TextField();
      num1.setBounds(50,50, 100,20);
      
      final TextField num2=new TextField();
      num2.setBounds(200,50, 100,20);
      
      final TextField result=new TextField();
      result.setBounds(50,100, 250,20);
      result.setEditable(false);
      
      Button addBtn=new Button("+");
      addBtn.setBounds(50,150,50,30);
      addBtn.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
              double n1 = Double.parseDouble(num1.getText());
              double n2 = Double.parseDouble(num2.getText());
              double res = n1 + n2;
              result.setText(String.valueOf(res));
          }
      });
      
      Button subBtn=new Button("-");
      subBtn.setBounds(120,150,50,30);
      subBtn.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
              double n1 = Double.parseDouble(num1.getText());
              double n2 = Double.parseDouble(num2.getText());
              double res = n1 - n2;
              result.setText(String.valueOf(res));
          }
      });
      
      Button mulBtn=new Button("*");
      mulBtn.setBounds(190,150,50,30);
      mulBtn.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
              double n1 = Double.parseDouble(num1.getText());
              double n2 = Double.parseDouble(num2.getText());
              double res = n1 * n2;
              result.setText(String.valueOf(res));
          }
      });
      
      Button divBtn=new Button("/");
      divBtn.setBounds(260,150,50,30);
      divBtn.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
              double n1 = Double.parseDouble(num1.getText());
              double n2 = Double.parseDouble(num2.getText());
              if(n2 != 0){
                  double res = n1 / n2;
                  result.setText(String.valueOf(res));
              } else {
                  result.setText("Cannot divide by zero");
              }
          }
      });
      f.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent we) {
            System.exit(0);
         }
            }
      );
      f.add(num1); f.add(num2); f.add(result);
      f.add(addBtn); f.add(subBtn); f.add(mulBtn); f.add(divBtn);
      
      f.setSize(400,400);
      f.setLayout(null);
      f.setVisible(true);
  }
}
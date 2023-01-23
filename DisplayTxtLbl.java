//Write a program having a text box and a label. As the user types characters in the text box,
//simultaneously displays it in label. Window should exit when „X‟ is occurred.


package JavaPractice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class DisplayTxtLbl extends JFrame {
	
	private JLabel lbl1;
	private JTextField txt1;
	private JTextArea txt2;
	
	
	public DisplayTxtLbl() {
		
		lbl1 = new JLabel("Write The word");
		txt1 = new JTextField(10);
		txt2 = new JTextArea();
		
		lbl1.setBounds(10, 20, 100, 25);
		txt1.setBounds(10, 50, 300, 25);
		txt2.setBounds(10, 105, 500, 600);
		
		setTitle("Text to Word");
		setSize(600,800);
		setLocation(100,100);
		setLayout(null);
		
		add(lbl1);
		add(txt1);
		add(txt2);
		
		setVisible(true);
		
        txt2.setEditable(false);
		
		txt1.addActionListener(new TextHandler());
	}
	class TextHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String n = (txt1.getText());
			//sum +=n;
			txt2.setText(n);
			txt1.setText("");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new DisplayTxtLbl();

	}

}

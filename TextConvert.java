//Design a screen in Java which accepts text in a text box. Convert the text to bold if the left
//mouse button is clicked and to italic if the right button is clicked.

package JavaPractice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextConvert extends JFrame {
	
	private JLabel lbltxt;
	private JTextField txttxt;
	private JButton butleft ,butright ;
	
	public TextConvert () {
		
		lbltxt = new JLabel ("Word");
		txttxt = new JTextField (50);
		butleft = new JButton("Bold");
		butright = new JButton ("Italic");
		
		lbltxt.setBounds(10, 20, 50, 25);
		txttxt.setBounds(80, 20, 200, 35);
		butleft.setBounds(80,80,80,25);
		butright.setBounds(190, 80, 80, 25);
		
		//butleft.setFont(new Font("Time New Roman",Font.BOLD,25));
		//butright.setFont(new Font("Time New Roman",Font.BOLD,25));
		
		setTitle("Text Convert");
		setSize(400,500);
		setLocation(100,100);
		setLayout(null);
		add(lbltxt);
		add(txttxt);
		add(butleft);
		add(butright);
		setVisible(true);
		
		butleft.addActionListener( new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				//b2.setEnabled(!b2.isEnabled());
				txttxt.setFont(new Font("Time New Roman",Font.BOLD,15));
			}
		});
		
		butright.addActionListener( new ActionListener(){
		
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			//b2.setEnabled(!b2.isEnabled());
			txttxt.setFont(new Font("Time New Roman",Font.ITALIC,25));
		}
	});
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new TextConvert();
		
	}

}

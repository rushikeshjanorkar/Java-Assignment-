//Design a screen in Java which contains a text box. If the left mouse button is clicked,
//convert the text to uppercase and if the right mouse button is clicked, convert it to lowercase.

package JavaPractice;

import javax.swing.*;
import javax.swing.plaf.basic.BasicTabbedPaneUI.MouseHandler;

import java.awt.*;
import java.awt.event.*;

public class TextUppLow extends  JFrame {

private JTextField txt1 ;
	
	public  TextUppLow() {
		txt1 = new  JTextField(50)  ;
		
		setTitle("Mouse Click");
		setSize(300, 400);
		setLocation(300,300);
		setLayout(new FlowLayout());
		add(txt1);
		setVisible(true);
		
		MouseHandler mh= new  MouseHandler();
		txt1.addMouseListener(mh);
		}
	
 class MouseHandler extends MouseAdapter{
		public void mouseClicked(MouseEvent e) {
			String s= txt1.getText();
			if(e.getButton()==MouseEvent.BUTTON1) {
				txt1.setText(s.toUpperCase());
			}
			if(e.getButton()==MouseEvent.BUTTON3) {
				txt1.setText(s.toLowerCase());
			}
		}
 }
	public static void main(String[] args) {
		
		new TextUppLow();
		
		
		
	}

}

package pro;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class text {
	private JFrame frame;
	private JTextField txtName;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					text window = new text();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	/**
	 * Create the application.
	 */
	public text() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	    frame = new JFrame();
	    frame.setBounds(100, 100, 196, 169);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.getContentPane().setLayout(null);
	         
	    txtName = new JTextField();
	    txtName.setBounds(57, 18, 93, 21);
	    frame.getContentPane().add(txtName);
	    txtName.setColumns(10);
	         
	    final JLabel lblMessage = new JLabel("Please enter your name.");
	    lblMessage.setBounds(20, 79, 151, 15);
	    frame.getContentPane().add(lblMessage);
	         
	    JButton btnSubmit = new JButton("Submit");
	    btnSubmit.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent arg0) {
	            lblMessage.setText("Hello " + txtName.getText() + "!");
	        }
	    });
	    btnSubmit.setBounds(57, 46, 93, 23);
	    frame.getContentPane().add(btnSubmit);
	         
	    JLabel lblName = new JLabel("Name:");
	    lblName.setBounds(20, 21, 54, 15);
	    frame.getContentPane().add(lblName);
		
	}

}

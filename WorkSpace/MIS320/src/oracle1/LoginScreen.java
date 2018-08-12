package oracle1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;

public class LoginScreen extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3611980285723567075L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					LoginScreen frame = new LoginScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginScreen() 
	{
		setResizable(false);
		addWindowListener(new java.awt.event.WindowAdapter() 
		{
		    @Override
		    public void windowClosing(java.awt.event.WindowEvent windowEvent) 
		    {
		        if (JOptionPane.showConfirmDialog(null, 
		            "Are you sure?", "Quit Program", 
		            JOptionPane.YES_NO_OPTION,
		            JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION)
		        {
		            System.exit(0);
		        }
		    }
		});
		setTitle("Blooming Fitness Center");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 525, 335);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, "name_1197633550224");
		panel.setLayout(null);
	
		JButton btnLogin = new JButton("Login");
		btnLogin.setEnabled(false);
		btnLogin.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				new MainScreen().setVisible(true);
				LoginScreen.this.dispose();
				LoginScreen.this.setVisible(false);
			}
		});
		btnLogin.setBounds(136, 218, 117, 29);
		panel.add(btnLogin);
		
		JButton btnQuit = new JButton("Quit");
		btnQuit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0);
			}
		});
		btnQuit.setBounds(277, 218, 117, 29);
		panel.add(btnQuit);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(123, 107, 74, 16);
		panel.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(123, 156, 74, 16);
		panel.add(lblPassword);
		
		JLabel lblLoginMenu = new JLabel("LOGIN MENU");
		lblLoginMenu.setFont(new Font("Helvetica", Font.BOLD, 16));
		lblLoginMenu.setBounds(206, 22, 123, 41);
		panel.add(lblLoginMenu);
		
		textField = new JTextField("admin");
		textField.setBounds(259, 102, 151, 26);
		panel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				char[] password = passwordField.getPassword();
				char[] correctPass = new char[] {'p', 's', 'h', 'y', 'a', 'm'};
				
				if (Arrays.equals(password, correctPass)) 
				{
					JOptionPane.showMessageDialog(null, "Correct Password");
					btnLogin.setEnabled(true);
				} else 
				{
					JOptionPane.showMessageDialog(null, "Incorrect Password");
				}
			}
		});
		passwordField.setBounds(259, 151, 151, 26);
		panel.add(passwordField);
	}
}

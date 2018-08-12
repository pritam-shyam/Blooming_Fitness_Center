import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Screen3 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Screen1 frame = new Screen1();
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
	public Screen3() {
		setTitle("Project ZEBRA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 380);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Inventory Information");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel.setBounds(6, 18, 239, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblItemId = new JLabel("Item ID");
		lblItemId.setBounds(27, 59, 61, 16);
		contentPane.add(lblItemId);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(27, 98, 48, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setBounds(27, 126, 82, 16);
		contentPane.add(lblDescription);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setBounds(27, 154, 61, 16);
		contentPane.add(lblQuantity);
		
		JLabel lblNewLabel_2 = new JLabel("Location");
		lblNewLabel_2.setBounds(27, 182, 61, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Manufacture");
		lblNewLabel_3.setBounds(27, 210, 98, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Retail Cost");
		lblNewLabel_4.setBounds(27, 243, 82, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblStoreNumber = new JLabel("Store Number");
		lblStoreNumber.setBounds(264, 59, 92, 16);
		contentPane.add(lblStoreNumber);
		
		JLabel lblWeight = new JLabel("Weight");
		lblWeight.setBounds(264, 154, 61, 16);
		contentPane.add(lblWeight);
		
		textField = new JTextField();
		textField.setBounds(80, 54, 61, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(358, 54, 67, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(69, 93, 116, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(107, 121, 318, 26);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(88, 149, 61, 26);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(314, 149, 111, 26);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(88, 177, 130, 26);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(107, 205, 130, 26);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(107, 238, 42, 26);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JButton btnAdd = new JButton("Add ");
		btnAdd.setBounds(119, 296, 82, 29);
		contentPane.add(btnAdd);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(213, 296, 92, 29);
		contentPane.add(btnDelete);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(314, 296, 98, 29);
		contentPane.add(btnSave);
	}
}

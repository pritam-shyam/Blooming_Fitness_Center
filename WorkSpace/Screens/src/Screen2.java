import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Screen2 extends JFrame {

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
	private JTextField textField_9;

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
	public Screen2() {
		setTitle("Project ZEBRA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 420);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Order Information");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel.setBounds(6, 18, 239, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblOrderNumber = new JLabel("Order Number");
		lblOrderNumber.setBounds(26, 66, 98, 16);
		contentPane.add(lblOrderNumber);
		
		JLabel lblOrderDate = new JLabel("Order Date");
		lblOrderDate.setBounds(26, 94, 76, 16);
		contentPane.add(lblOrderDate);
		
		JLabel lblOrderStatus = new JLabel("Order Status");
		lblOrderStatus.setBounds(26, 122, 98, 16);
		contentPane.add(lblOrderStatus);
		
		JLabel lblEmployeeId = new JLabel("Employee ID");
		lblEmployeeId.setBounds(270, 66, 87, 16);
		contentPane.add(lblEmployeeId);
		
		textField = new JTextField();
		textField.setBounds(128, 61, 63, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(128, 89, 103, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(128, 117, 103, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(350, 61, 98, 26);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblCustomerName = new JLabel("Customer ID");
		lblCustomerName.setBounds(26, 184, 108, 16);
		contentPane.add(lblCustomerName);
		
		JLabel lblShippingAddress = new JLabel("Shipping Address");
		lblShippingAddress.setBounds(26, 212, 126, 16);
		contentPane.add(lblShippingAddress);
		
		JLabel lblState = new JLabel("State");
		lblState.setBounds(26, 240, 61, 16);
		contentPane.add(lblState);
		
		JLabel lblZip = new JLabel("Zip");
		lblZip.setBounds(270, 240, 61, 16);
		contentPane.add(lblZip);
		
		JLabel lblPaymentType = new JLabel("Payment Type");
		lblPaymentType.setBounds(26, 303, 98, 16);
		contentPane.add(lblPaymentType);
		
		JLabel lblAmountPaid = new JLabel("Amount Paid");
		lblAmountPaid.setBounds(26, 331, 87, 16);
		contentPane.add(lblAmountPaid);
		
		textField_4 = new JTextField();
		textField_4.setBounds(146, 179, 76, 26);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(146, 207, 172, 26);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(61, 235, 47, 26);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(298, 235, 76, 26);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(128, 298, 87, 26);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(128, 326, 63, 26);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		JButton btnNewOrder = new JButton("New Order");
		btnNewOrder.setBounds(230, 363, 117, 29);
		contentPane.add(btnNewOrder);
		
		JButton btnUpdateOrder = new JButton("Update Order");
		btnUpdateOrder.setBounds(350, 363, 117, 29);
		contentPane.add(btnUpdateOrder);
	}
}

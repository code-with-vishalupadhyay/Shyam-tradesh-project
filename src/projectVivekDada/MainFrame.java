package projectVivekDada;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class MainFrame {

	public JFrame frmMainFrame;
	private JTextField txtAccountId;
	private JTextField txtDate;
	private JTextField txtFName;
	private JTextField txtMobil;
	private JTextField txtAadhar;
	private JTextField txtPan;
	private JTextField txtBankName;
	private JTextField txtIfsc;
	private JTextField txtAccount;
	private JTextField txtWName;
	private JTextField txtWAadhar;
	private JTextField txtWMobilNo;
	private JTextField txtLoan;
	private JTextField txtName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frmMainFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMainFrame = new JFrame();
		frmMainFrame.setBackground(new Color(128, 128, 192));
		frmMainFrame.getContentPane().setForeground(new Color(128, 128, 255));
		frmMainFrame.setTitle("Main frame");
		frmMainFrame.setBounds(100, 100, 679, 573);
		frmMainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMainFrame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome");
		lblNewLabel.setForeground(new Color(128, 0, 64));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(377, 11, 125, 43);
		frmMainFrame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Shyam traders");
		lblNewLabel_1.setForeground(new Color(128, 0, 64));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1.setBounds(357, 65, 168, 29);
		frmMainFrame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(" Account id");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(48, 123, 90, 14);
		frmMainFrame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Date");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(48, 168, 76, 14);
		frmMainFrame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Father Name");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(48, 209, 109, 14);
		frmMainFrame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Addresh ");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(48, 259, 76, 14);
		frmMainFrame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Mobil No.");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setBounds(48, 312, 76, 14);
		frmMainFrame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Aadhar No.");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_7.setBounds(48, 357, 109, 14);
		frmMainFrame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Pan card");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_8.setBounds(48, 403, 76, 14);
		frmMainFrame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Bank Name");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_9.setBounds(369, 123, 85, 14);
		frmMainFrame.getContentPane().add(lblNewLabel_9);
		
		txtAccountId = new JTextField();
		txtAccountId.setBounds(179, 120, 131, 20);
		frmMainFrame.getContentPane().add(txtAccountId);
		txtAccountId.setColumns(10);
		
		txtDate = new JTextField();
		txtDate.setText("dd/mm/yyyy");
		txtDate.setToolTipText("");
		txtDate.setBounds(179, 167, 131, 20);
		frmMainFrame.getContentPane().add(txtDate);
		txtDate.setColumns(10);
		
		txtFName = new JTextField();
		txtFName.setBounds(179, 208, 131, 20);
		frmMainFrame.getContentPane().add(txtFName);
		txtFName.setColumns(10);
		
		txtMobil = new JTextField();
		txtMobil.setBounds(179, 311, 131, 20);
		frmMainFrame.getContentPane().add(txtMobil);
		txtMobil.setColumns(10);
		
		txtAadhar = new JTextField();
		txtAadhar.setBounds(179, 356, 131, 20);
		frmMainFrame.getContentPane().add(txtAadhar);
		txtAadhar.setColumns(10);
		
		txtPan = new JTextField();
		txtPan.setBounds(179, 402, 131, 20);
		frmMainFrame.getContentPane().add(txtPan);
		txtPan.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("IFSC code");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_10.setBounds(369, 170, 85, 14);
		frmMainFrame.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Account No.");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_11.setBounds(369, 211, 85, 14);
		frmMainFrame.getContentPane().add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Witness Name");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_12.setBounds(369, 261, 109, 14);
		frmMainFrame.getContentPane().add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("W. Aadhar");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_13.setBounds(369, 307, 85, 14);
		frmMainFrame.getContentPane().add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("W. Mobil No.");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_14.setBounds(369, 359, 109, 14);
		frmMainFrame.getContentPane().add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Loan amount");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_15.setBounds(369, 405, 109, 14);
		frmMainFrame.getContentPane().add(lblNewLabel_15);
		
		txtBankName = new JTextField();
		txtBankName.setBounds(528, 120, 105, 20);
		frmMainFrame.getContentPane().add(txtBankName);
		txtBankName.setColumns(10);
		
		txtIfsc = new JTextField();
		txtIfsc.setBounds(528, 167, 105, 20);
		frmMainFrame.getContentPane().add(txtIfsc);
		txtIfsc.setColumns(10);
		
		txtAccount = new JTextField();
		txtAccount.setBounds(528, 209, 105, 20);
		frmMainFrame.getContentPane().add(txtAccount);
		txtAccount.setColumns(10);
		
		txtWName = new JTextField();
		txtWName.setBounds(528, 258, 105, 20);
		frmMainFrame.getContentPane().add(txtWName);
		txtWName.setColumns(10);
		
		txtWAadhar = new JTextField();
		txtWAadhar.setBounds(528, 306, 105, 20);
		frmMainFrame.getContentPane().add(txtWAadhar);
		txtWAadhar.setColumns(10);
		
		txtWMobilNo = new JTextField();
		txtWMobilNo.setBounds(528, 356, 105, 20);
		frmMainFrame.getContentPane().add(txtWMobilNo);
		txtWMobilNo.setColumns(10);
		
		txtLoan = new JTextField();
		txtLoan.setBounds(528, 402, 105, 20);
		frmMainFrame.getContentPane().add(txtLoan);
		txtLoan.setColumns(10);
		
		JTextArea txtAreaAddresh = new JTextArea();
		txtAreaAddresh.setBounds(179, 256, 131, 43);
		frmMainFrame.getContentPane().add(txtAreaAddresh);
		
		JLabel lblNewLabel_16 = new JLabel("Name");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_16.setBounds(48, 75, 90, 14);
		frmMainFrame.getContentPane().add(lblNewLabel_16);
		
		txtName = new JTextField();
		txtName.setBounds(179, 74, 109, 20);
		frmMainFrame.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		JButton btnSave = new JButton("Save Detail");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Shyam","root","vishu@123");
					String quary="insert into tradersh values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"; 
					PreparedStatement ps=con.prepareStatement(quary);
			
	 			    ps.setString(1, txtName.getText());
	 				ps.setString(2, txtAccountId.getText());
	 				ps.setString(3, txtDate.getText());
	 			    ps.setString(4, txtFName.getText());
	 				ps.setString(5, txtAreaAddresh.getText());
	 				ps.setString(6, txtMobil.getText());
	 				ps.setString(7, txtAadhar.getText());
	 				ps.setString(8, txtPan.getText());
	 				ps.setString(9, txtBankName.getText());
	 				ps.setString(10, txtIfsc.getText());
	 				ps.setString(11, txtAccount.getText());
	 				ps.setString(12, txtWName.getText());
	 				ps.setString(13, txtWAadhar.getText());
	 			    ps.setString(14, txtWMobilNo.getText());
	 				ps.setString(15, txtLoan.getText());
	 				
	 				int i=ps.executeUpdate();
	 				
	 			JOptionPane.showMessageDialog(btnSave,i+"data insert Sucessfully");
	 				ps.close();
	 				con.close();
				} catch (ClassNotFoundException | SQLException e1) {
					
					e1.printStackTrace();
					JOptionPane.showMessageDialog(btnSave,"data is not insert Sucessfully !!! please insert data correctly");
				}
			}
			
		});
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSave.setBounds(48, 463, 140, 36);
		frmMainFrame.getContentPane().add(btnSave);
		
		JButton btnNewButton_1 = new JButton("view detail");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jframe2 j2=new jframe2();
				j2.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(197, 465, 131, 34);
		frmMainFrame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Payment");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jFrame4 j4=new jFrame4();
				j4.setVisible(true);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(338, 463, 101, 36);
		frmMainFrame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Delete data");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Jframe5 j5= new Jframe5();
				j5.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.setBounds(470, 463, 89, 23);
		frmMainFrame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Reset");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				    txtName.setText("");
	 				txtAccountId.setText("");
	 				txtDate.setText("");
	 			    txtFName.setText("");
	 				txtAreaAddresh.setText("");
	 				txtMobil.setText("");
	 				txtAadhar.setText("");
	 				txtPan.setText("");
	 				txtBankName.setText("");
	 				txtIfsc.setText("");
	 				txtAccount.setText("");
	 				txtWName.setText("");
	 				txtWAadhar.setText("");
	 			    txtWMobilNo.setText("");
	 		        txtLoan.setText("");
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_3.setBounds(48, 510, 89, 23);
		frmMainFrame.getContentPane().add(btnNewButton_3);
	}
}

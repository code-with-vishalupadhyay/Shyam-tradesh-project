package projectVivekDada;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class jFrame4 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtAccountId;
	private JTextField txtName;
	private JTextField txtloan;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jFrame4 frame = new jFrame4();
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
	public jFrame4() {
		setTitle("Payment detail");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 686, 546);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Account id");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(78, 149, 96, 29);
		contentPane.add(lblNewLabel);
		
		txtAccountId = new JTextField();
		txtAccountId.setBounds(294, 151, 139, 29);
		contentPane.add(txtAccountId);
		txtAccountId.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(78, 213, 96, 29);
		contentPane.add(lblNewLabel_1);
		
		txtName = new JTextField();
		txtName.setBounds(294, 215, 139, 29);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Payment Detail");
		lblNewLabel_2.setForeground(new Color(0, 0, 160));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2.setBounds(177, 48, 432, 71);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Money");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(78, 273, 108, 39);
		contentPane.add(lblNewLabel_3);
		
		txtloan = new JTextField();
		txtloan.setBounds(294, 280, 139, 28);
		contentPane.add(txtloan);
		txtloan.setColumns(10);
		
		JButton btnSubmitted = new JButton("Submmit money");
		btnSubmitted.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Shyam","root","vishu@123");
					String quary="update tradersh set Money=? where accountID=? and name=?";
					
					PreparedStatement ps=con.prepareStatement(quary);
			         ps.setString(1, txtloan.getText());
			         ps.setString(2, txtAccountId.getText());
			         ps.setString(3, txtName.getText());
	 				int i=ps.executeUpdate();
	 				
	 			JOptionPane.showMessageDialog(btnSubmitted,i+" data update Sucessfully");
	 				ps.close();
	 				con.close();
				} catch (ClassNotFoundException | SQLException e1) {
					
					e1.printStackTrace();
					JOptionPane.showMessageDialog(btnSubmitted,"data is not upadate Sucessfully !!! please insert data correctly");
				}
			}
		});
		btnSubmitted.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSubmitted.setBounds(73, 366, 179, 46);
		contentPane.add(btnSubmitted);
		
		JButton btnNewButton_2 = new JButton("Back to main");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame mf2= new MainFrame();
				mf2.frmMainFrame.setVisible(true);
				
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_2.setBounds(73, 447, 179, 39);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Back to detail");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jframe2 jf2= new jframe2();
				jf2.setVisible(true);
				
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_3.setBounds(294, 370, 203, 39);
		contentPane.add(btnNewButton_3);
	}
}

package projectVivekDada;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Jframe5 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtAccountId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jframe5 frame = new Jframe5();
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
	public Jframe5() {
		setTitle("Delete user ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 668, 456);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(71, 112, 116, 38);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Account id");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(71, 173, 116, 38);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("Delete user from data");
		lblNewLabel_3.setForeground(new Color(128, 0, 64));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_3.setBounds(178, 32, 287, 58);
		contentPane.add(lblNewLabel_3);
		
		txtName = new JTextField();
		txtName.setBounds(251, 123, 134, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtAccountId = new JTextField();
		txtAccountId.setBounds(251, 184, 134, 20);
		contentPane.add(txtAccountId);
		txtAccountId.setColumns(10);
		
		JButton btnDelete = new JButton("Delete ");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Shyam","root","vishu@123");
					String quary="Delete from tradersh where name =? and AccountId=?";
					
					PreparedStatement ps=con.prepareStatement(quary);
			        
			         ps.setString(1, txtName.getText());
			         ps.setString(2, txtAccountId.getText());
	 				int i=ps.executeUpdate();
	 				
	 			JOptionPane.showMessageDialog(btnDelete,i+" Data Delete Sucessfully");
	 				ps.close();
	 				con.close();
				} catch (ClassNotFoundException | SQLException e1) {
					
					e1.printStackTrace();
					JOptionPane.showMessageDialog(btnDelete," Data is not Delete Sucessfully !!! please insert data correctly");
				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDelete.setBounds(84, 295, 116, 38);
		contentPane.add(btnDelete);
		
		JButton btnNewButton_1 = new JButton("Back to main Frame");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame mf2= new MainFrame();
				mf2.frmMainFrame.setVisible(true);
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(268, 295, 250, 38);
		contentPane.add(btnNewButton_1);
	}
}

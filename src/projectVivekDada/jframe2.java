package projectVivekDada;

import java.awt.EventQueue;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;



import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class jframe2 extends JFrame {

	private static final long serialVersionUID = 1L;
	public JPanel frame2;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jframe2 frame = new jframe2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	DefaultTableModel model = new DefaultTableModel();

	/**
	 * Create the frame.
	 */
	public jframe2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 853, 601);
		frame2 = new JPanel();
		frame2.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(frame2);
		frame2.setLayout(null);
		
		JScrollPane tblDATA = new JScrollPane();
		tblDATA.setBounds(10, 11, 780, 479);
		frame2.add(tblDATA);
		
		table = new JTable();
		
		String[] col= {"Name","AccountId","date","Father_Name","Addresh","Mobil_No","Aadhar_No","Pan_card","Bank_name","IFSC_code","Account_No","Witness_Name","W_Mo_No","W_Aadhar","Money"};
		String[] row=new String [0];
		model.setColumnIdentifiers(col);
		table.setModel(model);
		tblDATA.setViewportView(table);
		
		JButton btnNewButton = new JButton("Back to main menu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			MainFrame mf1= new MainFrame();
			mf1.frmMainFrame.setVisible(true);
			
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnNewButton.setBounds(55, 517, 89, 23);
		frame2.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("View data");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Shyam","root","vishu@123");
					Statement st=con.createStatement();
					String quary="select * from tradersh";
					ResultSet rs=st.executeQuery(quary);
					ResultSetMetaData rsmd = rs.getMetaData();
					int cols = rsmd.getColumnCount();
					String[] colName= new String[cols];
					for(int i=0; i<cols; i++)
					colName[i]=rsmd.getColumnName(i+1);
			
					String Name,AccountId,date,Father_Name,Addresh,Mobil_No,Aadhar_No,Pan_card,Bank_name,IFSC_code,Account_No,Witness_Name,W_Mo_No,W_Aadhar,Money;
					while (rs.next())
					{
						Name =rs.getString(1);
						AccountId =rs.getString(2);
						date =rs.getString(3);
						Father_Name =rs.getString(4);
						Addresh =rs.getString(5);
						Mobil_No =rs.getString(6);
						Aadhar_No =rs.getString(7);
						Pan_card =rs.getString(8);
						Bank_name =rs.getString(9);
						IFSC_code =rs.getString(10);
						Account_No =rs.getString(11);
						Witness_Name =rs.getString(12);
						W_Mo_No =rs.getString(13);
						W_Aadhar =rs.getString(14);
						 Money =rs.getString(15);
						 String[] row= {Name,AccountId,date,Father_Name,Addresh,Mobil_No,Aadhar_No,Pan_card,Bank_name,IFSC_code,Account_No,Witness_Name,W_Mo_No,W_Aadhar,Money};
						 model.addRow(row);
					}
					st.close();
					con.close();
		
					} catch (ClassNotFoundException | SQLException e2) {
					
					e2.printStackTrace();
				}
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnNewButton_2.setBounds(439, 521, 89, 23);
		frame2.add(btnNewButton_2);
	}

	
}

package Bai10_Switch;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.awt.event.ActionEvent;

public class EmployeeGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textHoTen;
	private JTextField textSchool;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeGUI frame = new EmployeeGUI();
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
	public EmployeeGUI() {
		setTitle("Thong tin ve nhan luc");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 684, 446);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Sinh vien", null, panel, null);
		
		JLabel lblNewLabel = new JLabel("Ho ten");
		
		textHoTen = new JTextField();
		textHoTen.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Truong");
		
		textSchool = new JTextField();
		textSchool.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Gioi tinh");
		
		JComboBox comboBoxGender = new JComboBox();
		comboBoxGender.setModel(new DefaultComboBoxModel(new String[] {"Nam", "Nu", "Khac"}));
		
		JLabel lblNewLabel_3 = new JLabel("Hoc luc");
		
		JComboBox comboBoxHocLuc = new JComboBox();
		comboBoxHocLuc.setModel(new DefaultComboBoxModel(new String[] {"Xuat Sac", "Gioi", "Kha", "Trung Binh", "Yeu"}));
		
		JLabel lblNewLabel_4 = new JLabel("Ngay sinh");
		
		JDateChooser dateChooser = new JDateChooser();
		
		JButton btnNewButton = new JButton("Nhap");
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"STT", "Ho ten", "Ngay sinh", "Truong", "Hoc luc", "Hoc bong"
			}
		));
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_panel = new GroupLayout(panel);
		scrollPane.setViewportView(table);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab(" Nhan vien", null, panel_1, null);
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Student obj = new Student(textSchool.getText() ,textHoTen.getText(), comboBoxGender.getSelectedIndex(), 
							dateChooser.getDate(), comboBoxHocLuc.getSelectedItem().toString()
							);
				//test
				System.out.println("Sinh vien: " + obj.toString());
				System.out.println(textSchool.getText() + " " + textHoTen.getText()
							+ dateChooser.getDate().toString());
				//
				//
				switch(obj.getHocLuc()){
					case "Xuat Sac":
						obj.setHocBong(1000);
						break;
					case "Gioi":
						obj.setHocBong(855.5);
						break;
					default:
						obj.setHocBong(0);
						
				}
				
				SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
				
				DefaultTableModel modal = (DefaultTableModel)table.getModel();
				modal.insertRow(modal.getRowCount(), new Object[] {modal.getRowCount(), obj.getName(),
						df.format(obj.getBirthDay()), obj.getSchool(), obj.getHocLuc(), obj.getHocBong()});
			
			}
		});
		
		
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
							.addGap(18))
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
											.addGap(18)
											.addComponent(textHoTen, GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
											.addGap(2))
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
											.addGap(18)
											.addComponent(textSchool, GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
											.addPreferredGap(ComponentPlacement.RELATED)))
									.addGap(55)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
										.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
									.addGap(94))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 67, Short.MAX_VALUE)))
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(0)
									.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
									.addGap(34))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(14)
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addComponent(comboBoxGender, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(comboBoxHocLuc, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
									.addGap(87))))))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(textHoTen, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2)
						.addComponent(comboBoxGender, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNewLabel_3)
							.addComponent(comboBoxHocLuc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNewLabel_1)
							.addComponent(textSchool, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(19)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel_4)
								.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, 30, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(18)
							.addComponent(btnNewButton)))
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		
	}
}

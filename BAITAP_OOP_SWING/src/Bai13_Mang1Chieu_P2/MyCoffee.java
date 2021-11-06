package Bai13_Mang1Chieu_P2;

import java.awt.EventQueue;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class MyCoffee extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	SimpleDateFormat df = new SimpleDateFormat("dd-mm-yyy", Locale.ENGLISH);
	CoffeeShop[] a = new CoffeeShop[]{new CoffeeShop("Kha Coffee", "2 Nguyen Hue"),
			new CoffeeShop("Bon Coffee", "3 Hai Ba Trung"),
			new CoffeeShop("Noi Coffee", "11 Nguyen Hue") };
												
	Manager[] managers;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyCoffee frame = new MyCoffee();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	JComboBox comboBox = new JComboBox();
	private JTable table;
	/**
	 * Create the frame.
	 * @throws ParseException 
	 */
	public MyCoffee() throws ParseException {
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"STT", "Tên quán", "Địa chỉ"
			}
		));
		
		this.managers = new Manager[] {
				new Manager(a, 1000, "Le Thi A", 0, df.parse("12-12-1999")),
				new Manager(new CoffeeShop[] {new CoffeeShop("Hoang Hao", "12 Nguyen Hue")},
						2000, "Nguyen Van B", 1, df.parse("12-12-2000"))
		};
		
		for(int i = 0; i < managers.length; i++) {
			comboBox.addItem(managers[i].getName());
		}
		
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);
		CoffeeShop[] shops = managers[0].getShops();
		for(int i = 0; i < shops.length; i++) {
			model.insertRow(model.getRowCount() , 
					new Object[] {model.getRowCount() + 1, shops[i].getName(), shops[i].getAddress() });
		}
		
		setBounds(100, 100, 761, 455);
		
		JLabel lblNewLabel = new JLabel("H\u1ECD t\u00EAn ng\u01B0\u1EDDi qu\u1EA3n l\u00FD");
		
		JScrollPane scrollPane = new JScrollPane();

		scrollPane.setViewportView(table);
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel)
							.addGap(61)
							.addComponent(comboBox, 0, 564, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
							.addGap(14))))
		);
		//
		//ComboBox change Coffee
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.setRowCount(0);
				int index = comboBox.getSelectedIndex();
				CoffeeShop[] shops = managers[index].getShops();
				for(int i = 0; i < shops.length; i++) {
					model.insertRow(model.getRowCount() , 
							new Object[] {model.getRowCount() + 1, shops[i].getName(), shops[i].getAddress() });
				}
			}
		});
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(36)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		
		getContentPane().setLayout(groupLayout);

	}
}

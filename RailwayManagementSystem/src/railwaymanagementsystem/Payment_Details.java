package railwaymanagementsystem;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

public class Payment_Details extends JFrame{ 

    JTextField textField;
    JTable table;
    JLabel Sector;
    JLabel StationCode, Capacity, Classcode, Coachname, label;

    public static void main(String[] args) {
        new Payment_Details();
    }

    public Payment_Details(){
	initialize();
    }

    private void initialize(){
        setTitle("PAYMENT_DETAILS");
	getContentPane().setBackground(Color.WHITE);
	setSize(860,486);
	setLayout(null);
		
	JLabel Fcode = new JLabel("PNR NO");
	Fcode.setFont(new Font("Tahoma", Font.PLAIN, 17));
	Fcode.setBounds(60, 160, 150, 26);
	add(Fcode);
		
	textField = new JTextField();
	textField.setBounds(200, 160, 150, 26);
	add(textField);
	
        table = new JTable();
	table.setBounds(45, 329, 766, 87);
	add(table);
		
	JButton Show = new JButton("SHOW");
	Show.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Show.setBackground(Color.BLACK);
        Show.setForeground(Color.WHITE);
	Show.setBounds(200, 210, 150, 26);
	add(Show);
		
	Sector = new JLabel("PAYMENT DETAILS");
	Sector.setForeground(Color.BLUE);
	Sector.setFont(new Font("Tahoma", Font.PLAIN, 31));
	Sector.setBounds(51, 17, 300, 39);
	add(Sector);
		
	StationCode = new JLabel("PNR_NO");
	StationCode.setFont(new Font("Tahoma", Font.PLAIN, 13));
	StationCode.setBounds(84, 292, 108, 26);
	add(StationCode);
		
	Capacity = new JLabel("PAID_AMOUNT");
	Capacity.setFont(new Font("Tahoma", Font.PLAIN, 13));
	Capacity.setBounds(183, 298, 92, 14);
	add(Capacity);
		
	Classcode = new JLabel("PAY_DATE");
	Classcode.setFont(new Font("Tahoma", Font.PLAIN, 13));
	Classcode.setBounds(322, 294, 101, 24);
	add(Classcode);
		
	Coachname = new JLabel("CHEQUE_NO");
	Coachname.setFont(new Font("Tahoma", Font.PLAIN, 13));
	Coachname.setBounds(455, 298, 114, 14);
	add(Coachname);
		
	label = new JLabel("");
	label.setIcon(new ImageIcon(ClassLoader.getSystemResource("railwaymanagementsystem/icons/payment.jpeg")));
	label.setBounds(425, 15, 239, 272);
	add(label);
		
	JLabel Cardno = new JLabel("CARD_NO");
	Cardno.setFont(new Font("Tahoma", Font.PLAIN, 13));
	Cardno.setBounds(602, 299, 101, 19);
	add(Cardno);
		
	JLabel Phoneno = new JLabel("PHONE_NO");
	Phoneno.setFont(new Font("Tahoma", Font.PLAIN, 13));
	Phoneno.setBounds(712, 294, 86, 24);
	add(Phoneno);
	
        setVisible(true);
		
	Show.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
		
                try {
                    String code  = textField.getText();
                    
                    conn c = new conn();
                    String str = "select pnr_no,paid_amt,pay_date,cheque_no,card_no,ph_no from payment where pnr_no = '"+code+"'";
					
                    ResultSet rs = c.s.executeQuery(str);
		
                    table.setModel(DbUtils.resultSetToTableModel(rs));
					
		}catch(SQLException e) {
                    e.printStackTrace();
                }
            }
	});
		
	setSize(960,590);
        setLocation(400,200);
	setVisible(true);

    }
}

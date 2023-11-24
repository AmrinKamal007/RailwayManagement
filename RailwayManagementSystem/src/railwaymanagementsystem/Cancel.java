package railwaymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class Cancel extends JFrame { 
    
    private JTextField textField,textField_1,textField_2,textField_3,textField_4,textField_5,textField_6,textField_7;

    public static void main(String[] args) {
        new Cancel();
    }
    
    public Cancel() {
        initialize();
    }
    
    private void initialize() {
        setTitle("CANCELLATION");
	getContentPane().setBackground(Color.WHITE);
	setBounds(100, 100, 801, 580);
	setLayout(null);
		
	JLabel Cancellation = new JLabel("CANCELLATION");
	Cancellation.setFont(new Font("Tahoma", Font.PLAIN, 31));
	Cancellation.setBounds(185, 24, 259, 40);
	add(Cancellation);
		
	
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("railwaymanagementsystem/icons/cancel.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel NewLabel = new JLabel(i3);
	NewLabel.setBounds(470, 100, 250, 250);
	add(NewLabel);
		
	JLabel PassengerNo = new JLabel("PNR NO");
	PassengerNo.setFont(new Font("Tahoma", Font.PLAIN, 17));
	PassengerNo.setBounds(60, 120, 150, 27);
	add(PassengerNo);
        
        textField = new JTextField();
	textField.setBounds(200, 120, 150, 27);
	add(textField);
		
	JLabel Address = new JLabel("ADDRESS");
	Address.setFont(new Font("Tahoma", Font.PLAIN, 17));
	Address.setBounds(60, 170, 150, 27);
	add(Address);
        
        textField_1 = new JTextField();
	textField_1.setBounds(200, 170, 150, 27);
	add(textField_1);
		
	JLabel Nationality = new JLabel("NATIONALITY");
	Nationality.setFont(new Font("Tahoma", Font.PLAIN, 17));
	Nationality.setBounds(60, 220, 150, 27);
	add(Nationality);
        
        textField_2 = new JTextField();
	textField_2.setBounds(200, 220, 150, 27);
	add(textField_2);
		
	JLabel Name = new JLabel("NAME");
	Name.setFont(new Font("Tahoma", Font.PLAIN, 17));
	Name.setBounds(60, 270, 150, 27);
	add(Name);
		
        textField_3 = new JTextField();
	textField_3.setBounds(200, 270, 150, 27);
	add(textField_3);
        
	JLabel Gender = new JLabel("GENDER");
	Gender.setFont(new Font("Tahoma", Font.PLAIN, 17));
	Gender.setBounds(60, 320, 150, 27);
	add(Gender);
        
        textField_4 = new JTextField();
	textField_4.setBounds(200, 320, 150, 27);
	add(textField_4);
        
        JLabel Ph_no = new JLabel("PH_NO");
	Ph_no.setFont(new Font("Tahoma", Font.PLAIN, 17));
	Ph_no.setBounds(60, 370, 150, 27);
	add(Ph_no);
        
        textField_5 = new JTextField();
	textField_5.setBounds(200, 370, 150, 27);
	add(textField_5);
        
        JLabel Aadhaar_No = new JLabel("AADHAAR_NO");
	Aadhaar_No.setFont(new Font("Tahoma", Font.PLAIN, 17));
	Aadhaar_No.setBounds(60, 420, 150, 27);
	add(Aadhaar_No);
        
        textField_6 = new JTextField();
	textField_6.setBounds(200, 420, 150, 27);
	add(textField_6);
        
        JLabel st_code = new JLabel("ST_CODE");
	st_code.setFont(new Font("Tahoma", Font.PLAIN, 17));
	st_code.setBounds(60, 470, 150, 27);
	add(st_code);
        
        textField_7 = new JTextField();
	textField_7.setBounds(200, 470, 150, 27);
	add(textField_7);
		
	JButton Cancel = new JButton("CANCEL");
	Cancel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        Cancel.setBackground(Color.BLACK);
        Cancel.setForeground(Color.WHITE);
	Cancel.setBounds(200, 520, 150, 32);
	add(Cancel);
		
	
        Cancel.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
		
                String pnr_no = textField.getText();
		String address = textField_1.getText();
		String nationality = textField_2.getText();
                String name=textField_3.getText();
		String gender = textField_4.getText();
                String ph_no=textField_5.getText();
                String aadhaar_No=textField_6.getText();
		String st_code = textField_7.getText();
					
					
		try{	
                    conn c = new conn();
                    String str = "delete from passenger where pnr_no="+pnr_no+" and address='"+address+"' and nationality='"+nationality+"' and name='"+name+"' and gender='"+gender+"' and ph_no="+ph_no+" and aadhaar_No="+aadhaar_No+" and st_code='"+st_code+"';";
		    
                    c.s.executeUpdate(str);
                    JOptionPane.showMessageDialog(null,"Ticket Canceled");
                    setVisible(false);
						
		}catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
			
	setSize(950,650);
	setVisible(true);
        setLocation(400,150);
    }
}

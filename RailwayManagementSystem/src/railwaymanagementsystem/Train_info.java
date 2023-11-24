package railwaymanagementsystem;

import net.proteanit.sql.DbUtils;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class Train_info extends JFrame{  

    private JTable table;
    private JTextField textField;
    
    public static void main(String[] args){		 
	new Train_info().setVisible(true);    
    }
    
    public Train_info(){
        
        getContentPane().setBackground(Color.WHITE);
        getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 13));
		
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(860,523);
	setLayout(null);
	setVisible(true);
		
	JLabel Scode = new JLabel("STATION CODE");
	Scode.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Scode.setBounds(50, 100, 200, 30);
	add(Scode);
	
		
	JLabel TrainDetails = new JLabel(" INFORMATION");
	TrainDetails.setFont(new Font("Tahoma", Font.PLAIN, 31));
	TrainDetails.setForeground(new Color(100, 149, 237));
	TrainDetails.setBounds(50, 20, 570, 35);
	add(TrainDetails);
		
	JButton btnShow = new JButton("SHOW");
	btnShow.setFont(new Font("Tahoma", Font.PLAIN, 20));
	
        btnShow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
	
                String code = textField.getText();
                
                try {
                    conn c = new conn();
                    String str = "select s_code,s_name,src,dst,capacity,class_code,coach_name from train where s_code = '"+code+"'";
      
                    ResultSet rs = c.s.executeQuery(str);
                    table.setModel(DbUtils.resultSetToTableModel(rs));	
                    
                }catch(SQLException e){
                    e.printStackTrace();
                }
            }
        });

        btnShow.setBounds(220, 150, 120, 30);
	add(btnShow);
		
        table = new JTable();
        table.setBackground(Color.WHITE);
	table.setBounds(23, 250, 800, 300);
        
        JScrollPane pane = new JScrollPane(table);
	pane.setBounds(23, 250, 800, 300);
        pane.setBackground(Color.WHITE);
        add(pane);
		
	textField = new JTextField();
        textField.setBounds(220, 100, 200, 30);
	add(textField);
		
	JLabel StationCode = new JLabel("STATION CODE");
	StationCode.setFont(new Font("Tahoma", Font.PLAIN, 13));
        StationCode.setBounds(23, 220, 126, 14);
	add(StationCode);
		
	JLabel TrainName = new JLabel("TRAIN NAME");
        TrainName.setFont(new Font("Tahoma", Font.PLAIN, 13));
	TrainName.setBounds(145, 220, 120, 14);
	add(TrainName);
		
	JLabel Source = new JLabel("SOURCE");
	Source.setFont(new Font("Tahoma", Font.PLAIN, 13));
	Source.setBounds(275, 220, 104, 14);
	add(Source);
		
	JLabel Destination = new JLabel("DESTINATION");
	Destination.setFont(new Font("Tahoma", Font.PLAIN, 13));
	Destination.setBounds(367, 220, 120, 14);
	add(Destination);
		
		
	JLabel Capacity = new JLabel("CAPACITY");
	Capacity.setFont(new Font("Tahoma", Font.PLAIN, 13));
	Capacity.setBounds(497, 220, 111, 14);
	add(Capacity);
		
	JLabel ClassCode = new JLabel("CLASS CODE");
	ClassCode.setFont(new Font("Tahoma", Font.PLAIN, 13));
	ClassCode.setBounds(587, 220, 120, 14);
	add(ClassCode);
		
	JLabel CoachName = new JLabel("COACH NAME");
	CoachName.setFont(new Font("Tahoma", Font.PLAIN, 13));
	CoachName.setBounds(700, 220, 111, 14);
	add(CoachName);
		
	
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	setSize(900,650);
        setVisible(true);
        setLocation(400,200);
		
    }
}
package railwaymanagementsystem;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Mainframe extends JFrame{

    public static void main(String[] args) {
        new Mainframe().setVisible(true);
    }
    
    public Mainframe() {
        super("INDIAN RAILWAY RESERVATION MANAGEMENT SYSTEM");
        System.out.println("In main frame");
        initialize();
    }

    
    private void initialize() {
	
        setForeground(Color.CYAN);
        setLayout(null); 

        JLabel NewLabel = new JLabel("");
	NewLabel.setIcon(new ImageIcon(ClassLoader.getSystemResource("railwaymanagementsystem/icons/Train_3.jpg")));
	NewLabel.setBounds(0, 0, 2000, 900); 
	add(NewLabel); 

        JLabel RailwayManagementSystem = new JLabel("INDIAN RAILWAYS WELCOMES YOU");
	RailwayManagementSystem.setForeground(Color.BLACK);
        RailwayManagementSystem.setFont(new Font("Tahoma", Font.BOLD, 48));
	RailwayManagementSystem.setBounds(300, 10, 900, 60);
	NewLabel.add(RailwayManagementSystem);
		
		
        JMenuBar menuBar = new JMenuBar();
	setJMenuBar(menuBar);
	
        JMenu TrainInfo = new JMenu("TRAIN_INFO");
        TrainInfo.setForeground(Color.BLACK);
	menuBar.add(TrainInfo);
        
        JMenuItem TrainDetails = new JMenuItem("TRAIN_INFO");
	TrainInfo.add(TrainDetails);
        
        JMenu AddCustomerDetails = new JMenu("ADD_CUSTOMER_DETAILS");
        AddCustomerDetails.setForeground(Color.BLACK);
	menuBar.add(AddCustomerDetails);
        
        JMenuItem ReservationDetails = new JMenuItem("ADD_CUSTOMER_DETAILS");
	AddCustomerDetails.add(ReservationDetails);
	
        JMenu JourneyDetails = new JMenu("JOURNEY_DETAILS");
        JourneyDetails.setForeground(Color.BLACK);
	menuBar.add(JourneyDetails);
        
        JMenuItem PassengerDetails = new JMenuItem("JOURNEY_DETAILS");
	JourneyDetails.add(PassengerDetails);
		
	JMenu PaymentDetails = new JMenu("PAYMENT_DETAILS");
        PaymentDetails.setForeground(Color.BLACK);
	menuBar.add(PaymentDetails);
        
        JMenuItem SectorDetails_1 = new JMenuItem("PAYMENT_DETAILS");
	PaymentDetails.add(SectorDetails_1);
		
	JMenu CancellationDetails = new JMenu("CANCELLATION");
        CancellationDetails.setForeground(Color.BLACK);
	menuBar.add(CancellationDetails);
        
        JMenuItem Cancellation = new JMenuItem("CANCELLATION");
	CancellationDetails.add(Cancellation);	
		
	TrainDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Train_info();
            }
	});
        
	ReservationDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    new Add_customer();
		} catch (Exception e) {
                    e.printStackTrace();
		} 
            }
	});
		
        PassengerDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    new Journey_Details();
                } catch (Exception e) {
                    e.printStackTrace();
		}
            }
	});
		
        SectorDetails_1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    new Payment_Details();
		} catch (Exception e) {
                    e.printStackTrace();
		}
            }
	});
		
        Cancellation.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Cancel();
            }
	});
		
        setSize(1950,1090);
	setVisible(true);
    }
}

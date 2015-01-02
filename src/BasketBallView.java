import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class BasketBallView extends JFrame{

	public BasketBallView()
	{
		JFrame BballF= new JFrame();
		
		JPanel hello = new JPanel();
		JTextField hi = new JTextField("BasketBall");
		
		hello.add(hi);
		BballF.add(hello);
		BballF.pack();
		BballF.setVisible(true);
	}
}

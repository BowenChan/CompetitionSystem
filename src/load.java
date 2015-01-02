import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class load extends JFrame{

	public static void main(String args[])
	{
		
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
	        public void run() {
	            loadGui();
	        }
	    });
	}
	
	private static void loadGui()
	{
		JButton create = new JButton("Start");
		final JFrame frame = new JFrame();
		//frame.setLayout(new BorderLayout());
		create.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

				//VVPRIMARY ERROR CURRENTLY VV
				//unable to setvisible false without the nextframe losing pixel
				//frame.setVisible(false);
				//frame.dispose();
				SelectionView a = new SelectionView();
				
			}
			
		});
		
		frame.setSize(400, 400);
		frame.add(create);
		frame.pack();
		frame.setVisible(true);
	}
	
}

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class SelectionView {

	public static void main(String args[])
	{
		//intialize frame
		JFrame selection = new JFrame("Sport Selection");
		JPanel a = new JPanel();
		selection.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		a.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		selection.setSize(500, 500);
		
		
		
		final JComboBox box = createDropdown();
		JButton load = new JButton("Load");
		
		load.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				int value = box.getSelectedIndex();
				
				switch(value)
				{
				case 0:
					System.out.println("Table Tennis");
					break;
				case 1:
					System.out.println("Basketball");
					break;
				default:
					System.out.println("Nothing");
					break;
				}
			}
			
		});
		//create comboBox
		
		c.ipady = 40;      //make this component tall
		c.weightx = 0.0;
		c.gridwidth = 3;
		c.gridx = 0;
		c.gridy = 1;
		a.add(box, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 2;
		a.add(load,c);
		
		selection.add(a);
		selection.setVisible(true);
	}
	
	/**
	 * Method CreateDropDown
	 * 
	 * Creates the dropdown menu for the selection view
	 * 
	 * @return the dropdown menu used in the view
	 */
	public static JComboBox createDropdown()
	{
		String[] sport = {"Table Tennis", "BasketBall"};
		
		JComboBox cb = new JComboBox(sport);
		
		return cb;
	}
}

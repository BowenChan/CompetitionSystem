import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SelectionView extends JFrame {

	public SelectionView() {
		// intialize frame
		JFrame selection = new JFrame("Sport Selection");
		JPanel a = new JPanel();
		selection.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		a.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();

		selection.setSize(300, 500);

		final JComboBox box = createDropdown();
		JButton load = new JButton("Load");

		load.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				int value = box.getSelectedIndex();

				switch (value) {
				case 0:
					TableTennisView a = new TableTennisView();
					break;
				case 1:
					BasketBallView b = new BasketBallView();
					break;
				default:
					System.out.println("Nothing");
					break;
				}
			}

		});
		// create comboBox

		c.ipady = 20; // make this component tall
		c.ipadx = 5;
		c.weightx = 0.0;
		c.gridwidth = 1;
		c.gridx = 0;
		c.gridy = 1;
		a.add(box, c);

		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 1;
		a.add(load, c);

		selection.add(a);
		selection.pack();
		selection.setVisible(true);
		selection.revalidate();
		selection.repaint();
	}

	/**
	 * Method CreateDropDown
	 * 
	 * Creates the dropdown menu for the selection view
	 * 
	 * @return the dropdown menu used in the view
	 */
	public JComboBox createDropdown() {
		String[] sport = { "Table Tennis", "BasketBall" };

		JComboBox cb = new JComboBox(sport);

		return cb;
	}
}

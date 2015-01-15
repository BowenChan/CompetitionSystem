
import java.awt.CardLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class StartPage extends JPanel {

	Integer[] tables = { 1, 2, 3, 4, 5, 6 };
	// Matches create;
	boolean visible;
	Matches game;
	JButton submit;
	JComboBox<Integer> tableAmount;

	StartPage(Matches cur) {
		// this.setSize(500, 500);
		game = cur;
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		JLabel welcome = new JLabel(
				"<html><center>Please Select</center><center> the number of </center><center> tables</center><br></html>");
		welcome.setFont(new Font("serif", Font.PLAIN, 52));
		welcome.setAlignmentX(CENTER_ALIGNMENT);
		welcome.setHorizontalAlignment(SwingConstants.CENTER);
		add(welcome);
		visible = true;
		this.add(createStart());
		setVisible(true);
	}

	private JPanel createStart() {
		tableAmount = new JComboBox<Integer>(tables);
		JPanel total = new JPanel();
		total.add(tableAmount);
		total.add(new JLabel("Tables"));
		total.setVisible(true);
		submit = new JButton("✓");
		// submit.addActionListener(new ActionListener(){
		//
		// @Override
		// public void actionPerformed(ActionEvent arg0) {
		// // TODO Auto-generated method stub
		// Object hello = tableAmount.getSelectedItem();
		// //switchVisi();
		// //create = new Matches(tableAmount.getSelectedItem());
		// }
		//
		// });
		total.add(submit);
		return total;
	}

	public void setSubmit(final CardLayout layout, final JPanel current) {
		submit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				layout.next(current);
				QueueFrame queue = new QueueFrame(tableAmount.getSelectedItem());
				queue.setVisi();
				game.setTable(tableAmount.getSelectedItem());
			}

		});
	}

	public void switchVisi() {
		if (visible == true) {
			visible = false;
			this.setVisible(visible);
		} else {
			visible = true;
			this.setVisible(visible);
		}

	}
}

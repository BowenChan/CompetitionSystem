import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TableTennisView extends JFrame {

	public TableTennisView() {
		JFrame tabletennis = new JFrame("Table Tennis");
		tabletennis.setSize(200, 200);

		JPanel hello = new JPanel();
		JTextField hi = new JTextField("Table Tennis");

		hello.add(hi);
		tabletennis.add(hello);
		// tabletennis.pack();
		tabletennis.setVisible(true);
	}

}

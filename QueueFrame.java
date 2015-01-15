

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class QueueFrame extends JFrame{

	String[] list = {"Bowen", "John", "Kim"};
	Integer amountOfTable;
	String[] labels = {"Table 1", "Table 2", "Table 3", "Table 4", "Table 5", "Table 6"};
	JLabel[] names;
	JPanel[] tables;
	JPanel panel;
	QueueFrame(Object table)
	{
		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		tables = new JPanel[6];
		names = new JLabel[6];
		setSize(200,300);
		setVisible(false);
		setTitle("QueueList");
		amountOfTable =  (Integer) table;
		createLabel();
		createPanel();
		this.add(panel);
	}
	
	public void setVisi()
	{
		this.setVisible(true);
	}
	
	private void createLabel()
	{
		for(int i = 0; i < amountOfTable; i++)
		{
			names[i] = new JLabel(labels[i]);
			setAlignment(names[i]);
		}
	}
	
	private void setAlignment(JLabel cur)
	{
		cur.setAlignmentX(JPanel.CENTER_ALIGNMENT);
		cur.setAlignmentY(JPanel.TOP_ALIGNMENT);
		
		//cur.
	}
	private void createPanel()
	{

		for(int i = 0; i < amountOfTable; i++)
		{
			tables[i] = new JPanel();
			tables[i].setLayout(new BoxLayout(tables[i], BoxLayout.Y_AXIS));
			tables[i].setBorder(BorderFactory.createLineBorder(Color.black));
			JButton conclude = new JButton("Done");
			
			tables[i].add(names[i]);
			tables[i].add(addQueue(tables[i]));
			panel.add(tables[i]);
		}
		
	}
	
	private JPanel addQueue(final JPanel loc)
	{
		JPanel cur = new JPanel();
		final JButton add = new JButton("add");
		final JComboBox<String> names = new JComboBox<String>(list);
		cur.add(names);
		add.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				names.setEnabled(false);
				add.setEnabled(false);
				loc.add(addQueue(loc));
				loc.revalidate();
			}
			
		});
		cur.add(add);
		
		return cur;
	}
}

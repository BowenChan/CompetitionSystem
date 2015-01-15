import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;


public class MainFrame extends JFrame{
	MainFrame()
	{
		//setSize(900,800);
		setSize(900,630);
		//setSize(600,600);
		setUpJTab();
		this.setResizable(false);
		setVisible(true);
	
	}
	
	public void setUpJTab()
	{
		JPanel a = new JPanel();
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.NORTH);
		tabbedPane.addTab("Matches", new MatchesMain());
		//tabbedPane.addTab("Matches", new Matches());
		
		tabbedPane.addTab("Players", new JPanel());
		
		tabbedPane.addTab("Players Info", new JPanel());
		
		tabbedPane.addTab("Add Player", new NewPlayer());
		
		tabbedPane.addTab("rating", new JPanel());
		
		tabbedPane.addTab("attendance", new JPanel());
		add(tabbedPane);
		
	}
	
}




import java.awt.CardLayout;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class MatchesMain extends JPanel{
	CardLayout layout;
	JPanel current;
	MatchesMain(){
		//this.setLayout(new GridLayout(4,3));
		layout = new CardLayout();
		current = new JPanel();
		current.setLayout(layout);
		//layout.show(current, "Selection");
		
		
		Matches match = new Matches();
		StartPage selection = new StartPage(match);
		
		current.add(selection, "Select");
		current.add(match, "games");
		
		selection.setSubmit(layout, current);
		match.setRevert(layout, current);
		this.add(current);
		
		this.setVisible(true);
		
	}
 
}

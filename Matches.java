

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Matches extends JPanel {
	Integer amountOfTable;
	int[] games;
	JPanel[] tables;
	String[] labels = {"Table 1", "Table 2", "Table 3", "Table 4", "Table 5", "Table 6"};
	String[] JComboName = {"Bowen", "Nancy", "Seigo"};
	JLabel[] names;
	JPanel bottom;
	JPanel side;
	JButton revert;
	Matches()
	{
		this.setSize(600,600);
		this.setBorder(BorderFactory.createLineBorder(Color.RED));
		games = new int[6];
		tables = new JPanel[6];
		names = new JLabel[6];
		revert = new JButton("Back");
		bottom = new JPanel();
		this.setLayout(new BorderLayout());
		/*
//		JLabel first, second , third ,fourth,fifth,sixth;
//		
//		first = new JLabel("Table 1");
//		second = new JLabel("Table 2");
//		third = new JLabel("Table 3");
//		fourth = new JLabel("Table 4");
//		fifth = new JLabel("Table 5");
//		sixth = new JLabel("Table 6");
//		JPanel playerList = new JPanel();
//		//playerList.setLayout(new BoxLayout(playerList, BoxLayout.X_AXIS));
//		playerList.add(name("Bowen"));
//		playerList.add(addVs());
//		playerList.add(name("Nancy"));
//		
//		JPanel fPanel,  sPanel, tPanel, foPanel,fiPanel,siPanel;
//		
//		fPanel = new JPanel();
//
//		//fPanel.setLayout(new GridLayout(4,3));
//		//fPanel.setPreferredSize(new Dimension(250,250));
//		fPanel.setLayout(new BoxLayout(fPanel, BoxLayout.Y_AXIS));
//		fPanel.setBorder(BorderFactory.createLineBorder(Color.black));
//		fPanel.add(first);
//		fPanel.add(playerList);
//		fPanel.add(createGames(fPanel));
//		//fPanel.add(createGames());
//		//fPanel.add(createGames());
//		//fPanel.add(createGames());
//		//fPanel.add(createGames());
//		//fPanel.add(new JButton("button"));
//		
//		sPanel = new JPanel();
//		//sPanel.setPreferredSize(new Dimension(250,250));
//		sPanel.setLayout(new BoxLayout(sPanel, BoxLayout.Y_AXIS));
//		sPanel.setBorder(BorderFactory.createLineBorder(Color.black));
//		sPanel.add(second);
//		
//		tPanel = new JPanel();
//		//tPanel.setPreferredSize(new Dimension(250,250));
//		tPanel.setBorder(BorderFactory.createLineBorder(Color.black));
//		tPanel.add(third);
//		
//		foPanel = new JPanel();
//		//foPanel.setPreferredSize(new Dimension(250,250));
//		foPanel.setBorder(BorderFactory.createLineBorder(Color.black));
//		foPanel.add(fourth);
//		
//		fiPanel = new JPanel();
//		//foPanel.setPreferredSize(new Dimension(250,250));
//		fiPanel.setBorder(BorderFactory.createLineBorder(Color.black));
//		fiPanel.add(fifth);
//		
//		siPanel = new JPanel();
//		//foPanel.setPreferredSize(new Dimension(250,250));
//		siPanel.setBorder(BorderFactory.createLineBorder(Color.black));
//		siPanel.add(sixth);
//		/*
//		setAlignment(fPanel);
//		setAlignment(sPanel);
//		setAlignment(tPanel);
//		setAlignment(foPanel);
//		*/
//		setAlignment(first);
//		setAlignment(second);
//		setAlignment(third);
//		setAlignment(fourth);
//		setAlignment(fifth);
//		setAlignment(sixth);
		
		//setLayout(new GridLayout(3,2,10,10));
//		this.add(fPanel);
//		this.add(sPanel);
//		this.add(tPanel);
//		this.add(foPanel);
//		this.add(fiPanel);
//		this.add(siPanel);
		
		//this.addFocusListener(focus());*/
		side = new JPanel();
		side.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		System.out.println(this.getLayout());
	}
	
	private void setAlignment(JLabel cur)
	{
		cur.setAlignmentX(JPanel.CENTER_ALIGNMENT);
		cur.setAlignmentY(JPanel.TOP_ALIGNMENT);
		
		//cur.
	}
	//Setting the names and creating the 2 names
	
	//adding vs
	private JPanel addVs()
	{
		final JButton confirmP = new JButton("Confirmed");
		JLabel vs = new JLabel("vs.");
		final JComboBox<String> players1 = new JComboBox<String>(JComboName);
		final JComboBox<String> players2 = new JComboBox<String>(JComboName);
		JPanel people = new JPanel();
		people.add(players1);
		people.add(vs);
		people.add(players2);
		people.add(confirmP);
		
		confirmP.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent arg0)
			{	
				// TODO Auto-generated method stub
				players1.setEnabled(false);
				players2.setEnabled(false);
				
				System.out.println(players1.getSelectedItem() + " vs " + players2.getSelectedItem());
				confirmP.setEnabled(false);
				confirmP.setVisible(false);
			}

		});
		
	
		return people;
	}
	
	private JTextField name(String name)
	{
		JTextField player = new JTextField(name);
		player.setEnabled(true);
		System.out.println(player.getPreferredSize());
		player.setHorizontalAlignment(JTextField.CENTER); 	
		player.setEditable(false);
		player.setDragEnabled(false);
		player.setBorder(null);
		//player.setPreferredSize(new Dimension(100,20));
		return player;
	}
	
	private JPanel createGames(final JPanel loc, final int i)
	{
		final int index = 0;
		final JPanel game = new JPanel();
		final JButton conclude = new JButton("Done");
		final JTextField score1 = new JTextField("",2);
		final JTextField score2 = new JTextField("",2);
		final JButton submit = new JButton("✓");
		//submit.setEnabled(false);
		submit.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if(games[i] < 4){
				score1.setEnabled(false);
				score2.setEnabled(false);
				submit.setEnabled(false);
				loc.add(createGames(loc, i));
				loc.revalidate();
				loc.repaint();
				games[i]++;
				}
				else
				{
					score1.setEnabled(false);
					score2.setEnabled(false);
					submit.setEnabled(false);
					loc.add(conclude);
					loc.revalidate();
					loc.repaint();
				}
				
			}
			
		});
		//submit.set
		//game.setLayout(new BoxLayout(game,BoxLayout.X_AXIS));
		game.add(score1);
		game.add(new JLabel("-"));
		game.add(score2);
		game.add(submit);

		loc.setVisible(true);
		return game;
	}
	
	public void setTable(Object object)
	{
		reset();
		amountOfTable = (Integer) object;
		if((amountOfTable == 6 || amountOfTable % 2 == 1) && amountOfTable > 1)
			bottom.setLayout(new GridLayout(2,amountOfTable/2,10,10));
		else
			bottom.setLayout(new GridLayout(amountOfTable/2,2,10,10));
		createLabel();
		createPanel();
		this.add(revert, BorderLayout.SOUTH);
		this.add(bottom, BorderLayout.CENTER);
		this.add(side,BorderLayout.EAST);
	}

	private void reset()
	{
		this.removeAll();
		bottom.removeAll();
		this.revalidate();
		this.repaint();
		
	}
	private void createLabel()
	{
		for(int i = 0; i < amountOfTable; i++)
		{
			names[i] = new JLabel(labels[i]);
			setAlignment(names[i]);
			games[i] = 0;
		}
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
			tables[i].add(addVs());
			tables[i].add(createGames(tables[i], i));
			bottom.add(tables[i]);
		}
		
	}
	
	public void setRevert(final CardLayout layout,final JPanel current)
	{
		revert.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				layout.next(current);
			}
			
		});
	}
}

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class RulesAndRegulations extends JFrame{

	JButton accept, decline;
	RulesAndRegulations()
	{
		JPanel agreement = new JPanel();
		agreement.setSize(new Dimension(300,300));
		agreement.setPreferredSize(new Dimension(300,300));
		setLayout(new BorderLayout());
		agreement.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		accept = new JButton("Accept");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		accept.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("true");
				System.exit(0);
			}
			
		});
		decline = new JButton("Decline");
		setSize(400,400);
		add(agreement,BorderLayout.CENTER);
		JPanel south = new JPanel();
		south.setLayout(new BorderLayout());
		south.add(accept,BorderLayout.WEST);
		south.add(decline,BorderLayout.EAST);
		
		add(south, BorderLayout.SOUTH);
		
		setVisible(true);
		
	}
}

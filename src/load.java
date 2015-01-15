	import java.awt.BorderLayout;
	import java.awt.EventQueue;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.lang.reflect.InvocationTargetException;
	
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.UIManager;
	
	
public class load {

	private JFrame frame;

	public static void main(String args[]) throws InvocationTargetException,
			InterruptedException {

		EventQueue.invokeAndWait(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager
							.getSystemLookAndFeelClassName());
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				// Create the UI here
				load window = new load();

				window.frame.setVisible(true);
				window.frame.revalidate();
				window.frame.repaint();
			}
		});
	}

	public load() {
		loadGui();
	}

	private void loadGui() {
		JButton create = new JButton("Start");
		frame = new JFrame();
		// frame.setLayout(new BorderLayout());
		create.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

				SelectionView a = new SelectionView();

				// VVPRIMARY ERROR CURRENTLY VV
				// unable to setvisible false without the nextframe losing pixel
				frame.setVisible(false);
				frame.dispose();
				a.revalidate();
				a.repaint();

			}

		});

		frame.setSize(400, 400);
		frame.add(create);
		frame.pack();

	}

}

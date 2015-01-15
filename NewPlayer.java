import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NewPlayer extends JPanel {

	JTextField firstname, lastname, currRating, currEmail, birth, sjsuID;
	JLabel first, last, rating, email, birthday, id;
	String[] text = { "First Name", "Last Name", "Rating", "Email", "Birthday",
			"Student ID" };

	NewPlayer() {

		setLayout(new FlowLayout());
		createLabel();
		createTextField();

		add(first);
		add(firstname);
		add(last);
		add(lastname);

		add(rating);
		add(currRating);

		add(email);
		add(currEmail);

		add(birthday);
		add(birth);

		add(id);
		add(sjsuID);

		JButton create = new JButton("Submit");
		add(create);
		create.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				RulesAndRegulations rules;
				if (checkAllField())
					rules = new RulesAndRegulations();

			}

		});
	}

	private boolean checkAllField() {
		if (!firstname.getText().equals(text[0])
				&& !lastname.getText().equals(text[1])
				&& !currEmail.getText().equals(text[3])
				&& !birth.getText().equals(text[4])
				&& !sjsuID.getText().equals(text[5])) {
			if (currRating.getText().equals(text[2]))
				currRating.setText("0");
			return true;
		} else {
			ErrorPanel();
			return false;
		}
	}

	private void ErrorPanel() {
		System.out.println("Enter all the data");
	}

	private void createTextField() {
		firstname = new JTextField(text[0], 14);
		firstname.addFocusListener(textField(firstname, 0));

		lastname = new JTextField(text[1], 14);
		lastname.addFocusListener(textField(lastname, 1));

		currRating = new JTextField(text[2], 5);
		currRating.addFocusListener(textField(currRating, 2));

		currEmail = new JTextField(text[3], 20);
		currEmail.addFocusListener(textField(currEmail, 3));

		birth = new JTextField(text[4], 15);
		birth.addFocusListener(textField(birth, 4));

		sjsuID = new JTextField(text[5], 20);
		sjsuID.addFocusListener(textField(sjsuID, 5));
	}

	private void createLabel() {
		first = new JLabel("First Name: ");
		last = new JLabel("Last Name: ");
		rating = new JLabel("Rating: ");
		email = new JLabel("Email: ");
		birthday = new JLabel("Birtday: ");
		id = new JLabel("id");
	}

	public FocusListener textField(final JTextField textF, final int i) {
		return new FocusListener() {

			@Override
			public void focusGained(FocusEvent arg0) {

				// TODO Auto-generated method stub
				if (textF.getText().equals(text[i]))
					textF.setText("");

			}

			@Override
			public void focusLost(FocusEvent arg0) {
				// TODO Auto-generated method stub
				if (textF.getText().equals(""))
					textF.setText(text[i]);

			}

		};
	}

}

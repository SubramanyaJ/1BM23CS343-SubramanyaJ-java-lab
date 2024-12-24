import java.awt.*;
import java.awt.event.*;

public class DivisionMain1 extends Frame implements ActionListener {
	TextField num1, num2;
	Button dResult;
	Label outResult;
	String out = "";
	int flag = 0;

	public DivisionMain1() {
		setLayout(new FlowLayout());

		// Initialize the components
		dResult = new Button("RESULT");
		Label number1 = new Label("Number 1:", Label.RIGHT);
		Label number2 = new Label("Number 2:", Label.RIGHT);
		num1 = new TextField(5);
		num2 = new TextField(5);
		outResult = new Label("Result:", Label.RIGHT);

		// Add the components to the frame
		add(number1);
		add(num1);
		add(number2);
		add(num2);
		add(dResult);
		add(outResult);

		// Add ActionListeners
		num1.addActionListener(this);
		num2.addActionListener(this);
		dResult.addActionListener(this);

		// Window closing action
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}

	public void actionPerformed(ActionEvent ae) {
		int n1, n2;
		try {
			// Only process the division when the "RESULT" button is clicked
			if (ae.getSource() == dResult) {
				// Validate that the fields are not empty
				if (num1.getText().isEmpty() || num2.getText().isEmpty()) {
					throw new NumberFormatException("Fields cannot be empty");
				}

				// Parse the input numbers
				n1 = Integer.parseInt(num1.getText());
				n2 = Integer.parseInt(num2.getText());

				// Check for divide by zero
				if (n2 == 0) {
					throw new ArithmeticException("Cannot divide by zero");
				}

				// Perform the division
				double resultNum = (double) n1 / n2;
				out = n1 + " / " + n2 + " = " + resultNum;
				flag = 0; // Reset flag after successful division
				repaint(); // Redraw the result

			}
		} catch (NumberFormatException e1) {
			// Handle NumberFormatException (invalid inputs)
			flag = 1;
			out = "Number Format Exception! " + e1.getMessage();
			repaint();
		} catch (ArithmeticException e2) {
			// Handle divide by zero error
			flag = 1;
			out = "Arithmetic Exception! " + e2.getMessage();
			repaint();
		}
	}

	public void paint(Graphics g) {
		// Display the result based on the flag
		if (flag == 0) {
			g.drawString(out, outResult.getX() + outResult.getWidth() + 10,
					outResult.getY() + outResult.getHeight() - 8);
		} else {
			g.drawString(out, 100, 200);
		}
	}

	public static void main(String[] args) {
		// Create an instance of DivisionMain1 and set up the window properties
		DivisionMain1 frame = new DivisionMain1();
		frame.setTitle("Division Program");
		frame.setSize(400, 200);
		frame.setVisible(true);
	}
}

import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.border.Border;
import javax.swing.*;
import java.net.*;


public class Piecewise extends JFrame {

	private JMenuBar menuBar;
	private JButton wolfram;
	private JLabel cond;
	private JTextField cond1;
	private JTextField cond2;
	private JTextField cond3;
	private JTextField cond4;
	private JTextField cond5;
	private JButton done;
	private JTextArea output;
	private JLabel state;
	private JTextField state2;
	private JTextField state3;
	private JTextField state4;
	private JTextField state5;
	private JTextField state1;
	private String math;

	//Constructor 
	public Piecewise() {

		this.setTitle("Piecewise");
		this.setSize(500, 400);
		//menu generate method
		generateMenu();
		this.setJMenuBar(menuBar);

		//pane with null layout
		JPanel contentPane = new JPanel(null);
		contentPane.setPreferredSize(new Dimension(500, 400));
		contentPane.setBackground(new Color(192, 192, 192));


		wolfram = new JButton();
		wolfram.setBounds(408, 293, 64, 34);
		wolfram.setBackground(new Color(214, 217, 223));
		wolfram.setForeground(new Color(0, 0, 0));
		wolfram.setEnabled(false);
		wolfram.setFont(new Font("sansserif", 0, 12));
		wolfram.setText("W");
		wolfram.setVisible(true);
		//Set action for button click
		//Call defined method
		wolfram.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				web(evt);
			}
		});


		cond = new JLabel();
		cond.setBounds(164, 14, 90, 35);
		cond.setBackground(new Color(214, 217, 223));
		cond.setForeground(new Color(0, 0, 0));
		cond.setEnabled(true);
		cond.setFont(new Font("sansserif", 0, 12));
		cond.setText("Conditions");
		cond.setVisible(true);

		cond1 = new JTextField();
		cond1.setBounds(163, 51, 90, 35);
		cond1.setBackground(new Color(255, 255, 255));
		cond1.setForeground(new Color(0, 0, 0));
		cond1.setEnabled(true);
		cond1.setFont(new Font("sansserif", 0, 12));
		cond1.setText("");
		cond1.setVisible(true);

		cond2 = new JTextField();
		cond2.setBounds(165, 114, 90, 35);
		cond2.setBackground(new Color(255, 255, 255));
		cond2.setForeground(new Color(0, 0, 0));
		cond2.setEnabled(true);
		cond2.setFont(new Font("sansserif", 0, 12));
		cond2.setText("");
		cond2.setVisible(true);

		cond3 = new JTextField();
		cond3.setBounds(165, 174, 90, 35);
		cond3.setBackground(new Color(255, 255, 255));
		cond3.setForeground(new Color(0, 0, 0));
		cond3.setEnabled(true);
		cond3.setFont(new Font("sansserif", 0, 12));
		cond3.setText("");
		cond3.setVisible(true);

		cond4 = new JTextField();
		cond4.setBounds(161, 232, 90, 35);
		cond4.setBackground(new Color(255, 255, 255));
		cond4.setForeground(new Color(0, 0, 0));
		cond4.setEnabled(true);
		cond4.setFont(new Font("sansserif", 0, 12));
		cond4.setText("");
		cond4.setVisible(true);

		cond5 = new JTextField();
		cond5.setBounds(166, 298, 90, 35);
		cond5.setBackground(new Color(255, 255, 255));
		cond5.setForeground(new Color(0, 0, 0));
		cond5.setEnabled(true);
		cond5.setFont(new Font("sansserif", 0, 12));
		cond5.setText("");
		cond5.setVisible(true);

		done = new JButton();
		done.setBounds(298, 292, 90, 35);
		done.setBackground(new Color(214, 217, 223));
		done.setForeground(new Color(0, 0, 0));
		done.setEnabled(true);
		done.setFont(new Font("sansserif", 0, 12));
		done.setText("Done");
		done.setVisible(true);
		//Set action for button click
		//Call defined method
		done.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				click(evt);
			}
		});


		output = new JTextArea();
		output.setBounds(320, 72, 150, 100);
		output.setBackground(new Color(255, 255, 255));
		output.setForeground(new Color(0, 0, 0));
		output.setEnabled(false);
		output.setFont(new Font("sansserif", 0, 12));
		output.setLineWrap(true);
		output.setText("");
		output.setBorder(BorderFactory.createBevelBorder(1));
		output.setVisible(true);

		state = new JLabel();
		state.setBounds(41, 15, 90, 35);
		state.setBackground(new Color(214, 217, 223));
		state.setForeground(new Color(0, 0, 0));
		state.setEnabled(true);
		state.setFont(new Font("sansserif", 0, 12));
		state.setText("Statements");
		state.setVisible(true);

		state1 = new JTextField();
		state1.setBounds(37, 51, 90, 35);
		state1.setBackground(new Color(255, 255, 255));
		state1.setForeground(new Color(0, 0, 0));
		state1.setEnabled(true);
		state1.setFont(new Font("sansserif", 0, 12));
		state1.setText("");
		state1.setVisible(true);

		state2 = new JTextField();
		state2.setBounds(33, 116, 90, 35);
		state2.setBackground(new Color(255, 255, 255));
		state2.setForeground(new Color(0, 0, 0));
		state2.setEnabled(true);
		state2.setFont(new Font("sansserif", 0, 12));
		state2.setText("");
		state2.setVisible(true);

		state3 = new JTextField();
		state3.setBounds(31, 178, 90, 35);
		state3.setBackground(new Color(255, 255, 255));
		state3.setForeground(new Color(0, 0, 0));
		state3.setEnabled(true);
		state3.setFont(new Font("sansserif", 0, 12));
		state3.setText("");
		state3.setVisible(true);

		state4 = new JTextField();
		state4.setBounds(30, 236, 90, 35);
		state4.setBackground(new Color(255, 255, 255));
		state4.setForeground(new Color(0, 0, 0));
		state4.setEnabled(true);
		state4.setFont(new Font("sansserif", 0, 12));
		state4.setText("");
		state4.setVisible(true);

		state5 = new JTextField();
		state5.setBounds(32, 299, 90, 35);
		state5.setBackground(new Color(255, 255, 255));
		state5.setForeground(new Color(0, 0, 0));
		state5.setEnabled(true);
		state5.setFont(new Font("sansserif", 0, 12));
		state5.setText("");
		state5.setVisible(true);

		//adding components to contentPane panel
		contentPane.add(wolfram);
		contentPane.add(cond);
		contentPane.add(cond1);
		contentPane.add(cond2);
		contentPane.add(cond3);
		contentPane.add(cond4);
		contentPane.add(cond5);
		contentPane.add(done);
		contentPane.add(output);
		contentPane.add(state);
		contentPane.add(state2);
		contentPane.add(state3);
		contentPane.add(state4);
		contentPane.add(state5);
		contentPane.add(state1);

		//adding panel to JFrame and seting of window position and close operation
		this.add(contentPane);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.pack();
		this.setVisible(true);
	}

	//Method actionPerformed for wolfram
	private void web(ActionEvent evt) {
		try {
			Desktop.getDesktop().browse(URI.create("http://www.wolframalpha.com/input/?i=" + URLEncoder.encode(math, "UTF-8")));
		} catch (java.io.IOException e) {
			System.out.println(e.getMessage());
		}
	}

	//Method actionPerformed for done
	private void click(ActionEvent evt) {
		if (checkfields()) {
			wolfram.setEnabled(true);
			output.setEnabled(true);
			output.setText(math + "\n\nif any of your statements didn't show up, please double check your inputted data");
		} else {
			output.setText("please recheck your inputted data");
		}
	}

	private boolean checkfields() {
		math = "Piecewise[{";

		if (false == (state1.getText().equals("") && cond1.getText().equals(""))) {
			if (Syntax.check(state1.getText()) && Syntax.check(state1.getText())) {
				if (math.equals("Piecewise[{")) {
					math += "{(" + state1.getText() + "), (" + cond1.getText() + ")}";
				} else {
					math += ", {(" + state1.getText() + "), (" + cond1.getText() + ")}";
				}
			} else {
				return false;
			}
		}

		if (false == (state2.getText().equals("") && cond2.getText().equals(""))) {
			if (Syntax.check(state2.getText()) && Syntax.check(state2.getText())) {
				if (math.equals("Piecewise[{")) {
					math += "{(" + state2.getText() + "), (" + cond2.getText() + ")}";
				} else {
					math += ", {(" + state2.getText() + "), (" + cond2.getText() + ")}";
				}
			} else {
				return false;
			}
		}

		if (false == (state3.getText().equals("") && cond3.getText().equals(""))) {
			if (Syntax.check(state3.getText()) && Syntax.check(state3.getText())) {
				if (math.equals("Piecewise[{")) {
					math += "{(" + state3.getText() + "), (" + cond3.getText() + ")}";
				} else {
					math += ", {(" + state3.getText() + "), (" + cond3.getText() + ")}";
				}
			} else {
				return false;
			}
		}

		if (false == (state4.getText().equals("") && cond4.getText().equals(""))) {
			if (Syntax.check(state4.getText()) && Syntax.check(state4.getText())) {
				if (math.equals("Piecewise[{")) {
					math += "{(" + state4.getText() + "), (" + cond4.getText() + ")}";
				} else {
					math += ", {(" + state4.getText() + "), (" + cond4.getText() + ")}";
				}
			} else {
				return false;
			}
		}

		if (false == (state5.getText().equals("") && cond5.getText().equals(""))) {
			if (Syntax.check(state5.getText()) && Syntax.check(state5.getText())) {
				if (math.equals("Piecewise[{")) {
					math += "{(" + state5.getText() + "), (" + cond5.getText() + ")}";
				} else {
					math += ", {(" + state5.getText() + "), (" + cond5.getText() + ")}";
				}
			} else {
				return false;
			}
		}

		math += "}]";

		return true;
	}

	//method for generate menu
	public void generateMenu() {
		menuBar = new JMenuBar();

		JMenu file = new JMenu("File");
		JMenu tools = new JMenu("Tools");
		JMenu help = new JMenu("Help");

		JMenuItem open = new JMenuItem("Open   ");
		JMenuItem save = new JMenuItem("Save   ");
		JMenuItem exit = new JMenuItem("Exit   ");
		JMenuItem preferences = new JMenuItem("Preferences   ");
		JMenuItem about = new JMenuItem("About   ");


		file.add(open);
		file.add(save);
		file.addSeparator();
		file.add(exit);
		tools.add(preferences);
		help.add(about);

		menuBar.add(file);
		menuBar.add(tools);
		menuBar.add(help);
	}



	public static void main(String[] args) {
		System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Piecewise();
			}
		});
	}

}
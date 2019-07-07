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


public class DifferenceQuotient extends JFrame {

	private JMenuBar menuBar;
	private JButton done;
	private JTextField
	function;
	private JLabel fx;
	private JTextArea output;
	private JTextField
	var;
	private JButton wolfram;
	private String converted;

	//Constructor 
	public DifferenceQuotient() {

		this.setTitle("DifferenceQuotient");
		this.setSize(500, 400);
		//menu generate method
		generateMenu();
		this.setJMenuBar(menuBar);

		//pane with null layout
		JPanel contentPane = new JPanel(null);
		contentPane.setPreferredSize(new Dimension(500, 400));
		contentPane.setBackground(new Color(192, 192, 192));


		done = new JButton();
		done.setBounds(25, 279, 90, 35);
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
				done(evt);
			}
		});


		function = new JTextField();

		function.setBounds(82, 46, 90, 35);

		function.setBackground(new Color(255, 255, 255));

		function.setForeground(new Color(0, 0, 0));

		function.setEnabled(true);

		function.setFont(new Font("sansserif", 0, 12));

		function.setText("");

		function.setVisible(true);

		fx = new JLabel();
		fx.setBounds(9, 44, 90, 35);
		fx.setBackground(new Color(214, 217, 223));
		fx.setForeground(new Color(0, 0, 0));
		fx.setEnabled(true);
		fx.setFont(new Font("sansserif", 0, 12));
		fx.setText("f(              ) =");
		fx.setVisible(true);

		output = new JTextArea();
		output.setBounds(23, 118, 150, 100);
		output.setBackground(new Color(255, 255, 255));
		output.setForeground(new Color(0, 0, 0));
		output.setEnabled(false);
		output.setFont(new Font("sansserif", 0, 12));
		output.setText("");
		output.setBorder(BorderFactory.createBevelBorder(1));
		output.setVisible(true);

		var = new JTextField();
		var.setBounds(21, 50, 34, 28);
		var.setBackground(new Color(255, 255, 255));
		var.setForeground(new Color(0, 0, 0));
		var.setEnabled(true);
		var.setFont(new Font("sansserif", 0, 12));
		var.setText("");
		var.setVisible(true);

		wolfram = new JButton();
		wolfram.setBounds(141, 279, 57, 34);
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


		//adding components to contentPane   panel
		contentPane.add(done);
		contentPane.add(function);
		contentPane.add(fx);
		contentPane.add(output);
		contentPane.add(var);
		contentPane.add(wolfram);

		//adding panel to JFrame and seting of window position and close operation
		this.add(contentPane);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.pack();
		this.setVisible(true);
	}

	//Method actionPerformed for done
	private void done(ActionEvent evt) {
		if (Syntax.check(function.getText())) {
			converted = difference(function.getText(),
			var.getText());
			wolfram.setEnabled(true);
			output.setEnabled(true);
			output.setText(converted);
		} else {
			output.setText("please double check your inputted data");
		}
	}

	private String difference(String functext, String variable) {
		return "simplify | ((" + functext.replaceAll(variable, "(" + variable + " + h)") + ") - (" + functext + ")) / h";
	}

	//Method actionPerformed for wolfram
	private void web(ActionEvent evt) {
		try {
			Desktop.getDesktop().browse(URI.create("http://www.wolframalpha.com/input/?i=" + URLEncoder.encode(converted, "UTF-8")));
		} catch (java.io.IOException e) {
			System.out.println(e.getMessage());
		}
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
				new DifferenceQuotient();
			}
		});
	}

}
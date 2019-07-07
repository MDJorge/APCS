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


public class Factor extends JFrame {

	private JMenuBar menuBar;
	private JButton done;
	private JTextField functext;
	private JLabel
	function;
	private JTextArea output;
	private JButton wolfram;
	private String converted;

	//Constructor 
	public Factor() {

		this.setTitle("Factor");
		this.setSize(500, 400);
		//menu generate method
		generateMenu();
		this.setJMenuBar(menuBar);

		//pane with null layout
		JPanel contentPane = new JPanel(null);
		contentPane.setPreferredSize(new Dimension(500, 400));
		contentPane.setBackground(new Color(192, 192, 192));


		done = new JButton();
		done.setBounds(45, 300, 90, 35);
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


		functext = new JTextField();
		functext.setBounds(85, 60, 146, 39);
		functext.setBackground(new Color(255, 255, 255));
		functext.setForeground(new Color(0, 0, 0));
		functext.setEnabled(true);
		functext.setFont(new Font("sansserif", 0, 12));
		functext.setText("");
		functext.setVisible(true);

		function = new JLabel();

		function.setBounds(36, 65, 90, 35);

		function.setBackground(new Color(214, 217, 223));

		function.setForeground(new Color(0, 0, 0));

		function.setEnabled(true);

		function.setFont(new Font("sansserif", 0, 12));

		function.setText("f(x) =");

		function.setVisible(true);

		output = new JTextArea();
		output.setBounds(63, 145, 150, 100);
		output.setBackground(new Color(255, 255, 255));
		output.setForeground(new Color(0, 0, 0));
		output.setEnabled(false);
		output.setFont(new Font("sansserif", 0, 12));
		output.setLineWrap(true);
		output.setText("");
		output.setBorder(BorderFactory.createBevelBorder(1));
		output.setVisible(true);

		wolfram = new JButton();
		wolfram.setBounds(159, 299, 70, 35);
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


		//adding components to contentPane panel
		contentPane.add(done);
		contentPane.add(functext);
		contentPane.add(function);
		contentPane.add(output);
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
		if (Syntax.check(functext.getText())) {
			converted = "Factor[" + functext.getText() + "]";
			wolfram.setEnabled(true);
			output.setEnabled(true);
			output.setText(converted);
		} else {
			output.setText("please double check your inputted data");
		}
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
				new Factor();
			}
		});
	}

}
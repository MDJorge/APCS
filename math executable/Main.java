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


public class Main extends JFrame {

	private JMenuBar menuBar;
	private JButton difference;
	private JButton factor;
	private JButton limits;
	private JButton piecewise;
	private JLabel select;

	//Constructor 
	public Main() {

		this.setTitle("Main");
		this.setSize(500, 400);
		//menu generate method
		generateMenu();
		this.setJMenuBar(menuBar);

		//pane with null layout
		JPanel contentPane = new JPanel(null);
		contentPane.setPreferredSize(new Dimension(500, 400));
		contentPane.setBackground(new Color(192, 192, 192));


		difference = new JButton();
		difference.setBounds(72, 154, 156, 36);
		difference.setBackground(new Color(214, 217, 223));
		difference.setForeground(new Color(0, 0, 0));
		difference.setEnabled(true);
		difference.setFont(new Font("sansserif", 0, 12));
		difference.setText("difference quotient");
		difference.setVisible(true);
		//Set action for button click
		//Call defined method
		difference.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				differenceclick(evt);
			}
		});


		factor = new JButton();
		factor.setBounds(283, 148, 90, 35);
		factor.setBackground(new Color(214, 217, 223));
		factor.setForeground(new Color(0, 0, 0));
		factor.setEnabled(true);
		factor.setFont(new Font("sansserif", 0, 12));
		factor.setText("factor");
		factor.setVisible(true);
		//Set action for button click
		//Call defined method
		factor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				factorclick(evt);
			}
		});


		limits = new JButton();
		limits.setBounds(283, 84, 90, 35);
		limits.setBackground(new Color(214, 217, 223));
		limits.setForeground(new Color(0, 0, 0));
		limits.setEnabled(true);
		limits.setFont(new Font("sansserif", 0, 12));
		limits.setText("limits");
		limits.setVisible(true);
		//Set action for button click
		//Call defined method
		limits.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				limitclick(evt);
			}
		});


		piecewise = new JButton();
		piecewise.setBounds(74, 84, 149, 38);
		piecewise.setBackground(new Color(214, 217, 223));
		piecewise.setForeground(new Color(0, 0, 0));
		piecewise.setEnabled(true);
		piecewise.setFont(new Font("sansserif", 0, 12));
		piecewise.setText("piecewise function");
		piecewise.setVisible(true);
		//Set action for button click
		//Call defined method
		piecewise.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				piecewiseclick(evt);
			}
		});


		select = new JLabel();
		select.setBounds(204, 21, 90, 35);
		select.setBackground(new Color(255, 255, 255));
		select.setForeground(new Color(0, 0, 56));
		select.setEnabled(true);
		select.setFont(new Font("SansSerif", 0, 12));
		select.setText("Select a function");
		select.setVisible(true);

		//adding components to contentPane panel
		contentPane.add(difference);
		contentPane.add(factor);
		contentPane.add(limits);
		contentPane.add(piecewise);
		contentPane.add(select);

		//adding panel to JFrame and seting of window position and close operation
		this.add(contentPane);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.pack();
		this.setVisible(true);
	}

	//Method actionPerformed for difference
	private void differenceclick(ActionEvent evt) {
		System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new DifferenceQuotient();
			}
		});
	}

	//Method actionPerformed for factor
	private void factorclick(ActionEvent evt) {
		System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Factor();
			}
		});
	}

	//Method actionPerformed for limits
	private void limitclick(ActionEvent evt) {
		System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Limits();
			}
		});
	}

	//Method actionPerformed for piecewise
	private void piecewiseclick(ActionEvent evt) {
		System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Piecewise();
			}
		});
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
				new Main();
			}
		});
	}

}
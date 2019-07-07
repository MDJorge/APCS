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


public class Limits extends JFrame {

    private ButtonGroup direction;
    private JMenuBar menuBar;
    private JCheckBox optionstoggle;
    private JRadioButton left;
    private JLabel as;
    private JRadioButton both;
    private JButton done;
    private JLabel from;
    private JTextField functext;
    private JLabel fx;
    private JLabel goes;
    private JTextField goestext;
    private JLabel options;
    private JTextArea output;
    private JPanel panel1;
    private JRadioButton right;
    private JTextField
    var;
    private JButton wolfram;
    private String math;

    //Constructor 
    public Limits() {

        this.setTitle("Limits");
        this.setSize(500, 400);
        //menu generate method
        generateMenu();
        this.setJMenuBar(menuBar);


        optionstoggle = new JCheckBox();
        optionstoggle.setBounds(100, 100, 90, 35);
        optionstoggle.setBackground(new Color(214, 217, 223));
        optionstoggle.setForeground(new Color(0, 0, 0));
        optionstoggle.setEnabled(true);
        optionstoggle.setFont(new Font("sansserif", 0, 12));
        optionstoggle.setText("enable");
        optionstoggle.setVisible(true);
        //Set action for button click
        //Call defined method
        optionstoggle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                enabled(evt);
            }
        });

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(500, 400));
        contentPane.setBackground(new Color(192, 192, 192));


        left = new JRadioButton();
        left.setBounds(12, 60, 90, 35);
        left.setBackground(new Color(214, 217, 223));
        left.setForeground(new Color(0, 0, 0));
        left.setEnabled(false);
        left.setFont(new Font("sansserif", 0, 12));
        left.setText("Left");
        left.setVisible(true);


        as = new JLabel();
        as.setBounds(29, 141, 90, 35);
        as.setBackground(new Color(214, 217, 223));
        as.setForeground(new Color(0, 0, 0));
        as.setEnabled(true);
        as.setFont(new Font("sansserif", 0, 12));
        as.setText("as (variable)");
        as.setVisible(true);

        both = new JRadioButton();
        both.setBounds(14, 5, 90, 35);
        both.setBackground(new Color(214, 217, 223));
        both.setForeground(new Color(0, 0, 0));
        both.setEnabled(false);
        both.setFont(new Font("sansserif", 0, 12));
        both.setText("Both");
        both.setVisible(true);


        done = new JButton();
        done.setBounds(238, 48, 90, 35);
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


        from = new JLabel();
        from.setBounds(22, 266, 129, 34);
        from.setBackground(new Color(214, 217, 223));
        from.setForeground(new Color(0, 0, 0));
        from.setEnabled(true);
        from.setFont(new Font("sansserif", 0, 12));
        from.setText("from  (choose a side)");
        from.setVisible(true);

        functext = new JTextField();
        functext.setBounds(84, 47, 90, 35);
        functext.setBackground(new Color(255, 255, 255));
        functext.setForeground(new Color(0, 0, 0));
        functext.setEnabled(true);
        functext.setFont(new Font("sansserif", 0, 12));
        functext.setText("");
        functext.setVisible(true);

        fx = new JLabel();
        fx.setBounds(35, 48, 90, 35);
        fx.setBackground(new Color(214, 217, 223));
        fx.setForeground(new Color(0, 0, 0));
        fx.setEnabled(true);
        fx.setFont(new Font("sansserif", 0, 12));
        fx.setText("f(x) =");
        fx.setVisible(true);

        goes = new JLabel();
        goes.setBounds(25, 201, 90, 35);
        goes.setBackground(new Color(214, 217, 223));
        goes.setForeground(new Color(0, 0, 0));
        goes.setEnabled(true);
        goes.setFont(new Font("sansserif", 0, 12));
        goes.setText("goes to");
        goes.setVisible(true);

        goestext = new JTextField();
        goestext.setBounds(112, 203, 40, 35);
        goestext.setBackground(new Color(255, 255, 255));
        goestext.setForeground(new Color(0, 0, 0));
        goestext.setEnabled(false);
        goestext.setFont(new Font("sansserif", 0, 12));
        goestext.setText("");
        goestext.setVisible(true);

        options = new JLabel();
        options.setBounds(30, 99, 90, 35);
        options.setBackground(new Color(214, 217, 223));
        options.setForeground(new Color(0, 0, 0));
        options.setEnabled(true);
        options.setFont(new Font("sansserif", 0, 12));
        options.setText("options:");
        options.setVisible(true);

        output = new JTextArea();
        output.setBounds(288, 116, 150, 100);
        output.setBackground(new Color(255, 255, 255));
        output.setForeground(new Color(0, 0, 0));
        output.setEnabled(false);
        output.setFont(new Font("sansserif", 0, 12));
        output.setLineWrap(true);
        output.setText("");
        output.setBorder(BorderFactory.createBevelBorder(1));
        output.setVisible(true);

        panel1 = new JPanel(null);
        panel1.setBorder(BorderFactory.createEtchedBorder(1));
        panel1.setBounds(152, 253, 150, 100);
        panel1.setBackground(new Color(214, 217, 223));
        panel1.setForeground(new Color(0, 0, 0));
        panel1.setEnabled(true);
        panel1.setFont(new Font("sansserif", 0, 12));
        panel1.setVisible(true);

        right = new JRadioButton();
        right.setBounds(13, 31, 90, 35);
        right.setBackground(new Color(214, 217, 223));
        right.setForeground(new Color(0, 0, 0));
        right.setEnabled(false);
        right.setFont(new Font("sansserif", 0, 12));
        right.setText("Right");
        right.setVisible(true);

        var = new JTextField();
        var.setBounds(113, 141, 40, 35);
        var.setBackground(new Color(255, 255, 255));
        var.setForeground(new Color(0, 0, 0));
        var.setEnabled(false);
        var.setFont(new Font("sansserif", 0, 12));
        var.setText("");
        var.setVisible(true);

        wolfram = new JButton();
        wolfram.setBounds(365, 47, 64, 38);
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

        //Group radio buttons
        direction = new ButtonGroup();
        direction.add(left);
        direction.add(both);
        direction.add(right);


        //adding components to contentPane panel
        panel1.add(left);
        contentPane.add(as);
        panel1.add(both);
        contentPane.add(done);
        contentPane.add(from);
        contentPane.add(functext);
        contentPane.add(fx);
        contentPane.add(goes);
        contentPane.add(goestext);
        contentPane.add(options);
        contentPane.add(output);
        contentPane.add(panel1);
        panel1.add(right);
        contentPane.add(var);
        contentPane.add(wolfram);
        contentPane.add(optionstoggle);

        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }


    private void convert() {
        math = "Limit[(" + functext.getText() + ")]";
    }


    private void convertoptions() {
        if (both.isSelected()) {
            math = "Limit[(" + functext.getText() + "), (" +
            var.getText() + ") -> (" + goestext.getText() + ")]";
        } else if (left.isSelected()) {
            math = "Limit[(" + functext.getText() + "), (" +
            var.getText() + ") -> (" + goestext.getText() + "), Direction -> 1]";
        } else {
            math = "Limit[(" + functext.getText() + "), (" +
            var.getText() + ") -> (" + goestext.getText() + "), Direction -> -1]";
        }
    }

    //Method actionPerformed for done
    private void done(ActionEvent evt) {
        if (optionstoggle.isSelected() && Syntax.check(functext.getText())) {
            if (Syntax.check(var.getText()) && Syntax.check(goestext.getText()) && (both.isSelected() || left.isSelected() || right.isSelected()) && (false == (var.getText().equals("") ||
            var.getText().equals("")))) {
                convertoptions();
                wolfram.setEnabled(true);
                output.setEnabled(true);
                output.setText(math);
            } else {
                output.setText("please double check your inputted data");
            }
        } else if (Syntax.check(functext.getText())) {
            convert();
            wolfram.setEnabled(true);
            output.setEnabled(true);
            output.setText(math);
        } else {
            output.setText("please double check your inputted data");
        }
    }

    //Method actionPerformed for optionstoggle
    private void enabled(ActionEvent evt) {
        if (optionstoggle.isSelected()) {
            goestext.setEnabled(true);
            right.setEnabled(true);
            left.setEnabled(true);
            both.setEnabled(true);
            var.setEnabled(true);
        } else {
            goestext.setEnabled(false);
            right.setEnabled(false);
            left.setEnabled(false);
            both.setEnabled(false);
            var.setEnabled(false);
        }
    }

    //Method actionPerformed for wolfram
    private void web(ActionEvent evt) {
        try {
            Desktop.getDesktop().browse(URI.create("http://www.wolframalpha.com/input/?i=" + URLEncoder.encode(math, "UTF-8")));
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
                new Limits();
            }
        });
    }

}
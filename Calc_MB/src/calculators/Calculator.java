package calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JLabel;
import java.awt.Color;

public class Calculator implements ActionListener
{

    private JFrame frmM;
    private JTextField txtMultibaseCalculator;

    int num1, num2, sum;
    String operations;
    String answer;
    private JTextField bText;
    int base = 10;
    JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnA, btnB, btnC, btnD, btnE, btnF;

    /**
     * Launch the application.
     */
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {

            public void run()
            {
                try
                {
                    Calculator window = new Calculator();
                    window.frmM.setVisible(true);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Calculator()
    {
        initialize();
    }

    // Controls the buttons as the sliders moves from base 0 - 16
    public void checkDigits(int base) {
        btn0.setEnabled(base>0);
        btn1.setEnabled(base>1);
        btn2.setEnabled(base>2);
        btn3.setEnabled(base>3);
        btn4.setEnabled(base>4);
        btn5.setEnabled(base>5);
        btn6.setEnabled(base>6);
        btn7.setEnabled(base>7);
        btn8.setEnabled(base>8);
        btn9.setEnabled(base>9);
        btnA.setEnabled(base>10);
        btnB.setEnabled(base>11);
        btnC.setEnabled(base>12);
        btnD.setEnabled(base>13);
        btnE.setEnabled(base>14);
        btnF.setEnabled(base>15);       
    }
    
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton)e.getSource();
        String currentValue = txtMultibaseCalculator.getText();
        String newString = "";
        if (!currentValue.equals("0")) {
            newString = currentValue;
        }
        newString = newString + source.getText();
        txtMultibaseCalculator.setText(newString);
    }
    
    /**
     * Initialize the contents of the frame.
     */
    private void initialize()
    {
        frmM = new JFrame();
        frmM.getContentPane().setBackground(Color.RED);
        frmM.setBackground(Color.BLUE);
        frmM.setTitle("MULTIBASE CALCULATOR");
        frmM.setBounds(100, 100, 446, 367);
        frmM.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmM.getContentPane().setLayout(null);

        txtMultibaseCalculator = new JTextField();
        txtMultibaseCalculator.setHorizontalAlignment(SwingConstants.CENTER);
        txtMultibaseCalculator.setBounds(6, 6, 438, 36);
        frmM.getContentPane().add(txtMultibaseCalculator);
        txtMultibaseCalculator.setColumns(10);

        // Buttons 0 - 3 
        //Column 1

        //Button 0
        btn0 = new JButton("0");
        btn0.addActionListener(this);
        btn0.setBounds(6, 48, 48, 48);
        frmM.getContentPane().add(btn0);

        // Button 1 
        btn1 = new JButton("1");
        btn1.addActionListener(this);
        btn1.setBounds(6, 96, 48, 48);
        frmM.getContentPane().add(btn1);

        // Button 2
        btn2 = new JButton("2");
        btn2.addActionListener(this);
        btn2.setBounds(6, 144, 48, 48);
        frmM.getContentPane().add(btn2);

        //Button 3
        btn3 = new JButton("3");
        btn3.addActionListener(this);
        btn3.setBounds(6, 193, 48, 48);
        frmM.getContentPane().add(btn3);

        //COLUMN 2 4 -7
        // Button 4
        btn4 = new JButton("4");
        btn4.addActionListener(this);
        btn4.setBounds(66, 48, 48, 48);
        frmM.getContentPane().add(btn4);
        //Button 5
        btn5 = new JButton("5");
        btn5.addActionListener(this);
        btn5.setBounds(66, 96, 48, 48);
        frmM.getContentPane().add(btn5);

        //Button 6
        btn6 = new JButton("6");
        btn6.addActionListener(this);
        btn6.setBounds(66, 144, 48, 48);
        frmM.getContentPane().add(btn6);

        //Button 7
        btn7 = new JButton("7");
        btn7.addActionListener(this);
        btn7.setBounds(66, 193, 48, 48);
        frmM.getContentPane().add(btn7);

        //CLOUM 3 , Numbers 8 - B
        //Button 8
        btn8 = new JButton("8");
        btn8.addActionListener(this);
        btn8.setBounds(126, 48, 48, 48);
        frmM.getContentPane().add(btn8);

        //Button 9
        btn9 = new JButton("9");
        btn9.addActionListener(this);
        btn9.setBounds(126, 96, 48, 48);
        frmM.getContentPane().add(btn9);

        //Button A
        btnA = new JButton("A");
        btnA.addActionListener(this);
        btnA.setBounds(126, 144, 48, 48);
        frmM.getContentPane().add(btnA);

        //Button B
        btnB = new JButton("B");
        btnB.addActionListener(this);
        btnB.setBounds(126, 193, 48, 48);
        frmM.getContentPane().add(btnB);

        //COLUMN 4 LETTERS C - F
        //Button C
        btnC = new JButton("C");
        btnC.addActionListener(this);
        btnC.setBounds(186, 48, 48, 48);
        frmM.getContentPane().add(btnC);

        //Button D
        btnD = new JButton("D");
        btnD.addActionListener(this);
        btnD.setBounds(186, 96, 48, 48);
        frmM.getContentPane().add(btnD);

        //Button E 
        btnE = new JButton("E");
        btnE.addActionListener(this);
        btnE.setBounds(186, 144, 48, 48);
        frmM.getContentPane().add(btnE);

        //Button F
        btnF = new JButton("F");
        btnF.addActionListener(this);
        btnF.setBounds(186, 193, 48, 48);
        frmM.getContentPane().add(btnF);

        //OPERATIONS
        //Subtraction
        JButton btnNewButton_14 = new JButton("-");
        btnNewButton_14.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {
                String value = txtMultibaseCalculator.getText();
                Integer tempInt = Integer.valueOf(value, base);
                num1 = tempInt.intValue();
                txtMultibaseCalculator.setText("");
                operations = "-";
            }
        });
        btnNewButton_14.setBounds(277, 106, 50, 50);
        frmM.getContentPane().add(btnNewButton_14);

        // Addition 
        JButton btnNewButton_15 = new JButton("+");
        btnNewButton_15.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {
                String value = txtMultibaseCalculator.getText();
                Integer tempInt = Integer.valueOf(value, base);
                num1 = tempInt.intValue();
                txtMultibaseCalculator.setText("");
                operations = "+";
            }
        });
        btnNewButton_15.setBounds(277, 58, 50, 50);
        frmM.getContentPane().add(btnNewButton_15);

        //Multiplication
        JButton btnNewButton_16 = new JButton("x");
        btnNewButton_16.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {
                String value = txtMultibaseCalculator.getText();
                Integer tempInt = Integer.valueOf(value, base);
                num1 = tempInt.intValue();
                txtMultibaseCalculator.setText("");
                operations = "x";
            }
        });
        btnNewButton_16.setBounds(277, 154, 50, 50);
        frmM.getContentPane().add(btnNewButton_16);

        //Division
        JButton btnNewButton_17 = new JButton("/");
        btnNewButton_17.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {
                String value = txtMultibaseCalculator.getText();
                Integer tempInt = Integer.valueOf(value, base);
                num1 = tempInt.intValue();
                txtMultibaseCalculator.setText("");
                operations = "/";
            }
        });
        btnNewButton_17.setBounds(277, 203, 50, 50);
        frmM.getContentPane().add(btnNewButton_17);

        //= Sign, Operations
        JButton btnNewButton_18 = new JButton("=");
        btnNewButton_18.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {

                String value = txtMultibaseCalculator.getText();
                Integer tempInt = Integer.valueOf(value, base);
                num2 = tempInt.intValue();

                if (operations == "+")
                {
                    sum = num1 + num2;
                }
                else if (operations == "-")
                {
                    sum = num1 - num2;
                }
                else if (operations == "x")
                {
                    sum = num1 * num2;
                }
                else if (operations == "/")
                {
                    sum = num1 / num2;
                }
                System.out.println(num1 + operations + num2);
                
                String tempString = Integer.toString(sum, base);
                txtMultibaseCalculator.setText(tempString);

            }
        });
        btnNewButton_18.setBounds(339, 106, 50, 50);
        frmM.getContentPane().add(btnNewButton_18);

        //CLEARS
        JButton btnNewButton_19 = new JButton("CLR");
        btnNewButton_19.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {
                txtMultibaseCalculator.setText(null);
            }
        });
        btnNewButton_19.setBounds(339, 167, 50, 50);
        frmM.getContentPane().add(btnNewButton_19);

        //J label and text for the Slider
        JLabel bLabel = new JLabel("BASE:");
        bLabel.setBounds(41, 311, 61, 16);
        frmM.getContentPane().add(bLabel);

        bText = new JTextField();
        bText.setBounds(167, 306, 130, 26);
        frmM.getContentPane().add(bText);
        bText.setColumns(10);

        //SLIDER
        JSlider slider = new JSlider();
        slider.setMinorTickSpacing(1);
        slider.addChangeListener(new ChangeListener()
        {

            public void stateChanged(ChangeEvent e)
            {
                int c = slider.getValue();
                bText.setText("" + c);
               
                String currentString = txtMultibaseCalculator.getText();
                if (!currentString.equals(""))
                {
                    String value = txtMultibaseCalculator.getText();
                    Integer tempInt = Integer.valueOf(value, base);
                    int temp = tempInt.intValue();

                    base = c;
                    String tempString = Integer.toString(temp, c);
                    txtMultibaseCalculator.setText(tempString);
                }
                else {
                    base = c;
                }
                
                checkDigits(base);

            }

        });
        slider.setMinimum(2);
        slider.setMaximum(16);
        slider.setMajorTickSpacing(2);
        slider.setToolTipText("");
        slider.setSnapToTicks(true);
        slider.setPaintLabels(true);
        slider.setPaintTicks(true);
        slider.setBounds(6, 253, 438, 40);
        slider.setValue(10);
        base = 10;
        checkDigits(base);

        //System.out.println("Setting value of slider to " + base);
        frmM.getContentPane().add(slider);
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
public class CredentialsMenu {
	JFrame mainMenu = new JFrame("Credentials Generator");

    JPanel title = new JPanel();
    JPanel inputTextPanel = new JPanel();
    JPanel exitPanel = new JPanel();

    JLabel welcomeText = new JLabel("Welcome to the credentials randomizer program");
    JLabel inputPromptText = new JLabel("Click on the randomizer buttons to get a new username and password");

    JLabel userNameText = new JLabel("Username: ");
    JButton exitButton = new JButton("Exit Program");
    
    
    public CredentialsMenu() {
    	mainMenu.setSize(600, 600);
        mainMenu.setResizable(false);
        mainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainMenu.setLocationRelativeTo(null);
        mainMenu.setLayout(null);
        mainMenu.getContentPane().setBackground(new Color(100, 55, 90));
        
        title.setBounds(0, 0, 600, 50);
        exitPanel.setBounds(420,500,150,50);
        inputTextPanel.setBounds(0, 50, 600, 150);

        welcomeText.setFont(new Font("Monospaced", Font.BOLD, 16));
        welcomeText.setForeground(Color.white);
        inputPromptText.setFont(new Font("Monospaced", Font.BOLD, 10));
        inputPromptText.setForeground(Color.white);


        title.setBackground(new Color(150, 55, 120));
        exitPanel.setBackground(new Color(150, 55, 120));
        inputTextPanel.setBackground(new Color(100, 55, 90));
                 
        exitButton.setOpaque(false);
        exitButton.setContentAreaFilled(false);
        exitButton.setBorderPainted(false);
        
        ActionListener exitProgram = new ClickListener();
        exitButton.addActionListener(exitProgram);
        exitButton.addActionListener(e -> {
            mainMenu.dispose();
        });
        exitPanel.add(exitButton);
        title.add(welcomeText, BorderLayout.CENTER);
        inputTextPanel.add(inputPromptText);
        
        mainMenu.add(inputTextPanel);
        mainMenu.add(title);
        mainMenu.add(exitPanel);
        mainMenu.setVisible(true);
    }
    class ClickListener implements ActionListener {

       
        public void actionPerformed(ActionEvent e) {
                
            }
        }
    }



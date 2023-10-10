import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
public class CredentialsMenu {
	JFrame mainMenu = new JFrame("Credentials Generator and Manager");

    JPanel title = new JPanel();
    JPanel inputTextPanel = new JPanel();
    JPanel exitPanel = new JPanel();
    JPanel usernamePanel = new JPanel();
    JPanel passwordPanel = new JPanel();
    JPanel generatedCredentialsPanel = new JPanel();

    JLabel welcomeText = new JLabel("Welcome to the credentials randomizer program");
    JLabel inputPromptText = new JLabel("Click on the randomizer buttons to get a new username and password");
    JLabel userNameText = new JLabel("Username: ");
    JLabel passwordText = new JLabel("Password: ");
    JLabel currentUserNameLabel = new JLabel("Current Username: ");
    JLabel currentPasswordLabel = new JLabel("Current Password: ");
    
    JLabel currentUserNameText = new JLabel();
    JLabel currentPasswordText = new JLabel();
    JTextField userNameInput = new JTextField(24);
    JTextField passwordInput = new JTextField(24);
    
    JButton userNameRandomButton = new JButton("Randomize");
    JButton passwordRandomButton = new JButton("Randomize");
    JButton exitButton = new JButton("Exit Program");
    
    Border inputBorder = BorderFactory.createLineBorder(new Color(150,80,255),5);
    
    public CredentialsMenu() {
    	mainMenu.setSize(600, 600);
        mainMenu.setResizable(false);
        mainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainMenu.setLocationRelativeTo(null);
        mainMenu.setLayout(null);
        mainMenu.getContentPane().setBackground(new Color(100, 55, 90));
        

        title.setBounds(0, 0, 600, 50);
        exitPanel.setBounds(420,500,150,50);
        inputTextPanel.setBounds(0, 50, 585, 200);
        inputTextPanel.setBorder(inputBorder);
        usernamePanel.setBounds(100, 100, 400, 50);
        passwordPanel.setBounds(100, 150, 400, 50);
        generatedCredentialsPanel.setBounds(100, 350, 400, 50);

        welcomeText.setFont(new Font("Monospaced", Font.BOLD, 16));
        welcomeText.setForeground(Color.white);
        inputPromptText.setFont(new Font("Monospaced", Font.BOLD, 10));
        inputPromptText.setForeground(Color.white);
        userNameText.setFont(new Font("Monospaced", Font.BOLD, 10));
        userNameText.setForeground(Color.white);
        passwordText.setFont(new Font("Monospaced", Font.BOLD, 10));
        passwordText.setForeground(Color.white);
        currentUserNameLabel.setFont(new Font("Monospaced", Font.BOLD, 10));
        currentUserNameLabel.setForeground(Color.white);
        currentPasswordLabel.setFont(new Font("Monospaced", Font.BOLD, 10));
        currentPasswordLabel.setForeground(Color.white);
        currentPasswordText.setFont(new Font("Monospaced", Font.BOLD, 16));
        currentPasswordText.setForeground(Color.white);
        currentUserNameText.setFont(new Font("Monospaced", Font.BOLD, 16));
        currentUserNameText.setForeground(Color.white);

        title.setBackground(new Color(150, 55, 120));
        exitPanel.setBackground(new Color(150, 55, 120));
        inputTextPanel.setBackground(new Color(100, 55, 90));
        usernamePanel.setBackground(new Color(100, 55, 90));
        passwordPanel.setBackground(new Color(100, 55, 90));
        generatedCredentialsPanel.setBackground(new Color(100,55,90));
        
        exitButton.setOpaque(false);
        exitButton.setContentAreaFilled(false);
        exitButton.setBorderPainted(false);
        exitButton.setForeground(Color.white);

        userNameRandomButton.setOpaque(false);
        userNameRandomButton.setContentAreaFilled(false);
        userNameRandomButton.setBorderPainted(false);
        userNameRandomButton.setForeground(Color.white);

        passwordRandomButton.setOpaque(false);
        passwordRandomButton.setContentAreaFilled(false);
        passwordRandomButton.setBorderPainted(false);
        passwordRandomButton.setForeground(Color.white);

        ActionListener exitProgram = new ClickListener();
        exitButton.addActionListener(exitProgram);
        exitButton.addActionListener(e -> {
            mainMenu.dispose();
        });
        
        
        userNameRandomButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Username newUser = new Username();
                String newUserName = newUser.generateNewUsername();
                
                currentUserNameText.setText(newUserName);
            }
        });
        
        exitPanel.add(exitButton);
        title.add(welcomeText, BorderLayout.CENTER);
        inputTextPanel.add(inputPromptText);
        
        usernamePanel.add(userNameText);
        usernamePanel.add(userNameInput);
        usernamePanel.add(userNameRandomButton);
        
        passwordPanel.add(passwordText);
        passwordPanel.add(passwordInput);
        passwordPanel.add(passwordRandomButton);
        
        generatedCredentialsPanel.add(currentUserNameLabel);
        generatedCredentialsPanel.add(currentUserNameText);
        generatedCredentialsPanel.add(currentPasswordLabel);
        generatedCredentialsPanel.add(currentPasswordText);

        inputTextPanel.add(usernamePanel);
        inputTextPanel.add(passwordPanel);
        
        mainMenu.add(usernamePanel);
        mainMenu.add(passwordPanel);
        mainMenu.add(inputTextPanel);
        mainMenu.add(title);
        mainMenu.add(generatedCredentialsPanel);
        mainMenu.add(exitPanel);
        mainMenu.setVisible(true);
    }
    class ClickListener implements ActionListener {

       
        public void actionPerformed(ActionEvent e) {
                
            }
        }
    class UserRandomizeListener implements ActionListener {

       
        public void actionPerformed(ActionEvent e) {
                Username newUser = new Username();
                String newUserName = newUser.generateNewUsername();
                currentUserNameText.setName(newUserName);
            }
        }
    class PassRandomizeListener implements ActionListener {

       
        public void actionPerformed(ActionEvent e) {
                Password newPass = new Password();
            }
        }
    }



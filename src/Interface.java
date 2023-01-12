import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Interface {
	public static void main(String[] args) 
    {

        //Définition des Frames
        JFrame main = new JFrame("PolyBet : Now with blackjack and hookers");
        JFrame eleve = new JFrame("PolyBet : Now with blackjack and hookers");
        JFrame dealer = new JFrame("PolyBet : Now with blackjack and hookers");
        
        //Elements du main
        JLabel title = new JLabel("PolyBet", JLabel.CENTER);
        JButton log = new JButton("Connexion");
        JButton exit = new JButton("Quitter");
        title.setFont(new Font("Arial", Font.PLAIN, 120)); //Creating an Arial Font Style with size 30 
        main.add(title);
        JPanel panel = new JPanel();
        log.setFont(new Font("Arial", Font.PLAIN, 50));
        exit.setFont(new Font("Arial", Font.PLAIN, 50));
        panel.setLayout(new GridLayout(2, 1));
        panel.add(log); 
        panel.add(exit);
        log.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                    main.setVisible(false);
                    eleve.setVisible(true);
            }
            });
        exit.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
                main.dispose();
        }
        });
        main.setLayout(new GridLayout(2, 1));
        main.add(title);
        main.add(panel);
        
       //Elements de eleve
        JButton leave = new JButton("↵");
        leave.setFont(new Font("Arial", Font.PLAIN, 50));
        eleve.add(leave);
        
    
        
        
        main.pack();
        eleve.pack();
        dealer.pack();
        main.setSize(2000, 1000);
        eleve.setSize(2000, 1000);
        dealer.setSize(2000, 1000);
        main.setResizable(false);
        eleve.setResizable(false);
        dealer.setResizable(false);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.setVisible(true);
    }
}

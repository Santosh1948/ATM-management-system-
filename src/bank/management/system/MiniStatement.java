package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.lang.foreign.AddressLayout;
import java.sql.ResultSet;

public class MiniStatement extends JFrame {
    MiniStatement(String pinnumber){
        setTitle("Mini Statement");

        setLayout(null);

        JTextArea mini = new JTextArea();
        mini.setEditable(false);
        mini.setFont(new Font("Monospaced", Font.PLAIN, 12));

        JScrollPane scroll = new JScrollPane(mini);
        scroll.setBounds(20, 140, 350, 200);
        add(scroll);


        JLabel bank = new JLabel("Engineer Bank");
        bank.setBounds(150, 20 , 100 , 20);
        add(bank);

        JLabel card = new JLabel();
        card.setBounds(20,80,300,20);
        add(card);

        JLabel balance = new JLabel();
        balance.setBounds(20,400,300,20);
        add(balance);

        try {
            Conn con = new Conn();
            ResultSet rs = con.s.executeQuery("select * from login where pin = '"+pinnumber+"'");
            while (rs.next()){
                card.setText("Card Number: "+rs.getString("cardnumber"));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            Conn con = new Conn();
            ResultSet rs = con.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
            int bal = 0;
            while (rs.next()) {
                mini.append(
                        rs.getString("date") + "    " +
                                rs.getString("type") + "    " +
                                rs.getString("amount") + "\n"
                );

                if (rs.getString("type").equalsIgnoreCase("Deposit")) {
                    bal += Integer.parseInt(rs.getString("amount"));
                } else {
                    bal -= Integer.parseInt(rs.getString("amount"));
                }
            }

            balance.setText("Your Current Account Balance is Rs."+ bal);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        mini.setBounds(20,140,400,200);

        setSize(400,600);
        setLocation(20,20);
        getContentPane().setBackground(Color.white);
        setVisible(true);


    }

    public static void main(String[] args) {
        new MiniStatement("");
    }
}

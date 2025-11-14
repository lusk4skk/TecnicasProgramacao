package swing.view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private 	 JPanel DTP1;
	final static String MENU = "Card with JButtons to Select";
	final static String BANK = "Card with Bank Account Sys";
	final static String ACAD = "Card with Academic Sys";
	final static String BOOK = "Card with Bibliotecary Sys";
	final static String SELL = "Card with Online Shop";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("HACKATHON TP1 2025/2");
		setBounds(100, 100, 800, 600);
		setLocationRelativeTo(null);
		
		// Painel Principal
		DTP1 = new JPanel(new CardLayout());
		setContentPane(DTP1);
		
		// -- Card MENU --
		JPanel menu = new JPanel();
			   menu.setBorder(new EmptyBorder(5, 5, 5, 5));
			   menu.setLayout(null);
		
			JLabel lblTitulo1 = new JLabel("DESAFIO DE TP1");
				   lblTitulo1.setHorizontalAlignment(SwingConstants.CENTER);
				   lblTitulo1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 28));
				   lblTitulo1.setBounds(276, 38, 231, 63);
			menu.add(lblTitulo1);
			
			JLabel lblLegenda1 = new JLabel("Selecione um dos sistemas abaixo para começar!");
				   lblLegenda1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
				   lblLegenda1.setBounds(223, 90, 346, 51);
			menu.add(lblLegenda1);
			
			JButton btnSistemaBanc = new JButton("Sistema Bancário");
					btnSistemaBanc.setActionCommand(BANK);
					btnSistemaBanc.addActionListener(new ChangeCardlayoutListener());
					btnSistemaBanc.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 20));
					btnSistemaBanc.setBounds(303, 160, 198, 28);
			menu.add(btnSistemaBanc);
			
			JButton btnGestAcad = new JButton("Gestão Acadêmica");
					btnGestAcad.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 20));
					btnGestAcad.setBounds(303, 216, 198, 28);
			menu.add(btnGestAcad);
			
			JButton btnSistemaBib = new JButton("Sist. Bibliotecário");
					btnSistemaBib.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 20));
					btnSistemaBib.setBounds(303, 275, 198, 28);
			menu.add(btnSistemaBib);
			
			JButton btnVendasOnline = new JButton("Vendas Online");
					btnVendasOnline.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 20));
					btnVendasOnline.setBounds(303, 335, 198, 28);
			menu.add(btnVendasOnline);
		
		// -- SISTEMA BANCÁRIO -- 	
		JPanel conta_banc = new JPanel();
			   conta_banc.setLayout(null);
			
		
			JButton btnBack = new JButton("Voltar");
					btnBack.setActionCommand(MENU);
			        btnBack.addActionListener(new ChangeCardlayoutListener());
			        btnBack.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 20));
			        btnBack.setBounds(10, 517, 85, 36);
			conta_banc.add(btnBack);
        
		// -- CONSTRUTOR DE CARDS --
		DTP1.add(menu, MENU);
	    DTP1.add(conta_banc, BANK);
	    
		setVisible(true);
    }

    class ChangeCardlayoutListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            CardLayout cl = (CardLayout) (DTP1.getLayout());
            cl.show(DTP1, (String) evt.getActionCommand());
        }
    }
}

package swing.view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import swing.model.sistema_banc.Banco.model.*;

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
					btnGestAcad.setActionCommand(ACAD);
					btnGestAcad.addActionListener(new ChangeCardlayoutListener());
					btnGestAcad.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 20));
					btnGestAcad.setBounds(303, 216, 198, 28);
			menu.add(btnGestAcad);
			
			JButton btnSistemaBib = new JButton("Sist. Bibliotecário");
					btnSistemaBib.setActionCommand(BOOK);
					btnSistemaBib.addActionListener(new ChangeCardlayoutListener());
					btnSistemaBib.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 20));
					btnSistemaBib.setBounds(303, 275, 198, 28);
			menu.add(btnSistemaBib);
			
			JButton btnVendasOnline = new JButton("Vendas Online");
					btnVendasOnline.setActionCommand(SELL);
					btnVendasOnline.addActionListener(new ChangeCardlayoutListener());
					btnVendasOnline.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 20));
					btnVendasOnline.setBounds(303, 335, 198, 28);
			menu.add(btnVendasOnline);
		
		// -- SISTEMA BANCÁRIO -- 	
		JPanel conta_banc = new JPanel();
			   conta_banc.setLayout(null);
		
		Conta ct = new Conta("173007", "Alessandro", 2000);
			   
			   JPanel panelSaldo = new JPanel();
			   panelSaldo.setBackground(new Color(0, 128, 0));
			   panelSaldo.setBounds(10, 10, 766, 85);
			   conta_banc.add(panelSaldo);
			   panelSaldo.setLayout(null);
			    
			   JLabel lblSaldo = new JLabel("R$ " + ct.getSaldo());
			   lblSaldo.setForeground(new Color(255, 255, 255));
			   lblSaldo.setBounds(10, 10, 746, 65);
			   lblSaldo.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 36));
			   panelSaldo.add(lblSaldo);
			   
			   JLabel lblBoasVindas = new JLabel("Bem-vindo(a) de volta, " + ct.getNome());
			   lblBoasVindas.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 20));
			   lblBoasVindas.setBounds(20, 105, 303, 44);
			   conta_banc.add(lblBoasVindas);
			   
		// -- GESTÃO ACADÊMICA -- 	
     	JPanel gest_acad = new JPanel();
			   gest_acad.setLayout(null);
			   
			   
		// -- SISTEMA BIBLIOTECÁRIO -- 	
		JPanel sistema_bib = new JPanel();
			   sistema_bib.setLayout(null);
			   
			   
			   
			   
		// Botão Voltar		        
		JButton btnBack1 = new JButton("Voltar");
				btnBack1.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 20));
				btnBack1.setBounds(10, 517, 85, 36);
		        btnBack1.setActionCommand(MENU);
		        btnBack1.addActionListener(new ChangeCardlayoutListener());
		conta_banc.add(btnBack1);

		JButton btnBack2 = new JButton("Voltar");
				btnBack2.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 20));
				btnBack2.setBounds(10, 517, 85, 36);
		        btnBack2.setActionCommand(MENU);
		        btnBack2.addActionListener(new ChangeCardlayoutListener());
		gest_acad.add(btnBack2);

		JButton btnBack3 = new JButton("Voltar");
				btnBack3.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 20));
				btnBack3.setBounds(10, 517, 85, 36);
		        btnBack3.setActionCommand(MENU);
		        btnBack3.addActionListener(new ChangeCardlayoutListener());
		sistema_bib.add(btnBack3);
		
        
		// -- CONSTRUTOR DE CARDS --
		DTP1.add(menu, MENU);
	    DTP1.add(conta_banc, BANK);
	    
	    JSpinner spinner = new JSpinner();
	    spinner.setBounds(30, 159, 39, 36);
	    conta_banc.add(spinner);
	    
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

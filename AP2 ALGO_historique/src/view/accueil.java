package view;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;

public class accueil {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					accueil window = new accueil();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public accueil() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 710, 470);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton info = new JButton("");
		info.setIcon(new ImageIcon("C:\\Users\\Michel\\eclipse-workspace\\AP2 ALGO\\photo\\vosinfos.png"));
		info.setFont(new Font("Tahoma", Font.PLAIN, 18));
		info.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					vosinfo vca = new vosinfo();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		info.setBounds(394, 271, 210, 49);
		frame.getContentPane().add(info);
		info.setBorderPainted(false);
		info.setOpaque(false);
		
		JButton livre = new JButton("");
		livre.setIcon(new ImageIcon("C:\\Users\\Michel\\eclipse-workspace\\AP2 ALGO\\photo\\catalogue.png"));
		livre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		livre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					listelivre vca = new listelivre();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		livre.setBounds(80, 271, 240, 49);
		frame.getContentPane().add(livre);
		livre.setBorderPainted(false);
		livre.setOpaque(false);
		
		JButton emprunter = new JButton("");
		emprunter.setIcon(new ImageIcon("C:\\Users\\Michel\\eclipse-workspace\\AP2 ALGO\\photo\\emprunter.png"));
		emprunter.setFont(new Font("Tahoma", Font.PLAIN, 18));
		emprunter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					emprunter vca = new emprunter();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		emprunter.setBounds(126, 190, 151, 49);
		frame.getContentPane().add(emprunter);
		emprunter.setOpaque(false);
		emprunter.setBorderPainted(false);
		
		JButton historique = new JButton("Historique de prêts");
		historique.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				historique vca = new historique();
			}
		});
		historique.setBounds(423, 343, 166, 57);
		frame.getContentPane().add(historique);
		
		JButton rendre = new JButton("");
		rendre.setIcon(new ImageIcon("C:\\Users\\Michel\\eclipse-workspace\\AP2 ALGO\\photo\\retour.png"));
		rendre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rendre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					rendre vca = new rendre();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		rendre.setBounds(435, 190, 112, 49);
		frame.getContentPane().add(rendre);
		rendre.setBorderPainted(false);
		rendre.setOpaque(false);
		
		JButton btnBibliothcaire = new JButton("");
		btnBibliothcaire.setIcon(new ImageIcon("C:\\Users\\Michel\\eclipse-workspace\\AP2 ALGO\\photo\\bibliothecaire.png"));
		btnBibliothcaire.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnBibliothcaire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					loginbibliothecaire vca = new loginbibliothecaire();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnBibliothcaire.setBounds(501, 11, 183, 49);
		frame.getContentPane().add(btnBibliothcaire);
		
		
		JLabel defile = new JLabel("Bienvenue à la bibliothèque");
		defile.setForeground(Color.WHITE);
		defile.setFont(new Font("Tahoma", Font.PLAIN, 18));
		defile.setBounds(0, 84, 224, 28);
		frame.getContentPane().add(defile);
		
		//System.out.println(frame.getBounds().getMaxX());
		
		Rectangle longueur = defile.getBounds();
			defile.setBounds(0, 84, 224, 28);
			Timer timer = new Timer();
			TimerTask task = new TimerTask() {
				@Override
				public void run() {
					if(defile.getBounds().x==0||defile.getBounds().x!=frame.getBounds().getMaxX()) {
						int x = defile.getBounds().x;
						x+=10;
						defile.setBounds(x, 84, 224, 28);
						// System.out.println(x);
					}
					else {
						defile.setBounds(-200, 84, 224, 28);
					}
				};
				
			};
			timer.schedule(task, 100,100);
		
		
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon("C:\\Users\\Michel\\eclipse-workspace\\AP2 ALGO\\photo\\Bibliothèque.jpg"));
		background.setBounds(0, -33, 692, 463);
		frame.getContentPane().add(background);
		
		
		
	}
}

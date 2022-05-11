package view;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import common.UniversalHelper;
import javax.swing.ImageIcon;

public class GlavniMeni extends JFrame {
	
	static UniversalHelper Helper = new UniversalHelper();
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GlavniMeni frame = new GlavniMeni();
					frame.setVisible(true);
					GlavniMeni Center = (GlavniMeni) Helper.CenterWindow(frame);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GlavniMeni() {
		setTitle("Vasin Fast Food");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 653, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnHrana = new JButton("Udjite u meni");
		btnHrana.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnHrana.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				HranaMeni hranameni = new HranaMeni();
				hranameni.setVisible(true);
				HranaMeni Center = (HranaMeni) Helper.CenterWindow(hranameni);
			}
		});
		btnHrana.setBounds(233, 408, 172, 34);
		contentPane.add(btnHrana);
		
		JLabel lblNewLabel = new JLabel("Dobrodosli u VASIN FAST FOOD!");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel.setBounds(0, 45, 637, 51);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(GlavniMeni.class.getResource("/resources/Logo260.png")));
		lblNewLabel_1.setBounds(158, 115, 324, 260);
		contentPane.add(lblNewLabel_1);
		
		JLabel jLabelObject = new JLabel();
	}
}

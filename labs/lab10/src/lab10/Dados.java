package lab10;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Dados extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dados frame = new Dados();
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
	public Dados() {
		setTitle("Cadasto de Contas\r\n\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 410, 356);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPreencherDados = new JButton("Preencher dados");
		btnPreencherDados.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnPreencherDados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cadastro cad = new Cadastro(null);
				cad.setVisible(true);
				setVisible(false);
			}
		});
		btnPreencherDados.setBounds(95, 67, 187, 63);
		contentPane.add(btnPreencherDados);
		
		JButton btnVisualizarDados = new JButton("Visualizar dados");
		btnVisualizarDados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VisualizaDados v = new VisualizaDados();
				v.setVisible(true);
				setVisible(false);
			}
		});
		btnVisualizarDados.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnVisualizarDados.setBounds(95, 188, 187, 63);
		contentPane.add(btnVisualizarDados);
	}
}

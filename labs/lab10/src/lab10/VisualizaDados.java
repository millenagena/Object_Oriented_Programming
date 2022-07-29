package lab10;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class VisualizaDados extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VisualizaDados frame = new VisualizaDados();
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
	public VisualizaDados() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 372);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Selecione o CPF:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 52, 168, 30);
		contentPane.add(lblNewLabel);
		
		GerenciadorArquivos g = new GerenciadorArquivos();
		ArrayList<Cliente> clientes = new ArrayList<>(g.leArquivoTxt("dados.txt"));
		String[] CPFs = new String[clientes.size()];
		Integer i = 0;
		for(Cliente c: clientes) {
			CPFs[i] = c.getCpf();
			i++;
		}
		
		JComboBox comboCPF = new JComboBox();
		comboCPF.setModel(new DefaultComboBoxModel(CPFs));
		comboCPF.setSelectedIndex(0);
		comboCPF.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboCPF.setBounds(10, 104, 223, 30);
		contentPane.add(comboCPF);
		
		JButton btnProsseguir = new JButton("Prosseguir\r\n");
		btnProsseguir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Integer cpfSelecionado = comboCPF.getSelectedIndex();
				String cpf = (String) comboCPF.getItemAt(cpfSelecionado);
				
				for(Cliente c: clientes) {
					if(cpf.equals(c.getCpf())) {
						Cadastro cad = new Cadastro();
						cad.setVisible(true);
						// parei aqui
						
					}
				}
			}
		});
		btnProsseguir.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnProsseguir.setBounds(279, 280, 147, 45);
		contentPane.add(btnProsseguir);
	}
}

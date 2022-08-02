package lab10;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Cadastro extends JFrame {

	private JPanel contentPane;
	private JTextField nome;
	private JTextField cpf;
	private JTextField dataNascimento;
	private JTextField senha;
	private JTextField numeroConta;
	private JTextField email;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro frame = new Cadastro(null);
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
	public Cadastro(Cliente c) {
		
		setTitle("Cadastro de Contas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 758);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 10, 56, 45);
		contentPane.add(lblNewLabel);
		
		nome = new JTextField();
		nome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		nome.setBounds(10, 53, 368, 34);
		contentPane.add(nome);
		nome.setColumns(10);
		
		cpf = new JTextField();
		cpf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cpf.setColumns(10);
		cpf.setBounds(10, 140, 368, 34);
		contentPane.add(cpf);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCpf.setBounds(10, 97, 56, 45);
		contentPane.add(lblCpf);
		
		dataNascimento = new JTextField();
		dataNascimento.setFont(new Font("Tahoma", Font.PLAIN, 14));
		dataNascimento.setColumns(10);
		dataNascimento.setBounds(10, 229, 368, 34);
		contentPane.add(dataNascimento);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento");
		lblDataDeNascimento.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDataDeNascimento.setBounds(10, 186, 152, 45);
		contentPane.add(lblDataDeNascimento);
		
		senha = new JTextField();
		senha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		senha.setColumns(10);
		senha.setBounds(10, 504, 368, 34);
		contentPane.add(senha);
		
		JLabel lblSenha = new JLabel("Senha\r\n");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSenha.setBounds(10, 461, 56, 45);
		contentPane.add(lblSenha);
		
		numeroConta = new JTextField();
		numeroConta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		numeroConta.setColumns(10);
		numeroConta.setBounds(10, 417, 368, 34);
		contentPane.add(numeroConta);
		
		JLabel lblNmeroDaConta = new JLabel("N\u00FAmero da conta\r\n");
		lblNmeroDaConta.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNmeroDaConta.setBounds(10, 374, 122, 45);
		contentPane.add(lblNmeroDaConta);
		
		JComboBox comboSexo = new JComboBox();
		comboSexo.setModel(new DefaultComboBoxModel(new String[] {"Feminino", "Masculino"}));
		comboSexo.setSelectedIndex(0);
		comboSexo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboSexo.setBounds(10, 315, 140, 34);
		contentPane.add(comboSexo);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSexo.setBounds(10, 273, 56, 45);
		contentPane.add(lblSexo);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEmail.setBounds(10, 548, 56, 45);
		contentPane.add(lblEmail);
		
		email = new JTextField();
		email.setFont(new Font("Tahoma", Font.PLAIN, 14));
		email.setColumns(10);
		email.setBounds(10, 591, 368, 34);
		contentPane.add(email);
		
		JCheckBox checkNoticias = new JCheckBox("Desejo receber not\u00EDcias");
		checkNoticias.setFont(new Font("Tahoma", Font.PLAIN, 14));
		checkNoticias.setBounds(10, 651, 171, 21);
		contentPane.add(checkNoticias);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Integer sexo = comboSexo.getSelectedIndex();
				Cliente c = new Cliente(nome.getText(), cpf.getText(),
									    email.getText(), dataNascimento.getText(),
									    (String) comboSexo.getItemAt(sexo), 
									    Integer.parseInt(numeroConta.getText()),
									    checkNoticias.isSelected());
			
				GerenciadorArquivos g = new GerenciadorArquivos();
				ArrayList<Cliente> clientes = new ArrayList<>(g.leArquivoTxt("dados.txt"));
				clientes.add(c);
				g.escreveArquivoTxt(clientes, "dados.txt");
				
				// fechando a janela e abrindo a anterior novamente
				setVisible(false);
				Dados d = new Dados();
				d.setVisible(true);
			}
		});
		btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSalvar.setBounds(316, 677, 95, 34);
		contentPane.add(btnSalvar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Dados d = new Dados();
				d.setVisible(true);
			}
		});
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCancelar.setBounds(421, 677, 115, 34);
		contentPane.add(btnCancelar);
		
		if(c != null) {
			nome.setText(c.getNome());
			cpf.setText(c.getCpf());
			email.setText(c.getEmail());
			dataNascimento.setText(c.getDataNascimento());
			if(c.getSexo().equals("Feminino")) {
				comboSexo.setSelectedIndex(0);
			}else {
				comboSexo.setSelectedIndex(1);
			}
			numeroConta.setText(Integer.toString(c.getNumeroConta()));
			checkNoticias.setSelected(c.getNoticias());
		}
	}
}

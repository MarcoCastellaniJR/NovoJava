import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class TelaCadastroGeral {

	private JFrame frmTelaprincipal;
	private JTextField textPesquisa;
	private JTextField txtPrimeiroNome;
	private JTextField txtSegundoNome;
	private JTextField txtCPF;
	private JTextField txtRua;
	private JTextField txtBairro;
	private JTextField textField;
	private JTextField txtRenda;
	private JTextField txtTelefone;
	private JTextField txtPesquisa;
	private JTextField txtIdPesquisa;
	private JTextField txtNomeAtt;
	private JTextField txtSobrenomeAtt;
	private JTextField txtCPFAtt;
	private JTextField txtBairroAtt;
	private JTextField txtRendaAtt;
	private JTextField txtRuaAtt;
	private JTextField txtNumeroAtt;
	private JTextField txtTelefoneAtt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroGeral window = new TelaCadastroGeral();
					window.frmTelaprincipal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaCadastroGeral() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTelaprincipal = new JFrame();
		frmTelaprincipal.setTitle("TelaPrincipal");
		frmTelaprincipal.setBounds(100, 100, 750, 400);
		frmTelaprincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTelaprincipal.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 34, 716, 319);
		frmTelaprincipal.getContentPane().add(tabbedPane);
		
		JPanel AbaVisualizar = new JPanel();
		tabbedPane.addTab("Visualizar", null, AbaVisualizar, null);
		AbaVisualizar.setLayout(null);
		
		JButton btnResumoGeral = new JButton("Resumo Geral");
		btnResumoGeral.setBounds(10, 10, 120, 21);
		AbaVisualizar.add(btnResumoGeral);
		
		JButton btnPesquisaNome = new JButton("ByNome");
		btnPesquisaNome.setBounds(140, 10, 120, 21);
		AbaVisualizar.add(btnPesquisaNome);
		
		textPesquisa = new JTextField();
		textPesquisa.setBounds(10, 41, 691, 241);
		AbaVisualizar.add(textPesquisa);
		textPesquisa.setColumns(10);
		
		txtPesquisa = new JTextField();
		txtPesquisa.setBounds(530, 11, 171, 19);
		AbaVisualizar.add(txtPesquisa);
		txtPesquisa.setColumns(10);
		
		JButton btnPesquisaCPF = new JButton("ByCPF");
		btnPesquisaCPF.setBounds(270, 10, 120, 21);
		AbaVisualizar.add(btnPesquisaCPF);
		
		JButton btnLimpa = new JButton("Limpa Pesquisa");
		btnLimpa.setBounds(400, 10, 120, 21);
		AbaVisualizar.add(btnLimpa);
		
		JPanel AbaCadastro = new JPanel();
		tabbedPane.addTab("Cadastro", null, AbaCadastro, null);
		AbaCadastro.setLayout(null);
		
		JLabel lblNome = new JLabel("Primeiro Nome");
		lblNome.setBounds(10, 10, 100, 13);
		AbaCadastro.add(lblNome);
		
		txtPrimeiroNome = new JTextField();
		txtPrimeiroNome.setBounds(120, 7, 222, 19);
		AbaCadastro.add(txtPrimeiroNome);
		txtPrimeiroNome.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Segundo Nome");
		lblNewLabel.setBounds(10, 40, 100, 13);
		AbaCadastro.add(lblNewLabel);
		
		txtSegundoNome = new JTextField();
		txtSegundoNome.setBounds(120, 37, 222, 19);
		AbaCadastro.add(txtSegundoNome);
		txtSegundoNome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("CPF");
		lblNewLabel_1.setBounds(10, 70, 100, 13);
		AbaCadastro.add(lblNewLabel_1);
		
		txtCPF = new JTextField();
		txtCPF.setBounds(120, 67, 222, 19);
		AbaCadastro.add(txtCPF);
		txtCPF.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Rua");
		lblNewLabel_2.setBounds(10, 100, 45, 13);
		AbaCadastro.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Bairro");
		lblNewLabel_3.setBounds(10, 130, 45, 13);
		AbaCadastro.add(lblNewLabel_3);
		
		txtRua = new JTextField();
		txtRua.setBounds(120, 97, 222, 19);
		AbaCadastro.add(txtRua);
		txtRua.setColumns(10);
		
		txtBairro = new JTextField();
		txtBairro.setBounds(120, 127, 222, 19);
		AbaCadastro.add(txtBairro);
		txtBairro.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Numero");
		lblNewLabel_4.setBounds(10, 160, 45, 13);
		AbaCadastro.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(120, 157, 45, 19);
		AbaCadastro.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Sexo");
		lblNewLabel_5.setBounds(10, 190, 45, 13);
		AbaCadastro.add(lblNewLabel_5);
		
		JRadioButton rbtnMasculino = new JRadioButton("Masculino");
		rbtnMasculino.setBounds(120, 187, 103, 21);
		AbaCadastro.add(rbtnMasculino);
		
		JRadioButton rbtnFeminino = new JRadioButton("Feminino");
		rbtnFeminino.setBounds(239, 187, 103, 21);
		AbaCadastro.add(rbtnFeminino);
		
		JLabel lblNewLabel_6 = new JLabel("Renda");
		lblNewLabel_6.setBounds(10, 220, 100, 13);
		AbaCadastro.add(lblNewLabel_6);
		
		txtRenda = new JTextField();
		txtRenda.setBounds(120, 217, 222, 19);
		AbaCadastro.add(txtRenda);
		txtRenda.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Telefone");
		lblNewLabel_7.setBounds(10, 250, 45, 13);
		AbaCadastro.add(lblNewLabel_7);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(120, 247, 222, 19);
		AbaCadastro.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		JButton btnCadastro = new JButton("CADASTRO");
		btnCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ConnectionFactory conne = new ConnectionFactory();
				String stm = "INSERT INTO dbcadastrogeral ";
				conne.insertDB(null);//criar conexão, mandar o statement e fechar conexão
				conne.desconectDB();
				
				
				/*InsertDB insert = new InsertDB();
				try {
					insert.insertDB();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
				
				ConnectionFactory conecta = new ConnectionFactory();
				conecta.conectaDB();
			}
		});
		btnCadastro.setBounds(476, 244, 117, 25);
		AbaCadastro.add(btnCadastro);
		
		JPanel AbaAlteracao = new JPanel();
		tabbedPane.addTab("Alteração", null, AbaAlteracao, null);
		AbaAlteracao.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("Encontrar ID");
		lblNewLabel_9.setBounds(10, 10, 67, 13);
		AbaAlteracao.add(lblNewLabel_9);
		
		txtIdPesquisa = new JTextField();
		txtIdPesquisa.setBounds(87, 7, 96, 19);
		AbaAlteracao.add(txtIdPesquisa);
		txtIdPesquisa.setColumns(10);
		
		JButton btnPesquisa = new JButton("Pesquisa");
		btnPesquisa.setBounds(193, 6, 85, 21);
		AbaAlteracao.add(btnPesquisa);
		
		JButton btnAtualizaCadastro = new JButton("Atualizar Cadastro");
		btnAtualizaCadastro.setBounds(10, 261, 150, 21);
		AbaAlteracao.add(btnAtualizaCadastro);
		
		JLabel lblNewLabel_10 = new JLabel("Nome");
		lblNewLabel_10.setBounds(10, 40, 45, 13);
		AbaAlteracao.add(lblNewLabel_10);
		
		txtNomeAtt = new JTextField();
		txtNomeAtt.setBounds(87, 40, 200, 19);
		AbaAlteracao.add(txtNomeAtt);
		txtNomeAtt.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Sobrenome");
		lblNewLabel_11.setBounds(300, 40, 55, 13);
		AbaAlteracao.add(lblNewLabel_11);
		
		txtSobrenomeAtt = new JTextField();
		txtSobrenomeAtt.setBounds(370, 37, 200, 19);
		AbaAlteracao.add(txtSobrenomeAtt);
		txtSobrenomeAtt.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("CPF");
		lblNewLabel_12.setBounds(10, 70, 45, 13);
		AbaAlteracao.add(lblNewLabel_12);
		
		txtCPFAtt = new JTextField();
		txtCPFAtt.setBounds(87, 67, 200, 19);
		AbaAlteracao.add(txtCPFAtt);
		txtCPFAtt.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Rua");
		lblNewLabel_13.setBounds(300, 70, 45, 13);
		AbaAlteracao.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Bairro");
		lblNewLabel_14.setBounds(10, 100, 45, 13);
		AbaAlteracao.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Numero");
		lblNewLabel_15.setBounds(300, 100, 45, 13);
		AbaAlteracao.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("Renda");
		lblNewLabel_16.setBounds(10, 130, 45, 13);
		AbaAlteracao.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Telefone");
		lblNewLabel_17.setBounds(300, 130, 45, 13);
		AbaAlteracao.add(lblNewLabel_17);
		
		txtBairroAtt = new JTextField();
		txtBairroAtt.setBounds(87, 97, 200, 19);
		AbaAlteracao.add(txtBairroAtt);
		txtBairroAtt.setColumns(10);
		
		txtRendaAtt = new JTextField();
		txtRendaAtt.setBounds(87, 127, 200, 19);
		AbaAlteracao.add(txtRendaAtt);
		txtRendaAtt.setColumns(10);
		
		txtRuaAtt = new JTextField();
		txtRuaAtt.setBounds(370, 67, 200, 19);
		AbaAlteracao.add(txtRuaAtt);
		txtRuaAtt.setColumns(10);
		
		txtNumeroAtt = new JTextField();
		txtNumeroAtt.setBounds(370, 97, 200, 19);
		AbaAlteracao.add(txtNumeroAtt);
		txtNumeroAtt.setColumns(10);
		
		txtTelefoneAtt = new JTextField();
		txtTelefoneAtt.setBounds(370, 127, 200, 19);
		AbaAlteracao.add(txtTelefoneAtt);
		txtTelefoneAtt.setColumns(10);
		
		JButton btnDeletaCadastro = new JButton("Deleta Cadastro");
		btnDeletaCadastro.setBounds(170, 261, 150, 21);
		AbaAlteracao.add(btnDeletaCadastro);
		
		JLabel lblNewLabel_8 = new JLabel("TELA FEITA PARA CADASTRO GERAL E PESQUISAS DENTRO DO BANCO DE DADOS");
		lblNewLabel_8.setBounds(10, 10, 716, 13);
		frmTelaprincipal.getContentPane().add(lblNewLabel_8);
	}
}

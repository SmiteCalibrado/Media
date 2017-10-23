package calcular;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;

public class janela extends JFrame {
	

	private JPanel contentPane;
	private final JTextField lblNota1 = new JTextField();
	private JTextField lblNota2;
	private JTextField lblNota3;
	private JTextField lblNota4;
	int resulSoma;
	int resultado;
	private JLabel lblResultado;
	private int nota2;
	private int nota1;
	private int nota3;
	private int nota4;	
	
	
	private int soma(int a,int b,int c,int d) {
		int soma = a + b + c + d;
		return soma;
	}
	private int calculo(int e,int f) {
		int calculo = e/f;
		return calculo ;
		}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					janela frame = new janela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void clique() {
		variaveis();
		resulSoma = soma(nota1,nota2,nota3,nota4);
		resultado = calculo(resulSoma,4);
		atualizarCampo();
	
	}
	public void atualizarCampo() {
		lblResultado.setText(resultado+"");
	}
	
	public void variaveis() {
		nota1 = Integer.parseInt(lblNota1.getText());
		nota2 = Integer.parseInt(lblNota2.getText());
		nota3 = Integer.parseInt(lblNota3.getText());
		nota4 = Integer.parseInt(lblNota4.getText());
	}
	

	/**
	 * Create the frame.
	 */
	public janela() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 622, 254);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblNota1.setBounds(12, 24, 89, 36);
		contentPane.add(lblNota1);
		lblNota1.setColumns(10);
		
		lblResultado = new JLabel("");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setBounds(449, 26, 113, 32);
		contentPane.add(lblResultado);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(500, 113, 98, 93);
		btnCalcular.addActionListener(a -> clique());
		contentPane.add(btnCalcular);
		
		lblNota2 = new JTextField();
		lblNota2.setColumns(10);
		lblNota2.setBounds(113, 24, 89, 36);
		contentPane.add(lblNota2);
		
		lblNota3 = new JTextField();
		lblNota3.setColumns(10);
		lblNota3.setBounds(214, 24, 89, 36);
		contentPane.add(lblNota3);
		
		lblNota4 = new JTextField();
		lblNota4.setColumns(10);
		lblNota4.setBounds(315, 24, 89, 36);
		contentPane.add(lblNota4);
		
		JLabel lblNewLabel = new JLabel("=");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(416, 34, 56, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nota 1");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(22, 73, 79, 32);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNota_2 = new JLabel("Nota 2");
		lblNota_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNota_2.setBounds(123, 73, 79, 32);
		contentPane.add(lblNota_2);
		
		JLabel lblNota_1 = new JLabel("Nota 3");
		lblNota_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNota_1.setBounds(214, 73, 79, 32);
		contentPane.add(lblNota_1);
		
		JLabel lblNota = new JLabel("Nota 4");
		lblNota.setHorizontalAlignment(SwingConstants.CENTER);
		lblNota.setBounds(315, 73, 79, 32);
		contentPane.add(lblNota);
	}
}

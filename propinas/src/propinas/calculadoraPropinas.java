package propinas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculadoraPropinas {

	private JFrame frame;
	private JTextField facturaimporte;
	private JLabel lblSeleccionaUnMonto;
	private JTextField propinaresultado;
	private JTextField totalresultado;
	private ButtonGroup propinas = new ButtonGroup();
	private JRadioButton boton10;
	private JRadioButton boton15;
	private JRadioButton boton20;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadoraPropinas window = new calculadoraPropinas();
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
	public calculadoraPropinas() {
		initialize();
		propinas.add(boton10);
		propinas.add(boton15);
		propinas.add(boton20);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 435);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Importe de la factura:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel.setBounds(23, 33, 148, 26);
		frame.getContentPane().add(lblNewLabel);
		
		facturaimporte = new JTextField();
		facturaimporte.setHorizontalAlignment(SwingConstants.LEFT);
		facturaimporte.setBounds(23, 70, 202, 40);
		frame.getContentPane().add(facturaimporte);
		facturaimporte.setColumns(10);
		
		lblSeleccionaUnMonto = new JLabel("Selecciona un monto de propina:");
		lblSeleccionaUnMonto.setHorizontalAlignment(SwingConstants.LEFT);
		lblSeleccionaUnMonto.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblSeleccionaUnMonto.setBounds(23, 121, 268, 26);
		frame.getContentPane().add(lblSeleccionaUnMonto);
		
		boton10 = new JRadioButton("10%");
		boton10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double factura = Double.parseDouble(facturaimporte.getText());
			    double propina = factura * 0.10;
			    double total = factura + propina;
			    propinaresultado.setText(String.format("%.2f", propina)+ "€");
			    totalresultado.setText(String.format("%.2f", total)+ "€");
			}
		});
		boton10.setBounds(23, 154, 58, 23);
		frame.getContentPane().add(boton10);
		
		boton15 = new JRadioButton("15%");
		boton15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double factura = Double.parseDouble(facturaimporte.getText());
			    double propina = factura * 0.15;
			    double total = factura + propina;
			    propinaresultado.setText(String.format("%.2f", propina)+ "€");
			    totalresultado.setText(String.format("%.2f", total)+ "€");
			}
		});
		boton15.setBounds(23, 180, 58, 23);
		frame.getContentPane().add(boton15);
		
		boton20 = new JRadioButton("20%");
		boton20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double factura = Double.parseDouble(facturaimporte.getText());
			    double propina = factura * 0.20;
			    double total = factura + propina;
			    propinaresultado.setText(String.format("%.2f", propina)+ "€");
			    totalresultado.setText(String.format("%.2f", total)+ "€");
			}
		});
		boton20.setBounds(23, 206, 58, 23);
		frame.getContentPane().add(boton20);
		
		JLabel lblMontoDePropina = new JLabel("Monto de propina:");
		lblMontoDePropina.setHorizontalAlignment(SwingConstants.LEFT);
		lblMontoDePropina.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblMontoDePropina.setBounds(23, 236, 122, 26);
		frame.getContentPane().add(lblMontoDePropina);
		
		JLabel lblTotalAPagar = new JLabel("Total a pagar:");
		lblTotalAPagar.setHorizontalAlignment(SwingConstants.LEFT);
		lblTotalAPagar.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblTotalAPagar.setBounds(23, 273, 99, 26);
		frame.getContentPane().add(lblTotalAPagar);
		
		JButton reiniciar = new JButton("Reiniciar");
		reiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				facturaimporte.setText("");
			    propinaresultado.setText("");
			    totalresultado.setText("");
			    propinas.clearSelection();
			}
		});
		reiniciar.setBounds(20, 310, 102, 40);
		frame.getContentPane().add(reiniciar);
		
		propinaresultado = new JTextField();
		propinaresultado.setHorizontalAlignment(SwingConstants.LEFT);
		propinaresultado.setColumns(10);
		propinaresultado.setBounds(155, 237, 202, 26);
		frame.getContentPane().add(propinaresultado);
		
		totalresultado = new JTextField();
		totalresultado.setHorizontalAlignment(SwingConstants.LEFT);
		totalresultado.setColumns(10);
		totalresultado.setBounds(155, 273, 202, 26);
		frame.getContentPane().add(totalresultado);
	}
}

package ejercicio06;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Radio {

	private JFrame frmColoresRadio;
	private JRadioButton radAmarillo;
	private JRadioButton radAzul;
	private JRadioButton radRojo;
	private JRadioButton radNegro;
	private JLabel lblColor;
	ButtonGroup grupo=new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Radio window = new Radio();
					window.frmColoresRadio.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Radio() {
		initialize();
		grupo.add(radAmarillo);
		grupo.add(radAzul);
		grupo.add(radRojo);
		grupo.add(radNegro);
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void cambiarColor() {
		if(radAmarillo.isSelected())lblColor.setBackground(Color.yellow);
		if(radAzul.isSelected())lblColor.setBackground(Color.blue);
		if(radRojo.isSelected())lblColor.setBackground(Color.red);
		if(radNegro.isSelected())lblColor.setBackground(Color.black);
	}
	private void initialize() {
		frmColoresRadio = new JFrame();
		frmColoresRadio.setTitle("Colores radio");
		frmColoresRadio.setBounds(100, 100, 353, 300);
		frmColoresRadio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmColoresRadio.getContentPane().setLayout(null);
		
		radAmarillo = new JRadioButton("Amarillo");
		radAmarillo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiarColor();
			}
		});
		radAmarillo.setBounds(25, 38, 83, 23);
		frmColoresRadio.getContentPane().add(radAmarillo);
		
		radAzul = new JRadioButton("Azul");
		radAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiarColor();
			}
		});
		radAzul.setBounds(25, 82, 72, 23);
		frmColoresRadio.getContentPane().add(radAzul);
		
		radRojo = new JRadioButton("Rojo");
		radRojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiarColor();
			}
		});
		radRojo.setBounds(25, 125, 72, 23);
		frmColoresRadio.getContentPane().add(radRojo);
		
		radNegro = new JRadioButton("Negro");
		radNegro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiarColor();
			}
		});
		radNegro.setBounds(25, 168, 83, 23);
		frmColoresRadio.getContentPane().add(radNegro);
		
		lblColor = new JLabel("");
		lblColor.setOpaque(true);
		lblColor.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblColor.setBounds(118, 38, 187, 153);
		frmColoresRadio.getContentPane().add(lblColor);
	}
}

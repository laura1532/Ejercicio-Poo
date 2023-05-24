package ejercicio07;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JSlider;
import java.awt.Font;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class ejer {

	private JFrame frame;
	private JSlider sldValorA;
	private JSlider sldValorB;
	private JSlider sldValorC;
	private JLabel lblValorA;
	private JLabel lblValorB;
	private JLabel lblValorC;
	int a=0, b=0, c=0;
	double x1=0, x2=0;
	private JLabel lblEcuacion;
	private JLabel lblResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejer window = new ejer();
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
	
	public ejer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void calcular() {
		try {
		lblEcuacion.setText(a+"x^2+"+b+"x+"+c+"=0");
		int valor=(b*b)-(4*a*c);
		if(valor>0) {
			x1=(-b+Math.sqrt(valor))/(2*a);
			x1=(-b-Math.sqrt(valor))/(2*a);
			lblResultado.setText("x1="+x1+" x2=" +x2);
			
		}
		else if(valor==0) {
			x1=(-b)/(2*a);
			lblResultado.setText("x1="+x1);
				
		}
		
		else if(valor<0) {
			lblResultado.setText("No hay solucion");
				
		}
		}
		catch(Exception ex) {
			
		}
		
	}
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 396, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Valor de A");
		lblNewLabel.setBounds(54, 26, 89, 25);
		frame.getContentPane().add(lblNewLabel);
		
		lblValorA = new JLabel("0");
		lblValorA.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblValorA.setBounds(263, 45, 20, 25);
		frame.getContentPane().add(lblValorA);
		
		lblValorB = new JLabel("0");
		lblValorB.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblValorB.setBounds(264, 109, 30, 25);
		frame.getContentPane().add(lblValorB);
		
		lblValorC = new JLabel("0");
		lblValorC.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblValorC.setBounds(263, 174, 20, 25);
		frame.getContentPane().add(lblValorC);
		
		lblEcuacion = new JLabel("");
		lblEcuacion.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblEcuacion.setBounds(195, 222, 146, 25);
		frame.getContentPane().add(lblEcuacion);
		
		lblResultado = new JLabel("");
		lblResultado.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblResultado.setBounds(106, 261, 235, 25);
		frame.getContentPane().add(lblResultado);
		
		sldValorA = new JSlider();
		sldValorA.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				a=sldValorA.getValue();
				lblValorA.setText(""+a);
				calcular();
			}
		});
		sldValorA.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		sldValorA.setValue(0);
		sldValorA.setMinimum(-50);
		sldValorA.setBounds(54, 45, 200, 26);
		frame.getContentPane().add(sldValorA);
		
		
		
		JLabel lblValorDeB = new JLabel("Valor de B");
		lblValorDeB.setBounds(54, 90, 89, 25);
		frame.getContentPane().add(lblValorDeB);
		
		sldValorB = new JSlider();
		sldValorB.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				b=sldValorA.getValue();
				lblValorA.setText(""+b);
				calcular();
			}
		});
		sldValorB.setValue(0);
		sldValorB.setMinimum(-50);
		sldValorB.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		sldValorB.setBounds(54, 109, 200, 26);
		frame.getContentPane().add(sldValorB);
		
		
		
		JLabel lblValorDeC = new JLabel("Valor de C");
		lblValorDeC.setBounds(54, 155, 89, 25);
		frame.getContentPane().add(lblValorDeC);
		
		sldValorC = new JSlider();
		sldValorC.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				c=sldValorA.getValue();
				lblValorA.setText(""+c);
				calcular();
			}
		});
		sldValorC.setValue(0);
		sldValorC.setMinimum(-50);
		sldValorC.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		sldValorC.setBounds(54, 174, 200, 26);
		frame.getContentPane().add(sldValorC);
		
		
		
		
		
		
	}
}

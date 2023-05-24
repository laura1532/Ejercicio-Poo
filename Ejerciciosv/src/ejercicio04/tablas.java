package ejercicio04;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tablas {

	private JFrame frmTablasDeMultiplicar;
	private JTextArea txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tablas window = new tablas();
					window.frmTablasDeMultiplicar.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tablas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTablasDeMultiplicar = new JFrame();
		frmTablasDeMultiplicar.setIconImage(Toolkit.getDefaultToolkit().getImage(tablas.class.getResource("/ejercicios/c2be0b5fa21290af79e1607bbc1327da-multiplicar-doodle-de-matematicas.png")));
		frmTablasDeMultiplicar.setTitle("Tablas de multiplicar");
		frmTablasDeMultiplicar.setBounds(100, 100, 231, 339);
		frmTablasDeMultiplicar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTablasDeMultiplicar.getContentPane().setLayout(null);
		
		JSpinner spnNumero = new JSpinner();
		spnNumero.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int numero=Integer.parseInt(spnNumero.getValue().toString());
				String TABLA="";
				for(int i=1;i<=10;i++) {
					TABLA+=numero+"x"+i+"="+(numero*i)+"\n";
				}
				txtResultado.setText(TABLA);
			}
		});
		spnNumero.setBounds(20, 43, 72, 23);
		frmTablasDeMultiplicar.getContentPane().add(spnNumero);
		
		JButton btnBorrar = new JButton("borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				spnNumero.setValue(1);
				txtResultado.setText("");
			}
		});
		btnBorrar.setBounds(121, 43, 72, 23);
		frmTablasDeMultiplicar.getContentPane().add(btnBorrar);
		
		txtResultado = new JTextArea();
		txtResultado.setBounds(20, 77, 173, 174);
		frmTablasDeMultiplicar.getContentPane().add(txtResultado);
	}
}

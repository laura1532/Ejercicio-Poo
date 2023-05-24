package ejercicio05;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class M {

	private JFrame frmUsuario;
	private JLabel lblNewLabel;
	private JLabel lblcumple;
	private JCheckBox chkUniforme;
	private JCheckBox chkCarnet;
	private JCheckBox chkIdentificacion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					M window = new M();
					window.frmUsuario.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public M() {
		initialize();
		revisarUsuario();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void revisarUsuario() {
		String check="";
		if(chkUniforme.isSelected()) {
			check+=" °Uniforme";
		}else {
			check+=" No uniforme";
		}
		
		if(chkCarnet.isSelected()) {
			check+=" °Carnet";
		}else {
			check+=" No carnet";
		}
		
		if(chkIdentificacion.isSelected()) {
			check+=" °Identificacion";
		}else {
			check+=" No identificacion";
		}
	lblNewLabel.setText(check);
	if(chkUniforme.isSelected()&&chkCarnet.isSelected()&&chkIdentificacion.isSelected()) {
		lblcumple.setText("Cumple con todos los requisitos");
	}else {
		lblcumple.setText("No cumple con todos los requisitos");
	}
}
	private void initialize() {
		frmUsuario = new JFrame();
		frmUsuario.setTitle("Usuario");
		frmUsuario.setBounds(100, 100, 323, 218);
		frmUsuario.setLocationRelativeTo(null);
		frmUsuario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUsuario.getContentPane().setLayout(null);
		
		
		chkUniforme = new JCheckBox("Uniforme");
		chkUniforme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		chkUniforme.setBounds(32, 32, 97, 23);
		frmUsuario.getContentPane().add(chkUniforme);
		
		chkCarnet = new JCheckBox("Carnet");
		chkCarnet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				revisarUsuario();			}
		});
		chkCarnet.setBounds(32, 58, 97, 23);
		frmUsuario.getContentPane().add(chkCarnet);
		
		chkIdentificacion = new JCheckBox("Identificacion");
		chkIdentificacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		chkIdentificacion.setBounds(32, 84, 97, 23);
		frmUsuario.getContentPane().add(chkIdentificacion);
		
		lblNewLabel = new JLabel(" ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel.setBounds(135, 32, 143, 75);
		frmUsuario.getContentPane().add(lblNewLabel);
		
		lblcumple = new JLabel(" ");
		lblcumple.setHorizontalAlignment(SwingConstants.CENTER);
		lblcumple.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblcumple.setBounds(32, 114, 246, 30);
		frmUsuario.getContentPane().add(lblcumple);
	}
}

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class GUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textnombre;
	private JTextField textclasi;
	private JTextField textaño;
	private peliculas arrpelis[] = new peliculas[4];
	private JButton btnNewButton;
 int i=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 722, 288);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textnombre = new JTextField();
		textnombre.setBounds(182, 25, 86, 20);
		contentPane.add(textnombre);
		textnombre.setColumns(10);
		
		textclasi = new JTextField();
		textclasi.setBounds(182, 69, 86, 20);
		contentPane.add(textclasi);
		textclasi.setColumns(10);
		
		textaño = new JTextField();
		textaño.setBounds(182, 121, 86, 20);
		contentPane.add(textaño);
		textaño.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("NOMBRE");
		lblNewLabel.setBounds(114, 27, 89, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CLASIFICACIÓN");
		lblNewLabel_1.setBounds(84, 71, 132, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("AÑO");
		lblNewLabel_2.setBounds(140, 123, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		btnNewButton = new JButton("objeto");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre =textnombre.getText();
				String clasi =textclasi.getText();
				String año =textaño.getText();
				peliculas peliculasNUEVO = new peliculas(nombre, clasi, año);
				if(i<4) {
					arrpelis[i]=peliculasNUEVO;
					i++;
					
					textnombre.setText("");
					textclasi.setText("");
					textaño.setText("");
				}
			}
		});
		btnNewButton.setBounds(97, 179, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnImprimir = new JButton("Mostrar");
		btnImprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mostrar = JOptionPane.showInputDialog("¿De que pelicula quieres que te muestre la informacion?");
				for(int i=0; i<arrpelis.length; i++) {
					if(arrpelis[i]!=null) {
						if(arrpelis[i].getNombre().equals(mostrar)) {
							
						}
					}
				}
			}
		});
		btnImprimir.setBounds(229, 180, 85, 21);
		contentPane.add(btnImprimir);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(373, 23, 276, 134);
		contentPane.add(textArea);
		
		JButton btnEscribir = new JButton("escribir");
		btnEscribir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					BufferedWriter out = new BufferedWriter(new FileWriter("documento equipo pris cesar david montse poo"));
					String cadena = textArea.getText();
					for(int i=0; i< cadena.length(); i++) {
					   out.write(cadena.charAt(i));
					}
					out.newLine();//cambio de línea en el archivo
					out.write(cadena); // escribimos toda la línea
					out.close();
					} catch (IOException exepcion) {
					// TODO Auto-generated catch block
					System.out.println(exepcion.getMessage());
					exepcion.printStackTrace();
					}
				}
		});
		btnEscribir.setBounds(388, 179, 89, 23);
		contentPane.add(btnEscribir);
	}
}

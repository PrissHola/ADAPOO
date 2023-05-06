import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI extends JFrame {

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textnombre = new JTextField();
		textnombre.setBounds(140, 24, 86, 20);
		contentPane.add(textnombre);
		textnombre.setColumns(10);
		
		textclasi = new JTextField();
		textclasi.setBounds(140, 68, 86, 20);
		contentPane.add(textclasi);
		textclasi.setColumns(10);
		
		textaño = new JTextField();
		textaño.setBounds(140, 120, 86, 20);
		contentPane.add(textaño);
		textaño.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("NOMBRE");
		lblNewLabel.setBounds(50, 27, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CLASIFICACIÓN");
		lblNewLabel_1.setBounds(23, 71, 107, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("AÑO");
		lblNewLabel_2.setBounds(50, 123, 46, 14);
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
				}
			}
		});
		btnNewButton.setBounds(10, 179, 89, 23);
		contentPane.add(btnNewButton);
	}
}

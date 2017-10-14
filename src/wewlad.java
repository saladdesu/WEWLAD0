import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class wewlad extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_Cel;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					wewlad frame = new wewlad();
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
	
	public wewlad() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel_csladnev = new JLabel("Csal\u00E1di n\u00E9v");
		GridBagConstraints gbc_lblNewLabel_csladnev = new GridBagConstraints();
		gbc_lblNewLabel_csladnev.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_csladnev.gridx = 0;
		gbc_lblNewLabel_csladnev.gridy = 0;
		contentPane.add(lblNewLabel_csladnev, gbc_lblNewLabel_csladnev);
		
		JLabel lblNewLabel_1 = new JLabel("Keresztn\u00E9v");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 0;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 1;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 1;
		contentPane.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Egyetem");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 2;
		contentPane.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JRadioButton button_informatika = new JRadioButton("Informatika");
		buttonGroup.add(button_informatika);
		GridBagConstraints gbc_button_informatika = new GridBagConstraints();
		gbc_button_informatika.insets = new Insets(0, 0, 5, 0);
		gbc_button_informatika.gridx = 1;
		gbc_button_informatika.gridy = 3;
		contentPane.add(button_informatika, gbc_button_informatika);
		
		
		JLabel lblNewLabel_3 = new JLabel("Szak:");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 4;
		contentPane.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JRadioButton button_nemtom = new JRadioButton("Nemtom");
		buttonGroup.add(button_nemtom);
		GridBagConstraints gbc_button_nemtom = new GridBagConstraints();
		gbc_button_nemtom.insets = new Insets(0, 0, 5, 0);
		gbc_button_nemtom.gridx = 1;
		gbc_button_nemtom.gridy = 4;
		contentPane.add(button_nemtom, gbc_button_nemtom);
		
		JRadioButton button_bufe = new JRadioButton("B\u00FCf\u00E9 \u00E9s ruhat\u00E1r");
		buttonGroup.add(button_bufe);
		GridBagConstraints gbc_button_bufe = new GridBagConstraints();
		gbc_button_bufe.insets = new Insets(0, 0, 5, 0);
		gbc_button_bufe.gridx = 1;
		gbc_button_bufe.gridy = 5;
		contentPane.add(button_bufe, gbc_button_bufe);
		
		textField_Cel = new JTextField();
		GridBagConstraints gbc_textField_Cel = new GridBagConstraints();
		gbc_textField_Cel.insets = new Insets(0, 0, 5, 0);
		gbc_textField_Cel.gridwidth = 2;
		gbc_textField_Cel.fill = GridBagConstraints.BOTH;
		gbc_textField_Cel.gridx = 0;
		gbc_textField_Cel.gridy = 6;
		contentPane.add(textField_Cel, gbc_textField_Cel);
		textField_Cel.setColumns(10);
		
		JButton btnNewButton_Ok = new JButton("Ok");
		GridBagConstraints gbc_btnNewButton_Ok = new GridBagConstraints();
		gbc_btnNewButton_Ok.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_Ok.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_Ok.gridx = 0;
		gbc_btnNewButton_Ok.gridy = 7;
		contentPane.add(btnNewButton_Ok, gbc_btnNewButton_Ok);
		
		JButton btnNewButton_Torol = new JButton("Torol");
		GridBagConstraints gbc_btnNewButton_Torol = new GridBagConstraints();
		gbc_btnNewButton_Torol.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_Torol.gridx = 1;
		gbc_btnNewButton_Torol.gridy = 7;
		contentPane.add(btnNewButton_Torol, gbc_btnNewButton_Torol);
		
		///postásgeci
		
	}

}

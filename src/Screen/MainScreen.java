package Screen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextPane;

import character.PlayerCharacter;
import javax.swing.JPanel;

public class MainScreen {

	private JFrame frame;
	private final JPanel mainSreen = new JPanel();
	private final JPanel randomCharacterScreen = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen window = new MainScreen();
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
	public MainScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		PlayerCharacter pc1 = new PlayerCharacter("teste", 10, 2);
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		mainSreen.setBounds(0, 0, 684, 411);
		frame.getContentPane().add(mainSreen);
		mainSreen.setLayout(null);

		JButton btnCustomCharacterButton = new JButton("Personagem Customizado");
		btnCustomCharacterButton.setBounds(460, 263, 185, 35);
		mainSreen.add(btnCustomCharacterButton);

		JButton btnRandomCharacterButton = new JButton("Personagem Aleatório");
		btnRandomCharacterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainSreen.setVisible(false);
				randomCharacterScreen.setVisible(true);
			}
		});
		btnRandomCharacterButton.setBounds(460, 342, 185, 35);
		mainSreen.add(btnRandomCharacterButton);
		
		randomCharacterScreen.setBounds(0, 0, 684, 411);
		frame.getContentPane().add(randomCharacterScreen);
		randomCharacterScreen.setLayout(null);

		JButton btnBackMainScreenButton = new JButton("Voltar a tela inicial");
		btnBackMainScreenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainSreen.setVisible(true);
				randomCharacterScreen.setVisible(false);
			}
		});
		btnBackMainScreenButton.setBounds(460, 263, 185, 35);
		randomCharacterScreen.add(btnBackMainScreenButton);

		JButton btnGenerateRandomCharacterButton = new JButton("Gerar Personagem");
		btnGenerateRandomCharacterButton.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				JTextPane displayInfo = new JTextPane();
				displayInfo.setBounds(38, 87, 146, 96);
				randomCharacterScreen.add(displayInfo);
				displayInfo.setText(pc1.getCharacterName() + "\n" + pc1.getProficienyBonus());
			}
		});
		btnGenerateRandomCharacterButton.setBounds(460, 342, 185, 35);
		randomCharacterScreen.add(btnGenerateRandomCharacterButton);

	}
}

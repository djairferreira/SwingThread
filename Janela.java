package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Janela extends JFrame{
	private static final long serialVersionUID = 1L;
	private JButton botao = new JButton("Botão teste!");
	private JPanel north = new JPanel();
	
	public Janela() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.add(north, BorderLayout.NORTH);
		north.setBackground(new Color(96, 118, 254));
		
		north.setLayout(new FlowLayout(FlowLayout.LEFT));
		north.add(botao);
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Teste");
				
			}
		});
	}

}

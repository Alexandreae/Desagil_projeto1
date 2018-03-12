package br.pro.hashi.ensino.desagil.tequilada;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
	private Model model;
	private View view;
	
	public Controller(Model model,View view) {
		this.model = model;
		this.view = view;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		model.update();
		view.repaint();
		
		
	}

}

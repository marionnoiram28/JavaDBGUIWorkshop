package com.marion.entities;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;
/**
 * 
 * @author 28010-34-12
 *
 */
public class WindEventManagement implements WindowListener {
	/**
	 * 
	 */
	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		int ConfirmExit = JOptionPane.showConfirmDialog(null, "Souhaitez vous quitter l'application?", "Quitter?", JOptionPane.YES_NO_OPTION);
		if ( ConfirmExit == JOptionPane.OK_OPTION) {
		System.exit(0);
		}
		else {
			
		}
	 }

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}

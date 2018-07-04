package com.marion.entities;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import com.marion.HCI.SignInDataBaseChoice;
import com.marion.HCI.TableSelection;
import com.marion.SQLConnector.QueryMachine;
/**
 * 
 * @author 28010-34-12
 *
 */

public class MouseAndActionManagement implements ActionListener, MouseListener{

//Attributs

	
public MouseAndActionManagement() {
	super();
	
}


//_______________________________________________SignInDataBaseChoice_________________________________________________________
	/**
	 * Méthode choisir une base de données
	 * liée a la méthode de choix BDD(class Query Machine)
	 * @throws SQLException 
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void chooseBDD_click() throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException, IOException {
		System.out.println("chooseBD click");
		QueryMachine db= new QueryMachine();
		//méthode ouvertur dans constructeur donc doit lancer la BD juste comme cela si le nom et login et password sont ok
		//lance les tables dans la combo
		//btnconfirm bouton a associer
		//creation arrayList
//		ArrayList<String> récupDB= new ArrayList<String>();
		//arrayList recupère les tables
//		récupDB = db.getTablesList();
		//lancer table selection
		
		TableSelection selectT= new TableSelection();
		selectT.setVisible(true);
		//mettre ds combo la recupDB
		
	}
	
	
	/**
	 * 
	 */
//______________________________________________Table selection_____________________________________________________________________
	/*
	 * 
	 */
	//méthode selection table
	//méthode back return signInDataBdChoice
	
//_______________________________________________Action Bouton FRAME Lance-requête(GUI)_____________________________________________________
	/**
	 * Méthode envoyer vers créer un nouvel employé
	 * si click create envoi vers Formulaire2Creation
	 */
	public void create_Click() {
		//FormulCreation formcrea= new FormulCreation(); recuperation fenetre formulaire 
		//formcrea.setVisible() affichage fenetre formulaire
;		
	}
	/**
	 * Méthode modifier un employé
	 *  si click update envoie vers Formumaire2Modification et recuperation des infos employé ds jtext field
	 * remplace nouvel info ds bdd après confirmDialog
	 */
	public void update_click() {
		
	}
	/**
	 * Méthode quitter via bouton prendre la méthode window en param si marche copier meme methode
	 * Quitte l'application
	 * @throws SQLException 
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void leave_click() throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException, IOException {
		QueryMachine db= new QueryMachine();
		int ConfirmExit = JOptionPane.showConfirmDialog(null, "Souhaitez vous quitter l'application?", "Quitter?", JOptionPane.YES_NO_OPTION);
		if ( ConfirmExit == JOptionPane.OK_OPTION) {
		db.closeDBConnexion();
		System.exit(0);
		}
	}
	/**
	 * 
	 */
//_______________________________________________________Action Bouton FRAME Formulaire2Creation___________________________________________
	/**
	 * Méthode d'enregistrement de la création du nouvel employé dans la BDD.
	 * création nouvel employé ds BDD après confirmDialog
	 */
	public void okCreation_click() {
		
	}
	/**
	 * Méthode annuler la création du nouvel employé
	 * retourne à la frame lance-requête après confirmDialog
	 * posssibilité de creer methode genéral pour tout bouton annuler? 
	 */
	public void cancelCreation() {
		//retourne a la frame GUI Lance requête
	}
	/**
	 * 
	 */
//_______________________________________________________Action Bouton FRAME Formulaire2Modification__________________________________________
	/**
	 * Méthode de modification sur l'employé selectionné
	 * on récupère la méthode pour changer les information employé dans BDD
	 */
	public void updateValidate() {
		
	}
	/**
	 * méthode annuler cf en faire une seule pour toute les FRAME
	 */
	//public void cancelCreation() {}
	
	
//_____________________________________________________________________________________________________________________________________
	
	
	//evt de souris à voir si utile 
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
	
	try {
		JButton btn = new JButton();
		SignInDataBaseChoice fram1 = new SignInDataBaseChoice();
		
		Object source = evt.getSource();
		if (source == fram1.getBtnConfirm()) this.chooseBDD_click();
		System.out.println("try actionperformed");
		
	} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
		
	}

	
	
	
	
	
	
	
	
	
	
	
}

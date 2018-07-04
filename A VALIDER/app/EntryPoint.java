package com.marion.app;

import java.io.IOException;
import java.sql.SQLException;

import com.marion.HCI.SignInDataBaseChoice;
import com.marion.HCI.TableName;
import com.marion.HCI.TableSelection;
import com.marion.HCI.UpDateScreen;
import com.marion.SQLConnector.QueryMachine;
/**
 * 
 * @author 28010-34-12
 *
 */
//EO import
public class EntryPoint {
	public static void main(String[] args) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException, IOException {
		// pas sur quil faut le gerer ici QueryMachine qm = new QueryMachine(); // instanciate this class so you can connect your data base to your Java IDE
//		qm.setSql(/*"SQL query"*/); // write your SQL order here, if it's a search query you'll use my readOneColumn() or readAllColumns methods, if it's a table modification you'll use updateBase()
//		qm.updateBase();
//		qm.readOneColumn("columnName");
//		qm.readAllColumns();
		//pas sur quil faut le gerer ici qm.closeDBConnexion();
		
		SignInDataBaseChoice frame1 = new SignInDataBaseChoice();
//		TableSelection frame2 = new TableSelection();
//		TableName frame3 = new TableName();
//		UpDateScreen frame4 = new UpDateScreen();
//		
	}//EO main
}//EO EntryPoint
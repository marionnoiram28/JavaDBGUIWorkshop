package com.marion.SQLConnector;

/************************************************************************************************************************************************************************************/
//SO import
import java.io.*;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
import com.mysql.cj.jdbc.*;
import com.mysql.cj.jdbc.DatabaseMetaData;
import screens.ScreensFrame;
//EO import
/************************************************************************************************************************************************************************************/
public class QueryMachine{
/************************************************************************************************************************************************************************************/
	//SO class variables
	private Connection connect = null;
	private Statement state;
	private JOptionPane dbchoose = null;
	private JOptionPane loginChoose = null;
	private JOptionPane pwdChoose = null;
	private String input0 = loginChoose.showInputDialog("please type login");
	private String input1 = pwdChoose.showInputDialog("please enter password");
	final static File f = new File("selectedDB.txt"); // instanciation of File class that will store history of access to database
	private java.sql.DatabaseMetaData dmd;
	private String str;
	private ArrayList<String> tablesList = new ArrayList<String>();
	private ResultSet rsTables = null; // it was necessary to initialize this ResultSet variable

	private String selectedTable; /* this variable will be matched with the string coming from the comboBox item listener in screen 2, when the user selects a table; it will be used to display
	the contents of the table in screen 3*/
	private String sql = "SELECT * FROM " + selectedTable + ";"; //SQL query that will be used in readAllColumns method used in screen 3 (display selected table)

	//EO class variables
/************************************************************************************************************************************************************************************/
	/* SO setters of login input >>>
	* in the section below, we aim to attribute the variables input0 and input1 to the input the user will type in a showInputDialog message; these variables will be then used to make
	the connection to the database, it the informations are false it will return an SQL exception */
	private void setInput0(String input0) {
		this.input0 = input0;
	}
	private void setInput1(String input1) {
		this.input1 = input1;
	}
	//EO setters section
	/************************************************************************************************************************************************************************************/
	/*SO constructor section
	* when we instantiate the QueryPlusEngine class, it will automatically set an sql connection coded in constructor's class */
	public QueryMachine() throws  InstantiationException, IllegalAccessException, ClassNotFoundException, IOException {
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance(); // loading the driver
		/* SO if/else selectedDB.txt file exists
		in the block below, the app' will act differently depending on first launch by the user or not; this is aimed to improve UX since the user doesnt have to select the database he works with
		every time he uses the app */
		if(!f.exists()) { //case of first launch of the app
			f.createNewFile();
			// writers below will print in the txt file the name of the database selected by the user
			FileWriter fw = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);
			//the two setters below refer to login and password
			setInput0(input0);
			setInput1(input1);
			//this string below refer to the input of database by the user
			String input = dbchoose.showInputDialog("choose your data base");
			//SO try/catch that throws a custom SQLException in case of failure
			/* below, we connect our program to the database using jdbc MySQL connector; we fille the url with the input of the user; if there is something wrong with the data input by the user,
			it will generate an exception informing him that the acces to databse has been denied*/
			try {
				connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+ input +"?serverTimezone=UTC", input0, input1);
				//SO getting database metadata
				try {
					dmd = connect.getMetaData();
				} catch (SQLException sqle) {
					JOptionPane jop4 = new JOptionPane();
					jop4.showMessageDialog(null, "unable to load database metadata");
				}//EO try/catch
				//EO of getting databse metadata
				str=input.toString();
			} catch (SQLException sqle0) {
				JOptionPane jop = new JOptionPane();
				jop.showMessageDialog(null, "acces to database denied");
			}
			//EO SQLException try/catch
			bw.write(input.toString()); //coding writing what db was chosen in txt
			//SO closing ressources
			bw.close();
			fw.close();
			//EO closing ressources
		}else { // case of past launched app
			//SO setting up readers of selectedDB.txt file that will read what db was chosen in previous launch of app(when this file didnt exist)
			FileInputStream fis = new FileInputStream(f);
			DataInputStream dis = new DataInputStream(fis);
			BufferedReader br = new BufferedReader(new InputStreamReader(dis));
			str=br.readLine();
			//EO setting up readers
			//the two setters below refer to login and password
			setInput0(input0);
			setInput1(input1);
			//SO try/catch
			/* below, we connect our program to the database using jdbc MySQL connector; we fille the url with the input of the user; if there is something wrong with the data input by the user,
			it will generate an exception informing him that the acces to databse has been denied*/
			try {
				connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+str+"?serverTimezone=UTC", input0, input1);
				//SO getting database metadata
				try {
					dmd = connect.getMetaData();
				} catch (SQLException sqle1) {
					JOptionPane jop4 = new JOptionPane();
					jop4.showMessageDialog(null, "unable to load database metadata");
				}//EO try/catch
				//EO of getting databse metadata
			} catch (SQLException sqle2) {
				JOptionPane jop0 = new JOptionPane();
				jop0.showMessageDialog(null, "acces to database denied");
			}
			//EO try/catch
			//SO closing reading ressources
			br.close();
			dis.close();
			fis.close();
			//EO closing reading ressources
		}
		//EO if/else selectedDB.txt file exists
		//SO readying the Statement object that will initiate SQL queries
		try {
			this.state=connect.createStatement();
		} catch (SQLException sqle3) {
			JOptionPane jop1 = new JOptionPane();
			jop1.showMessageDialog(null, "error : impossible to operate queries");
		}
		//EO readying Statement object
	}//EO constructor
	/**
	 * @return **********************************************************************************************************************************************************************************/
	//the block below is about getting the table name that is selected by, we use DatabaseMetaData class for that purpose

	/*SO get list of all tables in database method, using metadata obtained in constructor; we also want to store every table name into a collection or array object so we can use later in
	 * screen 2 tables selection comboBox when we'll code our GUI*/
	public ArrayList<String> getTablesList(){    /*MAJ MARION*/
		ResultSet rsTables = null; // it was necessary to initialize this ResultSet variable
		try {
			rsTables = dmd.getTables(str, null, null, null); // getting tables metadata
		} catch (SQLException e) {
			JOptionPane jop8 = new JOptionPane();
			jop8.showMessageDialog(null, "unable to get tables data");
		}
		try {
			while(rsTables.next()) {
				String tableName = rsTables.getString("TABLE_NAME"); // we here tell the iterator to get the name of every table with the SQL commande "TABLE_NAME"
				tablesList.add(tableName);
			}//end while
		}catch(SQLException sqle4){
			JOptionPane jop6 = new JOptionPane();
			jop6.showMessageDialog(null, "unable to name database tables");
		}
		finally {
			try {
				rsTables.close(); // closing ressource
			} catch (SQLException sqle7) {
				JOptionPane jop7 = new JOptionPane();
				jop7.showMessageDialog(null, "unable to close result set iterator");
			}//EO try/catch
		}//end try/catch/finally
		return tablesList;   /*MAJ MARION*/
	}
	//EO getTablesList() method

  //SO select a table
 

/************************************************************************************************************************************************************************************/		
//the section below is about reading methods that display the content of a table in screen 3

	//SO readAllColumns() method that prints the results in the console
	public void readAllColumns() throws SQLException {
		//selectedTable = string issued from cbx listener
		ResultSet overall = state.executeQuery(sql);
		ResultSetMetaData rsmd = (ResultSetMetaData) overall.getMetaData();
		int numCol = rsmd.getColumnCount();
		int j=1;
		while(overall.next()) {
			System.out.println("row " + j + ">>>>>>>>>>>>>>>");
			for(int i=1; i < numCol; i++) {
					String resStr = overall. getString(i);
					System.out.println(rsmd.getColumnLabel(i).toString() + " == " + resStr);
			}//EO for loop
			j++;
			System.out.println("***************************************");
		}//EO while
	}//EO readAllColumns method

/************************************************************************************************************************************************************************************/
	//the whole section below is about setting up the methods that will allow the user to make update queries

		/*SO SCREEN 3 ROW ID METHOD, the goal here is to set the variable/method aimed at selecting the row the user will update in screen 4
		EO SCREEN 3 ROW ID METHOD*/

		/*
		SO updating rows methods, first we need to get the column names input by the user, then the values; once we saved this information, we can integrate
		it into pre formatted SQL syntax methods with string concatenation
		*/

		// SO method that will get the column names input by the user
		private void getColumnNames(){
				// finishes with Statement object that executes the command >>> state.executeUpdate("");
		}
		//EO getColumnNames method

		// SO method that will record values input by the user
		private void getValuesInput(){
			// finishes with Statement object that executes the command >>> state.executeUpdate("");
		}
		//EO getValuesInput method
		//SO insert into method/class to create rows, one limitation: we can only insert string values in rows
		public void insertIntoStringValues(String tableName, String columnName, String value){
			try{
				state.execute("INSERT INTO " + tableName + "(" + columnName + ")" + "VALUES('" + value + "')" + ";");
				System.out.println("row added");
			} catch (SQLException sqle5) {
				JOptionPane jop2 = new JOptionPane();
				jop2.showMessageDialog(null, "invalid add of row");
			}//EO try/catch
		}//EO  update() method
		//EO insert into method/class
		//SO update method/class based on row id
		public void update(String tableName, String columnName, String value, int id){
			int update;
			try{
				update = state.executeUpdate( "UPDATE " + tableName + " SET "+ columnName + "=''" + value + "' WHERE id='" + id + "' ;");
				System.out.println("number of modified rows: "+ update);
			} catch (SQLException sqle6) {
				JOptionPane jop3 = new JOptionPane();
				jop3.showMessageDialog(null, "invalid update of row");
			}//EO try/catch
		}//EO  update() method
		//EO update method/class
		//EO updating rows methods/classes
		/************************************************************************************************************************************************************************************/

			// method below is aimed at closing db connexion
			public void closeDBConnexion() throws SQLException {
				connect.close();
				System.out.println("connection to database closed");
			}

		//EO closeDBConnexion() method
		/************************************************************************************************************************************************************************************/
		}//EO QueryMachine class
		
			
			
			
			
			
	
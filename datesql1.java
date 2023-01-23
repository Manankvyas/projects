package advancejava;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class datesql1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		Scanner scan = null;
		PreparedStatement pst = null;
		
		String address =null;
		int rollno = 0;
		String name = null;
		java.sql.Date sqldob = null;
		String dob = null;
		try {
			String url = "jdbc:mysql:///practice1";
			//username and password would vary from user to user
			String userName = "root";
			String passWord = "Manank@24";
			con = DriverManager.getConnection(url,userName,passWord);
			System.out.println("connection established succesfully...");
			
			String sqlinsertquery = "insert into child(name,rollno,dob,address) values (?,?,?,?)";
			if(con !=  null)
				pst = con.prepareStatement(sqlinsertquery);
			
			if(pst != null) {
			 scan = new Scanner(System.in);
			
			if (scan != null) {
				System.out.print("Enter the name :: ");
				 name = scan.next();
				
				System.out.print("Enter the rollno :: ");
				 rollno = scan.nextInt();
				

				System.out.print("Enter the dob(MM-dd-yyyy) :: ");
				dob = scan.next();

				System.out.print("Enter the address ");
				 address  = scan.next();
			}
			
			if (dob != null) {
				SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
				java.util.Date uDate = sdf.parse(dob);

				long value = uDate.getTime();
				sqldob = new java.sql.Date(value);
			}
			
			pst.setString(1, name);
			pst.setInt(2, rollno);
			pst.setDate(3, sqldob);
			pst.setString(4, address);
			
			int rowAffected = pst.executeUpdate();
			System.out.println("No of rows inserted inserted is :: " + rowAffected);

		}
	}catch (SQLException e) {
		e.printStackTrace();
	} catch (ParseException e) {
		e.printStackTrace();
	} catch (Exception e) {
		e.printStackTrace();
	} 

		
		scan.close();
	
	}

}

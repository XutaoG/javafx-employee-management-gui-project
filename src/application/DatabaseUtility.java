package application;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseUtility
{
	public static Connection connectToDatabase()
	{
		Connection connection = null;
		
		try
		{
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Sql050204!");
			return connection;
		}
		catch (Exception e)
		{
			System.out.println("Connection error in " + DatabaseUtility.class.getName());
			e.printStackTrace();
		}
		return connection;
	}
}

package com.studyJava;
import java.sql.*;
import java.util.*;
public class jdbc1 
{

	public static void main(String[] args) throws SQLException 
	{
		Connection con=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/susan","root","root");
			System.out.println("Connected");
			PreparedStatement ps=con.prepareStatement("update table1 set rollno=? where studentname='Tilaka' ");
			ps.setInt(1, 5);
			/*ps.setString(2, "Tilaka");
			ps.setFloat(3, 9.01f);
			ps.setFloat(4, 99);
			ps.setInt(5, 40);
			ps.setInt(6, 15000);*/
			ps.executeUpdate();
			ps.close();
			/*ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt("rollno"));
				System.out.println(rs.getString("studentname"));
				System.out.println(rs.getFloat("percentage"));
				System.out.println(rs.getInt("deptno"));
				System.out.println(rs.getInt("stipend"));
			}*/
		}
		catch(ClassNotFoundException se)
		{
			System.out.println(se);
		}
		finally
		{
			con.setAutoCommit(false);
		}
	}

}

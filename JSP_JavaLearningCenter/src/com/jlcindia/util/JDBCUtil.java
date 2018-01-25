package com.jlcindia.util;

import java.sql.*;
public class JDBCUtil {
 static{
     try{
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
     }
     catch(ClassNotFoundException ex)
     {
         System.out.println(ex);
     }
 }   
 
 public static Connection getMySQLConnection() throws SQLException
 {
     String url="jdbc:sqlserver://localhost:1433";
     Connection con = DriverManager.getConnection(url,"JLCLogin","Feb@2016");
     return con;
 }
 
 public static void cleanup(Statement st, Connection con)
 {
     try{
         if(st!=null)
             st.close();
         if(con!=null)
             con.close();
     }
     catch(Exception e)
     {
         System.out.println(e);
     }
 }
 
 public static void cleanup(ResultSet rs, Statement st, Connection con)
 {
     try{
         if (rs!=null)
                 rs.close();
         if(st!=null)
             st.close();
         if(con!=null)
             con.close();
     }
     catch(Exception e)
     {
         System.out.println(e);
     }
 }
}

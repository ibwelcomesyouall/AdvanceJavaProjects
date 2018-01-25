package com.jlcindia.jdbc;

import java.sql.*;
import com.jlcindia.to.UserTO;
import com.jlcindia.util.JDBCUtil;
public class UserService {
    public int verifyUser(String un, String pw)
    {
        int x=0;
        Connection con=null;
        PreparedStatement ps = null;
        ResultSet rs=null;
        try{
            con=JDBCUtil.getMySQLConnection();
            String sql="select * from jlcusers where username=? and password =?";
            ps=con.prepareStatement(sql);
            ps.setString(1,un);
            ps.setString(2,pw);
            rs=ps.executeQuery();
            if(rs.next())
            {
                x=1;
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            JDBCUtil.cleanup(rs, ps, con);
        }
        return x;
    }
    
    public int registerUser(UserTO uto)
    {
        int x=0;
        Connection con= null;
        PreparedStatement ps = null;
        try{
            con=JDBCUtil.getMySQLConnection();
            String sql="insert into jlcusers values(?,?,?,?,?,?)";
            ps=con.prepareStatement(sql);
            ps.setInt(1,uto.getUserId());
            ps.setString(2,uto.getFname());
            ps.setString(3,uto.getEmail());
            ps.setLong(4,uto.getPhone());
            ps.setString(5,uto.getUsername());
            ps.setString(6,uto.getPassword());
            
            x=ps.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            JDBCUtil.cleanup(ps,con);
        }
        return x;
    }
    public String getPasswordByEmail(String em)
    {
        String pw=null;
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        try{
            con=JDBCUtil.getMySQLConnection();
            String sql ="select password from jlcusers where email=?";
            ps =con.prepareStatement(sql);
            ps.setString(1, em);
            rs=ps.executeQuery();
            if(rs.next())
            {
                pw=rs.getString(1);
            }
        } catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            JDBCUtil.cleanup(rs,ps,con);
        }
        return pw;
    }
    
    public int getNextUserId()
    {
        int x=0;
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        try{
            con=JDBCUtil.getMySQLConnection();
            String sql="select max(userid) from jlcusers";
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            if(rs.next())
            {
                x=rs.getInt(1);
                x=x+1;
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            JDBCUtil.cleanup(rs, ps, con);
        }
        return x;
    }
}

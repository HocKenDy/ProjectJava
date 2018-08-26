package model.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;




/**
 * DbConnection.java
 * 
 * Version 1.0
 * 
 * 28-07-2018
 * 
 * Copyright: HocNT3
 * Modification
 * 
 * DATE         AUTHOR      DESCRIPTIONS
 * --------------------------------- 
 * 28-07-2018   HocNT3     Create
 */
public class DbConnection {
    public static Logger lg = Logger.getLogger("DbConnection"); 
    public Connection sqlConn = null;
    public PreparedStatement psmt = null;
    public CallableStatement callSmt = null;
    public ResultSet rs = null;
    
    /**
     * Method: get Connection 
     * @return
     * @throws ClassNotFoundException 
     * @throws SQLException 
     */
    public Connection getConnect() throws ClassNotFoundException, SQLException {

        // --------------------------------------
        String nameDatabase = "MockProject2";
        String userDatabase = "sa";
        String passDatabase = "Nguyenthaihoc@1973";

        // --------------------------------------
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            sqlConn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=" + nameDatabase + "",
                    "" + userDatabase + "", "" + passDatabase + "");

        } catch (ClassNotFoundException e) {
            // Call Log4j for logging
            StackTraceElement stackTraceElement[] = e.getStackTrace();
            for (int i = 0; i < stackTraceElement.length; i++) {
                lg.warn(stackTraceElement[i].getClassName());
                lg.warn(stackTraceElement[i].getFileName());
                lg.warn(stackTraceElement[i].getLineNumber());
                lg.warn(stackTraceElement[i].getMethodName());
            }
            throw new ClassNotFoundException();
        }catch (SQLException ex) {
            // Call Log4j for logging
            StackTraceElement stackTraceElement[] = ex.getStackTrace();
            for (int i = 0; i < stackTraceElement.length; i++) {
                lg.warn(stackTraceElement[i].getClassName());
                lg.warn(stackTraceElement[i].getFileName());
                lg.warn(stackTraceElement[i].getLineNumber());
                lg.warn(stackTraceElement[i].getMethodName());
            }
            throw new SQLException();
		} 
     
        return sqlConn;
    }
    
}
package junit.test;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

import model.dao.DbConnection;

/**
 * DbConnectionTest.java
 * 
 * Version 1.0
 * 
 * 10-08-2018
 * 
 * Copyright: HocNT3
 * Modification
 * 
 * DATE			AUTHOR 		DESCRIPTIONS
 * --------------------------------- 
 * 10-08-2018   HCD-Fresher107		Create
 */
public class DbConnectionTest {
    DbConnection instance = new DbConnection();
  
    
    /**
     * method test connect DB success
     */
    @Test
    public void getConnectionTest() {
        Connection connection;
        try {
            connection = instance.getConnect();
            assertEquals(connection != null, true);
        } catch (ClassNotFoundException | SQLException e) {
        }
      
    }
}

package model.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.log4j.Logger;


/**
 * AutrepcmDAO.java
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
 * 28-07-2018   HocNT3      Create
 */
public class AutrepcmDAO {
 // Init Logger
    public static Logger lg = Logger.getLogger("AutrepcmDAO"); 
    //Init dbCon variable connect DB
    private DbConnection dbCon;

    public AutrepcmDAO() {
        dbCon = new DbConnection();
    }
    
    /**
     * method insert Utrepcm into database
     * @param rEpcm_Num
     * @param rEpcm_Name
     * @param rEpcm_Jobid
     * @param rEpcm_Pgm
     * @param rEpcm_Type
     * @param rEpcm_Pgtyp
     * @param rEpcm_Pgstl
     * @param rEpcm_Prntp
     * @return
     * @throws SQLException 
     * @throws ClassNotFoundException 
     */
    public int insertAutrepcm(String rEpcm_Num, String rEpcm_Name, String rEpcm_Jobid, String rEpcm_Pgm,
            String rEpcm_Type, String rEpcm_Pgtyp, String rEpcm_Pgstl, String rEpcm_Prntp) throws ClassNotFoundException, SQLException {
        int results =-1;
        // SQL query insert
        String sql = "INSERT INTO AUTREPCM VALUES (?,?,?,?,?,?,?,?,?,?)";
        try {
            dbCon.psmt = dbCon.getConnect().prepareStatement(sql);
            dbCon.psmt.setString(1, rEpcm_Num);
            dbCon.psmt.setString(2, rEpcm_Name);
            dbCon.psmt.setString(3, rEpcm_Jobid);
            dbCon.psmt.setString(4, rEpcm_Pgm);
            dbCon.psmt.setString(5, rEpcm_Type);
            dbCon.psmt.setString(6, rEpcm_Pgtyp);
            dbCon.psmt.setString(7, rEpcm_Pgstl);
            dbCon.psmt.setString(8, rEpcm_Prntp);
            dbCon.psmt.setString(9, "");
            dbCon.psmt.setString(10, "");
         results =  dbCon.psmt.executeUpdate();
           
            
        } catch (SQLException e) {
            // Call Log4j for logging
            StackTraceElement stackTraceElement[] = e.getStackTrace();
            for (int i = 0; i < stackTraceElement.length; i++) {
                lg.warn(stackTraceElement[i].getClassName());
                lg.warn(stackTraceElement[i].getFileName());
                lg.warn(stackTraceElement[i].getLineNumber());
                lg.warn(stackTraceElement[i].getMethodName());
            }
            
            throw new SQLException();
          
        } finally {
            if (dbCon.psmt != null && dbCon.getConnect() != null) {
                try {
                    dbCon.psmt.close();
                    dbCon.getConnect().close();

                } catch (SQLException e) {
                    lg.warn("The PreparedStatement or Connection not close ");
                }
            } else {
                // do something
            }
        }
        if(results == -1) {
            lg.warn("method insertAutrepcm(): insert fail");
        }
        return results;
    }
    
    /**
     * Method get all Epcm_Num in database
     * @return ArrayList<String>
     * @throws SQLException 
     * @throws ClassNotFoundException 
     */
    public ArrayList<String> getListrEpcm_Num() throws SQLException, ClassNotFoundException {
        //SQL query
        String sql = "SELECT rEpcm_Num FROM AUTREPCM";
      //New listrEpcm_Num ArrayList 
        ArrayList<String> listrEpcm_Num = new ArrayList<String>();

        try {
            dbCon.psmt = dbCon.getConnect().prepareStatement(sql);
            //Create ResultSet 
                dbCon.rs = dbCon.psmt.executeQuery();
                if(dbCon.rs == null){
                    lg.error("method getListAutcarnm(): ResultSet = null");
                    return listrEpcm_Num;
                }
            //Get id into string
            while(dbCon.rs.next()) {
                listrEpcm_Num.add(dbCon.rs.getString(1).trim());
            }
             return listrEpcm_Num;
        }catch(Exception tt) {
            
            // Call Log4j for logging
            StackTraceElement stackTraceElement[] = tt.getStackTrace();
            for (int i = 0; i < stackTraceElement.length; i++) {
                lg.warn(stackTraceElement[i].getClassName());
                lg.warn(stackTraceElement[i].getFileName());
                lg.warn(stackTraceElement[i].getLineNumber());
                lg.warn(stackTraceElement[i].getMethodName());
                
            }
            
            throw new SQLException();
            
        }finally {
            if((dbCon.psmt != null) && (dbCon.getConnect() != null)){
                try {
                    //Close PreparedStatement
                    dbCon.psmt.close();
                    //Close connect
                    dbCon.getConnect().close();
                } catch (SQLException e) {
                    lg.error("The PreparedStatement or Connection not close ");
                }
            } else {
                // do something
            }
        }
        
    }
    
    
    
}

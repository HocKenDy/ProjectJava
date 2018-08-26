package junit.test;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Test;

import model.dao.AutrepcmDAO;

/**
 * AutrepcmDaoTest.java
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
public class AutrepcmDaoTest {

 AutrepcmDAO instance = new AutrepcmDAO();
    
 /**
  * method test insert success
  */
    @Test
    public void insertAutrepcmTest1()  {
        String rEpcm_Num = "ID0001";
        String rEpcm_Name = "1";
        String rEpcm_Jobid = "1";
        String rEpcm_Pgm = "1";
        String rEpcm_Type = "1";
        String rEpcm_Pgtyp = "1";
        String rEpcm_Pgstl = "11";
        String rEpcm_Prntp = "1";
        int  results = 0; 
        try {
            results = instance.insertAutrepcm(rEpcm_Num, rEpcm_Name, rEpcm_Jobid, rEpcm_Pgm,
                    rEpcm_Type, rEpcm_Pgtyp, rEpcm_Pgstl, rEpcm_Prntp);
            assertEquals(1, results);
        }catch (Exception e) {
        }
        }
    
    /**
     * method test insert fail
     */
    @Test
    public void insertAutrepcmTest2()  {
        String rEpcm_Num = null;
        String rEpcm_Name = null;
        String rEpcm_Jobid = null;
        String rEpcm_Pgm = null;
        String rEpcm_Type = null;
        String rEpcm_Pgtyp = null;
        String rEpcm_Pgstl = null;
        String rEpcm_Prntp = null;
        int  results = 0; 
        try {
            results = instance.insertAutrepcm(rEpcm_Num, rEpcm_Name, rEpcm_Jobid, rEpcm_Pgm,
                    rEpcm_Type, rEpcm_Pgtyp, rEpcm_Pgstl, rEpcm_Prntp);
           
        }catch (Exception e) {
            assertEquals(0, results);
        }
        }
    
    /**
     * method test get list Epcm_Num success
     */
    @Test
    public void getListrEpcm_Num1() {
        int results1 = 0;
        int results2 = 0;
         try {
             results1 = instance.insertAutrepcm("ID0002", "1", "1", "1", "1", "1", "1", "1");
             results2 = instance.insertAutrepcm("ID0003", "2", "2", "2", "2", "2", "2", "2");
             assertEquals(1, results1);
             assertEquals(1, results2);
            ArrayList<String> listEpcm;
            listEpcm = instance.getListrEpcm_Num();
            assertEquals(2, listEpcm.size());
        } catch (ClassNotFoundException | SQLException e) {
           
        }
    }
    
    /**
     * method test get list Epcm_Num success each element
     */
    @Test
    public void getListrEpcm_Num2() {
        ArrayList<String> result;
        try {
            result = instance.getListrEpcm_Num();
            String[] listEpcm_Num = new String[] {"ID0001", "ID0002", "ID0003","ID0004", "ID0005", "ID0006", "ID0007", "ID0008", "ID0009", "ID0010" };
            for(int i = 0; i < result.size(); i++) {
                assertEquals(listEpcm_Num[i],result.get(i));
            }
        } catch (ClassNotFoundException | SQLException e) {
         
        }
    } 

}

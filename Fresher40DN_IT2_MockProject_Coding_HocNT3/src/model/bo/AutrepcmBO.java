package model.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.AUTREPCM;
import model.dao.AutrepcmDAO;

/**
 * AutrepcmBO.java
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

public class AutrepcmBO {
    private AutrepcmDAO auDao;

    public AutrepcmBO() {
        auDao = new AutrepcmDAO();
    }

    /**
     * 
     * @param rEpcm_Num
     * @param rEpcm_Name
     * @param rEpcm_Jobid
     * @param rEpcm_Pgm
     * @param rEpcm_Type
     * @param rEpcm_Pgtyp
     * @param rEpcm_Pgstl
     * @param rEpcm_Prntp
     * @return 1 insert success, 0 insert fail
     * @throws SQLException 
     * @throws ClassNotFoundException 
     */
    public int insertAutrepcm(String rEpcm_Num, String rEpcm_Name, String rEpcm_Jobid, String rEpcm_Pgm,
            String rEpcm_Type, String rEpcm_Pgtyp, String rEpcm_Pgstl, String rEpcm_Prntp) throws ClassNotFoundException, SQLException {
        if ("".equals(rEpcm_Num)) {
            return 0;
        }
        return auDao.insertAutrepcm(rEpcm_Num, rEpcm_Name, rEpcm_Jobid, rEpcm_Pgm, rEpcm_Type, rEpcm_Pgtyp, rEpcm_Pgstl,
                rEpcm_Prntp);
    }
    public ArrayList<String> getListrEpcm_NumBo() throws ClassNotFoundException, SQLException{
        return auDao.getListrEpcm_Num();
    }
    
    /**
     *  Method: Get list ID
     * @return String listID
     * @throws SQLException 
     * @throws ClassNotFoundException 
     */
   public String getListID() throws ClassNotFoundException, SQLException{
        StringBuffer buffer = new StringBuffer();
        ArrayList<String> list = auDao.getListrEpcm_Num();
        
        //if list not empty
        if(list != null) {
            for(int i = 0;i<list.size();i++){
                buffer.append(list.get(i) +",");
            }
        }
        return buffer.toString();
    }
   
   /**
    * Method check AUTREPCM exists attribute not empty
    * @param au
    * @return true if exists attribute of AUTREPCM empty, false if all attribute empty
    */
   public boolean validAutrepcmEmpty(AUTREPCM au) {
   	
   	if (!"".equals(au.getrEpcm_Name()) || !"".equals(au.getrEpcm_Jobid()) || !"".equals(au.getrEpcm_Pgm()) ||
   		!"".equals(au.getrEpcm_Prntp()) || !"".equals(au.getrEpcm_Pgtyp()) || !"".equals(au.getrEpcm_Type())||
   		        !"".equals(au.getrEpcm_Pgstl()))  {
   			return true;
   		}
   	return false;
   }

}

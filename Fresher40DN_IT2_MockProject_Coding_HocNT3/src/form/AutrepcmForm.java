package form;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import model.bean.AUTREPCM;

/**
 * AutrepcmForm.java
 * 
 * Version 1.0
 * 
 * 28-07-2018
 * 
 * Copyright: HocNT3
 * Modification
 * 
 * DATE			AUTHOR 		DESCRIPTIONS
 * --------------------------------- 
 * 28-07-2018   HocNT3		Create
 */
public class AutrepcmForm extends ActionForm {
    /**
     * 
     */
    private static final long serialVersionUID = 2438090248229686680L;

    //Create String Array arrayRepcm_Num
    private String[] arrayRepcm_Num;
    
    //Create String Array arrayRepcm_Name
    private String[] arrayRepcm_Name;
    
    //Create String Array arrayRepcm_Pgtyp
    private String[] arrayRepcm_Pgtyp;
    
    //Create String Array arrayRepcm_Pgstl
    private String[] arrayRepcm_Pgstl;
    
    //Create String Array arrayRepcm_Type
    private String[] arrayRepcm_Type;
    
    //Create String Array arrayRepcm_Jobid
    private String[] arrayRepcm_Jobid;
    
    //Create String Array arrayRepcm_Pgm
    private String[] arrayRepcm_Pgm;
    
    //Create String Array arrayRepcm_Prntp
    private String[] arrayRepcm_Prntp;
    
    //Create arrayRepcm_Num variable to save into session
    private String rearrayRepcm_Num0;
    private String rearrayRepcm_Num1;
    private String rearrayRepcm_Num2;
    private String rearrayRepcm_Num3;
    private String rearrayRepcm_Num4;   
    private String rearrayRepcm_Num5;
    private String rearrayRepcm_Num6;
    private String rearrayRepcm_Num7;
    private String rearrayRepcm_Num8;
    private String rearrayRepcm_Num9;
    
    //Create arrayRepcm_Name variable to save into session
    private String rearrayRepcm_Name0;
    private String rearrayRepcm_Name1;
    private String rearrayRepcm_Name2;
    private String rearrayRepcm_Name3;
    private String rearrayRepcm_Name4;
    private String rearrayRepcm_Name5;
    private String rearrayRepcm_Name6;
    private String rearrayRepcm_Name7;
    private String rearrayRepcm_Name8;
    private String rearrayRepcm_Name9;
    
    //Create arrayRepcm_Pgtyp variable to save into session
    private String rearrayRepcm_Pgtyp0;
    private String rearrayRepcm_Pgtyp1;
    private String rearrayRepcm_Pgtyp2;
    private String rearrayRepcm_Pgtyp3;
    private String rearrayRepcm_Pgtyp4;
    private String rearrayRepcm_Pgtyp5;
    private String rearrayRepcm_Pgtyp6;
    private String rearrayRepcm_Pgtyp7;
    private String rearrayRepcm_Pgtyp8;
    private String rearrayRepcm_Pgtyp9;
    
    //Create arrayRepcm_Pgstl variable to save into session
    private String rearrayRepcm_Pgstl0;
    private String rearrayRepcm_Pgstl1;
    private String rearrayRepcm_Pgstl2;
    private String rearrayRepcm_Pgstl3;
    private String rearrayRepcm_Pgstl4;
    private String rearrayRepcm_Pgstl5;
    private String rearrayRepcm_Pgstl6;
    private String rearrayRepcm_Pgstl7;
    private String rearrayRepcm_Pgstl8;
    private String rearrayRepcm_Pgstl9;
    
    //Create arrayRepcm_Type variable to save into session
    private String rearrayRepcm_Type0;
    private String rearrayRepcm_Type1;
    private String rearrayRepcm_Type2;
    private String rearrayRepcm_Type3;
    private String rearrayRepcm_Type4;
    private String rearrayRepcm_Type5;
    private String rearrayRepcm_Type6;
    private String rearrayRepcm_Type7;
    private String rearrayRepcm_Type8;
    private String rearrayRepcm_Type9;
    
    //Create arrayRepcm_Jobid variable to save into session
    private String rearrayRepcm_Jobid0;
    private String rearrayRepcm_Jobid1;
    private String rearrayRepcm_Jobid2;
    private String rearrayRepcm_Jobid3;
    private String rearrayRepcm_Jobid4;
    private String rearrayRepcm_Jobid5;
    private String rearrayRepcm_Jobid6;
    private String rearrayRepcm_Jobid7;
    private String rearrayRepcm_Jobid8;
    private String rearrayRepcm_Jobid9;
    
    //Create arrayRepcm_Pgm variable to save into session
    private String rearrayRepcm_Pgm0;
    private String rearrayRepcm_Pgm1;
    private String rearrayRepcm_Pgm2;
    private String rearrayRepcm_Pgm3;
    private String rearrayRepcm_Pgm4;
    private String rearrayRepcm_Pgm5;
    private String rearrayRepcm_Pgm6;
    private String rearrayRepcm_Pgm7;
    private String rearrayRepcm_Pgm8;
    private String rearrayRepcm_Pgm9;
    
    //Create arrayRepcm_Prntp variable to save into session
    private String rearrayRepcm_Prntp0;
    private String rearrayRepcm_Prntp1;
    private String rearrayRepcm_Prntp2;
    private String rearrayRepcm_Prntp3;
    private String rearrayRepcm_Prntp4;
    private String rearrayRepcm_Prntp5;
    private String rearrayRepcm_Prntp6;
    private String rearrayRepcm_Prntp7;
    private String rearrayRepcm_Prntp8;
    private String rearrayRepcm_Prntp9;
    
    //Create REPCM_PGSTL variable to save into session
    private String selectarrayRepcm_Pgstl0;
    private String selectarrayRepcm_Pgstl1;
    private String selectarrayRepcm_Pgstl2;
    private String selectarrayRepcm_Pgstl3;
    private String selectarrayRepcm_Pgstl4;
    private String selectarrayRepcm_Pgstl5;
    private String selectarrayRepcm_Pgstl6;
    private String selectarrayRepcm_Pgstl7;
    private String selectarrayRepcm_Pgstl8;
    private String selectarrayRepcm_Pgstl9;
    
    //Create REPCM_TYPE variable to save into session
    private String selectarrayRepcm_Type0;
    private String selectarrayRepcm_Type1;
    private String selectarrayRepcm_Type2;
    private String selectarrayRepcm_Type3;
    private String selectarrayRepcm_Type4;
    private String selectarrayRepcm_Type5;
    private String selectarrayRepcm_Type6;
    private String selectarrayRepcm_Type7;
    private String selectarrayRepcm_Type8;
    private String selectarrayRepcm_Type9;
    
    //Create variable handling business
    private ArrayList<String> listRepcm_Num;
    private ArrayList<AUTREPCM> listAUTREPCM;
    private String listId;
    private String listIdExists;
    private String listIdEmpty;
    private String submit;
    
/**
 *     
 * @return
 */
	public String getListIdEmpty() {
        return listIdEmpty;
    }
	
/**
 * 
 * @param listIdEmpty
 */
    public void setListIdEmpty(String listIdEmpty) {
        this.listIdEmpty = listIdEmpty;
    }
    
/**
 * 
 * @return
 */
    public String getSelectarrayRepcm_Pgstl0() {
        return selectarrayRepcm_Pgstl0;
    }
    
/**
 * 
 * @param selectarrayREPCMPGSTL0
 */
    public void setSelectarrayRepcm_Pgstl0(String selectarrayREPCMPGSTL0) {
        selectarrayRepcm_Pgstl0 = selectarrayREPCMPGSTL0;
    }
    
/**
 * 
 * @return
 */
    public String getSelectarrayRepcm_Type0() {
        return selectarrayRepcm_Type0;
    }
    
/**
 * 
 * @param selectarrayREPCMTYPE0
 */
    public void setSelectarrayRepcm_Type0(String selectarrayREPCMTYPE0) {
        selectarrayRepcm_Type0 = selectarrayREPCMTYPE0;
    }
    
    /**
     * 
     * @return
     */
    public String getSelectarrayRepcm_Pgstl1() {
        return selectarrayRepcm_Pgstl1;
    }
    
/**
 * 
 * @param selectarrayREPCMPGSTL1
 */
    public void setSelectarrayRepcm_Pgstl1(String selectarrayREPCMPGSTL1) {
        selectarrayRepcm_Pgstl1 = selectarrayREPCMPGSTL1;
    }
    
/**
 * 
 * @return
 */
    public String getSelectarrayRepcm_Pgstl2() {
        return selectarrayRepcm_Pgstl2;
    }
    
/**
 * 
 * @param selectarrayREPCMPGSTL2
 */
    public void setSelectarrayRepcm_Pgstl2(String selectarrayREPCMPGSTL2) {
        selectarrayRepcm_Pgstl2 = selectarrayREPCMPGSTL2;
    }
    
/**
 * 
 * @return
 */
    public String getSelectarrayRepcm_Pgstl3() {
        return selectarrayRepcm_Pgstl3;
    }
    
/**
 * 
 * @param selectarrayREPCMPGSTL3
 */
    public void setSelectarrayRepcm_Pgstl3(String selectarrayREPCMPGSTL3) {
        selectarrayRepcm_Pgstl3 = selectarrayREPCMPGSTL3;
    }
    
/**
 * 
 * @return
 */
    public String getSelectarrayRepcm_Pgstl4() {
        return selectarrayRepcm_Pgstl4;
    }
    
/**
 * 
 * @param selectarrayREPCMPGSTL4
 */
    public void setSelectarrayRepcm_Pgstl4(String selectarrayREPCMPGSTL4) {
        selectarrayRepcm_Pgstl4 = selectarrayREPCMPGSTL4;
    }
    
/**
 * 
 * @return
 */
    public String getSelectarrayRepcm_Pgstl5() {
        return selectarrayRepcm_Pgstl5;
    }
    
/**
 * 
 * @param selectarrayREPCMPGSTL5
 */
    public void setSelectarrayRepcm_Pgstl5(String selectarrayREPCMPGSTL5) {
        selectarrayRepcm_Pgstl5 = selectarrayREPCMPGSTL5;
    }
    
/**
 * 
 * @return
 */
    public String getSelectarrayRepcm_Pgstl6() {
        return selectarrayRepcm_Pgstl6;
    }
    
/**
 *  
 * @param selectarrayREPCMPGSTL6
 */
    public void setSelectarrayRepcm_Pgstl6(String selectarrayREPCMPGSTL6) {
        selectarrayRepcm_Pgstl6 = selectarrayREPCMPGSTL6;
    }
    
/**
 * 
 * @return
 */
    public String getSelectarrayRepcm_Pgstl7() {
        return selectarrayRepcm_Pgstl7;
    }
    
/**
 * 
 * @param selectarrayREPCMPGSTL7
 */
    public void setSelectarrayRepcm_Pgstl7(String selectarrayREPCMPGSTL7) {
        selectarrayRepcm_Pgstl7 = selectarrayREPCMPGSTL7;
    }
    
/**
 * 
 * @return
 */
    public String getSelectarrayRepcm_Pgstl8() {
        return selectarrayRepcm_Pgstl8;
    }
    
/**
 * 
 * @param selectarrayREPCMPGSTL8
 */
    public void setSelectarrayRepcm_Pgstl8(String selectarrayREPCMPGSTL8) {
        selectarrayRepcm_Pgstl8 = selectarrayREPCMPGSTL8;
    }
    
/**
 * 
 * @return
 */
    public String getSelectarrayRepcm_Pgstl9() {
        return selectarrayRepcm_Pgstl9;
    }
    
/**
 * 
 * @param selectarrayREPCMPGSTL9
 */
    public void setSelectarrayRepcm_Pgstl9(String selectarrayREPCMPGSTL9) {
        selectarrayRepcm_Pgstl9 = selectarrayREPCMPGSTL9;
    }
    
/**
 * 
 * @return
 */
    public String getSelectarrayRepcm_Type1() {
        return selectarrayRepcm_Type1;
    }
    
/**
 * 
 * @param selectarrayREPCMTYPE1
 */
    public void setSelectarrayRepcm_Type1(String selectarrayREPCMTYPE1) {
        selectarrayRepcm_Type1 = selectarrayREPCMTYPE1;
    }
    
/**
 * 
 * @return
 */
    public String getSelectarrayRepcm_Type2() {
        return selectarrayRepcm_Type2;
    }
    
/**
 * 
 * @param selectarrayREPCMTYPE2
 */
    public void setSelectarrayRepcm_Type2(String selectarrayREPCMTYPE2) {
        selectarrayRepcm_Type2 = selectarrayREPCMTYPE2;
    }
    
/**
 * 
 * @return
 */
    public String getSelectarrayRepcm_Type3() {
        return selectarrayRepcm_Type3;
    }
    
/**
 * 
 * @param selectarrayREPCMTYPE3
 */
    public void setSelectarrayRepcm_Type3(String selectarrayREPCMTYPE3) {
        selectarrayRepcm_Type3 = selectarrayREPCMTYPE3;
    }
    
/**
 * 
 * @return
 */
    public String getSelectarrayRepcm_Type4() {
        return selectarrayRepcm_Type4;
    }
    
/**
 * 
 * @param selectarrayREPCMTYPE4
 */
    public void setSelectarrayRepcm_Type4(String selectarrayREPCMTYPE4) {
        selectarrayRepcm_Type4 = selectarrayREPCMTYPE4;
    }
    
/**
 * 
 * @return
 */
    public String getSelectarrayRepcm_Type5() {
        return selectarrayRepcm_Type5;
    }
    
/**
 * 
 * @param selectarrayREPCMTYPE5
 */
    public void setSelectarrayRepcm_Type5(String selectarrayREPCMTYPE5) {
        selectarrayRepcm_Type5 = selectarrayREPCMTYPE5;
    }
    
/**
 * 
 * @return
 */
    public String getSelectarrayRepcm_Type6() {
        return selectarrayRepcm_Type6;
    }
    
/**
 * 
 * @param selectarrayREPCMTYPE6
 */
    public void setSelectarrayRepcm_Type6(String selectarrayREPCMTYPE6) {
        selectarrayRepcm_Type6 = selectarrayREPCMTYPE6;
    }
    
/**
 * 
 * @return
 */
    public String getSelectarrayRepcm_Type7() {
        return selectarrayRepcm_Type7;
    }
    
/**
 * 
 * @param selectarrayREPCMTYPE7
 */
    public void setSelectarrayRepcm_Type7(String selectarrayREPCMTYPE7) {
        selectarrayRepcm_Type7 = selectarrayREPCMTYPE7;
    }
    
/**
 * 
 * @return
 */
    public String getSelectarrayRepcm_Type8() {
        return selectarrayRepcm_Type8;
    }
    
/**
 * 
 * @param selectarrayREPCMTYPE8
 */
    public void setSelectarrayRepcm_Type8(String selectarrayREPCMTYPE8) {
        selectarrayRepcm_Type8 = selectarrayREPCMTYPE8;
    }
    
/**
 * 
 * @return
 */
    public String getSelectarrayRepcm_Type9() {
        return selectarrayRepcm_Type9;
    }
    
/**
 * 
 * @param selectarrayREPCMTYPE9
 */
    public void setSelectarrayRepcm_Type9(String selectarrayREPCMTYPE9) {
        selectarrayRepcm_Type9 = selectarrayREPCMTYPE9;
    }
    
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Name0() {
        return rearrayRepcm_Name0;
    }
    
/**
 * 
 * @param reArrayREPCMNAME0
 */
    public void setRearrayRepcm_Name0(String reArrayREPCMNAME0) {
        rearrayRepcm_Name0 = reArrayREPCMNAME0;
    }
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Name1() {
        return rearrayRepcm_Name1;
    }
/**
 * 
 * @param reArrayREPCMNAME1
 */
    public void setRearrayRepcm_Name1(String reArrayREPCMNAME1) {
        rearrayRepcm_Name1 = reArrayREPCMNAME1;
    }
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Name2() {
        return rearrayRepcm_Name2;
    }
/**
 * 
 * @param reArrayREPCMNAME2
 */
    public void setRearrayRepcm_Name2(String reArrayREPCMNAME2) {
        rearrayRepcm_Name2 = reArrayREPCMNAME2;
    }
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Name3() {
        return rearrayRepcm_Name3;
    }
/**
 * 
 * @param reArrayREPCMNAME3
 */
    public void setRearrayRepcm_Name3(String reArrayREPCMNAME3) {
        rearrayRepcm_Name3 = reArrayREPCMNAME3;
    }
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Name4() {
        return rearrayRepcm_Name4;
    }
/**
 * 
 * @param reArrayREPCMNAME4
 */
    public void setRearrayRepcm_Name4(String reArrayREPCMNAME4) {
        rearrayRepcm_Name4 = reArrayREPCMNAME4;
    }
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Name5() {
        return rearrayRepcm_Name5;
    }
/**
 * 
 * @param reArrayREPCMNAME5
 */
    public void setRearrayRepcm_Name5(String reArrayREPCMNAME5) {
        rearrayRepcm_Name5 = reArrayREPCMNAME5;
    }
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Name6() {
        return rearrayRepcm_Name6;
    }
/**
 * 
 * @param reArrayREPCMNAME6
 */
    public void setRearrayRepcm_Name6(String reArrayREPCMNAME6) {
        rearrayRepcm_Name6 = reArrayREPCMNAME6;
    }
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Name7() {
        return rearrayRepcm_Name7;
    }
/**
 * 
 * @param reArrayREPCMNAME7
 */
    public void setRearrayRepcm_Name7(String reArrayREPCMNAME7) {
        rearrayRepcm_Name7 = reArrayREPCMNAME7;
    }
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Name8() {
        return rearrayRepcm_Name8;
    }
/**
 * 
 * @param reArrayREPCMNAME8
 */
    public void setRearrayRepcm_Name8(String reArrayREPCMNAME8) {
        rearrayRepcm_Name8 = reArrayREPCMNAME8;
    }
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Name9() {
        return rearrayRepcm_Name9;
    }
/**
 * 
 * @param reArrayREPCMNAME9
 */
    public void setRearrayRepcm_Name9(String reArrayREPCMNAME9) {
        rearrayRepcm_Name9 = reArrayREPCMNAME9;
    }
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Pgtyp0() {
        return rearrayRepcm_Pgtyp0;
    }
/**
 * 
 * @param reArrayREPCMPGTYP0
 */
    public void setRearrayRepcm_Pgtyp0(String reArrayREPCMPGTYP0) {
        rearrayRepcm_Pgtyp0 = reArrayREPCMPGTYP0;
    }
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Pgtyp1() {
        return rearrayRepcm_Pgtyp1;
    }
/**
 * 
 * @param reArrayREPCMPGTYP1
 */
    public void setRearrayRepcm_Pgtyp1(String reArrayREPCMPGTYP1) {
        rearrayRepcm_Pgtyp1 = reArrayREPCMPGTYP1;
    }
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Pgtyp2() {
        return rearrayRepcm_Pgtyp2;
    }
/**
 * 
 * @param reArrayREPCMPGTYP2
 */
    public void setRearrayRepcm_Pgtyp2(String reArrayREPCMPGTYP2) {
        rearrayRepcm_Pgtyp2 = reArrayREPCMPGTYP2;
    }
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Pgtyp3() {
        return rearrayRepcm_Pgtyp3;
    }
/**
 * 
 * @param reArrayREPCMPGTYP3
 */
    public void setRearrayRepcm_Pgtyp3(String reArrayREPCMPGTYP3) {
        rearrayRepcm_Pgtyp3 = reArrayREPCMPGTYP3;
    }
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Pgtyp4() {
        return rearrayRepcm_Pgtyp4;
    }
/**
 * 
 * @param reArrayREPCMPGTYP4
 */
    public void setRearrayRepcm_Pgtyp4(String reArrayREPCMPGTYP4) {
        rearrayRepcm_Pgtyp4 = reArrayREPCMPGTYP4;
    }
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Pgtyp5() {
        return rearrayRepcm_Pgtyp5;
    }
/**
 * 
 * @param reArrayREPCMPGTYP5
 */
    public void setRearrayRepcm_Pgtyp5(String reArrayREPCMPGTYP5) {
        rearrayRepcm_Pgtyp5 = reArrayREPCMPGTYP5;
    }
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Pgtyp6() {
        return rearrayRepcm_Pgtyp6;
    }
/**
 * 
 * @param reArrayREPCMPGTYP6
 */
    public void setRearrayRepcm_Pgtyp6(String reArrayREPCMPGTYP6) {
        rearrayRepcm_Pgtyp6 = reArrayREPCMPGTYP6;
    }
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Pgtyp7() {
        return rearrayRepcm_Pgtyp7;
    }
/**
 * 
 * @param reArrayREPCMPGTYP7
 */
    public void setRearrayRepcm_Pgtyp7(String reArrayREPCMPGTYP7) {
        rearrayRepcm_Pgtyp7 = reArrayREPCMPGTYP7;
    }
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Pgtyp8() {
        return rearrayRepcm_Pgtyp8;
    }
/**
 * 
 * @param reArrayREPCMPGTYP8
 */
    public void setRearrayRepcm_Pgtyp8(String reArrayREPCMPGTYP8) {
        rearrayRepcm_Pgtyp8 = reArrayREPCMPGTYP8;
    }
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Pgtyp9() {
        return rearrayRepcm_Pgtyp9;
    }
/**
 * 
 * @param reArrayREPCMPGTYP9
 */
    public void setRearrayRepcm_Pgtyp9(String reArrayREPCMPGTYP9) {
        rearrayRepcm_Pgtyp9 = reArrayREPCMPGTYP9;
    }
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Pgstl0() {
        return rearrayRepcm_Pgstl0;
    }
/**
 * 
 * @param reArrayREPCMPGSTL0
 */
    public void setRearrayRepcm_Pgstl0(String reArrayREPCMPGSTL0) {
        rearrayRepcm_Pgstl0 = reArrayREPCMPGSTL0;
    }
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Pgstl1() {
        return rearrayRepcm_Pgstl1;
    }
/**
 * 
 * @param reArrayREPCMPGSTL1
 */
    public void setRearrayRepcm_Pgstl1(String reArrayREPCMPGSTL1) {
        rearrayRepcm_Pgstl1 = reArrayREPCMPGSTL1;
    }
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Pgstl2() {
        return rearrayRepcm_Pgstl2;
    }
/**
 * 
 * @param reArrayREPCMPGSTL2
 */
    public void setRearrayRepcm_Pgstl2(String reArrayREPCMPGSTL2) {
        rearrayRepcm_Pgstl2 = reArrayREPCMPGSTL2;
    }
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Pgstl3() {
        return rearrayRepcm_Pgstl3;
    }
/**
 * 
 * @param reArrayREPCMPGSTL3
 */
    public void setRearrayRepcm_Pgstl3(String reArrayREPCMPGSTL3) {
        rearrayRepcm_Pgstl3 = reArrayREPCMPGSTL3;
    }
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Pgstl4() {
        return rearrayRepcm_Pgstl4;
    }
/**
 * 
 * @param reArrayREPCMPGSTL4
 */
    public void setRearrayRepcm_Pgstl4(String reArrayREPCMPGSTL4) {
        rearrayRepcm_Pgstl4 = reArrayREPCMPGSTL4;
    }
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Pgstl5() {
        return rearrayRepcm_Pgstl5;
    }
/**
 * 
 * @param reArrayREPCMPGSTL5
 */
    public void setRearrayRepcm_Pgstl5(String reArrayREPCMPGSTL5) {
        rearrayRepcm_Pgstl5 = reArrayREPCMPGSTL5;
    }
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Pgstl6() {
        return rearrayRepcm_Pgstl6;
    }
/**
 * 
 * @param reArrayREPCMPGSTL6
 */
    public void setRearrayRepcm_Pgstl6(String reArrayREPCMPGSTL6) {
        rearrayRepcm_Pgstl6 = reArrayREPCMPGSTL6;
    }
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Pgstl7() {
        return rearrayRepcm_Pgstl7;
    }
/**
 * 
 * @param reArrayREPCMPGSTL7
 */
    public void setRearrayRepcm_Pgstl7(String reArrayREPCMPGSTL7) {
        rearrayRepcm_Pgstl7 = reArrayREPCMPGSTL7;
    }
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Pgstl8() {
        return rearrayRepcm_Pgstl8;
    }
/**
 * 
 * @param reArrayREPCMPGSTL8
 */
    public void setRearrayRepcm_Pgstl8(String reArrayREPCMPGSTL8) {
        rearrayRepcm_Pgstl8 = reArrayREPCMPGSTL8;
    }
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Pgstl9() {
        return rearrayRepcm_Pgstl9;
    }
/**
 * 
 * @param reArrayREPCMPGSTL9
 */
    public void setRearrayRepcm_Pgstl9(String reArrayREPCMPGSTL9) {
        rearrayRepcm_Pgstl9 = reArrayREPCMPGSTL9;
    }
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Type0() {
        return rearrayRepcm_Type0;
    }
    
/**
 * 
 * @param reArrayREPCMTYPE0
 */
    public void setRearrayRepcm_Type0(String reArrayREPCMTYPE0) {
        rearrayRepcm_Type0 = reArrayREPCMTYPE0;
    }
    
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Type1() {
        return rearrayRepcm_Type1;
    }
    
/**
 * 
 * @param reArrayREPCMTYPE1
 */
    public void setRearrayRepcm_Type1(String reArrayREPCMTYPE1) {
        rearrayRepcm_Type1 = reArrayREPCMTYPE1;
    }
    
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Type2() {
        return rearrayRepcm_Type2;
    }
    
/**
 * 
 * @param reArrayREPCMTYPE2
 */
    public void setRearrayRepcm_Type2(String reArrayREPCMTYPE2) {
        rearrayRepcm_Type2 = reArrayREPCMTYPE2;
    }
    
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Type3() {
        return rearrayRepcm_Type3;
    }
    
/**
 * 
 * @param reArrayREPCMTYPE3
 */
    public void setRearrayRepcm_Type3(String reArrayREPCMTYPE3) {
        rearrayRepcm_Type3 = reArrayREPCMTYPE3;
    }
    
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Type4() {
        return rearrayRepcm_Type4;
    }
    
/**
 * 
 * @param reArrayREPCMTYPE4
 */
    public void setRearrayRepcm_Type4(String reArrayREPCMTYPE4) {
        rearrayRepcm_Type4 = reArrayREPCMTYPE4;
    }
    
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Type5() {
        return rearrayRepcm_Type5;
    }
    
/**
 * 
 * @param reArrayREPCMTYPE5
 */
    public void setRearrayRepcm_Type5(String reArrayREPCMTYPE5) {
        rearrayRepcm_Type5 = reArrayREPCMTYPE5;
    }
    
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Type6() {
        return rearrayRepcm_Type6;
    }
    
/**
 * 
 * @param reArrayREPCMTYPE6
 */
    public void setRearrayRepcm_Type6(String reArrayREPCMTYPE6) {
        rearrayRepcm_Type6 = reArrayREPCMTYPE6;
    }
    
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Type7() {
        return rearrayRepcm_Type7;
    }
    
/**
 * 
 * @param reArrayREPCMTYPE7
 */
    public void setRearrayRepcm_Type7(String reArrayREPCMTYPE7) {
        rearrayRepcm_Type7 = reArrayREPCMTYPE7;
    }
    
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Type8() {
        return rearrayRepcm_Type8;
    }
    
/**
 * 
 * @param reArrayREPCMTYPE8
 */
    public void setRearrayRepcm_Type8(String reArrayREPCMTYPE8) {
        rearrayRepcm_Type8 = reArrayREPCMTYPE8;
    }
    
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Type9() {
        return rearrayRepcm_Type9;
    }
    
/**
 * 
 * @param reArrayREPCMTYPE9
 */
    public void setRearrayRepcm_Type9(String reArrayREPCMTYPE9) {
        rearrayRepcm_Type9 = reArrayREPCMTYPE9;
    }
    
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Jobid0() {
        return rearrayRepcm_Jobid0;
    }
    
/**
 * 
 * @param reArrayREPCMJOBID0
 */
    public void setRearrayRepcm_Jobid0(String reArrayREPCMJOBID0) {
        rearrayRepcm_Jobid0 = reArrayREPCMJOBID0;
    }
    
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Jobid1() {
        return rearrayRepcm_Jobid1;
    }
    
/**
 * 
 * @param reArrayREPCMJOBID1
 */
    public void setRearrayRepcm_Jobid1(String reArrayREPCMJOBID1) {
        rearrayRepcm_Jobid1 = reArrayREPCMJOBID1;
    }
    
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Jobid2() {
        return rearrayRepcm_Jobid2;
    }
    
/**
 * 
 * @param reArrayREPCMJOBID2
 */
    public void setRearrayRepcm_Jobid2(String reArrayREPCMJOBID2) {
        rearrayRepcm_Jobid2 = reArrayREPCMJOBID2;
    }
    
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Jobid3() {
        return rearrayRepcm_Jobid3;
    }
    
/**
 * 
 * @param reArrayREPCMJOBID3
 */
    public void setRearrayRepcm_Jobid3(String reArrayREPCMJOBID3) {
        rearrayRepcm_Jobid3 = reArrayREPCMJOBID3;
    }
    
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Jobid4() {
        return rearrayRepcm_Jobid4;
    }
    
/**
 * 
 * @param reArrayREPCMJOBID4
 */
    public void setRearrayRepcm_Jobid4(String reArrayREPCMJOBID4) {
        rearrayRepcm_Jobid4 = reArrayREPCMJOBID4;
    }
    
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Jobid5() {
        return rearrayRepcm_Jobid5;
    }
    
/**
 * 
 * @param reArrayREPCMJOBID5
 */
    public void setRearrayRepcm_Jobid5(String reArrayREPCMJOBID5) {
        rearrayRepcm_Jobid5 = reArrayREPCMJOBID5;
    }
    
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Jobid6() {
        return rearrayRepcm_Jobid6;
    }
    
/**
 * 
 * @param reArrayREPCMJOBID6
 */
    public void setRearrayRepcm_Jobid6(String reArrayREPCMJOBID6) {
        rearrayRepcm_Jobid6 = reArrayREPCMJOBID6;
    }
    
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Jobid7() {
        return rearrayRepcm_Jobid7;
    }
    
/**
 * 
 * @param reArrayREPCMJOBID7
 */
    public void setRearrayRepcm_Jobid7(String reArrayREPCMJOBID7) {
        rearrayRepcm_Jobid7 = reArrayREPCMJOBID7;
    }
    
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Jobid8() {
        return rearrayRepcm_Jobid8;
    }
    
/**
 * 
 * @param reArrayREPCMJOBID8
 */
    public void setRearrayRepcm_Jobid8(String reArrayREPCMJOBID8) {
        rearrayRepcm_Jobid8 = reArrayREPCMJOBID8;
    }
    
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Jobid9() {
        return rearrayRepcm_Jobid9;
    }
    
/**
 * 
 * @param reArrayREPCMJOBID9
 */
    public void setRearrayRepcm_Jobid9(String reArrayREPCMJOBID9) {
        rearrayRepcm_Jobid9 = reArrayREPCMJOBID9;
    }
    
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Pgm0() {
        return rearrayRepcm_Pgm0;
    }
    
/**
 * 
 * @param reArrayREPCMPGM0
 */
    public void setRearrayRepcm_Pgm0(String reArrayREPCMPGM0) {
        rearrayRepcm_Pgm0 = reArrayREPCMPGM0;
    }
    
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Pgm1() {
        return rearrayRepcm_Pgm1;
    }
    
/**
 * 
 * @param reArrayREPCMPGM1
 */
    public void setRearrayRepcm_Pgm1(String reArrayREPCMPGM1) {
        rearrayRepcm_Pgm1 = reArrayREPCMPGM1;
    }
    
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Pgm2() {
        return rearrayRepcm_Pgm2;
    }
    
/**
 * 
 * @param reArrayREPCMPGM2
 */
    public void setRearrayRepcm_Pgm2(String reArrayREPCMPGM2) {
        rearrayRepcm_Pgm2 = reArrayREPCMPGM2;
    }
    
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Pgm3() {
        return rearrayRepcm_Pgm3;
    }
    
/**
 * 
 * @param reArrayREPCMPGM3
 */
    public void setRearrayRepcm_Pgm3(String reArrayREPCMPGM3) {
        rearrayRepcm_Pgm3 = reArrayREPCMPGM3;
    }
    
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Pgm4() {
        return rearrayRepcm_Pgm4;
    }
    
/**
 * 
 * @param reArrayREPCMPGM4
 */
    public void setRearrayRepcm_Pgm4(String reArrayREPCMPGM4) {
        rearrayRepcm_Pgm4 = reArrayREPCMPGM4;
    }
    
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Pgm5() {
        return rearrayRepcm_Pgm5;
    }
    
/**
 * 
 * @param reArrayREPCMPGM5
 */
    public void setRearrayRepcm_Pgm5(String reArrayREPCMPGM5) {
        rearrayRepcm_Pgm5 = reArrayREPCMPGM5;
    }
    
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Pgm6() {
        return rearrayRepcm_Pgm6;
    }
    
/**
 * 
 * @param reArrayREPCMPGM6
 */
    public void setRearrayRepcm_Pgm6(String reArrayREPCMPGM6) {
        rearrayRepcm_Pgm6 = reArrayREPCMPGM6;
    }
    
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Pgm7() {
        return rearrayRepcm_Pgm7;
    }
    
/**
 * 
 * @param reArrayREPCMPGM7
 */
    public void setRearrayRepcm_Pgm7(String reArrayREPCMPGM7) {
        rearrayRepcm_Pgm7 = reArrayREPCMPGM7;
    }
    
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Pgm8() {
        return rearrayRepcm_Pgm8;
    }
    
/**
 * 
 * @param reArrayREPCMPGM8
 */
    public void setRearrayRepcm_Pgm8(String reArrayREPCMPGM8) {
        rearrayRepcm_Pgm8 = reArrayREPCMPGM8;
    }
    
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Pgm9() {
        return rearrayRepcm_Pgm9;
    }
    
/**
 * 
 * @param reArrayREPCMPGM9
 */
    public void setRearrayRepcm_Pgm9(String reArrayREPCMPGM9) {
        rearrayRepcm_Pgm9 = reArrayREPCMPGM9;
    }
    
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Prntp0() {
        return rearrayRepcm_Prntp0;
    }
    
/**
 * 
 * @param reArrayREPCMPRNTP0
 */
    public void setRearrayRepcm_Prntp0(String reArrayREPCMPRNTP0) {
        rearrayRepcm_Prntp0 = reArrayREPCMPRNTP0;
    }
    
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Prntp1() {
        return rearrayRepcm_Prntp1;
    }
    
/**
 * 
 * @param reArrayREPCMPRNTP1
 */
    public void setRearrayRepcm_Prntp1(String reArrayREPCMPRNTP1) {
        rearrayRepcm_Prntp1 = reArrayREPCMPRNTP1;
    }
    
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Prntp2() {
        return rearrayRepcm_Prntp2;
    }
    
/**
 * 
 * @param reArrayREPCMPRNTP2
 */
    public void setRearrayRepcm_Prntp2(String reArrayREPCMPRNTP2) {
        rearrayRepcm_Prntp2 = reArrayREPCMPRNTP2;
    }
    
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Prntp3() {
        return rearrayRepcm_Prntp3;
    }
    
/**
 * 
 * @param reArrayREPCMPRNTP3
 */
    public void setRearrayRepcm_Prntp3(String reArrayREPCMPRNTP3) {
        rearrayRepcm_Prntp3 = reArrayREPCMPRNTP3;
    }
    
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Prntp4() {
        return rearrayRepcm_Prntp4;
    }
    
/**
 * 
 * @param reArrayREPCMPRNTP4
 */
    public void setRearrayRepcm_Prntp4(String reArrayREPCMPRNTP4) {
        rearrayRepcm_Prntp4 = reArrayREPCMPRNTP4;
    }
    
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Prntp5() {
        return rearrayRepcm_Prntp5;
    }
    
/**
 * 
 * @param reArrayREPCMPRNTP5
 */
    public void setRearrayRepcm_Prntp5(String reArrayREPCMPRNTP5) {
        rearrayRepcm_Prntp5 = reArrayREPCMPRNTP5;
    }
    
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Prntp6() {
        return rearrayRepcm_Prntp6;
    }
    
/**
 * 
 * @param reArrayREPCMPRNTP6
 */
    public void setRearrayRepcm_Prntp6(String reArrayREPCMPRNTP6) {
        rearrayRepcm_Prntp6 = reArrayREPCMPRNTP6;
    }
    
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Prntp7() {
        return rearrayRepcm_Prntp7;
    }
    
/**
 * 
 * @param reArrayREPCMPRNTP7
 */
    public void setRearrayRepcm_Prntp7(String reArrayREPCMPRNTP7) {
        rearrayRepcm_Prntp7 = reArrayREPCMPRNTP7;
    }
    
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Prntp8() {
        return rearrayRepcm_Prntp8;
    }
    
/**
 * 
 * @param reArrayREPCMPRNTP8
 */
    public void setRearrayRepcm_Prntp8(String reArrayREPCMPRNTP8) {
        rearrayRepcm_Prntp8 = reArrayREPCMPRNTP8;
    }
    
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Prntp9() {
        return rearrayRepcm_Prntp9;
    }
    
/**
 * 
 * @param reArrayREPCMPRNTP9
 */
    public void setRearrayRepcm_Prntp9(String reArrayREPCMPRNTP9) {
        rearrayRepcm_Prntp9 = reArrayREPCMPRNTP9;
    }
    
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Num0() {
        return rearrayRepcm_Num0;
    }
    
/**
 * 
 * @param reArrayREPCMNUM0
 */
    public void setRearrayRepcm_Num0(String reArrayREPCMNUM0) {
        rearrayRepcm_Num0 = reArrayREPCMNUM0;
    }
    
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Num1() {
        return rearrayRepcm_Num1;
    }
    
/**
 * 
 * @param reArrayREPCMNUM1
 */
    public void setRearrayRepcm_Num1(String reArrayREPCMNUM1) {
        rearrayRepcm_Num1 = reArrayREPCMNUM1;
    }
    
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Num2() {
        return rearrayRepcm_Num2;
    }
    
/**
 * 
 * @param reArrayREPCMNUM2
 */
    public void setRearrayRepcm_Num2(String reArrayREPCMNUM2) {
        rearrayRepcm_Num2 = reArrayREPCMNUM2;
    }
    
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Num3() {
        return rearrayRepcm_Num3;
    }
    
/**
 * 
 * @param reArrayREPCMNUM3
 */
    public void setRearrayRepcm_Num3(String reArrayREPCMNUM3) {
        rearrayRepcm_Num3 = reArrayREPCMNUM3;
    }
    
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Num4() {
        return rearrayRepcm_Num4;
    }
    
/**
 * 
 * @param reArrayREPCMNUM4
 */
    public void setRearrayRepcm_Num4(String reArrayREPCMNUM4) {
        rearrayRepcm_Num4 = reArrayREPCMNUM4;
    }
    
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Num5() {
        return rearrayRepcm_Num5;
    }
    
/**
 * 
 * @param reArrayREPCMNUM5
 */
    public void setRearrayRepcm_Num5(String reArrayREPCMNUM5) {
        rearrayRepcm_Num5 = reArrayREPCMNUM5;
    }
    
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Num6() {
        return rearrayRepcm_Num6;
    }
    
/**
 * 
 * @param reArrayREPCMNUM6
 */
    public void setRearrayRepcm_Num6(String reArrayREPCMNUM6) {
        rearrayRepcm_Num6 = reArrayREPCMNUM6;
    }
    
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Num7() {
        return rearrayRepcm_Num7;
    }
    
/**
 * 
 * @param reArrayREPCMNUM7
 */
    public void setRearrayRepcm_Num7(String reArrayREPCMNUM7) {
        rearrayRepcm_Num7 = reArrayREPCMNUM7;
    }
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Num8() {
        return rearrayRepcm_Num8;
    }
/**
 * 
 * @param reArrayREPCMNUM8
 */
    public void setRearrayRepcm_Num8(String reArrayREPCMNUM8) {
        rearrayRepcm_Num8 = reArrayREPCMNUM8;
    }
    
/**
 * 
 * @return
 */
    public String getRearrayRepcm_Num9() {
        return rearrayRepcm_Num9;
    }
    
/**
 * 
 * @param reArrayREPCMNUM9
 */
    public void setRearrayRepcm_Num9(String reArrayREPCMNUM9) {
        rearrayRepcm_Num9 = reArrayREPCMNUM9;
    }
    
/**
 * 
 * @return
 */
    public String getListIdExists() {
        return listIdExists;
    }

    /**
     * 
     * @param listIdExists2
     */
    public void setListIdExists(String listIdExists2) {
        this.listIdExists = listIdExists2;
    }

    /**
     * 
     * @return
     */
    public String getListId() {
        return listId;
    }

    /**
     * 
     * @param listId
     */
    public void setListId(String listId) {
        this.listId = listId;
    }
  
   

    public ArrayList<String> getListRepcm_Num() {
        return listRepcm_Num;
    }

    public void setListRepcm_Num(ArrayList<String> listRepcm_Num) {
        this.listRepcm_Num = listRepcm_Num;
    }

    /**
     * 
     * @return
     */
    public String[] getarrayRepcm_Num() {
        return arrayRepcm_Num;
    }

    /**
     * 
     * @param arrayREPCMNUM
     */
    public void setarrayRepcm_Num(String[] arrayREPCMNUM) {
        arrayRepcm_Num = arrayREPCMNUM;
    }

    /**
     * 
     * @return
     */
    public String[] getarrayRepcm_Name() {
        return arrayRepcm_Name;
    }

    /**
     * 
     * @param arrayREPCMNAME
     */
    public void setarrayRepcm_Name(String[] arrayREPCMNAME) {
        arrayRepcm_Name = arrayREPCMNAME;
    }

    /**
     * 
     * @return
     */
    public String[] getarrayRepcm_Pgtyp() {
        return arrayRepcm_Pgtyp;
    }

    /**
     * 
     * @param arrayREPCMPGTYP
     */
    public void setarrayRepcm_Pgtyp(String[] arrayREPCMPGTYP) {
        arrayRepcm_Pgtyp = arrayREPCMPGTYP;
    }

    /**
     * 
     * @return
     */
    public String[] getarrayRepcm_Pgstl() {
        return arrayRepcm_Pgstl;
    }

    /**
     * 
     * @param arrayREPCMPGSTL
     */
    public void setarrayRepcm_Pgstl(String[] arrayREPCMPGSTL) {
        arrayRepcm_Pgstl = arrayREPCMPGSTL;
    }

    /**
     * 
     * @return
     */
    public String[] getarrayRepcm_Type() {
        return arrayRepcm_Type;
    }

    /**
     * 
     * @param arrayREPCMTYPE
     */
    public void setarrayRepcm_Type(String[] arrayREPCMTYPE) {
        arrayRepcm_Type = arrayREPCMTYPE;
    }

    /**
     * 
     * @return
     */
    public String[] getarrayRepcm_Jobid() {
        return arrayRepcm_Jobid;
    }

    /**
     * 
     * @param arrayREPCMJOBID
     */
    public void setarrayRepcm_Jobid(String[] arrayREPCMJOBID) {
        arrayRepcm_Jobid = arrayREPCMJOBID;
    }

    /**
     * 
     * @return
     */
    public String[] getarrayRepcm_Pgm() {
        return arrayRepcm_Pgm;
    }

    /**
     * 
     * @param arrayREPCMPGM
     */
    public void setarrayRepcm_Pgm(String[] arrayREPCMPGM) {
        arrayRepcm_Pgm = arrayREPCMPGM;
    }

    /**
     * 
     * @return
     */
    public String[] getarrayRepcm_Prntp() {
        return arrayRepcm_Prntp;
    }

    /**
     * 
     * @param arrayREPCMPRNTP
     */
    public void setarrayRepcm_Prntp(String[] arrayREPCMPRNTP) {
        arrayRepcm_Prntp = arrayREPCMPRNTP;
    }

    /**
     * 
     * @return
     */
    public String getSubmit() {
        return submit;
    }

    /**
     * 
     * @param submit
     */
    public void setSubmit(String submit) {
        this.submit = submit;
    }

    /**
     * 
     * @return
     */
    public ArrayList<AUTREPCM> getListAUTREPCM() {
        return listAUTREPCM;
    }

    /**
     * 
     * @param listAUTREPCM
     */
    public void setListAUTREPCM(ArrayList<AUTREPCM> listAUTREPCM) {
        this.listAUTREPCM = listAUTREPCM;
    }
    
    /**
     * 
     */
    @Override
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        try {
            request.setCharacterEncoding("utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        super.reset(mapping, request);
    }

}

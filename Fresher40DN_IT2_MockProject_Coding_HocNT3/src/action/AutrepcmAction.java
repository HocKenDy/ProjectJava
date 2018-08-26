package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import common.CONSTANT;
import form.AutrepcmForm;
import model.bean.AUTREPCM;
import model.bo.AutrepcmBO;

/**
 * AutrepcmAction.java
 * 
 * Version 1.0
 * 
 * 04-08-2018
 * 
 * Copyright: HocNT3
 * Modification
 * 
 * DATE         AUTHOR      DESCRIPTIONS
 * --------------------------------- 
 * 04-08-2018   HocNT3      Create
 */
public class AutrepcmAction extends Action {
	
	/**
	 * method handling insert, comeback and business of module
	 */
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response){
	try {
		// Define type character for form
		request.setCharacterEncoding("utf-8");
	
		// Initialization session
		HttpSession session = request.getSession();
		// Initialization aUtrepcmForm
		AutrepcmForm aUtrepcmForm = (AutrepcmForm) form;
		// Initialization aUTREPCMBo
		AutrepcmBO aUtrepcmBo = new AutrepcmBO();
		// Create boolean checkNumExists variable
		boolean checkNumExists = false;
		//Create variable constant insert, cancel 
		final String _INSERT = "登録(Ｎ)";
        final String _CANCEL ="キャンセル(K)";
		
        // Create variable listIdExists with type StringBuffer
		StringBuffer listIdExists = new StringBuffer();
		// Create variable listIdExists with type StringBuffer
		StringBuffer listIdEmpty = new StringBuffer();
		// Create variable listSuccess with type StringBuffer
		StringBuffer listSuccess = new StringBuffer();
		// Create strListIdExists variable
		String strListIdExists = null;
		// Create strListIdEmpty variable
		String strListIdEmpty = null;
		// Create strSuccess variable
		String strSuccess = null;
			
		// Get data from client to form server
		String[] arrayRepcm_Num = aUtrepcmForm.getarrayRepcm_Num();
		String[] arrayRepcm_Name = aUtrepcmForm.getarrayRepcm_Name();
		String[] arrayRepcm_Pgtyp = aUtrepcmForm.getarrayRepcm_Pgtyp();
		String[] arrayRepcm_Pgstl = aUtrepcmForm.getarrayRepcm_Pgstl();
		String[] arrayRepcm_Type = aUtrepcmForm.getarrayRepcm_Type();
		String[] arrayRepcm_Jobid = aUtrepcmForm.getarrayRepcm_Jobid();
		String[] arrayRepcm_Pgm = aUtrepcmForm.getarrayRepcm_Pgm();
		String[] arrayRepcm_Prntp = aUtrepcmForm.getarrayRepcm_Prntp();

		// Get list レポートＮＯ in database
		aUtrepcmForm.setListId(aUtrepcmBo.getListID());

		// Catch 登録(Ｎ) click event
		if (_INSERT.equalsIgnoreCase(aUtrepcmForm.getSubmit())) {
			int validAllEmpty = 0;
			// Set list REPCM_NUM
			aUtrepcmForm.setListRepcm_Num(aUtrepcmBo.getListrEpcm_NumBo());

			// Loop with length arrayRepcm_Num.length
			for (int i = 0; i < arrayRepcm_Num.length; i++) {
				// Check empty of arrayRepcm_Num field
				if (!"".equals(arrayRepcm_Num[i])) {
					// Check exists of arrayRepcm_Num in database
					checkNumExists = aUtrepcmForm.getListRepcm_Num().contains(arrayRepcm_Num[i]);

					// If arrayRepcm_Num exists in database
					if (checkNumExists) {
						listIdExists.append(i + ",");

					} else {
						listSuccess.append(i + ",");
					}
				} else {
					AUTREPCM au = new AUTREPCM(arrayRepcm_Num[i], arrayRepcm_Name[i], arrayRepcm_Pgtyp[i],
												arrayRepcm_Pgstl[i], arrayRepcm_Type[i], arrayRepcm_Jobid[i],
												arrayRepcm_Pgm[i], arrayRepcm_Prntp[i]);
					if(aUtrepcmBo.validAutrepcmEmpty(au)) {
						listIdEmpty.append(i + ",");
					}else {
						validAllEmpty++;
					}
					
				}
			}
			
			//Event if all field for form client empty
			if (validAllEmpty == 10) {
				listIdEmpty.append(CONSTANT._EMPTY);
				aUtrepcmForm.setListIdEmpty(listIdEmpty.toString());
				return mapping.findForward(CONSTANT._REGISTER);
			}
			
			// Convert variable listIdExists form type StringBuffer to variable strListIdExists type String
			strListIdExists = listIdExists.toString();
			if(strListIdExists.length()!= 0) {
			    strListIdExists = strListIdExists.substring(0, strListIdExists.length()-1);
			}
			
		     // Convert variable listIdEmpty form type StringBuffer to variable strListIdEmpty type String
			strListIdEmpty = listIdEmpty.toString();
			if(strListIdEmpty.length()!= 0) {
				strListIdEmpty = strListIdEmpty.substring(0, strListIdEmpty.length()-1);
			}
			
			//Check strListIdExists has data 
			if (strListIdExists.length() != 0 || strListIdEmpty.length() != 0) {

				aUtrepcmForm.setListIdExists(strListIdExists);
				aUtrepcmForm.setListIdEmpty(strListIdEmpty);
				// Save session of all field on form to user can re-load 
				for (int i = 0; i < arrayRepcm_Num.length; i++) {
					session.setAttribute("arrayRepcm_Num" + i + "", arrayRepcm_Num[i]);
					session.setAttribute("arrayRepcm_Name" + i + "", arrayRepcm_Name[i]);
					session.setAttribute("arrayRepcm_Pgtyp" + i + "", arrayRepcm_Pgtyp[i]);
					session.setAttribute("arrayRepcm_Pgstl" + i + "", arrayRepcm_Pgstl[i]);
					session.setAttribute("arrayRepcm_Type" + i + "", arrayRepcm_Type[i]);
					session.setAttribute("arrayRepcm_Jobid" + i + "", arrayRepcm_Jobid[i]);
					session.setAttribute("arrayRepcm_Pgm" + i + "", arrayRepcm_Pgm[i]);
					session.setAttribute("arrayRepcm_Prntp" + i + "", arrayRepcm_Prntp[i]);

				}
				// Save arrayREPCM_NUM on session
				aUtrepcmForm.setRearrayRepcm_Num0((String) session.getAttribute("arrayRepcm_Num0"));
				aUtrepcmForm.setRearrayRepcm_Num1((String) session.getAttribute("arrayRepcm_Num1"));
				aUtrepcmForm.setRearrayRepcm_Num2((String) session.getAttribute("arrayRepcm_Num2"));
				aUtrepcmForm.setRearrayRepcm_Num3((String) session.getAttribute("arrayRepcm_Num3"));
				aUtrepcmForm.setRearrayRepcm_Num4((String) session.getAttribute("arrayRepcm_Num4"));
				aUtrepcmForm.setRearrayRepcm_Num5((String) session.getAttribute("arrayRepcm_Num5"));
				aUtrepcmForm.setRearrayRepcm_Num6((String) session.getAttribute("arrayRepcm_Num6"));
				aUtrepcmForm.setRearrayRepcm_Num7((String) session.getAttribute("arrayRepcm_Num7"));
				aUtrepcmForm.setRearrayRepcm_Num8((String) session.getAttribute("arrayRepcm_Num8"));
				aUtrepcmForm.setRearrayRepcm_Num9((String) session.getAttribute("arrayRepcm_Num9"));

				// Save arrayRepcm_Name on session
				aUtrepcmForm.setRearrayRepcm_Name0((String) session.getAttribute("arrayRepcm_Name0"));
				aUtrepcmForm.setRearrayRepcm_Name1((String) session.getAttribute("arrayRepcm_Name1"));
				aUtrepcmForm.setRearrayRepcm_Name2((String) session.getAttribute("arrayRepcm_Name2"));
				aUtrepcmForm.setRearrayRepcm_Name3((String) session.getAttribute("arrayRepcm_Name3"));
				aUtrepcmForm.setRearrayRepcm_Name4((String) session.getAttribute("arrayRepcm_Name4"));
				aUtrepcmForm.setRearrayRepcm_Name5((String) session.getAttribute("arrayRepcm_Name5"));
				aUtrepcmForm.setRearrayRepcm_Name6((String) session.getAttribute("arrayRepcm_Name6"));
				aUtrepcmForm.setRearrayRepcm_Name7((String) session.getAttribute("arrayRepcm_Name7"));
				aUtrepcmForm.setRearrayRepcm_Name8((String) session.getAttribute("arrayRepcm_Name8"));
				aUtrepcmForm.setRearrayRepcm_Name9((String) session.getAttribute("arrayRepcm_Name9"));
				
				// Save arrayREPCM_PGTYP on session
				aUtrepcmForm.setRearrayRepcm_Pgtyp0((String) session.getAttribute("arrayRepcm_Pgtyp0"));
				aUtrepcmForm.setRearrayRepcm_Pgtyp1((String) session.getAttribute("arrayRepcm_Pgtyp1"));
				aUtrepcmForm.setRearrayRepcm_Pgtyp2((String) session.getAttribute("arrayRepcm_Pgtyp2"));
				aUtrepcmForm.setRearrayRepcm_Pgtyp3((String) session.getAttribute("arrayRepcm_Pgtyp3"));
				aUtrepcmForm.setRearrayRepcm_Pgtyp4((String) session.getAttribute("arrayRepcm_Pgtyp4"));
				aUtrepcmForm.setRearrayRepcm_Pgtyp5((String) session.getAttribute("arrayRepcm_Pgtyp5"));
				aUtrepcmForm.setRearrayRepcm_Pgtyp6((String) session.getAttribute("arrayRepcm_Pgtyp6"));
				aUtrepcmForm.setRearrayRepcm_Pgtyp7((String) session.getAttribute("arrayRepcm_Pgtyp7"));
				aUtrepcmForm.setRearrayRepcm_Pgtyp8((String) session.getAttribute("arrayRepcm_Pgtyp8"));
				aUtrepcmForm.setRearrayRepcm_Pgtyp9((String) session.getAttribute("arrayRepcm_Pgtyp9"));

				// Save arrayREPCM_JOBID on session
				aUtrepcmForm.setRearrayRepcm_Jobid0((String) session.getAttribute("arrayRepcm_Jobid0"));
				aUtrepcmForm.setRearrayRepcm_Jobid1((String) session.getAttribute("arrayRepcm_Jobid1"));
				aUtrepcmForm.setRearrayRepcm_Jobid2((String) session.getAttribute("arrayRepcm_Jobid2"));
				aUtrepcmForm.setRearrayRepcm_Jobid3((String) session.getAttribute("arrayRepcm_Jobid3"));
				aUtrepcmForm.setRearrayRepcm_Jobid4((String) session.getAttribute("arrayRepcm_Jobid4"));
				aUtrepcmForm.setRearrayRepcm_Jobid5((String) session.getAttribute("arrayRepcm_Jobid5"));
				aUtrepcmForm.setRearrayRepcm_Jobid6((String) session.getAttribute("arrayRepcm_Jobid6"));
				aUtrepcmForm.setRearrayRepcm_Jobid7((String) session.getAttribute("arrayRepcm_Jobid7"));
				aUtrepcmForm.setRearrayRepcm_Jobid8((String) session.getAttribute("arrayRepcm_Jobid8"));
				aUtrepcmForm.setRearrayRepcm_Jobid9((String) session.getAttribute("arrayRepcm_Jobid9"));

				// Save arrayREPCM_PGM on session
				aUtrepcmForm.setRearrayRepcm_Pgm0((String) session.getAttribute("arrayRepcm_Pgm0"));
				aUtrepcmForm.setRearrayRepcm_Pgm1((String) session.getAttribute("arrayRepcm_Pgm1"));
				aUtrepcmForm.setRearrayRepcm_Pgm2((String) session.getAttribute("arrayRepcm_Pgm2"));
				aUtrepcmForm.setRearrayRepcm_Pgm3((String) session.getAttribute("arrayRepcm_Pgm3"));
				aUtrepcmForm.setRearrayRepcm_Pgm4((String) session.getAttribute("arrayRepcm_Pgm4"));
				aUtrepcmForm.setRearrayRepcm_Pgm5((String) session.getAttribute("arrayRepcm_Pgm5"));
				aUtrepcmForm.setRearrayRepcm_Pgm6((String) session.getAttribute("arrayRepcm_Pgm6"));
				aUtrepcmForm.setRearrayRepcm_Pgm7((String) session.getAttribute("arrayRepcm_Pgm7"));
				aUtrepcmForm.setRearrayRepcm_Pgm8((String) session.getAttribute("arrayRepcm_Pgm8"));
				aUtrepcmForm.setRearrayRepcm_Pgm9((String) session.getAttribute("arrayRepcm_Pgm9"));

				// Save arrayREPCM_PRNTP on session
				aUtrepcmForm.setRearrayRepcm_Prntp0((String) session.getAttribute("arrayRepcm_Prntp0"));
				aUtrepcmForm.setRearrayRepcm_Prntp1((String) session.getAttribute("arrayRepcm_Prntp1"));
				aUtrepcmForm.setRearrayRepcm_Prntp2((String) session.getAttribute("arrayRepcm_Prntp2"));
				aUtrepcmForm.setRearrayRepcm_Prntp3((String) session.getAttribute("arrayRepcm_Prntp3"));
				aUtrepcmForm.setRearrayRepcm_Prntp4((String) session.getAttribute("arrayRepcm_Prntp4"));
				aUtrepcmForm.setRearrayRepcm_Prntp5((String) session.getAttribute("arrayRepcm_Prntp5"));
				aUtrepcmForm.setRearrayRepcm_Prntp6((String) session.getAttribute("arrayRepcm_Prntp6"));
				aUtrepcmForm.setRearrayRepcm_Prntp7((String) session.getAttribute("arrayRepcm_Prntp7"));
				aUtrepcmForm.setRearrayRepcm_Prntp8((String) session.getAttribute("arrayRepcm_Prntp8"));
				aUtrepcmForm.setRearrayRepcm_Prntp9((String) session.getAttribute("arrayRepcm_Prntp9"));

				// Save arrayREPCM_PGSTL on session
				aUtrepcmForm.setRearrayRepcm_Pgstl0((String) session.getAttribute("arrayRepcm_Pgstl0"));
				aUtrepcmForm.setRearrayRepcm_Pgstl1((String) session.getAttribute("arrayRepcm_Pgstl1"));
				aUtrepcmForm.setRearrayRepcm_Pgstl2((String) session.getAttribute("arrayRepcm_Pgstl2"));
				aUtrepcmForm.setRearrayRepcm_Pgstl3((String) session.getAttribute("arrayRepcm_Pgstl3"));
				aUtrepcmForm.setRearrayRepcm_Pgstl4((String) session.getAttribute("arrayRepcm_Pgstl4"));
				aUtrepcmForm.setRearrayRepcm_Pgstl5((String) session.getAttribute("arrayRepcm_Pgstl5"));
				aUtrepcmForm.setRearrayRepcm_Pgstl6((String) session.getAttribute("arrayRepcm_Pgstl6"));
				aUtrepcmForm.setRearrayRepcm_Pgstl7((String) session.getAttribute("arrayRepcm_Pgstl7"));
				aUtrepcmForm.setRearrayRepcm_Pgstl8((String) session.getAttribute("arrayRepcm_Pgstl8"));
				aUtrepcmForm.setRearrayRepcm_Pgstl9((String) session.getAttribute("arrayRepcm_Pgstl9"));

				// Save arrayREPCM_TYPE on session
				aUtrepcmForm.setRearrayRepcm_Type0((String) session.getAttribute("arrayRepcm_Type0"));
				aUtrepcmForm.setRearrayRepcm_Type1((String) session.getAttribute("arrayRepcm_Type1"));
				aUtrepcmForm.setRearrayRepcm_Type2((String) session.getAttribute("arrayRepcm_Type2"));
				aUtrepcmForm.setRearrayRepcm_Type3((String) session.getAttribute("arrayRepcm_Type3"));
				aUtrepcmForm.setRearrayRepcm_Type4((String) session.getAttribute("arrayRepcm_Type4"));
				aUtrepcmForm.setRearrayRepcm_Type5((String) session.getAttribute("arrayRepcm_Type5"));
				aUtrepcmForm.setRearrayRepcm_Type6((String) session.getAttribute("arrayRepcm_Type6"));
				aUtrepcmForm.setRearrayRepcm_Type7((String) session.getAttribute("arrayRepcm_Type7"));
				aUtrepcmForm.setRearrayRepcm_Type8((String) session.getAttribute("arrayRepcm_Type8"));
				aUtrepcmForm.setRearrayRepcm_Type9((String) session.getAttribute("arrayRepcm_Type9"));

				return mapping.findForward(CONSTANT._REGISTER);
			}
			// Convert variable listSuccess form type StringBuffer to variable strSuccess type String
			strSuccess = listSuccess.toString();
			
			if(strSuccess.length()!=0) {
				strSuccess = strSuccess.substring(0, strSuccess.length()-1);	
			}
			 //Check strSuccess has data 
			if(strSuccess.length() != 0) {
				for (int i = 0; i < arrayRepcm_Num.length; ++i) {
					// Check arrayRepcm_Num[i] has empty 
					if (!"".equals(arrayRepcm_Num[i])) {
						//  Add a valid AUTREPCM object to the database
						aUtrepcmBo.insertAutrepcm(arrayRepcm_Num[i], arrayRepcm_Name[i], arrayRepcm_Jobid[i],
								arrayRepcm_Pgm[i], arrayRepcm_Type[i], arrayRepcm_Pgtyp[i], arrayRepcm_Pgstl[i],
								arrayRepcm_Prntp[i]);
					}
				}
				return mapping.findForward(CONSTANT._SUCCESS);
			}
			return mapping.findForward(CONSTANT._REGISTER);
			
		}  else if (_CANCEL.equalsIgnoreCase(aUtrepcmForm.getSubmit())) {
			return mapping.findForward(CONSTANT._COMEBACK);
		} else {
			return mapping.findForward(CONSTANT._REGISTER);

		}
	}catch (Exception e) {
        return mapping.findForward(CONSTANT._ERRORPAGE);
    }
	
	}
}

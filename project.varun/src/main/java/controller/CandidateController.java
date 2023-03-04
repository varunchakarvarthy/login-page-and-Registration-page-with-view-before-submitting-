package controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import dao.Dao;
import dto.Candidatedetails;

@MultipartConfig
@WebServlet("/abc")
public class CandidateController extends HttpServlet{

	
		@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
			String S3=req.getParameter("fullname");
			String S4=req.getParameter("dateofbirth");
			String S5=req.getParameter("email");
			String S6=req.getParameter("mobilenumber");
			String S7=req.getParameter("gender");
			String S8=req.getParameter("fathername");
			String S9=req.getParameter("placeofbirth");
			String S10=req.getParameter("nationality");
			String S11=req.getParameter("bloodgroup");
			String S12=req.getParameter("passportnumber");
			String S13=req.getParameter("aadharnumber");
			String S14=req.getParameter("pancardnumbar");
			String S15=req.getParameter("housename");
			String S16=req.getParameter("street");
			String S17=req.getParameter("area");
			String S18=req.getParameter("city");
			String S19=req.getParameter("state");
			String S20=req.getParameter("pincode");
			String S21=req.getParameter("qualification1");
			String S22=req.getParameter("percentage1");
			
			Part p1 =req.getPart("marksheet1");
			String filename1=p1.getSubmittedFileName();
			String path1=getServletContext().getRealPath("")+"files";
			System.out.println(path1);
			File file1=new File(path1);
			p1.write(path1+file1.separator+filename1);
			
			
			String S24=req.getParameter("qualification2");
			String S25=req.getParameter("percentage2");
			
			Part p2 =req.getPart("marksheet2");
			String filename2=p2.getSubmittedFileName();
			String path2=getServletContext().getRealPath("")+"files";
			File file2=new File(path2);
			p2.write(path1+file2.separator+filename2);
		
			
			
			Candidatedetails c1=new Candidatedetails();
			c1.setFullname(S3);
			c1.setDateofbirth(S4);
			c1.setEmail(S5);
			c1.setMobilenumber(S6);
			c1.setGender(S7);
			c1.setFathername(S8);
			c1.setPlaceofbirth(S9);
			c1.setNationality(S10);
			c1.setBloodgroup(S11);
			c1.setPassportnumber(S12);
			c1.setAadharnumber(S13);
			c1.setPancardnumbar(S14);
			c1.setHousename(S15);
			c1.setStreet(S16);
			c1.setArea(S17);
			c1.setCity(S18);
			c1.setState(S19);
			c1.setPincode(S20);
			c1.setQualification1(S21);
			c1.setPercentage1(S22);
			c1.setMarksheet1(filename1);
			c1.setQualification2(S24);
			c1.setPercentage2(S25);
			c1.setMarksheet2(filename2);
			
			Dao D1=new Dao();
			D1.create(c1);
			
			RequestDispatcher dispatcher=req.getRequestDispatcher("comlogout.html");
			dispatcher.forward(req, resp);
	}
		
	}



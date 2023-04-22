package com.maxx;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 * Servlet implementation class ImageUpload
 */
@WebServlet("/ImageUpload")
public class ImageUpload extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletFileUpload upload = new ServletFileUpload(new DiskFileItemFactory());
		
		try {
			List<FileItem> images = upload.parseRequest(request);
			String name;
			for(FileItem image : images)
			{
				name=image.getName();
				try {  //for mac and linux
				name=name.substring(name.lastIndexOf("\\")+1);
				}
				catch (Exception e) {
					// TODO: handle exception
				}
				
				image.write(new File("c:/Include/Images/"+name));
				System.out.println(name);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}

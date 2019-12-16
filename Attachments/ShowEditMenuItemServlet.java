package com.cognizant.truyum.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.truyum.dao.MenuItemDao;
import com.cognizant.truyum.dao.MenuItemDaoCollectionImpl;
import com.cognizant.truyum.model.MenuItem;


@WebServlet("/ShowEditMenuItem")
public class ShowEditMenuItemServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String stringId= request.getParameter("menuItemId");
		Long id=new Long(stringId);
		MenuItem menuItem = null;
		try {
			MenuItemDao menuItemDao=new MenuItemDaoCollectionImpl();
			menuItem=menuItemDao.getMenuItem(id);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher rd=request.getRequestDispatcher("edit-menu-item.jsp");  
		request.setAttribute("menuItem",menuItem);
		rd.forward(request, response);   
	}

}

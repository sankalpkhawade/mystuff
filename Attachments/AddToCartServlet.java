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

import com.cognizant.truyum.dao.CartDao;
import com.cognizant.truyum.dao.CartDaoCollectionImpl;
import com.cognizant.truyum.dao.MenuItemDao;
import com.cognizant.truyum.dao.MenuItemDaoCollectionImpl;
import com.cognizant.truyum.model.MenuItem;

@WebServlet("/AddtoCart")
public class AddToCartServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String stringid=request.getParameter("menuItemId");
		ArrayList<MenuItem> menuItemList=null;
		Long menuItemId =new Long(stringid);
		long userId=1l;
		CartDao cartDao=null;
		MenuItemDao menuItemDao=null;
		try {
			cartDao= new CartDaoCollectionImpl();
			cartDao.addCartItem(userId, menuItemId);
			menuItemDao=new MenuItemDaoCollectionImpl();
			menuItemList=(ArrayList<MenuItem>) menuItemDao.getMenuItemListCustomer();
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher rd=request.getRequestDispatcher("menu-item-list-customer.jsp");  
		request.setAttribute("addCartStatus", true);
		request.setAttribute("menuItemList", menuItemList);
		rd.forward(request, response);
	}

}

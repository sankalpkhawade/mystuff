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
import com.cognizant.truyum.dao.CartEmptyException;
import com.cognizant.truyum.model.Cart;
import com.cognizant.truyum.model.MenuItem;


@WebServlet("/ShowCart")
public class ShowCartServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		long userId=1l;
		Cart cart=null;
		ArrayList<MenuItem> menuItemList=null;
		CartDao cartDao=null;
		
		try {
			cartDao=new CartDaoCollectionImpl();
			cart=cartDao.getAllCartItems(userId);
			if(cart==null){
				throw new CartEmptyException();
			}
			request.setAttribute("cart", cart);
			RequestDispatcher rd=request.getRequestDispatcher("cart.jsp");
			rd.forward(request, response);
			//cart=cartDao.getAllCartItems(userId);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		} catch (CartEmptyException e) {
			
			RequestDispatcher rd=request.getRequestDispatcher("cart-empty.jsp");
			rd.forward(request, response);
		}
	}

}

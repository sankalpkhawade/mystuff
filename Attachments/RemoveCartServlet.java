package com.cognizant.truyum.servlet;

import java.io.IOException;
import java.text.ParseException;

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

@WebServlet("/RemoveCart")
public class RemoveCartServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String stringid=request.getParameter("menuItemId");
		Long menuItemId=new Long(stringid);
		CartDao cartDao=null;
		long userId=1l;
		Cart cart=null;
		try {
			cartDao=new CartDaoCollectionImpl();
			cartDao.removeCartItem(userId, menuItemId);
			request.setAttribute("removeCartItemStatus", true);
			cart=cartDao.getAllCartItems(userId);
			if(cart==null){
				throw new CartEmptyException();
			}else{
				cart=cartDao.getAllCartItems(userId);
				request.setAttribute("cart", cart);
				RequestDispatcher rd=request.getRequestDispatcher("cart.jsp");
				rd.forward(request, response);
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CartEmptyException e) {
			RequestDispatcher rd=request.getRequestDispatcher("cart-empty.jsp");
			rd.forward(request, response);
		}
	}

}

package com.cognizant.movieCruiser.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.movieCruiser.dao.MovieListDao;
import com.cognizant.movieCruiser.dao.MovieListDaoCollectionImpl;
import com.cognizant.movieCruiser.model.MovieList;
import com.cognizant.movieCruiser.util.DateUtil;


@WebServlet("/EditMovieItem")
public class EditMovieItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String title=request.getParameter("title");
			long boxOffice=Long.parseLong(request.getParameter("boxOffice"));
			Date dateOfLaunch=null;
			try {
				dateOfLaunch=DateUtil.convertToDate(request.getParameter("dateOfLaunch"));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			boolean active=Boolean.parseBoolean(request.getParameter("active"));		
			String genre=request.getParameter("genre");
			boolean hasTeaser=request.getParameter("hasTeaser") !=null;
			long id=Long.parseLong(request.getParameter("id"));
			MovieList movieItem=new MovieList(id,title,boxOffice,active,dateOfLaunch,genre,hasTeaser);
			MovieListDao movieListDao=null;
			try {
				movieListDao=new MovieListDaoCollectionImpl();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			movieListDao.modifyMovieItem(movieItem);
			request.setAttribute("EditMovieStatus", true);
			RequestDispatcher rd=request.getRequestDispatcher("edit-movie-status.jsp");  
			rd.forward(request, response);
		}


}

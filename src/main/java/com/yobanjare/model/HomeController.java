package com.yobanjare.model;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.yobanjare.model.db.JdbcDao;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController 
{
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	private JdbcDao myDao;
	
	@Autowired
	public void setMyDao(JdbcDao myDao)
	{
		this.myDao = myDao;
	}

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(@RequestParam(value="emailid", required=false) String emailid,@RequestParam(value="password", required=false) String password,Locale locale, Model model) 
		//public String home(Model model)
	{
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("emailid",emailid);
		model.addAttribute("password",password);
		
		if(myDao.setBookData())
		{
			model.addAttribute("result","true");			
		}
		else
		{
			model.addAttribute("result","false");				
		}
		
		
		return "landingpage";
	}
	
	@RequestMapping(value = "/dashboard", method = RequestMethod.GET)
	
		public String dashboard(Model model) {
		
		return "dashboard";
	}
	
	
	@RequestMapping(value = "/traveller", method = RequestMethod.GET)
	
	public String traveller(Model model) {
	
	return "traveller";
	
	}
	
	@RequestMapping(value = "/trip", method = RequestMethod.GET)
	
		public String trip(Model model) {
	
		return "trip";
	}
	
	@RequestMapping(value = "/ajaxTest1", method = RequestMethod.GET)
	
		public String ajaxTest1(Model model) {
		
		return "ajaxTest1";
	}
	
	@RequestMapping(value = "/tbs", method = RequestMethod.GET)

	public String tbs(Model model) {

		return "testFb";
	}


}

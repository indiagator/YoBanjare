package com.yobanjare.model.db;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
//import org.springframework.jdbc.datasource.*;

//import javax.sql.DataSource;

public class JdbcDao extends JdbcDaoSupport
{
			
	
	
	public boolean setBookData()
	{
		
		this.getJdbcTemplate().execute("insert into book values( \"04\",\"YoBanjare\",\"Prateek\") ");
		
		return true;
	}

}

package com.demo.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component("foodGroupDAO")
public class FoodGroupDAO {
	
	private JdbcTemplate myJDBCTemplate;

	
	public JdbcTemplate getMyJDBCTemplate() {
		return myJDBCTemplate;
	}


	@Autowired
	public void setMyJDBCTemplate(DataSource ds) {
		this.myJDBCTemplate = new JdbcTemplate(ds);
	}


	public List<FoodGroup> getFoodGroups(){
		
		return myJDBCTemplate.query("select * from foodgroups", new RowMapper <FoodGroup>(){

			public FoodGroup mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				FoodGroup fg = new FoodGroup();
				fg.setId(rs.getInt("id"));
				fg.setName(rs.getString("name"));
				fg.setDescription(rs.getString("description"));
				return fg;
			}
			
		});
	}

}

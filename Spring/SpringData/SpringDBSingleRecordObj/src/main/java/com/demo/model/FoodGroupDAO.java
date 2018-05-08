package com.demo.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.MappingSqlQueryWithParameters;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("foodGroupDAO")
public class FoodGroupDAO {
	
	private NamedParameterJdbcTemplate myJDBCTemplate;

	
	public NamedParameterJdbcTemplate getMyJDBCTemplate() {
		return myJDBCTemplate;
	}


	@Autowired
	public void setMyJDBCTemplate(DataSource ds) {
		this.myJDBCTemplate = new NamedParameterJdbcTemplate(ds);
	}


	public List<FoodGroup> getFoodGroups(){
		
		MapSqlParameterSource myMap = new MapSqlParameterSource();
		myMap.addValue("groupName", "Meat");
		return myJDBCTemplate.query("select * from foodgroups where name=:groupName",myMap, new RowMapper <FoodGroup>(){

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
	
	public FoodGroup getFoodGroups(int id){
		MapSqlParameterSource myMap = new MapSqlParameterSource();
		myMap.addValue("id", id);
		
		return myJDBCTemplate.queryForObject("select * from foodgroups where id=:id", myMap, new RowMapper<FoodGroup>(){
		

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

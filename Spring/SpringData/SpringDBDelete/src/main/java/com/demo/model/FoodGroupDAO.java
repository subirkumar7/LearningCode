package com.demo.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
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
	
	public Boolean addFoodGroup(String name, String description) {
		Boolean flag = false;
		
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("name", name);
		params.addValue("description", description);
		
		int result_count = myJDBCTemplate.update("insert into foodgroups(name, description) values(:name, :description)", params);
		
		if(result_count==1) {
			System.out.println("Insert successful");
			flag=true;
		} else {
			System.out.println("Error occured");
		}
		return flag;
	}
	
	public Boolean createFoodGroup(FoodGroup fg) {
		Boolean flag = false;

		BeanPropertySqlParameterSource params =new BeanPropertySqlParameterSource(fg);
	
		int result_count = myJDBCTemplate.update("insert into foodgroups(name, description) values(:name, :description)", params);
	
		if(result_count==1) {
			System.out.println("Insert successful");
			flag=true;
		} else {
			System.out.println("Error occured");
		}
		return flag;
	
	}

	public Boolean updateFoodGroup(FoodGroup fg) {
		Boolean flag = false;
		BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(fg);
		
		int result_count = myJDBCTemplate.update("update foodgroups set name=:name, description=:description where id = :id ", params);
		
		if(result_count==1) {
			System.out.println("Update successful");
			flag=true;
		} else {
			System.out.println("Error occured");
		}
		
		return flag;
	}
	
	public Boolean deleteFoodGroups(int id){
		Boolean flag = false;
		
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("id", id);

		int numOfRowsAffected = myJDBCTemplate.update("delete from foodgroups where id= :id ", params);
		

		if(numOfRowsAffected==1) {
			System.out.println("Delete successful");
			flag=true;
		} else {
			System.out.println("Error occured");
		}
		
		return flag;
	}
}

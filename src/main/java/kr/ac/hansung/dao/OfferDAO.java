package kr.ac.hansung.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import kr.ac.hansung.model.Credit_year_semester;
import kr.ac.hansung.model.Offer;

@Repository
public class OfferDAO{
	
	private JdbcTemplate jdbcTemplateObject;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	
	public int getRowCount(){
		
		String sqlStatement = "select count(*) from subject";
		return jdbcTemplateObject.queryForObject(sqlStatement, Integer.class);
		
	}
	
	public Offer name_getOffer(String name){
		String sqlStatement = "select * from subject where name=?";
		
		return jdbcTemplateObject.queryForObject(sqlStatement, new Object[] {name} ,new OfferMapper());
	}
	
	public List<Offer> year_semester_getOffer(int year,int semester){
		String sqlStatement = "select * from subject where year=? AND semester=?";
		
		return jdbcTemplateObject.query(sqlStatement, new Object[] {year,semester} ,new OfferMapper());
	}
	
	public Offer division_getOffer(String division){
		String sqlStatement = "select * from subject where division=?";
		
		return jdbcTemplateObject.queryForObject(sqlStatement, new Object[] {division} ,new OfferMapper());
	}
		
	
	public List<Offer> getOffers(){
		String sqlStatement = "select * from subject";
		
		return jdbcTemplateObject.query(sqlStatement, new OfferMapper());
	}
	
	public boolean insert(Offer offer){
		
		String name = offer.getName();
		String code = offer.getCode();
		int credit = offer.getCredit();
		String division = offer.getDivision();
		int semester = offer.getSemester();
		int year = offer.getYear();
		
		String sqlStatement = "insert into subject (year, semester, code, name, division, credit) values (?,?,?,?,?,?)";
		return (jdbcTemplateObject.update(sqlStatement, new Object[]{year, semester, code, name, division, credit}) ==1);	
	}
	
	public boolean update(Offer offer){
		
		String name = offer.getName();
		String code = offer.getCode();
		int credit = offer.getCredit();
		String division = offer.getDivision();
		int semester = offer.getSemester();
		int year = offer.getYear();
		
		String sqlStatement = "update subject set year=?, semester=?, code=?, name=?, division=?, credit=?";
		return (jdbcTemplateObject.update(sqlStatement, new Object[]{year, semester, code, name, division, credit}) ==1);		
	}
	
} 

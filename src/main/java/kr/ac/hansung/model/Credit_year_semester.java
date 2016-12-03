package kr.ac.hansung.model;

import java.util.List;

public class Credit_year_semester {
	int year;
	int semester;
	int credit_sum;
	List<Offer> subjects;
	
	public Credit_year_semester() {
		
	}
	
	public Credit_year_semester(int year, int semester, int credit_sum, List<Offer> subjects) {
		this.year = year;
		this.semester = semester;
		this.credit_sum = credit_sum;
		this.subjects = subjects;
	}

	public List<Offer> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Offer> subjects) {
		this.subjects = subjects;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public int getCreditSum() {
		return credit_sum;
	}

	public void setCreditSum(int credit_sum) {
		this.credit_sum = credit_sum;
	}

	@Override
	public String toString() {
		return "년도=" + year + ", 학기=" + semester + ", 이수 학점=" + credit_sum;
	}
	
}

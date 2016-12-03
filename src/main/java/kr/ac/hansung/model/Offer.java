package kr.ac.hansung.model;

public class Offer {
	
	int year;
	int semester;
	String code;
	String name;
	String division;
	int credit;
	
	public Offer() {
		
	}
	
	public Offer(int year, int semester, String code, String name, String division, int credit) {
		this.year = year;
		this.semester = semester;
		this.code = code;
		this.name = name;
		this.division = division;
		this.credit = credit;
	}
	
	
	
	@Override
	public String toString() {
		return "년도=" + year + "| 학기=" + semester + "| 과목코드=" + code + "| 교과목명=" + name + "| 구분="
				+ division + "| 학점=" + credit;
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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

}

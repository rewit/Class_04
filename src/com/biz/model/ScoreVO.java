package com.biz.model;

public class ScoreVO {
	
	private String number;
	private String name;
	private int Kor;
	private int Eng;
	private int Math;
	
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return Kor;
	}
	public void setKor(int Kor) {
		this.Kor = Kor;
	}
	public int getEng() {
		return Eng;
	}
	public void setEng(int Eng) {
		this.Eng = Eng;
	}
	public int getMath() {
		return Math;
	}
	public void setMath(int Math) {
		this.Math = Math;
	}
	@Override
	public String toString() {
		return "ScoreVO [number=" + number + ", name=" + name + ", Kor=" + Kor + ", Eng=" + Eng + ", Math=" + Math
				+ "]";
	}
	
	

}

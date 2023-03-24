package com.example.demo.project;

public class Movie {
	private int index;
	private int year;
   private String moviename;
	public Movie(int index, String moviename, int year) {
		this.index=index;
		this.moviename=moviename;
		this.year=year;
	}
	public int getIndex() {
		return index;
	}
	public int getYear() {
		return year;
	}
	public String getMoviename() {
		return moviename;
	}
	@Override
	public String toString() {
		return "Movie [index=" + index + ", year=" + year + ", moviename=" + moviename + "]";
	}
	

}

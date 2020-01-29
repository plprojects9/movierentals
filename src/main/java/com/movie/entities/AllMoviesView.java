package com.movie.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "all_movies_view")
public class AllMoviesView {
	
	
	private String fname;
	private String lname;
	@Id
	private int movieid;
	@Column(name = "rented_movie_title")
	private String rentedmoviename;
	
	public int getMovieid() {
		return movieid;
	}
	public void setCustid(int movieid) {
		this.movieid = movieid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public String getRentedmoviename() {
		return rentedmoviename;
	}
	public void setRentedmoviename(String rentedmoviename) {
		this.rentedmoviename = rentedmoviename;
	}
	@Override
	public String toString() {
		return "AllMoviesView [fname=" + fname + ", lname=" + lname + ", movieid=" + movieid + ", rentedmoviename="
				+ rentedmoviename + "]";
	}
	
		
}

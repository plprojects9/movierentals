package com.movie.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "rented_movies_view")
public class RentedMoviesView {
	
	@Id
	private int custid;
	private String fname;
	private String lname;
	@Column(name = "rented_movie_title")
	private String rentedmoviename;
	
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
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
		return "RentedMoviesView [custid=" + custid + ", fname=" + fname + ", lname=" + lname + ", movietitle="
				+ rentedmoviename + "]";
	}
		
}

package com.redhat.example;

import java.io.Serializable;



public class Seats implements Serializable{

	private static final long serialVersionUID = 1L;

	  private int row;
	  private Boolean a;
	  private Boolean b;
	  private Boolean c;
	  private Boolean d;
	  private Boolean e;
	
	 public Seats (int g, Boolean h, Boolean i, Boolean j, Boolean k, Boolean l){
		  row = g;
		  a = h;
		  b = i;
		  c = j;
		  d = k;
		  e = l;
	  }
	public Seats(){
		
	}
	
	public void init(int r){
		row = r;
	    a=false;
	    b=false;
	    c=false;
	    d=false;
	    e=false;
	  }
	  void output( int num ){
		    System.out.printf("%4d %8s %8s %8s %8s %8s\n",num+1,a,b,c,d,e);
	  }
	 
	  // Getter Setter
	  public Boolean getA(){
		  return a;
	  }
	  public Boolean getB(){
		  return b;
	  }
	  public Boolean getC(){
		  return c;
	  }
	  public Boolean getD(){
		  return d;
	  }
	  public Boolean getE(){
		  return e;
	  }
	  public void setA( Boolean param){
		  a = param;
	  }
	  public void setB( Boolean param){
		  b = param;
	  }
	  public void setC( Boolean param){
		  c = param;
	  }
	  public void setD( Boolean param){
		  d = param;
	  }
	  public void setE( Boolean param){
		  e = param;
	  }
	  public Integer getRow() {
		  return row;
	  }
	  public void setRow(Integer row) {
		  this.row = row;
	  }
}  
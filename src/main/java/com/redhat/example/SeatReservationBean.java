package com.redhat.example;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import javax.enterprise.context.SessionScoped;


import javax.inject.Named;

@SessionScoped
@Named
public class SeatReservationBean implements Serializable {
	private static final long serialVersionUID = 1L;

	private  List<Seats> list = new ArrayList<Seats>();
	
	//座席の列数を指定
    int count=6;
    int i;
   
    
	@PostConstruct
	void init() {
		try {
			System.out.println("### Init ###");
			// 座席予約保存用の配列を初期化
		    for (i=0; i<count; i++){
		    	Seats se = new Seats();
		    	se.init(i);
		    	list.add(se);
		    }
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public void toggleStatus(Integer r, String p) { 
	    if (p.equals("a")){
	        list.get(r).setA(!list.get(r).getA());  }
	    else if ( p.equals("b") ){
	    	list.get(r).setB(!list.get(r).getB());  }
	    else if ( p.equals("c") ){
	    	list.get(r).setC(!list.get(r).getC());  }
	    else if ( p.equals("d") ){
	    	list.get(r).setD(!list.get(r).getD());  }
	    else if ( p.equals("e") ){
	    	list.get(r).setE(!list.get(r).getE());  }
	}

	public void dataClear() { 
	    for (i=0; i<list.size(); i++){
	    	list.get(i).init(i);
	    }
	}	
	
	public void reLoad() { 
	
	}	
	
	public List<Seats> getSeats() { 
		return list; 
	}	
   
   @PreDestroy
   public void remove() {
	   list.clear();
   }
}
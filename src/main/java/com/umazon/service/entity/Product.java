package com.umazon.service.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "products")//you can only write "@Table" and JPA will create the table with the class name
public class Product {

    @Id
    @GeneratedValue//This is for generate the id automatically by jpa
    private int id;

    @Column(name = "productname")//adding this above every attribute will rename the column name
    private String pname;

    @Column(name = "productgroup")
    private String pgroup;

    private int Prodid;

    public int getId() {
        return id;
    }

   
	public void setId(int id) {
        this.id = id;
    }

    public String pname() {
        return pname;
    }
    public String getPname() {
		return pname;
	}

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPgroup() {
        return pgroup;
    }

    public void setPgroup(String pgroup) {
        this.pgroup = pgroup;
    }

    public void setProdid(int prodid) {
        this.Prodid = prodid;
    }

    public int getProdid() {
        return Prodid;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", pname='" + pname + '\'' +
                ", pgroup='" + pgroup + '\'' +
                ", prodid=" + Prodid +
                '}';
    }
}
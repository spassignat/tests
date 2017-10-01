/*
 * Copyright 2006 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

/*
 * @(#)CreditCard.java	1.5 06/02/11
 */

package com.sun.ts.tests.ejb30.persistence.query.language.schema30;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToOne;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;


/*
 * CreditCard
 */

@Entity
@Table(name="CREDITCARD_TABLE")
public class CreditCard implements java.io.Serializable {

    // Instance variables
    private String id;
    private String number;
    private String type;
    private String expires;
    private boolean approved;
    private double balance;
    private Order order;
    private Customer customer;

    public CreditCard()
    {
    }

    public CreditCard(String v1, String v2, String v3, String v4, 
		boolean v5, double v6, Order v7, Customer v8)
    {
	id = v1;
	number = v2;
	type = v3;
	expires = v4;
	approved = v5;
	balance = v6;
	order = v7;
	customer = v8;
    }

    public CreditCard(String v1, String v2, String v3, String v4,
		boolean v5, double v6)
    {
	id = v1;
	number = v2;
	type = v3;
	expires = v4;
	approved = v5;
	balance = v6;
    }

    // ===========================================================
    // getters and setters for state fields


    @Id
    @Column(name="ID")
    public String getId()
    {
	return id;
    }
    public void setId(String v)
    {
	id = v;
    }

    @Column(name="CREDITCARD_NUMBER")
    public String getNumber()
    {
	return number;
    }
    public void setNumber(String v)
    {
	number = v;
    }

    @Column(name="TYPE")
    public String getType()
    {
	return type;
    }
    public void setType(String v)
    {
	type = v;
    }

    @Column(name="EXPIRES")
    public String getExpires()
    {
	return expires;
    }
    public void setExpires(String v)
    {
	expires = v;
    }

    @Column(name="APPROVED")
    public boolean getApproved()
    {
	return approved;
    }
    public void setApproved(boolean v)
    {
	approved = v;
    }

    @Column(name="BALANCE")
    public double getBalance()
    {
	return balance;
    }
    public void setBalance(double v)
    {
	balance = v;
    }


    // ===========================================================
    // getters and setters for association fields

    @OneToOne
    @JoinColumn(
        name="FK_FOR_ORDER_TABLE")
    public Order getOrder()
    {
	return order;
    }
    public void setOrder(Order v)
    {
	order = v;
    }

    @ManyToOne
    @JoinColumn
	(name="FK3_FOR_CUSTOMER_TABLE")
    public Customer getCustomer()
    {
	return customer;
    }
    public void setCustomer(Customer v)
    {
	customer = v;
    }
}

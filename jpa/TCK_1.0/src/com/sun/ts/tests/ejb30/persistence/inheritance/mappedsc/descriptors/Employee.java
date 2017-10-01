/*
 * Copyright 2006 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
 
/*
 * @(#)Employee.java	1.1 06/02/21
 */

package com.sun.ts.tests.ejb30.persistence.inheritance.mappedsc.descriptors;

import java.sql.Date;

/*
 * Employee as mapped superclass, which can be concrete or abstract.
 * Mapping may be overriden by subclass entities with annotation or descriptor.
 */

public abstract class Employee extends AbstractPersonnel {

    private  int	     id;
    private  String	     firstName;
    private  String	     lastName;
    private  Date	     hireDate;

   /** the project this Employee leads */
    protected Project project;
 
   /** the department this Employee belongs to */
    protected Department department;

    protected Employee() {}
    
    protected Employee(int id, String firstName, String lastName, Date hireDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hireDate = (Date) hireDate.clone();
    }
    
   // ===========================================================
   // getters and setters for the state fields

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getHireDate() {
        return hireDate;
    }
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }

    public Project getProject() {
        return project;
    }
    public void setProject(Project project) {
        this.project = project;
    }

}


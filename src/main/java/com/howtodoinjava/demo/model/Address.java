package com.howtodoinjava.demo.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.models.auth.In;

import javax.persistence.*;

@Entity
public class Address {

    @Id
    private Integer id;

    @Column
    private String name;

    @Column
    private String column1;

    @Column
    private String column2;

    @Column
    private String landMark;

    @Column
    private Integer pinCode;

    @ManyToOne
    @JsonIgnore
    private EmployeeEntity employee;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColumn1() {
        return column1;
    }

    public void setColumn1(String column1) {
        this.column1 = column1;
    }

    public String getColumn2() {
        return column2;
    }

    public void setColumn2(String column2) {
        this.column2 = column2;
    }

    public String getLandMark() {
        return landMark;
    }

    public void setLandMark(String landMark) {
        this.landMark = landMark;
    }

    public Integer getPinCode() {
        return pinCode;
    }

    public void setPinCode(Integer pinCode) {
        this.pinCode = pinCode;
    }

    public EmployeeEntity getEmployee() {
        return employee;
    }

    @JsonIgnore
    public void setEmployee(EmployeeEntity employee) {
        this.employee = employee;
    }
}

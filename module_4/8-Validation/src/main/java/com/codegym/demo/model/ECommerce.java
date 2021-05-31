package com.codegym.demo.model;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class ECommerce {
    @Id
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank(message = "Bắt buộc phải nhập nhé bạn!")
    @Size(min = 5,max = 10)
    private String name;
    @NotBlank(message = "Bắt buộc phải nhập nhé bạn!")
    private String amountPeople;
    @OneToMany(mappedBy = "eCommerce",cascade = CascadeType.ALL)
    private List<Blog> blog;


    //    @OneToMany(mappedBy = "blog")
//    List<Blog> blogs;
    public ECommerce() {
    }

    public ECommerce(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAmountPeople() {
        return amountPeople;
    }

    public void setAmountPeople(String amountPeople) {
        this.amountPeople = amountPeople;
    }

    public List<Blog> getBlog() {
        return blog;
    }

    public void setBlog(List<Blog> blog) {
        this.blog = blog;
    }

}

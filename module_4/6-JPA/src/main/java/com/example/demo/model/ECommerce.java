package com.example.demo.model;


import javax.persistence.*;
import java.util.List;

@Entity
public class ECommerce {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToMany(mappedBy = "eCommerce")
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
    public List<Blog> getBlog() {
        return blog;
    }

    public void setBlog(List<Blog> blog) {
        this.blog = blog;
    }

}

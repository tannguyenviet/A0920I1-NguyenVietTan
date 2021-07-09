package com.codegym.demo.model;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;
import java.sql.Date;

@Entity
public class Blog implements Validator {
    private static final String BIRTHDAY_REGEX="([12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01]))";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
//    @NotBlank(message = "type can not be blank")
    private String type;
//    @NotBlank(message = "author can not be blank")
    private String author;
//    @NotBlank(message = "description can not be blank")

    private String description;
//    @NotNull(message = "Not null")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date timeRelease;
    @ManyToOne(targetEntity = ECommerce.class)
    private  ECommerce eCommerce;
    public Blog(int id, String type, String author, String description) {
        this.id = id;
        this.type = type;
        this.author = author;
        this.description = description;
    }

    public Blog() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getTimeRelease() {
        return timeRelease;
    }

    public void setTimeRelease(Date timeRelease) {
        this.timeRelease = timeRelease;
    }

    public ECommerce geteCommerce() {
        return eCommerce;
    }

    public void seteCommerce(ECommerce eCommerce) {
        this.eCommerce = eCommerce;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return Blog.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Blog blog = (Blog) target;
        String description = blog.getDescription();
        Date birthday = blog.getTimeRelease();
        System.out.println("Vô validate ");
        ValidationUtils.rejectIfEmpty(errors, "description", "description.empty");
        if (description.length()<5){
            System.out.println("Vô đây");
            errors.rejectValue("description", "description.length");
        }
        if(!blog.getAuthor().matches("^([A-Z][a-z]* )+([A-Z][a-z]*)")){
            errors.rejectValue("author","author.form");
        }
//        System.out.println("day"+birthday.toString());
        if(birthday==null){
            errors.rejectValue("timeRelease","timerelease.form");
        }
        else{
            if(!birthday.toString().matches(BIRTHDAY_REGEX)){
                errors.rejectValue("timeRelease","timerelease.form");
            }
            System.out.println("birthday" +birthday.toString());

        }

    }
}

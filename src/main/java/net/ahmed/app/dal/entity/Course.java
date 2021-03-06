package net.ahmed.app.dal.entity;
// Generated Jul 16, 2020 12:45:46 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Course generated by hbm2java
 */
@Entity(name="course")
public class Course  implements java.io.Serializable {


     private Integer id;
     private Category category;
     private Instructor instructor;
     private String title;
     private String decription;
     private String picture;
     private float price;
     private Float discounts;
     private int cartId;
     private Set<Review> reviews = new HashSet<Review>(0);
     private Set<Enrollment> enrollments = new HashSet<Enrollment>(0);
     private Set<Content> contents = new HashSet<Content>(0);

    public Course() {
    }

	
    public Course(Category category, Instructor instructor, String title, float price, int cartId) {
        this.category = category;
        this.instructor = instructor;
        this.title = title;
        this.price = price;
        this.cartId = cartId;
    }
    public Course(Category category, Instructor instructor, String title, String decription, String picture, float price, Float discounts, int cartId, Set<Review> reviews, Set<Enrollment> enrollments, Set<Content> contents) {
       this.category = category;
       this.instructor = instructor;
       this.title = title;
       this.decription = decription;
       this.picture = picture;
       this.price = price;
       this.discounts = discounts;
       this.cartId = cartId;
       this.reviews = reviews;
       this.enrollments = enrollments;
       this.contents = contents;
    }

    public Course(String title, String decription, String picture, float price, Float discounts) {
        this.title = title;
        this.decription = decription;
        this.picture = picture;
        this.price = price;
        this.discounts = discounts;
    }
   
     @Id 
     @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="category_id", nullable=false)
    public Category getCategory() {
        return this.category;
    }
    
    public void setCategory(Category category) {
        this.category = category;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="instructor_id", nullable=false)
    public Instructor getInstructor() {
        return this.instructor;
    }
    
    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    
    @Column(name="title", nullable=false)
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    
    @Column(name="decription", length=65535)
    public String getDecription() {
        return this.decription;
    }
    
    public void setDecription(String decription) {
        this.decription = decription;
    }

    
    @Column(name="picture")
    public String getPicture() {
        return this.picture;
    }
    
    public void setPicture(String picture) {
        this.picture = picture;
    }

    
    @Column(name="price", nullable=false, precision=12, scale=0)
    public float getPrice() {
        return this.price;
    }
    
    public void setPrice(float price) {
        this.price = price;
    }

    
    @Column(name="discounts", precision=12, scale=0)
    public Float getDiscounts() {
        return this.discounts;
    }
    
    public void setDiscounts(Float discounts) {
        this.discounts = discounts;
    }

    
    @Column(name="Cart_id", nullable=false)
    public int getCartId() {
        return this.cartId;
    }
    
    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="course")
    public Set<Review> getReviews() {
        return this.reviews;
    }
    
    public void setReviews(Set<Review> reviews) {
        this.reviews = reviews;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="course")
    public Set<Enrollment> getEnrollments() {
        return this.enrollments;
    }
    
    public void setEnrollments(Set<Enrollment> enrollments) {
        this.enrollments = enrollments;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="course")
    public Set<Content> getContents() {
        return this.contents;
    }
    
    public void setContents(Set<Content> contents) {
        this.contents = contents;
    }




}



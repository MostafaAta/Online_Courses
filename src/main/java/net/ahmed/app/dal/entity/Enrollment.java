package net.ahmed.app.dal.entity;
// Generated Jul 16, 2020 12:45:46 AM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Enrollment generated by hbm2java
 */
@Entity(name="enrollment")
public class Enrollment  implements java.io.Serializable {


     private int id;
     private Course course;
     private Student student;
     private Date enrollDate;

    public Enrollment() {
    }

    public Enrollment(int id, Course course, Student student, Date enrollDate) {
       this.id = id;
       this.course = course;
       this.student = student;
       this.enrollDate = enrollDate;
    }

    public Enrollment(Date enrollDate) {
        this.enrollDate = enrollDate;
    }
   
     @Id 
     @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="course_id", nullable=false)
    public Course getCourse() {
        return this.course;
    }
    
    public void setCourse(Course course) {
        this.course = course;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="student_id", nullable=false)
    public Student getStudent() {
        return this.student;
    }
    
    public void setStudent(Student student) {
        this.student = student;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="enroll_date", nullable=false, length=19)
    public Date getEnrollDate() {
        return this.enrollDate;
    }
    
    public void setEnrollDate(Date enrollDate) {
        this.enrollDate = enrollDate;
    }




}



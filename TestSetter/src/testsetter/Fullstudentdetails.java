/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsetter;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author XCODING
 */
@Entity
@Table(name = "FULLSTUDENTDETAILS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fullstudentdetails.findAll", query = "SELECT f FROM Fullstudentdetails f")
    , @NamedQuery(name = "Fullstudentdetails.findByStudentnumber", query = "SELECT f FROM Fullstudentdetails f WHERE f.studentnumber = :studentnumber")
    , @NamedQuery(name = "Fullstudentdetails.findByStudentname", query = "SELECT f FROM Fullstudentdetails f WHERE f.studentname = :studentname")
    , @NamedQuery(name = "Fullstudentdetails.findByStudentsurname", query = "SELECT f FROM Fullstudentdetails f WHERE f.studentsurname = :studentsurname")
    , @NamedQuery(name = "Fullstudentdetails.findByYearofstudy", query = "SELECT f FROM Fullstudentdetails f WHERE f.yearofstudy = :yearofstudy")
    , @NamedQuery(name = "Fullstudentdetails.findByGender", query = "SELECT f FROM Fullstudentdetails f WHERE f.gender = :gender")})
public class Fullstudentdetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "STUDENTNUMBER")
    private String studentnumber;
    @Basic(optional = false)
    @Column(name = "STUDENTNAME")
    private String studentname;
    @Column(name = "STUDENTSURNAME")
    private String studentsurname;
    @Column(name = "YEAROFSTUDY")
    private Integer yearofstudy;
    @Column(name = "GENDER")
    private String gender;

    public Fullstudentdetails() {
    }

    public Fullstudentdetails(String studentnumber) {
        this.studentnumber = studentnumber;
    }

    public Fullstudentdetails(String studentnumber, String studentname) {
        this.studentnumber = studentnumber;
        this.studentname = studentname;
    }

    public String getStudentnumber() {
        return studentnumber;
    }

    public void setStudentnumber(String studentnumber) {
        this.studentnumber = studentnumber;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getStudentsurname() {
        return studentsurname;
    }

    public void setStudentsurname(String studentsurname) {
        this.studentsurname = studentsurname;
    }

    public Integer getYearofstudy() {
        return yearofstudy;
    }

    public void setYearofstudy(Integer yearofstudy) {
        this.yearofstudy = yearofstudy;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studentnumber != null ? studentnumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fullstudentdetails)) {
            return false;
        }
        Fullstudentdetails other = (Fullstudentdetails) object;
        if ((this.studentnumber == null && other.studentnumber != null) || (this.studentnumber != null && !this.studentnumber.equals(other.studentnumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "testsetter.Fullstudentdetails[ studentnumber=" + studentnumber + " ]";
    }
    
}

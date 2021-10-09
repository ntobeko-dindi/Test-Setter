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
@Table(name = "LOGINS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Logins.findAll", query = "SELECT l FROM Logins l")
    , @NamedQuery(name = "Logins.findByUserid", query = "SELECT l FROM Logins l WHERE l.userid = :userid")
    , @NamedQuery(name = "Logins.findByPassword", query = "SELECT l FROM Logins l WHERE l.password = :password")})
public class Logins implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "USERID")
    private String userid;
    @Column(name = "PASSWORD")
    private String password;

    public Logins() {
    }

    public Logins(String userid) {
        this.userid = userid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userid != null ? userid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Logins)) {
            return false;
        }
        Logins other = (Logins) object;
        if ((this.userid == null && other.userid != null) || (this.userid != null && !this.userid.equals(other.userid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "testsetter.Logins[ userid=" + userid + " ]";
    }
    
}

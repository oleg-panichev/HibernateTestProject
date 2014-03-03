package HibernateTestProject;

import javax.persistence.*;

/**
 * Created by Oleg on 02.03.14.
 */
@Entity
@Table(name = "STUDENT", schema = "APP", catalog = "")
public class StudentEntity {
    private int id;
    private double grade;
    private String sname;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "GRADE")
    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Basic
    @Column(name = "SNAME")
    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentEntity that = (StudentEntity) o;

        if (Double.compare(that.grade, grade) != 0) return false;
        if (id != that.id) return false;
        if (sname != null ? !sname.equals(that.sname) : that.sname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        temp = Double.doubleToLongBits(grade);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (sname != null ? sname.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "id=" + id +
                ", grade=" + grade +
                ", sname='" + sname + '\'' +
                '}';
    }
}

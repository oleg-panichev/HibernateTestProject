package HibernateTestProject;

import javax.persistence.*;

/**
 * Created by Oleg on 02.03.14.
 */
@Entity
@Table(name = "BOOK", schema = "APP", catalog = "")
public class BookEntity {
    private int bid;
    private String title;

    @Id
    @Column(name = "BID")
    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    @Basic
    @Column(name = "TITLE")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookEntity that = (BookEntity) o;

        if (bid != that.bid) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bid;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        return result;
    }
}

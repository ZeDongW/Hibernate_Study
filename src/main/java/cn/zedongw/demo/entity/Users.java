package cn.zedongw.demo.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.Objects;

/**
 * @ClassName Users
 * @Description:
 * @Author ZeDongW
 * @Date 2020/3/11 0011 16:43
 * @Version
 * @Modified By:
 * @Modified Time:
 **/
@Entity
public class Users {
    private int id;
    private String userName;
    private Date birthday;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "userName")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "birthday")
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return id == users.id &&
                Objects.equals(userName, users.userName) &&
                Objects.equals(birthday, users.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, birthday);
    }

    public Users(int id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    public Users() {
    }
}

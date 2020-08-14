package aaa.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
public class Teacher {
    @Id
    @Column
    String tid;
    @Column
    String tname;
    @Column
    String posts;
    @Column
    String tstate;

    @Override
    public String toString() {
        return "Teacher{" +
                "tid='" + tid + '\'' +
                ", tname='" + tname + '\'' +
                ", posts='" + posts + '\'' +
                ", tstate='" + tstate + '\'' +
                '}';
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getPosts() {
        return posts;
    }

    public void setPosts(String posts) {
        this.posts = posts;
    }

    public String getTstate() {
        return tstate;
    }

    public void setTstate(String tstate) {
        this.tstate = tstate;
    }

    public Teacher() {
    }

    public Teacher(String tid, String tname, String posts, String tstate) {
        this.tid = tid;
        this.tname = tname;
        this.posts = posts;
        this.tstate = tstate;
    }
}

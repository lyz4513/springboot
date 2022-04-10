package com.example.springboot_hellword.entity.po;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@ToString
@Entity
@Table(name = "user")
public class UserPo {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name ="user_name")
    private String userName;

    @Column(name ="pass_word")
    private String passWord;


    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}

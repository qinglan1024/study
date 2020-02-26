package com.example.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;

@Data
@Table(name = "tb_user")
public class User {

    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer id;

    @Column(name = "user_name")
    private String username;

    private String password;

    private String name;

    private Integer sex;

    private Integer age;

    @Transient
    private String note;

    private Date created;

    private Date updated;
}

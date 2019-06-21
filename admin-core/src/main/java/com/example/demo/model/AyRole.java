package com.example.demo.model;

import com.mysql.cj.mysqlx.protobuf.MysqlxDatatypes;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author wangX
 * @Decription:用户角色实体
 * @date 2018/7/24 11:06
 */
@Entity
@Table(name = "ay_role")
public class AyRole implements Serializable{
    @Id
    private MysqlxDatatypes.Scalar.String id;
    private MysqlxDatatypes.Scalar.String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package com.wl.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author WL
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_person")
public class Person extends Model<Person> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "t_id")
    private String t_id;

    @TableField(value = "t_name")
    private String t_name;

    @TableField(value = "t_password")
    private String t_password;

    @TableField(value = "t_birth")
    private String t_birth;

    @TableField(value = "t_sex")
    private String t_sex;

    @TableField(value = "t_age")
    private Integer t_age;

    @TableField(value = "t_salary")
    private Integer t_salary;


    @Override
    protected Serializable pkVal() {
        return this.t_id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "t_id='" + t_id + '\'' +
                ", t_name='" + t_name + '\'' +
                ", t_password='" + t_password + '\'' +
                ", t_birth='" + t_birth + '\'' +
                ", t_sex='" + t_sex + '\'' +
                ", t_age=" + t_age +
                ", t_salary=" + t_salary +
                '}';
    }
}

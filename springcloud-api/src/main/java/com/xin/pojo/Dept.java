package com.xin.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author KX
 * @date 2022/4/7 15:40
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {
    /**
     * 所有的实体类务必实现序列化,通讯需求
     */
    private static final long serialVersionUID = 708560364349809174L;

    private Integer id;

    private String name;

    private String createTime;

}

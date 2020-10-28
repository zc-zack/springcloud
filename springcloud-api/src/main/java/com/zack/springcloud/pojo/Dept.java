package com.zack.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * com.zack.springcloud.pojo
 *
 * @author zhangc
 * @version 1.0
 * @create 2020/10/27 10:27
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {

    private Long id;

    private String dName;

    private String dbSource;

    public Dept(String dName) {
        this.dName = dName;
    }

    /**
     * 链式写法
     * Dept dept = new Dept();
     * dept.setId().setDName();
     */

}

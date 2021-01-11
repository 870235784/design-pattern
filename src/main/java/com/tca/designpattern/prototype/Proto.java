package com.tca.designpattern.prototype;

import lombok.Data;

/**
 * @author zhouan
 * @Date 2020/8/3
 * java拷贝, 对于对象内部的属性, 采用的是浅拷贝的方式
 */
@Data
public class Proto implements Cloneable {

    private String name;

    private InnerProto innerProto;

    @Override
    protected Proto clone() throws CloneNotSupportedException {
        return (Proto)super.clone();
    }
}

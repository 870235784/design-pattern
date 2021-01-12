package com.tca.designpattern.creation.prototype;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zhouan
 * @Date 2020/8/3
 */
@Slf4j
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Proto proto = new Proto();
        proto.setName("Tom");
        InnerProto innerProto = new InnerProto();
        innerProto.setInnerName("汤姆");
        proto.setInnerProto(innerProto);
        Proto clone = proto.clone();

        log.info("clone对象, 当对象属性为字符串时, 是否为浅拷贝: {}, 字符串是不可变对象, 所以不需要深拷贝!", proto.getName() == clone.getName());
        log.info("clone是否为浅拷贝: {}", proto.getInnerProto() == clone.getInnerProto());

    }
}

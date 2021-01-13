package com.tca.designpattern.structure.adapter;

/**
 * @author zhouan
 * @Date 2021/01/14
 */
public interface IWorkerAdapter {

    /**
     * supports
     * @param obj
     * @return
     */
    boolean supports(Object obj);

    /**
     * work
     * @param obj
     */
    void work(Object obj);
}

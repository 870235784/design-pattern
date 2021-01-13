package com.tca.designpattern.structure.adapter;

/**
 * @author zhouan
 * @Date 2021/01/14
 */
public class CookerAdapter implements IWorkerAdapter {

    @Override
    public boolean supports(Object obj) {
        return (obj instanceof Cooker);
    }

    @Override
    public void work(Object obj) {
        ((Cooker)obj).cook();
    }
}

package com.tca.designpattern.structure.adapter;

/**
 * @author zhouan
 * @Date 2021/01/14
 */
public class ProgrammerAdapter implements IWorkerAdapter {
    @Override
    public boolean supports(Object obj) {
        return (obj instanceof Programmer);
    }

    @Override
    public void work(Object obj) {
        ((Programmer)obj).program();
    }
}

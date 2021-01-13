package com.tca.designpattern.structure.adapter;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author zhouan
 * @Date 2021/01/14
 * 适配器模式
 */
public class Client {

    public static void main(String[] args) {
        List<IWorkerAdapter> workerAdapterList = Lists.newArrayList(new ProgrammerAdapter(), new CookerAdapter());
        List<Object> workers = Lists.newArrayList(new Cooker(), new Programmer());

        workers.forEach(worker -> {
            for (IWorkerAdapter workerAdapter : workerAdapterList) {
                if (workerAdapter.supports(worker)) {
                    workerAdapter.work(worker);
                }
            }
        });
    }
}

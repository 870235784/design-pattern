package com.tca.designpattern.factory.factorymethod02;

/**
 * @author zhoua
 * @Date 2021/1/9
 */
public interface IOrderPizza {

    /**
     * 创建pizza
     * @param pizzaTypeEnum
     * @return
     */
    AbstractPizza createPizza(PizzaTypeEnum pizzaTypeEnum);

}

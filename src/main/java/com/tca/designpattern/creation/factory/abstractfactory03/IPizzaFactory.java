package com.tca.designpattern.creation.factory.abstractfactory03;

/**
 * @author zhoua
 * @Date 2021/1/9
 */
public interface IPizzaFactory {

    /**
     * 创建pizza
     * @param pizzaType
     * @return
     */
    AbstractPizza createPizza(PizzaTypeEnum pizzaType);

}

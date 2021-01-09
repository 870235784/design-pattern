package com.tca.designpattern.factory.factorymethod02;


/**
 * @author zhoua
 * @Date 2021/1/9
 */
public class PizzaHutOrderPizza implements IOrderPizza {

    @Override
    public AbstractPizza createPizza(PizzaTypeEnum pizzaTypeEnum) {
        if (pizzaTypeEnum == PizzaTypeEnum.CHEESE) {
            return new PizzaHutCheesePizza();
        }
        if (pizzaTypeEnum == PizzaTypeEnum.CLAM) {
            return new PizzaHutClamPizza();
        }
        return null;
    }
}

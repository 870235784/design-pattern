package com.tca.designpattern.creation.factory.abstractfactory03;


/**
 * @author zhoua
 * @Date 2021/1/9
 */
public class PizzaHutFactory implements IPizzaFactory {

    @Override
    public AbstractPizza createPizza(PizzaTypeEnum pizzaType) {
        if (pizzaType == PizzaTypeEnum.CHEESE) {
            return new PizzaHutCheesePizza();
        }
        if (pizzaType == PizzaTypeEnum.CLAM) {
            return new PizzaHutClamPizza();
        }
        return null;
    }
}

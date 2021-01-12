package com.tca.designpattern.creation.factory.factorymethod02;


import lombok.extern.slf4j.Slf4j;

/**
 * @author zhoua
 * @Date 2021/1/9
 */
@Slf4j
public class LacesarOrderPizza implements IOrderPizza {

    @Override
    public AbstractPizza createPizza(PizzaTypeEnum pizzaTypeEnum) {
        if (pizzaTypeEnum == PizzaTypeEnum.CHEESE) {
            return new LacesarCheesePizza();
        }
        if (pizzaTypeEnum == PizzaTypeEnum.CLAM) {
            return new LacesarClamPizza();
        }
        return null;
    }

    public static void main(String[] args) {
        IOrderPizza lacesarOrderPizza = new LacesarOrderPizza();
        AbstractPizza pizza = lacesarOrderPizza.createPizza(PizzaTypeEnum.CHEESE);
        log.info("pizza = {}", pizza);
    }
}

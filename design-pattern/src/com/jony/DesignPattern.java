
package com.jony;

import com.jony.behavior.responsibiltychain.DeptManager;
import com.jony.behavior.responsibiltychain.GeneralManager;
import com.jony.behavior.responsibiltychain.Handler;
import com.jony.behavior.responsibiltychain.ProjectManager;
import com.jony.behavior.strategy.DiscountStrategy;
import com.jony.behavior.strategy.MiddleStrategy;
import com.jony.behavior.strategy.Price;
import com.jony.behavior.templatemethod.Account;
import com.jony.behavior.templatemethod.CDAccount;
import com.jony.behavior.templatemethod.MoneyMarketAccount;
import com.jony.creational.abstractfactory.SkinFactory;
import com.jony.creational.abstractfactory.SpringSkinFactory;
import com.jony.creational.builder.Builder;
import com.jony.creational.builder.ConcreteBuilder;
import com.jony.creational.builder.Director;
import com.jony.creational.builder.Product;
import com.jony.creational.factory.DatabaseLoggerFactory;
import com.jony.creational.factory.FileLoggerFactory;
import com.jony.creational.factory.Logger;
import com.jony.creational.factory.LoggerFactory;
import com.jony.structural.adapter.Adaptee;
import com.jony.structural.adapter.ClassAdapter;
import com.jony.structural.adapter.ObjectAdapter;
import com.jony.structural.decorator.Component;
import com.jony.structural.decorator.ConcreteComponent;
import com.jony.structural.decorator.ConcreteDecoratorA;
import com.jony.structural.decorator.ConcreteDecoratorB;
import com.jony.structural.proxy.AbstractObjeact;
import com.jony.structural.proxy.ProxyObject;

/**
 * @author lichao 2018/6/3 - 下午4:36.
 */
public class DesignPattern {

    public static void main(String[] args) {

        AbstractObjeact abstractObjeact = new ProxyObject();
        abstractObjeact.operation();

        Account account = new MoneyMarketAccount();
        System.out.println(account.calculateInterest());
        account = new CDAccount();
        System.out.println(account.calculateInterest());


        Handler handler1 = new GeneralManager();
        Handler handler2 = new DeptManager();
        Handler handler3 = new ProjectManager();
        handler3.setSuccessor(handler2);
        handler2.setSuccessor(handler1);

        handler3.handleFeeRequest("jony",300);
        handler3.handleFeeRequest("jony",700);
        handler3.handleFeeRequest("jony",1500);

        DiscountStrategy discountStrategy = new MiddleStrategy();
        Price price = new Price(discountStrategy);
        System.out.println(price.quote(1000));

        ClassAdapter classAdapter = new ClassAdapter();
        classAdapter.operation1();
        classAdapter.operation2();
        Adaptee adaptee = new Adaptee();
        ObjectAdapter objectAdapter = new ObjectAdapter(adaptee);
        objectAdapter.operation1();
        objectAdapter.operation2();

        Component component = new ConcreteComponent();
        component.operation();
        component = new ConcreteDecoratorA(component);
        component.operation();
        component = new ConcreteComponent();
        component = new ConcreteDecoratorB(component);
        component.operation();

        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.construct();
        Product product = builder.retriveProduct();
        System.out.println(product.getPart1());
        System.out.println(product.getPart2());

        LoggerFactory loggerFactory = new DatabaseLoggerFactory();
        Logger logger = loggerFactory.createLogger();
        logger.writeLog();
        loggerFactory = new FileLoggerFactory();
        logger = loggerFactory.createLogger();
        logger.writeLog();

        SkinFactory skinFactory = new SpringSkinFactory();
        skinFactory.createButton().display();
        skinFactory.createComboBox().display();
        skinFactory.createTextField().display();


    }











}

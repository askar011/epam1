package edu.epam.pizza.entity;

import edu.epam.pizza.report.CheckReport;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private static int number = 10000;
    private int clientNumber;
    private static final int MAX_PIZZA_AMOUNT = 10;

    private List<Pizza> pizzaList = new ArrayList<>(MAX_PIZZA_AMOUNT);

    private ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
    public LocalTime orderTime = zonedDateTime.toLocalTime();
    public CheckReport checkReport = new CheckReport();

    // in every order incrementing the orderNumber
    public Order(int clientNumber) {
        this.clientNumber = clientNumber;
        this.number++;
    }

    public int getNumber(){
        return number;
    }
    public int getClientNumber() {
        return clientNumber;
    }

    public List<Pizza> getPizzaList() {
        return pizzaList;
    }

    public void addPizza(Pizza pizza){
        pizzaList.add(pizza);
    }

    @Override
    public String toString() {
        return checkReport.printLine("*")+ "Заказ: " + getNumber() + "\n" + "Клиент: " + getClientNumber() + "\n"
                + checkReport.checkList(pizzaList,orderTime);
    }
}

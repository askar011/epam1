package edu.epam.train.Main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private static Logger logger = LogManager.getLogger();
    public static int number = 10000;
    private int clientNumber;
    private List<Pizza> pizzaList = new ArrayList<>();
    private ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
    private LocalTime localTime = zonedDateTime.toLocalTime();

    // in every order incrementing the orderNumber

    public Order(int clientNumber) {
        this.clientNumber = clientNumber;
        this.number++;
    }
    public static int getNumber(){
        return number;
    }

    public int getClientNumber() {
        return clientNumber;
    }

    public void addPizza(Pizza pizza){
        pizzaList.add(pizza);
    }

    private String checkList(List<? extends Pizza> list){
        StringBuilder res= new StringBuilder();
        double totalCost = 0;
        for (Pizza elem : list){
            totalCost += (this.getSum(elem) * elem.getAmount());
            res.append("Название: " + elem.getName() + "\n");
            res.append(printLine("-"));
            res.append("Pizza Base(" + elem.getType() + ") " + elem.getType().getCost() + "\n");
            res.append(elem.getIngredientsList(elem.ingredientsList));
            res.append(printLine("-"));
            res.append("Всего:" + getSum(elem)+"\n" + "Кол-во:" + elem.getAmount() + "\n");
            res.append(printLine("-"));
        }
        res.append("Общая сумма :" +totalCost + "\n");
        res.append("Время заказа :" + localTime.getHour()+ ":"+ localTime.getMinute()+ ":"+ localTime.getSecond() + "\n");
        res.append(printLine("*"));
        logger.info("Время заказа :" + localTime.getHour()+ ":"+ localTime.getMinute()+ ":"+ localTime.getSecond() + "\n");
        logger.info("Общая сумма :" +totalCost + "\n");
        return res.toString();
    }

    // getting the cost of base pizza + with all ingredients
    public double getSum(Pizza pizza){
        double sum = pizza.getType().getCost();
        sum += getSumOfIngredients(pizza.ingredientsList);
        return sum;
    }


    private double getSumOfIngredients(List<? extends Ingredients> list){
        double sum = 0;
        for (Ingredients el : list){
            sum += el.getCost();
        }
        return sum;
    }

    private String printLine(String str){
        StringBuilder builder = new StringBuilder();
        for (int i = 0 ; i < 30;i++){
            builder.append(str);
        }
        builder.append("\n");
        return builder.toString();
    }

    @Override
    public String toString() {
        return printLine("*") + "Заказ: " + number + "\n" + "Клиент: " + this.getClientNumber() + "\n"  + checkList(pizzaList);
    }
}

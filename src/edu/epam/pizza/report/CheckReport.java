package edu.epam.pizza.report;

import edu.epam.pizza.archive.CheckWriter;
import edu.epam.pizza.entity.Pizza;
import edu.epam.pizza.operation.Calculation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalTime;
import java.util.List;

public class CheckReport {

    private static Logger logger = LogManager.getLogger();

    private double totalCost = 0;

    public String checkList(List<Pizza> list, LocalTime orderTime){
        StringBuilder res= new StringBuilder();
        Calculation calculator = new Calculation();
        CheckWriter fileWriter = new CheckWriter();
        for (Pizza elem : list){
            totalCost += calculator.getSum(elem) * elem.getAmount();
            res.append("Название: " + elem.getName() + "\n");
            res.append(printLine("-"));
            res.append("Pizza Base(" + elem.getType() + ") " + elem.getType().getCost() + "\n");
            res.append(elem.getIngredientsList(elem.ingredientsList));
            res.append(printLine("-"));
            res.append("Всего:" + calculator.getSum(elem)+"\n" + "Кол-во:" + elem.getAmount() + "\n");
            res.append(printLine("-"));
        }
        res.append("Общая сумма :" + totalCost + "\n");
        res.append("Время заказа :" +orderTime.getHour()+ ":"+ orderTime.getMinute()+ ":"+
                orderTime.getSecond() + "\n");
        res.append(printLine("*"));
        logger.info("Время заказа :" + orderTime.getHour()+ ":"+ orderTime.getMinute()+ ":"+
                orderTime.getSecond() + "\n");
        logger.info("Общая сумма :" +totalCost + "\n");
        fileWriter.writeToFile(res.toString());
        return res.toString();
    }

    public double getTotalCost() {
        return totalCost;
    }

    public String printLine(String str){
        StringBuilder builder = new StringBuilder();
        for (int i = 0 ; i < 30;i++){
            builder.append(str);
        }
        builder.append("\n");
        return builder.toString();
    }

}

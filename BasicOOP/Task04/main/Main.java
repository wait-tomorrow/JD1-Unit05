package by.htp.BasicOOP.Task04.main;

import java.util.List;

import by.htp.BasicOOP.Task04.bean.Treasure;
import by.htp.BasicOOP.Task04.service.ServiceException;
import by.htp.BasicOOP.Task04.service.ServiceProvider;
import by.htp.BasicOOP.Task04.service.TreasureService;

public class Main {

    public static void main(String[] args) {

	TreasureService treasureService = ServiceProvider.getInstance().getTreasureService();

	try {

	    System.out.println("Список сокровищ: ");
	    printTreasures(treasureService.getTreasures());

	    System.out.println("\nСамое дорогое сокровище: ");
	    System.out.println(treasureService.takeMostExpensive().getName());

	    System.out.println("\nСокровища на сумму 200:");
	    printTreasures(treasureService.takeUntilSumIsReached(200));

	} catch (ServiceException e) {
	    System.out.println("Something is happened!");
	}
    }

    public static void printTreasures(List<Treasure> list) {
	for (Treasure treasure : list) {
	    System.out.println(treasure.getName() + " " + treasure.getCost());
	}
    }
}

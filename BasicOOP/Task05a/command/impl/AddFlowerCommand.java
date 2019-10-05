package by.htp.BasicOOP.Task05a.command.impl;

import by.htp.BasicOOP.Task05a.command.Command;
import by.htp.BasicOOP.Task05a.service.*;

public class AddFlowerCommand implements Command {

    @Override
    public String execute(String request) throws ServiceException {
	String[] info = request.split(" ");

	String bouquetName = info[1].split("=")[1];
	String name = info[2].split("=")[1];
	String price = info[3].split("=")[1];

	ServiceProvider provider = ServiceProvider.getInstance();
	BouquetService bouqCreator = provider.getBouquetService();

	String response;

	try {
	    boolean result = bouqCreator.addFlower(bouquetName, name, Integer.parseInt(price));
	    response = result ? "Добавлено успешно" : "Не добавлено";

	} catch (ServiceException e) {
	    response = e.getMessage();
	}

	return response;
    }
}

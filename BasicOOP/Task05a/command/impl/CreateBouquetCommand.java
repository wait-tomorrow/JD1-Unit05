package by.htp.BasicOOP.Task05a.command.impl;

import by.htp.BasicOOP.Task05a.command.Command;
import by.htp.BasicOOP.Task05a.service.*;

public class CreateBouquetCommand implements Command {

    @Override
    public String execute(String request) {
	String[] info = request.split(" ");

	String name = info[1].split("=")[1];

	ServiceProvider provider = ServiceProvider.getInstance();
	BouquetService bouqCreator = provider.getBouquetService();

	String response;

	try {
	    boolean result;
	    result = bouqCreator.createBouquet(name);
	    response = result ? "Создан успешно" : "Не создан";
	} catch (ServiceException e) {
	    response = e.getMessage();
	}

	return response;
    }
}

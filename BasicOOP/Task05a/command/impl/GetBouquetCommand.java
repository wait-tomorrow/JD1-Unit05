package by.htp.BasicOOP.Task05a.command.impl;

import by.htp.BasicOOP.Task05a.command.Command;
import by.htp.BasicOOP.Task05a.service.BouquetService;
import by.htp.BasicOOP.Task05a.service.ServiceException;
import by.htp.BasicOOP.Task05a.service.ServiceProvider;

public class GetBouquetCommand implements Command {

    @Override
    public String execute(String request) throws ServiceException {
	String[] params = request.split(" ");

	String name = params[1].split("=")[1];

	ServiceProvider provider = ServiceProvider.getInstance();
	BouquetService bouqCreator = provider.getBouquetService();

	String response;

	response = bouqCreator.getBouquet(name);

	return response;
    }
}

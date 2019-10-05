package by.htp.BasicOOP.Task05a.controller;

import by.htp.BasicOOP.Task05a.command.*;
import by.htp.BasicOOP.Task05a.service.ServiceException;

public class Controller {
    private final CommandProvider provider = new CommandProvider();

    public String doAction(String request) {
	String response;
	String commandName = request.split(" ")[0];
	Command command = provider.getCommand(commandName);

	try {
	    response = command.execute(request);
	} catch (ServiceException e) {
	    response = e.getMessage();
	}

	return response;
    }
}

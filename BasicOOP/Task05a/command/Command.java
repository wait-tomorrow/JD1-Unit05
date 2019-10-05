package by.htp.BasicOOP.Task05a.command;

import by.htp.BasicOOP.Task05a.service.ServiceException;

public interface Command {

    String execute(String command) throws ServiceException;
}

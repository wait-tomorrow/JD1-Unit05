package by.htp.BasicOOP.Task05a.command;

import java.util.HashMap;
import java.util.Map;

import by.htp.BasicOOP.Task05a.command.impl.*;

public class CommandProvider {

    private Map<String, Command> commands;

    public CommandProvider() {
	commands = new HashMap<String, Command>();

	commands.put("createBouquet", new CreateBouquetCommand());
	commands.put("addFlower", new AddFlowerCommand());
	commands.put("addCover", new AddCoverCommand());
	commands.put("getBouquet", new GetBouquetCommand());
    }

    public Command getCommand(String CommandName) {
	return commands.get(CommandName);
    }
}

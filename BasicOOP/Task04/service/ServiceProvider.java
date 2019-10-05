package by.htp.BasicOOP.Task04.service;

import by.htp.BasicOOP.Task04.service.impl.TreasureServiceImpl;

public class ServiceProvider {
    private static final ServiceProvider instance = new ServiceProvider();

    private ServiceProvider() {
    };

    public static ServiceProvider getInstance() {
	return instance;
    }

    private TreasureService treasureService = new TreasureServiceImpl();

    public TreasureService getTreasureService() {
	return treasureService;
    }

}

package by.htp.BasicOOP.Task05a.service;

import by.htp.BasicOOP.Task05a.service.impl.BouquetServiceImpl;

public class ServiceProvider {

    private static final ServiceProvider instance = new ServiceProvider();

    private ServiceProvider() {
    };

    public static ServiceProvider getInstance() {
	return instance;
    }

    private BouquetService bouquetService = new BouquetServiceImpl();

    public BouquetService getBouquetService() {
	return bouquetService;
    }
}

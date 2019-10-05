package by.htp.BasicOOP.Task05a.service.impl;

import java.util.List;

import by.htp.BasicOOP.Task05a.bean.*;
import by.htp.BasicOOP.Task05a.service.*;

public class BouquetServiceImpl implements BouquetService {

    @Override
    public boolean createBouquet(String name) throws ServiceException {
	Bouquet bouquet = new Bouquet(name);
	BouquetCreator.getInstance().getBouquets().add(bouquet);
	return true;
    }

    @Override
    public boolean addCover(String nameBouquet, String name, int price) throws ServiceException {
	try {
	    Cover cover = new Cover(name, price);
	    BouquetCreator bouqCreator = BouquetCreator.getInstance();

	    Bouquet bouquet = findBouquetByName(bouqCreator.getBouquets(), nameBouquet);
	    bouquet.setCover(cover);

	} catch (Exception e) {
	    throw new ServiceException("Упаковка не добавлена");
	}

	return true;
    }

    @Override
    public boolean addFlower(String bouquetName, String flowerName, int price) throws ServiceException {
	try {
	    Flower flower = new Flower(flowerName, price);
	    BouquetCreator bouqCreator = BouquetCreator.getInstance();

	    Bouquet bouquet = findBouquetByName(bouqCreator.getBouquets(), bouquetName);
	    bouquet.getFlowers().add(flower);
	} catch (Exception e) {
	    throw new ServiceException("Цветок не добавлен");
	}
	return true;
    }

    private static Bouquet findBouquetByName(List<Bouquet> bouquets, String name) {
	Bouquet result = null;
	
	for (Bouquet bouquet : bouquets) {
	    if (name.equals(bouquet.getName())) {
		result = bouquet;
	    }
	}
	return result;
    }

    @Override
    public String getBouquet(String bouquetName) {
	BouquetCreator bouqCreator = BouquetCreator.getInstance();
	Bouquet result = null;
	
	for (Bouquet bouquet : bouqCreator.getBouquets()) {
	    if (bouquetName.equals(bouquet.getName())) {
		result = bouquet;
	    }
	}
	return result.toString();
    }
}

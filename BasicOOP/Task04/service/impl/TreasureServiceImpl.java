package by.htp.BasicOOP.Task04.service.impl;

import java.util.ArrayList;
import java.util.List;
import by.htp.BasicOOP.Task04.dao.DAOProvider;
import by.htp.BasicOOP.Task04.dao.TreasureDao;
import by.htp.BasicOOP.Task04.bean.Treasure;
import by.htp.BasicOOP.Task04.dao.DAOException;
import by.htp.BasicOOP.Task04.service.util.Validator;
import by.htp.BasicOOP.Task04.service.TreasureService;
import by.htp.BasicOOP.Task04.service.ServiceException;
import by.htp.BasicOOP.Task04.bean.Cave;

public class TreasureServiceImpl implements TreasureService {

    private Cave getCave() throws ServiceException {
	Cave cave;
	if (!Validator.isCredentialValid("Credential")) {
	    throw new ServiceException("something happen");
	}

	DAOProvider provider = DAOProvider.getInstance();
	TreasureDao treasureDao = provider.getTreasureDao();

	try {
	    cave = new Cave(treasureDao.getTreasures());
	} catch (DAOException e) {
	    throw new ServiceException(e);
	}
	return cave;
    }

    @Override
    public List<Treasure> getTreasures() throws ServiceException {
	Cave cave = getCave();
	return cave.getTreasures();
    }

    @Override
    public Treasure takeMostExpensive() throws ServiceException {
	Cave cave = getCave();
	Treasure mostExpensiveTreasure = null;

	double max = 0;
	for (Treasure treasure : cave.getTreasures()) {
	    if (treasure.getCost() > max) {
		max = treasure.getCost();
		mostExpensiveTreasure = treasure;
	    }
	}
	return mostExpensiveTreasure;
    }

    @Override
    public List<Treasure> takeUntilSumIsReached(double sum) throws ServiceException {
	Cave cave = getCave();
	List<Treasure> result = new ArrayList<Treasure>();

	for (Treasure treasure : cave.getTreasures()) {
	    if (sum == 0) {
		break;
	    }

	    if (sum > treasure.getCost() && (sum - treasure.getCost()) > 0) {
		sum = sum - treasure.getCost();
		result.add(treasure);
	    }
	}

	return result;
    }
}

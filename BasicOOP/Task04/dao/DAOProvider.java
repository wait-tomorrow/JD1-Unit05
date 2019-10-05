package by.htp.BasicOOP.Task04.dao;

import by.htp.BasicOOP.Task04.dao.impl.TreasureDaoImpl;

public class DAOProvider {

    private static final DAOProvider instance = new DAOProvider();

    public static DAOProvider getInstance() {
	return instance;
    }

    private DAOProvider() {
    }

    private TreasureDao treasureDao = new TreasureDaoImpl();

    public TreasureDao getTreasureDao() {
	return treasureDao;
    }

}

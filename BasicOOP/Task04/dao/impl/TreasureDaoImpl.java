package by.htp.BasicOOP.Task04.dao.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import by.htp.BasicOOP.Task04.bean.Treasure;
import by.htp.BasicOOP.Task04.dao.DAOException;
import by.htp.BasicOOP.Task04.dao.TreasureDao;

public class TreasureDaoImpl implements TreasureDao {

    @Override
    public List<Treasure> getTreasures() throws DAOException {
	final String SOURSE = "resources\\Treasure.txt";

	List<Treasure> treasures = new ArrayList<Treasure>();
	try (BufferedReader bufferedReader = new BufferedReader(new FileReader(SOURSE))) {
	    while (bufferedReader.ready()) {
		String[] treasure = bufferedReader.readLine().split(" ");
		treasures.add(new Treasure(treasure[0], Double.parseDouble(treasure[1])));
	    }
	} catch (Exception e) {
	    throw new DAOException(e);
	}
	return treasures;
    }
}

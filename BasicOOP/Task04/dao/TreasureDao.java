package by.htp.BasicOOP.Task04.dao;

import java.util.List;
import by.htp.BasicOOP.Task04.bean.Treasure;

public interface TreasureDao {
    List<Treasure> getTreasures() throws DAOException;
}

package by.htp.BasicOOP.Task04.service;

import java.util.List;

import by.htp.BasicOOP.Task04.bean.Treasure;

public interface TreasureService {
    public Treasure takeMostExpensive() throws ServiceException;

    public List<Treasure> takeUntilSumIsReached(double price) throws ServiceException;

    List<Treasure> getTreasures() throws ServiceException;
}

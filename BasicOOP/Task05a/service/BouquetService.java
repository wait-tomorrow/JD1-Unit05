package by.htp.BasicOOP.Task05a.service;

public interface BouquetService {

    public boolean createBouquet(String bouquetName) throws ServiceException;

    public boolean addFlower(String bouquetName, String flowerName, int price) throws ServiceException;

    public boolean addCover(String bouquetName, String packName, int price) throws ServiceException;

    public String getBouquet(String bouquetName);
}

package by.htp.BasicOOP.Task05a.main;

import by.htp.BasicOOP.Task05a.controller.Controller;

public class Main {

    public static void main(String[] args) {
	Controller controller = new Controller();

	controller.doAction("createBouquet bouquet=Букет");
	controller.doAction("addCover bouquet=Букет name=Джут price=2");
	controller.doAction("addFlower bouquet=Букет name=Роза price=10");
	controller.doAction("addFlower bouquet=Букет name=Лилия price=8");

	String response = controller.doAction("getBouquet bouquet=Букет");
	System.out.println(response);
    }
}

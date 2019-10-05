package by.htp.BasicOOP.Task04.service;

public class ServiceException extends Exception {

    public ServiceException() {
	super();
    }

    public ServiceException(Exception e) {
	super(e);
    }

    public ServiceException(String e) {
	super(e);
    }
}

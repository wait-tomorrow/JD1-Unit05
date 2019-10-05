package by.htp.BasicOOP.Task05a.service;

public class ServiceException extends Exception {

    public ServiceException() {
	super();
    }

    public ServiceException(Exception e) {
	super(e);
    }

    public ServiceException(String message) {
	super(message);
    }
}

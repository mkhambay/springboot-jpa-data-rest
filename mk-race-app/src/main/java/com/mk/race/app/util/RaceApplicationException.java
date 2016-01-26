package com.mk.race.app.util;

public class RaceApplicationException extends RuntimeException {
	
	private Integer statusCode;
	
	private static final long serialVersionUID = 1L;

	public RaceApplicationException(Throwable t, int statusCode) {
        super(t);
        this.statusCode = statusCode;
    }

    public RaceApplicationException(final String errorMessage, int statusCode) {
        super(errorMessage);
        this.statusCode = statusCode;
    }

    public RaceApplicationException(String errMsg, Throwable t, int statusCode) {
        super(errMsg, t);
        this.statusCode = statusCode;
    }
    
    public Integer getStatusCode() {
    	return statusCode;
    }
}

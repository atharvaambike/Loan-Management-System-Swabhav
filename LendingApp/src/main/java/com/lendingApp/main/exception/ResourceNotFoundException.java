package com.lendingApp.main.exception;

public class ResourceNotFoundException extends RuntimeException{
	public ResourceNotFoundException(String message) {
        super(message);
    }
}

package edu.tcu.cs.hogwartsartifactsonline.domain;

public class StatusCode {
    public static final int SUCCESS = 200; //success
    public static final int FFAILURE = 400; //Failure
    public static final int UNAUTHORIZED = 401; // username or password incorrect
    public static final int FORBIDDEN = 403; //insufficient rights
    public static final int NOT_FOUND = 404; //API not found
    public static final int INTERNAL_SERVER_ERROR = 500; //Repetitive ops
}

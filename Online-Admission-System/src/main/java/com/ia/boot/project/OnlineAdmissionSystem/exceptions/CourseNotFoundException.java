package com.ia.boot.project.OnlineAdmissionSystem.exceptions;

public class CourseNotFoundException extends Exception{

    public void courseNotFound(){
        System.out.println("This course does not exist");
    }
}

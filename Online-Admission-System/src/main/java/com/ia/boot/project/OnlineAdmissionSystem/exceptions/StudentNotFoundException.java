package com.ia.boot.project.OnlineAdmissionSystem.exceptions;

public class StudentNotFoundException extends Exception{
    public void studentNotFound(){
        System.out.println("Student does not exist");
    }
}

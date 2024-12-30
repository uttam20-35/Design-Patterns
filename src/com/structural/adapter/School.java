package com.structural.adapter;

public class School {

    public static void main(String[] args) {
        Pen pen = new PenAdapter();
        AssignmentWork assignmentWork= new AssignmentWork();
        assignmentWork.setPen(pen);
        assignmentWork.writeAssignment("Writing is a Good Habit");
    }
}

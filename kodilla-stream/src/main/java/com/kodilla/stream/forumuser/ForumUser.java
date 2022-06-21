package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int ID;
    private final String username;
    private final char sex;
    private final LocalDate birthDate;
    private final int numberOfPostsPublished;

    public ForumUser(final int ID,final String username,final char sex,int yearOfBirth,int monthOfBirth,int dayOfBirth,final int numberOfPostsPublished) {
        this.ID = ID;
        this.username = username;
        this.sex = sex;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.numberOfPostsPublished = numberOfPostsPublished;
    }

    public int getID() {
        return ID;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getNumberOfPostsPublished() {
        return numberOfPostsPublished;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "ID=" + ID +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", numberOfPostsPublished=" + numberOfPostsPublished +
                '}';
    }
}

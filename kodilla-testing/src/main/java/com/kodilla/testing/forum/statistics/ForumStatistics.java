package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private Statistics statistics;
    int commentsResult;
    int usersResult;
    int postsResult;
    double advPostsForUser;
    double advCommentsForUser;
    double advCommentsForPost;


    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }



    public void calculateAdvStatistics (Statistics statistics) {
        postsResult=statistics.postsCount();
        commentsResult=statistics.commentsCount();
        usersResult=statistics.usersNames().size();
        if (usersResult>0) {
            advPostsForUser=postsResult/(double) usersResult;
            advCommentsForUser= commentsResult/(double) usersResult;
        } else {
            advPostsForUser=0;
            advCommentsForUser=0;
        }
        if (postsResult>0) {
            advCommentsForPost= commentsResult/(double) postsResult;
        } else {
            advCommentsForPost=0;
        }
    }
    public int getPostsResult() {
        return postsResult;
    }

    public int getCommentsResult() {
        return commentsResult;
    }

    public int getUsersResult() {
        return usersResult;
    }

    public double getAdvPostsForUser() {
        return advPostsForUser;
    }

    public double getAdvCommentsForUser() {
        return advCommentsForUser;
    }

    public double getAdvCommentsForPost() {
        return advCommentsForPost;
    }
    public void showStatistics(){
        System.out.println("Liczba postów: " + getPostsResult() );
        System.out.println("Liczba komentarzy: " + getCommentsResult() );
        System.out.println("Liczba użytkowników: " + getUsersResult() );
        System.out.println("Średnia liczba postów na użytkownika: " + getAdvPostsForUser() );
        System.out.println("Średnia liczba komentarzy na użytkownika: " + getAdvCommentsForUser() );
        System.out.println("Średnia liczba komentarzy na post: " + getAdvCommentsForPost() );
    }
}

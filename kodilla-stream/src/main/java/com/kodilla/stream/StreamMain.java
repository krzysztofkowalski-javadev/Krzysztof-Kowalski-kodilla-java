package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.person.People;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {


        public static void main (String[]args){

            Forum theForum = new Forum();
            Map<Integer, ForumUser> theResultMapOfForumUser=theForum.getList().stream()
                    .filter(forumUser -> forumUser.getSex()=='M')
                    .filter(forumUser -> forumUser.getBirthDate().isBefore(LocalDate.now().minusYears(20)))
                    .filter(forumUser -> forumUser.getNumberOfPostsPublished()>=1)
                    .collect(Collectors.toMap(ForumUser::getID, forumUser -> forumUser));

            theResultMapOfForumUser.entrySet().stream()
                    .map(entry -> entry.getKey() + ": " + entry.getValue())
                    .forEach(System.out::println);


        }
}

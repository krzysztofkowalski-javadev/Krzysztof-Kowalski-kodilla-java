package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }
    @Mock
    private Statistics statisticsMock;

    private List<String> generateListOfUsers(int usersQuantity){
        List<String> resultList= new ArrayList<>();
        for (int n=1; n<=usersQuantity;n++){
            resultList.add("User"+n);
        }
        return resultList;
    }

    @Test
    public void testCalculatePost0Comments0Users0(){
        //Given
        Statistics statisticsMock=mock(Statistics.class);

        ForumStatistics forumStatistics=new ForumStatistics(statisticsMock);

        List<String> resultUsers=new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(resultUsers);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, forumStatistics.getUsersResult());
        assertEquals(0, forumStatistics.getPostsResult());
        assertEquals(0, forumStatistics.getCommentsResult());
        assertEquals(0, forumStatistics.getAdvPostsForUser());
        assertEquals(0, forumStatistics.getAdvCommentsForUser());
        assertEquals(0, forumStatistics.getAdvCommentsForPost());

        forumStatistics.showStatistics();
    }
    @Test
    public void testCalculatePost1000Comments0Users0(){
        //Given
        Statistics statisticsMock=mock(Statistics.class);

        ForumStatistics forumStatistics=new ForumStatistics(statisticsMock);

        List<String> resultUsers=new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(resultUsers);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, forumStatistics.getUsersResult());
        assertEquals(1000, forumStatistics.getPostsResult());
        assertEquals(0, forumStatistics.getCommentsResult());
        assertEquals(0, forumStatistics.getAdvPostsForUser());
        assertEquals(0, forumStatistics.getAdvCommentsForUser());
        assertEquals(0, forumStatistics.getAdvCommentsForPost());

        forumStatistics.showStatistics();
    }
    @Test
    public void testCalculatePost1000Comments100Users0(){
        //Given
        Statistics statisticsMock=mock(Statistics.class);

        ForumStatistics forumStatistics=new ForumStatistics(statisticsMock);

        List<String> resultUsers=new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(resultUsers);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, forumStatistics.getUsersResult());
        assertEquals(1000, forumStatistics.getPostsResult());
        assertEquals(100, forumStatistics.getCommentsResult());
        assertEquals(0, forumStatistics.getAdvPostsForUser());
        assertEquals(0, forumStatistics.getAdvCommentsForUser());
        assertEquals(0.1, forumStatistics.getAdvCommentsForPost());

        forumStatistics.showStatistics();
    }
    @Test
    public void testCalculatePost0Comments0Users100(){
        //Given
        Statistics statisticsMock=mock(Statistics.class);

        ForumStatistics forumStatistics=new ForumStatistics(statisticsMock);

        List<String> resultUsers=new ArrayList<>();
        List<String> resultUsers100=generateListOfUsers(100);
        when(statisticsMock.usersNames()).thenReturn(resultUsers100);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(100, forumStatistics.getUsersResult());
        assertEquals(0, forumStatistics.getPostsResult());
        assertEquals(0, forumStatistics.getCommentsResult());
        assertEquals(0, forumStatistics.getAdvPostsForUser());
        assertEquals(0, forumStatistics.getAdvCommentsForUser());
        assertEquals(0, forumStatistics.getAdvCommentsForPost());

        forumStatistics.showStatistics();
    }

    @Test
    public void testCalculatePost1000Comments0Users100(){
        //Given
        Statistics statisticsMock=mock(Statistics.class);

        ForumStatistics forumStatistics=new ForumStatistics(statisticsMock);

        List<String> resultUsers=new ArrayList<>();
        List<String> resultUsers100=generateListOfUsers(100);
        when(statisticsMock.usersNames()).thenReturn(resultUsers100);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(100, forumStatistics.getUsersResult());
        assertEquals(1000, forumStatistics.getPostsResult());
        assertEquals(0, forumStatistics.getCommentsResult());
        assertEquals(10, forumStatistics.getAdvPostsForUser());
        assertEquals(0, forumStatistics.getAdvCommentsForUser());
        assertEquals(0, forumStatistics.getAdvCommentsForPost());

        forumStatistics.showStatistics();
    }
    @Test
    public void testCalculatePost1000Comments2000Users100(){
        //Given
        Statistics statisticsMock=mock(Statistics.class);

        ForumStatistics forumStatistics=new ForumStatistics(statisticsMock);

        List<String> resultUsers=new ArrayList<>();
        List<String> resultUsers100=generateListOfUsers(100);
        when(statisticsMock.usersNames()).thenReturn(resultUsers100);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(2000);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(100, forumStatistics.getUsersResult());
        assertEquals(1000, forumStatistics.getPostsResult());
        assertEquals(2000, forumStatistics.getCommentsResult());
        assertEquals(10, forumStatistics.getAdvPostsForUser());
        assertEquals(20, forumStatistics.getAdvCommentsForUser());
        assertEquals(2, forumStatistics.getAdvCommentsForPost());

        forumStatistics.showStatistics();
    }


}

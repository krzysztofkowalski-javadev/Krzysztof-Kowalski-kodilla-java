package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theForumUserList= new ArrayList<>();
    public Forum(){
        theForumUserList.add(new ForumUser(1,"angel23",'M',1992,07,23,23));
        theForumUserList.add(new ForumUser(2,"smallMouse",'F',1978,03,11,54));
        theForumUserList.add(new ForumUser(3,"crazy02",'M',2001,12,29,0));
        theForumUserList.add(new ForumUser(4,"Monica80",'F',1980,04,05,8));
        theForumUserList.add(new ForumUser(5,"Ghost",'M',2002,06,26,222));

    }
    public List<ForumUser> getList(){
        return  new ArrayList<>(theForumUserList);
    }
}

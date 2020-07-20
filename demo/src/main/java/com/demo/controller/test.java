package com.demo.controller;

import com.demo.entity.User;

import java.util.ArrayList;
import java.util.List;

public class test {

    public static void main(String[] args) {

        User user1 = new User();
        List<User> userList = new ArrayList<User>();
        User user = new User();
        for (int i = 0; i < 10; i++) {

            user.setUserName(i + " ");
            userList.add(user);
        }

        System.out.println(userList.size());

        for (int i = 0; i < userList.size(); i++) {
            System.out.println(userList.get(i).getUserName());
        }

    }
}





 /*   List<User> returnResult = new ArrayList<>();
    for (int i = 0; i < num; i++) {
        List<User> data = Rows.get(i).elements();
        AlarmInfo ai  = new AlarmInfo(); //创建对象
        ai.setAlarmCode(data.get(ac).getTextTrim());
        ai.setAlarmCategory(data.get(acg).getTextTrim());
        returnResult.add(ai);
    }*/





















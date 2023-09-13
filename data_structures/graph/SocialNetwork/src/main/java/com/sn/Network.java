package com.sn;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Network {

    Scanner read = new Scanner(System.in);
    private HashMap<String,User> userList = new HashMap<>();
    Set<User> visited = new HashSet<>();
    String input;

    public void takeUser(){
        System.out.println("User name:");
        input = read.nextLine();
        User user = new User();
        user.name = input;
        userList.put(input,user);
    }

    public void addFriend(){
        System.out.println("User:");
        input = read.nextLine();

        User temp = null;

        if(userList.get(input) != null){
            temp = userList.get(input);
        }else{
            temp = new User();
            temp.name = input;
            userList.put(input,temp);
        }

        System.out.println("Friend:");
        input = read.nextLine();

        if(userList.get(input) != null){
            temp.friends.add(userList.get(input));
        }else{
            User userFriend = new User();
            userFriend.name = input;
            userList.put(input,userFriend);
            temp.friends.add(userFriend);

        }
    }

    private void dfs(User user){
        visited.add(user);
        for(int i=0; i < user.friends.size(); i++){
            System.out.println(user.name + " - "+user.friends.get(i).name);
            if(!visited.contains(user.friends.get(i)))
                dfs(user.friends.get(i));
        }

        return;
    }

    public void display(String name){
        if(userList.get(name) != null){
            dfs(userList.get(name));
        }
    }



}

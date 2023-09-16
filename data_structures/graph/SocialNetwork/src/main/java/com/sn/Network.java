package com.sn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Network {

    Scanner read = new Scanner(System.in);
    private HashMap<String,User> userList = new HashMap<>();
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

    private void dfs(User user,Set<User> visited){
        visited.add(user);
        for(int i=0; i < user.friends.size(); i++){
            // System.out.println(user.name + " - "+user.friends.get(i).name);
            if(!visited.contains(user.friends.get(i)))
                dfs(user.friends.get(i),visited);
        }

        return;
    }

    public void display(String name){
        Set<User> visited = new HashSet<>();
        if(userList.get(name) != null){
            dfs(userList.get(name),visited);
        }
        System.out.println(visited);
    }

    public Set<User> comm(String name){
        Set<User> visited = new HashSet<>();
        if(userList.get(name) != null){
            dfs(userList.get(name),visited);
        }
        return visited;
    }

    public void shortestPath(String source, String sink){
        User src = userList.get(source);
        User snk = userList.get(sink);
        ArrayList<User> shortestpath = new ArrayList<>();
        sp(src,snk,0,Integer.MAX_VALUE,new ArrayList<User>(),shortestpath);
        System.out.println(shortestpath);
    }

    private void sp(User source, User sink,int currpath,int path,ArrayList<User> curr,ArrayList<User> sp){
        if(source == sink){
            if(currpath < path ){
                path = currpath;
                sp.clear();
                sp.addAll(curr);
                sp.add(source);
            }
        }
        for(int i=0; i < source.friends.size(); i++){
            currpath++;
            curr.add(source);
            sp(source.friends.get(i),sink,currpath,path,curr,sp);
            curr.remove(curr.get(curr.size()-1));
            currpath--;
        }
    }

    public int centralityMeasure(String user){
       return userList.get(user).friends.size();
    }

    public void findCommunities(){
        Set<User> visited = new HashSet<>();
        for(String key: userList.keySet()){
            if(!visited.contains(userList.get(key))){
                visited.addAll(comm(key));
                System.out.println(comm(key));

            }
        }
    }



}

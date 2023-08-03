package com.movieTicket;
import com.movieTicket.controller.*;
import com.movieTicket.model.*;

/**
 * Hello world!
 *
 */
public class  Main
{
    public static void main( String[] args )
    {
        Database database = new Database();
        Register reg = new Register(database);

        reg.userForm();
        reg.addUser();
        reg.userForm();
        reg.addUser();

    }
}

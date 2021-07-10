package dev.edmt.android_app_server.Common;

import dev.edmt.android_app_server.Model.Request;
import dev.edmt.android_app_server.Model.User;

public class Common {

    public static User currentUser;
    public static Request currentRequest;
    public static final String UPDATE = "Update";
    public static final String DELETE = "Delete";
    public static int PICK_IMAGE_REQUEST = 71;

    public static String convertCodeToStatus(String code)
    {
        if(code.equals("0"))
            return "Placed";
        else if(code.equals("1"))
            return "On my way";
        else
            return "Shipped";
    }



}

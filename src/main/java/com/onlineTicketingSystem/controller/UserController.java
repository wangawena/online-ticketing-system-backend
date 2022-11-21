package com.onlineTicketingSystem.controller;


import com.onlineTicketingSystem.pojo.Result;
import com.onlineTicketingSystem.pojo.Token;
import com.onlineTicketingSystem.pojo.User;
import com.onlineTicketingSystem.server.UserServer;
import com.onlineTicketingSystem.util.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserServer userServer;

    @GetMapping("/login")
    public Result login(User user)
    {
        Result result=new Result();
        result.setCode(400);
        result.setMsg("false");

        User u = userServer.selectuser(user);
        if(u==null)
            return result;
        else
        {
            result.setCode(200);
            result.setMsg("success");
            JWTUtil jwtUtil=new JWTUtil();
            Token token=new Token();

            String radomString=jwtUtil.randomString();
            String time= String.valueOf(System.currentTimeMillis());

            token.setToken(jwtUtil.getToken(u.getUsername(),radomString,time));
            result.setData(token);
        }
        return result;
    }
}

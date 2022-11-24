package com.onlineTicketingSystem.controller;


import com.onlineTicketingSystem.pojo.*;
import com.onlineTicketingSystem.pojo.son.TickInformation;
import com.onlineTicketingSystem.server.InformationServer;
import com.onlineTicketingSystem.server.TickInformationServer;
import com.onlineTicketingSystem.server.UserServer;
import com.onlineTicketingSystem.util.JWTUtil;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserServer userServer;

    @Autowired
    InformationServer informationServer;

    @Autowired
    TickInformationServer tickInformationServer;

    @PostMapping("/login")
    public Result login(User user)
    {
        Result result=new Result();
        result.setCode(400);
        result.setMsg("登录失败");

        User u = userServer.selectuser(user);
        if(u==null)
            return result;
        else
        {
            result.setCode(200);
            result.setMsg("登录成功");
            JWTUtil jwtUtil=new JWTUtil();
            Token token=new Token();

            String radomString=jwtUtil.randomString();
            String time= String.valueOf(System.currentTimeMillis());

            token.setToken(jwtUtil.getToken(u.getUsername(),radomString,time));
            result.setData(token);
        }
        return result;
    }

    @PostMapping("/register")
    public Result register(User user)
    {
        Result result=new Result();
        result.setMsg("注册失败");
        result.setCode(userServer.createUser(user));
        if(result.getCode()==200)
            result.setMsg("注册成功");
        else if(result.getCode()==402)
            result.setMsg("账户名已存在");
        return  result;
    }

    @PostMapping("/user/findAllUserPost")
    public List<String> findAllUserPost()
    {
        return userServer.findAllUSer();
    }

    @GetMapping("/user/findAllUserGet")
    public Order findAllUserGet(String username)
    {
        Order order=new Order();
        order.setUsername(username);
        order.setInformation(informationServer.findInformationByName(username));
        return order;
    }


    @GetMapping("/user/findAllTickByName")
    public UserTickInformation findAllTickByName(String username)
    {
        UserTickInformation userTickInformation=new UserTickInformation();
        userTickInformation.setUsername(username);
        List<TickInformation> tickInformations=new ArrayList<>();
        tickInformations=tickInformationServer.findAllTickByName(username);
        userTickInformation.setTickInformation(tickInformations);
        return userTickInformation;
    }


    @PostMapping("/user/ByTick")
    public Result ByTick(@RequestBody  UserTickInformation userTickInformation)
    {
        Result result=new Result();
        System.out.println("userTickInformation:"+userTickInformation.getUsername()
        +"\n"+userTickInformation.getTickInformation().toString());
        tickInformationServer.ByTick(userTickInformation);
        result.setCode(200);
        result.setMsg("购票成功");
        return  result;
    }
}

package com.onlineTicketingSystem.server;

import java.util.List;

public interface ActosuriServer {


    public List<String> findAllActosuriByID(int id);

    public void deleteById(int id);
}

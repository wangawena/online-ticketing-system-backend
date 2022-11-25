package com.onlineTicketingSystem.server.impl;


import com.onlineTicketingSystem.dao.ActosuriDao;
import com.onlineTicketingSystem.dao.CommentDao;
import com.onlineTicketingSystem.dao.DescriptionDao;
import com.onlineTicketingSystem.dao.GalleryuriDao;
import com.onlineTicketingSystem.pojo.Description;
import com.onlineTicketingSystem.server.ActosuriServer;
import com.onlineTicketingSystem.server.DescriptionServer;
import com.onlineTicketingSystem.server.GalleryuriServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DescriptionServerImpl implements DescriptionServer {

    @Autowired
    DescriptionDao descriptionDao;

    @Autowired
    ActosuriDao actosuriDao;

    @Autowired
    GalleryuriDao galleryuriDao;

    @Autowired
    CommentDao commentDao;

    @Override
    public Description findAllDescByID(int id) {
        Description description=new Description();
        description=descriptionDao.findAllDescByID(id);
        return description;
    }

    @Override
    public void deleteById(int id) {
        descriptionDao.deleteById(id);
        //删除电影演员图片
        actosuriDao.deleteById(id);
        //删除电影海报
        galleryuriDao.deleteById(id);
        //删除电影评论
        commentDao.deleteById(id);
    }
}

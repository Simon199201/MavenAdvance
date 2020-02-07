package com.itheima.service.impl;

import com.itheima.dao.ItemMapper;
import com.itheima.pojo.Item;
import com.itheima.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemMapper itemMapper;

    @Override
    public Item findItemById(int id) {
        return itemMapper.findById(id);
    }
}

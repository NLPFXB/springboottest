package project.dao;

import project.datasource.DatabaseContextHolder;
import project.datasource.DatabaseType;
import project.mapper.ShopMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import project.user.Shop;

@Repository
public class ShopDao {
    @Autowired
    private ShopMapper shopMapper;

    /**
     * 获取shop
     */
    public Shop getShop(int id) {
        return shopMapper.getShop(id);
    }
}
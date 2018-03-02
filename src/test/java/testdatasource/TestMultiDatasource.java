package testdatasource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import project.dao.ShopDao;
import project.start;
import project.user.Shop;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootApplication
@SpringApplicationConfiguration(start.class)
public class TestMultiDatasource {
    @Autowired
    private ShopDao shopDao;

    @Test
    public void test(){
        Shop shop =shopDao.getShop(1);
        System.out.println(shop.getId());
    }
}

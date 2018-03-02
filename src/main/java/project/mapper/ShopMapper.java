package project.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import project.user.Shop;

@Mapper
public interface ShopMapper {
    @Select("SELECT * FROM test1 WHERE id = #{id}")
    public Shop getShop(@Param("id") int id);

}
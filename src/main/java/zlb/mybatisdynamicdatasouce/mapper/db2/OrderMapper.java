package zlb.mybatisdynamicdatasouce.mapper.db2;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import zlb.mybatisdynamicdatasouce.entity.Order;
import org.apache.ibatis.annotations.Select;
import java.math.BigDecimal;

/**
 *  Mapper 接口
 */
public interface OrderMapper extends BaseMapper<Order> {

    @Select("SELECT price from orders WHERE user_id = #{userId}")
    BigDecimal getPriceByUserId(Integer userId);
}
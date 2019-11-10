package zlb.mybatisdynamicdatasouce.service;

import com.baomidou.mybatisplus.extension.service.IService;
import zlb.mybatisdynamicdatasouce.entity.Order;
import java.math.BigDecimal;
import java.util.List;

/**
 *  服务类
 */
public interface OrderService extends IService<Order> {
    List<Order> getOrderList();
    BigDecimal getOrderPriceByUserId(Integer userId);
}
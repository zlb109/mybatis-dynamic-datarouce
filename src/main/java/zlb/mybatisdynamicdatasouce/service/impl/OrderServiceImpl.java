package zlb.mybatisdynamicdatasouce.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import zlb.mybatisdynamicdatasouce.config.ReadOnly;
import zlb.mybatisdynamicdatasouce.entity.Order;
import zlb.mybatisdynamicdatasouce.mapper.db2.OrderMapper;
import zlb.mybatisdynamicdatasouce.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * 服务实现类
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Override
    @ReadOnly
    public List<Order> getOrderList() {
        return orderMapper.selectList(null);
    }

    @Override
    public BigDecimal getOrderPriceByUserId(Integer userId) {
        return orderMapper.getPriceByUserId(userId);
    }
}
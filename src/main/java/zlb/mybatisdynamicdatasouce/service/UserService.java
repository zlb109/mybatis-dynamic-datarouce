package zlb.mybatisdynamicdatasouce.service;

import com.baomidou.mybatisplus.extension.service.IService;
import zlb.mybatisdynamicdatasouce.entity.User;
import java.math.BigDecimal;
import java.util.List;

/**
 *  服务类
 */
public interface UserService extends IService<User> {
    List<User> getUserList();

    BigDecimal getOrderPriceByUserId(Integer userId);
}
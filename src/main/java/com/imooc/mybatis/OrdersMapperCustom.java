package com.imooc.mybatis;

import java.util.List;

import com.imooc.entity.Orders;
import com.imooc.entity.OrdersCustom;
import com.imooc.entity.User;

/**
 * 
 * <p>Title: UserDao</p>
 * <p>Description: 用户mapper</p>
 * <p>Company: www.itcast.com</p> 
 * @author	传智.燕青
 * @date	2015-3-17下午2:47:51
 * @version 1.0
 */
public interface OrdersMapperCustom {
	
	public List<OrdersCustom> findOrdersUser() throws Exception;
    
	//查询订单关联查询使用resultMap
	public List<Orders> findOrdersUserResultMap() throws Exception;
	
	public List<Orders> findOrdersAndOrderDetailResultMap() throws Exception;
	
	public List<User> findUserAndItemsResultMap() throws Exception;
	
	//延迟加载
	public List<Orders> findOrdersUserLazyLoadingMap() throws Exception;
}

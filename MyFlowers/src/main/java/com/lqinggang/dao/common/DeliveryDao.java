package com.lqinggang.dao.common;

import java.util.List;

import com.lqinggang.common.dao.BaseDao;
import com.lqinggang.entity.common.Delivery;

/**
 * @author LQingGang
 * @time 2018年3月22日 - 下午2:37:18
 */
public interface DeliveryDao extends BaseDao<Delivery>{
	
	/**
	 * 添加配送信息
	 * @param delivery
	 * @return void
	 */
	public void addDelivery(Delivery delivery);

	/**
	 * 删除配送信息
	 * @param order_id
	 * @return void
	 */
	public void deleteDelivery(String order_id);
	
	/**
	 * 查询配送状态
	 * @param order_id
	 * @return Delivery
	 */
	public List<Delivery> queryDelivery(int order_id);
	
	
	/**
	 * 更新配送状态
	 * @param delivery
	 * @return void
	 */
	public void updateDelivery(Delivery delivery);
	
}

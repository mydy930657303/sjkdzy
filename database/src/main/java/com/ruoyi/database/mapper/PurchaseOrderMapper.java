package com.ruoyi.database.mapper;

import java.util.List;
import com.ruoyi.database.domain.PurchaseOrder;

/**
 * 采购订单Mapper接口
 * 
 * @author tinaliasd
 * @date 2022-12-05
 */
public interface PurchaseOrderMapper 
{
    /**
     * 查询采购订单
     * 
     * @param purchaseOrderId 采购订单主键
     * @return 采购订单
     */
    public PurchaseOrder selectPurchaseOrderByPurchaseOrderId(Long purchaseOrderId);

    /**
     * 查询采购订单列表
     * 
     * @param purchaseOrder 采购订单
     * @return 采购订单集合
     */
    public List<PurchaseOrder> selectPurchaseOrderList(PurchaseOrder purchaseOrder);

    /**
     * 新增采购订单
     * 
     * @param purchaseOrder 采购订单
     * @return 结果
     */
    public int insertPurchaseOrder(PurchaseOrder purchaseOrder);

    /**
     * 修改采购订单
     * 
     * @param purchaseOrder 采购订单
     * @return 结果
     */
    public int updatePurchaseOrder(PurchaseOrder purchaseOrder);

    /**
     * 删除采购订单
     * 
     * @param purchaseOrderId 采购订单主键
     * @return 结果
     */
    public int deletePurchaseOrderByPurchaseOrderId(Long purchaseOrderId);

    /**
     * 批量删除采购订单
     * 
     * @param purchaseOrderIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePurchaseOrderByPurchaseOrderIds(Long[] purchaseOrderIds);
}

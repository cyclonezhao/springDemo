package org.example.dao.mapper;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.example.entity.Order;
import org.example.entity.Product;

import java.util.List;
import java.util.Map;

@Mapper
public interface XmlMapperDemo {
    Order getOrder(@Param("id") int id);
    Order getRelatedProducts(@Param("id") int id);

    List<Order> getOrderLst();

    @MapKey("id")
    Map<Integer, Order> getOrderMap();

    @Update("update t_order set intField1 = intField1 + 1 where id=1")
    void updateIntField2();

    @Update("update t_order set intField2 = intField2 + 1 where id=1")
    void updateIntField1();
}

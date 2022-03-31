package com.webservicescourse.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservicescourse.course.entities.OrderItem;
import com.webservicescourse.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}

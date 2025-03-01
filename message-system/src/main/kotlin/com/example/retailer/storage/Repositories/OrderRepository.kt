package com.example.retailer.storage.Repositories

import com.example.retailer.api.distributor.Order
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface OrderRepository : CrudRepository<Order, String> {
}
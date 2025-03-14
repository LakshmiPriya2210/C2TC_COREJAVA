// src/App.js
import React, { useEffect, useState } from 'react';
import axios from 'axios';
import OrderList from './OrderList';
import OrderForm from './OrderForm';
import './App.css';
import './OrderForm.css';
import './OrderList.css';
import './index.css';

const App = () => {
  const [orders, setOrders] = useState([]);

  useEffect(() => {
    fetchOrders();
  }, []);

  const fetchOrders = async () => {
    try {
      const response = await axios.get('http://localhost:8080/orders/all');
      setOrders(response.data);
    } catch (error) {
      console.error('Error fetching orders:', error);
    }
  };

  const addOrder = async (order) => {
    try {
      const response = await axios.post('http://localhost:8080/orders/create', order);
      setOrders([...orders, response.data]);
    } catch (error) {
      console.error('Error adding order:', error);
    }
  };

  const removeOrder = async (id) => {
    try {
      await axios.delete(`http://localhost:8080/orders/${id}`);
      setOrders(orders.filter(order => order.id !== id));
    } catch (error) {
      console.error('Error removing order:', error);
    }
  };

  return (
    <div className="app">
      <h1>Order Management</h1>
      <OrderForm addOrder={addOrder} />
      <OrderList orders={orders} removeOrder={removeOrder} />
    </div>
  );
};

export default App;

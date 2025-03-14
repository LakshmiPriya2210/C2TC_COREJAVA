// src/components/OrderForm.js
import React, { useState } from 'react';

const OrderForm = ({ addOrder }) => {
  const [customerName, setCustomerName] = useState('');
  const [product, setProduct] = useState('');
  const [quantity, setQuantity] = useState(1);
  const [price, setPrice] = useState(0.0);

  const handleSubmit = (e) => {
    e.preventDefault();
    const newOrder = {
      customerName,
      product,
      quantity: parseInt(quantity, 10),
      price: parseFloat(price)
    };
    addOrder(newOrder);
    setCustomerName('');
    setProduct('');
    setQuantity(1);
    setPrice(0.0);
  };

  return (
    <form onSubmit={handleSubmit} className="order-form">
      <h2>Place an Order</h2>
      <div>
        <label>
          Customer Name:
          <input
            type="text"
            value={customerName}
            onChange={(e) => setCustomerName(e.target.value)}
            required
          />
        </label>
      </div>
      <div>
        <label>
          Product:
          <input
            type="text"
            value={product}
            onChange={(e) => setProduct(e.target.value)}
            required
          />
        </label>
      </div>
      <div>
        <label>
          Quantity:
          <input
            type="number"
            value={quantity}
            onChange={(e) => setQuantity(e.target.value)}
            required
          />
        </label>
      </div>
      <div>
        <label>
          Price:
          <input
            type="number"
            step="0.01"
            value={price}
            onChange={(e) => setPrice(e.target.value)}
            required
          />
        </label>
      </div>
      <button type="submit">Submit Order</button>
    </form>
  );
};

export default OrderForm;

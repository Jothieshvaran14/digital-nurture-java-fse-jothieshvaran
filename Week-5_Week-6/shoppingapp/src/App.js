import Cart from "./Cart";

function App() {
  const items = [
    { Itemname: "Laptop", Price: 65000 },
    { Itemname: "Mouse", Price: 800 },
    { Itemname: "Keyboard", Price: 1500 },
    { Itemname: "Monitor", Price: 12000 },
    { Itemname: "Headphones", Price: 2500 },
  ];

  return (
    <div>
      <h2>Shopping Cart</h2>
      <table border="1">
        <thead>
          <tr>
            <th>Item</th>
            <th>Price</th>
          </tr>
        </thead>
        <tbody>
          {items.map((item, index) => (
            <Cart
              key={index}
              Itemname={item.Itemname}
              Price={item.Price}
            />
          ))}
        </tbody>
      </table>
    </div>
  );
}

export default App;
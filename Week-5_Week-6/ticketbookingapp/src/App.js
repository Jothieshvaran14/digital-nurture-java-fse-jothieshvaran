import { useState } from "react";

function App() {
  const [count, setCount] = useState(0);

  const increment = () => {
    setCount(count + 1);
  };

  const decrement = () => {
    if (count > 0) {
      setCount(count - 1);
    }
  };

  return (
    <div style={{ textAlign: "center", marginTop: "40px" }}>
      <h2>Ticket Booking App</h2>

      <h3>Tickets Booked: {count}</h3>

      <button onClick={increment}>Book Ticket</button>

      <button onClick={decrement} style={{ marginLeft: "10px" }}>
        Cancel Ticket
      </button>
    </div>
  );
}

export default App;
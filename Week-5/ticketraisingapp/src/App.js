import { useState } from "react";

function App() {
  const [ticket, setTicket] = useState("");
  const [tickets, setTickets] = useState([]);

  const raiseTicket = () => {
    if (ticket.trim() !== "") {
      setTickets([...tickets, ticket]);
      setTicket("");
    }
  };

  return (
    <div style={{ padding: "20px" }}>
      <h2>Ticket Raising App</h2>

      <input
        type="text"
        placeholder="Enter issue"
        value={ticket}
        onChange={(e) => setTicket(e.target.value)}
      />

      <button onClick={raiseTicket} style={{ marginLeft: "10px" }}>
        Raise Ticket
      </button>

      <h3>Raised Tickets</h3>
      <ul>
        {tickets.map((item, index) => (
          <li key={index}>{item}</li>
        ))}
      </ul>
    </div>
  );
}

export default App;
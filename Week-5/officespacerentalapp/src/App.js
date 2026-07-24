function App() {
  const office = {
    name: "Tech Park Office",
    rent: 65000,
    address: "Chennai",
    image:
      "https://images.unsplash.com/photo-1497366754035-f200968a6e72?w=600",
  };

  return (
    <div style={{ padding: "20px" }}>
      <h1>Office Space Rental</h1>

      <img
        src={office.image}
        alt="Office"
        width="400"
        height="250"
      />

      <h2>{office.name}</h2>

      <h3
        style={{
          color: office.rent <= 60000 ? "red" : "green",
        }}
      >
        Rent: ₹{office.rent}
      </h3>

      <p>Address: {office.address}</p>
    </div>
  );
}

export default App;
import React from "react";

function ListofPlayers() {
  const players = [
    "Sachin",
    "Virat",
    "Dhoni",
    "Rohit",
    "Gill",
    "Hardik",
    "Jadeja",
    "Bumrah",
    "Rahul",
    "Pant",
    "Surya",
  ];

  const oddPlayers = players.filter((_, index) => index % 2 === 0);
  const evenPlayers = players.filter((_, index) => index % 2 !== 0);

  return (
    <div>
      <h2>List of Players</h2>

      <h3>Odd Team Players</h3>
      <ul>
        {oddPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>

      <h3>Even Team Players</h3>
      <ul>
        {evenPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>
    </div>
  );
}

export default ListofPlayers;
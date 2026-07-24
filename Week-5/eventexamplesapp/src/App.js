function App() {
  const onClickHandler = () => {
    alert("I was clicked");
  };

  const onMouseOverHandler = () => {
    alert("Mouse Hovered");
  };

  return (
    <div style={{ textAlign: "center", marginTop: "40px" }}>
      <h2>Event Examples App</h2>

      <button onClick={onClickHandler}>Click Me</button>

      <br />
      <br />

      <button onMouseOver={onMouseOverHandler}>
        Hover Over Me
      </button>
    </div>
  );
}

export default App;
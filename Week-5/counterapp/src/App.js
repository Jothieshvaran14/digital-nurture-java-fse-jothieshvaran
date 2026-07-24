import { Component } from "react";

class CountPeople extends Component {
  constructor() {
    super();
    this.state = {
      entrycount: 0,
      exitcount: 0,
    };
  }

  UpdateEntry = () => {
    this.setState({ entrycount: this.state.entrycount + 1 });
  };

  UpdateExit = () => {
    this.setState({ exitcount: this.state.exitcount + 1 });
  };

  render() {
    return (
      <div style={{ textAlign: "center" }}>
        <h2>People Counter</h2>
        <p>Entered: {this.state.entrycount}</p>
        <button onClick={this.UpdateEntry}>Login</button>

        <p>Exited: {this.state.exitcount}</p>
        <button onClick={this.UpdateExit}>Exit</button>
      </div>
    );
  }
}

export default CountPeople;
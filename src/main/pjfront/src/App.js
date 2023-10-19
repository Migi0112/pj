import logo from './logo.svg';
import React, {useState} from 'react';
import './App.css';

function App() {
  const [text, setText] = useState("");

  return (
    <div className="App">
      <header className="App-header">
        <input type="text" value={text} onChange={(e) => {setText(e.target.value);}}/>

        <img src={logo} className="App-logo" alt="logo" />
        <p>
          리액트 메인화면!!
        </p>
      </header>
    </div>
  );
}

export default App;
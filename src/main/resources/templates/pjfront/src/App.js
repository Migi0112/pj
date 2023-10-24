import logo from './logo.svg';
import React, {useState} from 'react';
import './App.css';

function App() {
  const [text, setText] = useState("");

  return (
    <div className="App">
      <header className="App-header">
        <div>
          <input type="text" className="textInput" value={text} onChange={(e) => {setText(e.target.value);}}/>
          <a href="" title="Button border lightblue" className="button btnFloat btnLightBlue"></a>
        </div>
        <img src={logo} className="App-logo" alt="logo" />        
      </header>
    </div>
  );
}

export default App;
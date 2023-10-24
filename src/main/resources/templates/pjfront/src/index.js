import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import './bootstrap.min.css';
import './main.css';
import App from './App';
import Header from './main/inc/Header'
import reportWebVitals from './reportWebVitals';

const root = ReactDOM.createRoot(document.getElementById('root'));

root.render(
<React.StrictMode>
  <Header />
  <App />
</React.StrictMode>
);

reportWebVitals();
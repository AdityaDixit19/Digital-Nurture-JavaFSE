import React from 'react';
import Counter from './Components/Counter';
import WelcomeButton from './Components/WelcomeButton';
import SyntheticEventButton from './Components/SyntheticEventButton';
import CurrencyConvertor from './Components/CurrencyConvertor';

function App() {
  return (
    <div className="App">
      <h1>eventexamplesapp</h1>
      <p style={{ textAlign: 'center', color: '#555' }}>
        React Event Handling Lab
      </p>

      <Counter />
      <WelcomeButton />
      <SyntheticEventButton />
      <CurrencyConvertor />
    </div>
  );
}

export default App;
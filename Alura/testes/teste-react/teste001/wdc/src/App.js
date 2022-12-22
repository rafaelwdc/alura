import './App.css';
import { useState } from 'react'

function App() {
  const [nome, setNome] = useState('Rafa')
  function alterarNome() {
    setNome('Rafael Matheus de Freitas')
  }
  return (
    <div className="App">
      <header className="App-header">
        <h1>{nome}</h1>
        <button onClick={alterarNome}>Mudar nome para nome completo</button>
      </header>
    </div>
  );
}

export default App;

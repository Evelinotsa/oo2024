import { useEffect, useRef, useState } from "react";
import "./App.css";

function App() {
  const [joed, setjoed] = useState([]);
  const nimetusRef = useRef();
  const lahtmeXRef = useRef();
  const lahtmeYRef = useRef();
  const suudmeXRef = useRef();
  const suudmeYRef = useRef();
  const kiirusRef = useRef();

  useEffect(() => {
    fetch("http://localhost:8080/joed")
      .then((response) => response.json())
      .then((body) => {
        setjoed(body);
      });
  }, []);

  function kustuta(primaarivoti) {
    fetch("http://localhost:8080/joed/" + primaarivoti, { method: "DELETE" })
      .then((response) => response.json())
      .then((json) => {
        setjoed(json);
      });
  }

  function lisa() {
    if (nimetusRef.current.value.trim() === "") {
      return;
    }
    const joed = {
      nimetus: nimetusRef.current.value,
      lahtmeX: lahtmeXRef.current.value,
      lahtmeY: lahtmeYRef.current.value,
      suudmeX: suudmeXRef.current.value,
      suudmeY: suudmeYRef.current.value,
      kiirus: kiirusRef.current.value,
    };
    fetch("http://localhost:8080/joed", {
      method: "POST",
      body: JSON.stringify(joed),
      headers: { "Content-Type": "application/json" },
    })
      .then((response) => response.json())
      .then((json) => {
        setjoed(json);
      });
  }

  return (
    <div className="App">
      <div>
        <label>Jõe nimi</label> <br />
        <input ref={nimetusRef} type="text" /> <br />
        <label>Jõe lahtmeX</label> <br />
        <input ref={lahtmeXRef} type="text" /> <br />
        <label>Jõe lahtmeY</label> <br />
        <input ref={lahtmeYRef} type="text" /> <br />
        <label>Jõe suudmeX</label> <br />
        <input ref={suudmeXRef} type="text" /> <br />
        <label>Jõe suudmeY</label> <br />
        <input ref={suudmeYRef} type="text" /> <br />
        <label>Jõe kiirus</label> <br />
        <input ref={kiirusRef} type="text" /> <br />
        <button onClick={() => lisa()}>Sisesta</button> <br />
        <br />
        {joed.map((t) => (
          <div>
            {t.id} | {t.nimetus} | {t.lahtmeX} | {t.lahtmeY} | {t.suudmeX} |{" "}
            {t.suudmeY} | {t.kiirus}
            <button onClick={() => kustuta(t.id)}>x</button>
          </div>
        ))}
      </div>
    </div>
  );
}

export default App;

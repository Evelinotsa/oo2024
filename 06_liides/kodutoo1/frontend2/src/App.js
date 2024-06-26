import { useRef, useState } from "react";
import "./App.css";
import { useEffect } from "react";

function App() {
  const [kogus, setKogus] = useState(0); //HTMLis esinevad muutujad peavad olema useState sees
  const [looma, setLooma] = useState([]);
  const nimiRef = useRef();
  const populatsioonRef = useRef();
  const eluigaRef = useRef();
  const kaalRef = useRef();
  const [loomapood, setLoomapood] = useState([]);

  useEffect(() => {
    fetch("http://localhost:8080/api/loomad")
      .then((response) => response.json())
      .then((json) => {
        setLoomapood(json);
      });
  }, []);

  //uef
  useEffect(() => {
    fetch("http://localhost:8080/api/loomad")
      .then((response) => response.json())
      .then((json) => {
        setKogus(json.length);
        setLooma(json);
      });
  }, []);

  function kustuta(primaarvoti) {
    fetch("http://localhost:8080/api/loomad/" + primaarvoti, {
      method: "DELETE",
    })
      .then((response) => response.json())
      .then((json) => {
        if (json.error) {
          alert("Loom on hetkel loomapoes!");
          return;
        }
        setKogus(json.length);
        setLooma(json);
      });
  }

  function lisa() {
    if (nimiRef.current.value.trim() === "") {
      return;
    }
    const loom = {
      nimetus: nimiRef.current.value,
      populatsioon: populatsioonRef.current.value,
      keskmineEluiga: eluigaRef.current.value,
      keskmineKaal: kaalRef.current.value,
    };
    fetch("http://localhost:8080/api/loomad", {
      method: "POST",
      body: JSON.stringify(loom),
      headers: { "Content-Type": "application/json" },
    })
      .then((response) => response.json())
      .then((json) => {
        setKogus(json.length);
        setLooma(json);
      });
  }

  function kustutaLP(primaarivoti) {
    fetch("http://localhost:8080/loomapood/" + primaarivoti, {
      method: "DELETE",
    })
      .then((response) => response.json())
      .then((json) => {
        if (json.error) {
          alert("Loom on kasutusel!"); // toastify
          return;
        }
        setLoomapood(json);
      });
  }

  const lpNimiRef = useRef();
  const kogusRef = useRef();

  function lisaLP() {
    const lisatavLP = {
      loom: { nimetus: lpNimiRef.current.value },
      kogus: kogusRef.current.value,
    };
    fetch("http://localhost:8080/loomapood", {
      method: "POST",
      body: JSON.stringify(lisatavLP),
      headers: { "Content-Type": "application/json" },
    })
      .then((response) => response.json())
      .then((json) => {
        fetch("http://localhost:8080/loomapood")
          .then((response) => response.json())
          .then((json) => {
            setLoomapood(json);
          });
      });
  }

  return (
    <div className="App">
      Mul on {kogus} looma
      <br /> <br />
      <label>Looma nimetus</label> <br />
      <input ref={nimiRef} type="text" /> <br />
      <label>Looma populatsioon</label> <br />
      <input ref={populatsioonRef} type="number" /> <br />
      <label>Looma keskmine eluiga</label> <br />
      <input ref={eluigaRef} type="number" /> <br />
      <label>Looma keskmine kaal</label> <br />
      <input ref={kaalRef} type="number" /> <br />
      <button onClick={() => lisa()}>Sisesta</button> <br />
      {looma.map((l) => (
        <div>
          {l.nimetus} <br /> populatsioon:{l.populatsioon} keskmine eluiga:
          {l.keskmineEluiga} keskmine kaal:{l.keskmineKaal}{" "}
          <button onClick={() => kustuta(l.nimetus)}>x</button>{" "}
        </div>
      ))}
      <hr />
      <label>Looma nimetus (täpne nimetus andmebaasist)</label> <br />
      <input ref={lpNimiRef} type="text" /> <br />
      <label>Kogus</label> <br />
      <input ref={kogusRef} type="text" /> <br />
      <button onClick={() => lisaLP()}>Sisesta</button> <br />
      {loomapood.map((lp) => (
        <div>
          {lp.id} | {lp.loom?.nimetus} | {lp.loom?.keskmineEluiga} | {lp.kogus}{" "}
          | <button onClick={() => kustutaLP(lp.id)}>x</button>{" "}
        </div>
      ))}
    </div>
  );
}

export default App;

const express = require("express");
const bodyParser = require("body-parser");
const app = express();
const port = 8080;

app.use(bodyParser.json());

let filmes = [];

app.post("/api/filmes", (req, res) => {
  const data = req.body;
  filmes.push(data);
  console.log(data);
  res.status(201).json({ message: "Filme Adicionado com sucesso!", data });
});

app.get("/api/filmes", (req, res) => {
  res.status(200).json(filmes);
});

app.listen(port, () => {
  console.log(`server is runing in:${port}`);
});

const express = require("express");
const loginRoute = require("./route/login_route")

const port = 3000;

const app = express();

app.use(express.json()); // function to parse incoming JSON payloads
app.use(express.urlencoded()); // function to parse incoming URL-encoded payloads

app.get("/", (req, res) => {
  res.status(200).send({ message: "Kukkuluuruu" });
  res.end;
});

app.use("/login",loginRoute)

app.listen(port, () => {
  console.log(`Server listening on port ${port}...`);
});

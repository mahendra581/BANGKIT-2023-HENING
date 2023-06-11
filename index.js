const express = require("express");

const bodyParser = require("body-parser");
const v1Routes = require("./src/v1/routes/apiRoutes");

const app = express();
const PORT = process.env.PORT || 3000;

app.use(bodyParser.json());

app.use("/api/v1/", v1Routes);

app.listen(PORT, () => {
  console.log(`API is listening on port ${PORT}`);
});

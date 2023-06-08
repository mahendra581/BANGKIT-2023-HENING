const express = require("express");
const articleController = require("../../controllers/articleController");

const router = express.Router();

router.get("/", articleController.getAllArticles);

router.get("/:articleId", articleController.getOneArticles);

module.exports = router;

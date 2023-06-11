const express = require("express");
const router = express.Router();

// controller
const articleController = require("../../controllers/articleController");
const coursesController = require("../../controllers/courseController");

// Article Router
router.get("/articles", articleController.getAllArticles);
router.get("/articles/:articleId", articleController.getOneArticles);

// Course Router
router.get("/courses", coursesController.getAllCourses);
router.get("/courses/:courseId", coursesController.getOneCourses);

module.exports = router;

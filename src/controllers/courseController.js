const courseService = require("../services/courseService");

const getAllCourses = (req, res) => {
  const allCourses = courseService.getAllCourses();
  res.send({ status: "OK", data: allCourses });
};

const getOneCourses = (req, res) => {
  const {
    params: { courseId },
  } = req;
  if (!courseId) {
    return;
  }
  const course = courseService.getOneCourses(courseId);
  res.send({ status: "OK", data: course });
};

module.exports = {
  getAllCourses,
  getOneCourses,
};

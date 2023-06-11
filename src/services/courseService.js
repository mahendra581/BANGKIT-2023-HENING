const Course = require("../database/Course");

const getAllCourses = () => {
  const allCourses = Course.getAllCourses();
  return allCourses;
};

const getOneCourses = (courseId) => {
  const course = Course.getOneCourses(courseId);
  return course;
};

module.exports = {
  getAllCourses,
  getOneCourses,
};

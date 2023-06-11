const DB = require("./db.json");

const getAllCourses = () => {
  return DB.courses;
};

const getOneCourses = (courseId) => {
  const course = DB.courses.find((course) => course.id === courseId);
  if (!course) {
    return;
  }
  return course;
};

module.exports = { getAllCourses, getOneCourses };

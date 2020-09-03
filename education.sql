SELECT institution.name AS institutionName,course.name AS courseName,COUNT(institutionid) as NoOfStudents
FROM institution
LEFT JOIN course ON institution = institution.institutionid
LEFT JOIN student ON course = course.courseid
GROUP BY institution.name, course.name

function isPassing(score) {
    return score >= 90;
}
console.log(isPassing(80));

function gradeScore(score) {
    if (score >= 90) return "A";
    if (score >= 80) return "B";
    if (score >= 70) return "C";
    if (score >= 60) return "D";
    return "F";
}
console.log(gradeScore(50));

const students = [
    { id: 1, name: "Saraa", score: 94, program: "web" },
    { id: 2, name: "Bataa", score: 82, program: "java" },
    { id: 3, name: "Dorj", score: 58, program: "java" },
    { id: 4, name: "Naraa", score: 76, program: "web" }
];

function averageScore() {
    return students.reduce((sum, student) => student.score + sum, 0) / students.length;
}
console.log(averageScore());

function countPassing() {
    return students.filter(student => student.score >= 60);
}
console.log(countPassing().length);

function findHighest() {
    let highest = 0;
    for (let score of students) {
        if (highest < score.score) {
            highest = score.score;
        }
    }
    return highest;
}
console.log(findHighest());

function countByProgram() {
    let matches = 0;
    for (let s of students) {
        if (s.program.equalsIgnoreCase(program)) {
            matches.add(s);
        }
    }
    return matches;
}
console.log(countByProgram());

function studentById() {
    return students.filter(student => student.)
}
class Course {
    private String courseName;
    private Instructor instructor;
    private TextBook textBook;

    public Course(String name, Instructor instr, TextBook text) {
        this.courseName = name;
        this.instructor = instr;
        this.textBook = text;
    }

    public String toString() {
        return "Curso: " + courseName + "\n" + instructor + "\n" + textBook;
    }
}
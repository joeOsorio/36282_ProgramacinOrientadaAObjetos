class Instructor {
    private String lastName, firstName, officeNumber;

    public Instructor(String lname, String fname, String office) {
        this.lastName = lname;
        this.firstName = fname;
        this.officeNumber = office;
    }

    public String toString() {
        return "Instructor: " + firstName + " " + lastName + " (Oficina: " + officeNumber + ")";
    }
}

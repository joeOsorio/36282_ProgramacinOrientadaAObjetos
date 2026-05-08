class TextBook {
    private String title, author, publisher;

    public TextBook(String t, String a, String p) {
        this.title = t;
        this.author = a;
        this.publisher = p;
    }

    public String toString() {
        return "Libro: " + title + " por " + author + " (" + publisher + ")";
    }
}

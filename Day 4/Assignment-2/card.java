class Card {
    String TitleOfBook;
    String AuthorOfBook;
    String SubjectOfBook;

    public Card() {
    }    
    public Card(String TitleOfBook, String AuthorOfBook, String SubjectOfBook) {
        this.TitleOfBook = TitleOfBook;
        this.AuthorOfBook = AuthorOfBook;
        this.SubjectOfBook = SubjectOfBook;
    }
    public void Set_Title(String TitleOfBook) {
        this.TitleOfBook = TitleOfBook;
    }

    public void Set_Author(String AuthorOfBook) {
        this.AuthorOfBook = AuthorOfBook;
    }

    public void Set_Subject(String SubjectOfBook) {
        this.SubjectOfBook = SubjectOfBook;
    }

    public String Get_Title() {
        return this.TitleOfBook;
    }
    public String Get_Author() {
        return this.AuthorOfBook;
    }
    public String Get_Subject() {
        return this.SubjectOfBook;
    }
    public String toString() {
        return "Book Title :" + this.TitleOfBook + " , " + "Author of Book :" + this.AuthorOfBook + " , " + "Subject of Book :" + this.SubjectOfBook;
    }
}
package VOB10_a1;

public class Library {

    private Book[] books;

    public void addBook(Book book){
        if(books == null){
            books = new Book[1];//初始化一个位置放新的书
            books[0] = book;//把书添加进数组
        }else{

            Book[] booksNew = new Book[books.length + 1];
            //将原来的书通过for循环全部加入到新的数组booksnew中
            for(int i = 0; i< books.length ; i++){
                booksNew[i] = books[i];
            }

            booksNew[books.length] = book ;//将新书添加到新数组的末尾（即位置books.length）
            books = booksNew;

        }
        /*
        单独测试addbook
        // 打印当前所有书籍
        System.out.println("Aktuelle Bücher in der Bibliothek:");
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(books[i]);
            }
        }
        System.out.println(""); // 添加一个空行以便区分不同的添加操作
        */
    }


    public void borrowBook(String title){
        for(Book book : books){
            if(book.getTitel() ==  title && book.getAnzahlExemplare() >0){
                book.setAnzahlExemplare(book.getAnzahlExemplare() - 1);
            }
        }
        System.out.println();

    }

    public void returnBook(String title){

        for(Book book : books) {
            if (book.getTitel() == title) {
                book.setAnzahlExemplare((book.getAnzahlExemplare() + 1));
            }
        }
    }


    public void displayBooks(){
        System.out.println("In der Bibliothek ebthalten : ");
        for(int i  = 0 ; i < books.length ; i++){
            System.out.println(i + "," + books[i]);
        }
    }
}

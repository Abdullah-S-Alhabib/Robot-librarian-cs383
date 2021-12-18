/* Mgren AlMArshood 361111435
Muthanna AlMohimed 391108661
Mohammed AlRubayan 351115669 */
        package Library;

class BookDB {

private int bookID;

public String[] queryBook(int bookID) {

        String[] bookinfo = {""};
        return bookinfo;
        }

public void insertBook(String bookinfo) {//inserts a book to the library
        }

public void deleteBook(int bookID) {//deletes a book from the library
        }
        }


        /* Mgren AlMArshood 361111435
        Muthanna AlMohimed 391108661
        Mohammed AlRubayan 351115669*/


interface ILibrary {

public void addBook(int bookID);

public void removeBook(int bookID);

public void addGenre(int barcode);

public void addSubGenre(int barcode);

public void editBookInfo(int bookID);

public void editGenre(int barcode);

public void editSubGenre(int barcode);

public void removeGenre(int barcode);

public void removeSubGenre(int barcode);

        }


        /* Mgren AlMArshood 361111435
        Muthanna AlMohimed 391108661
        Mohammed AlRubayan 351115669*/


class LibraryImp implements ILibrary {


public void addBook(int bookID) {//adds a book to the library.
        }


public void removeBook(int bookID) {//Tag a book as removed from the library.
        }


public void addGenre(int barcode) {//adds a genre to the shelf database.
        }


public void addSubGenre(int barcode) {//adda subgenre to the shelf database.
        }


public void editBookInfo(int bookID) {//edit a specific book'92s info.
        }


public void editGenre(int barcode) {//edit a genre.
        }


public void editSubGenre(int barcode) {//edit a subgenre.
        }


public void removeGenre(int barcode) {//Tag a genre as removed.
        }


public void removeSubGenre(int barcode) {//Tag a subgenre as removed.
        }

        }


        /* Mgren AlMArshood 361111435
        Muthanna AlMohimed 391108661
        Mohammed AlRubayan 351115669*/

class ShelfDB {

private int barcode;

public void insertGenre(String[] genreInfo) {

        }

public void deleteGenre(int barcode) {

        }

public void insertSubgenre() {

        }

public void deleteSubgenre() {

        }

        }


/* Mgren AlMArshood 361111435
Muthanna AlMohimed 391108661
Mohammed AlRubayan 351115669*/
        package IO;

class AdminGUI extends GUI {

private int userID;

public void manualControlGUI() {//Initiate manual control

        }

public void promoteUserGUI() {// Initiate promoteUser(userID) in the user management module addBookGUI(bookID): adds a book to the library.

        }

public void addBookGUI(int bookID) {//Tag a book as removed from the library.

        }

public void removeBookGUI(int bookID) {//adds a genre to the shelf database.

        }

public void addGenreGUI(int barcode) {//adda subgenre to the shelf database.

        }

public void addSubGenreGUI(int barcode) {// edit a specific book'92s info.

        }

public void editBookInfoGUI(int bookID) {//edit a genre.

        }

public void editGenreGUI(int barcode) {//edit a subgenre.

        }

public void editSubGenreGUI(int barcode) {//Tag a genre as removed.

        }

public void removeGenreGUI(int barcode) {//Tag a subgenre as removed.

        }

        }


        /* Mgren AlMArshood 361111435
        Muthanna AlMohimed 391108661
        Mohammed AlRubayan 351115669*/


class GUI {

private int elementID;

public String[] findBookGUI() {
        String[] bookInfo = {""};
        return bookInfo;
        }//Display the option '93find book'94 and display a form after clicking it, the form is returned to the findBook(bookInfo) function as input.

public void borrowBookGUI(int bookID) {//The system initiates the borrow sequence (SRS UC0002).

        }

public void readLocallyGUI(int bookID) {//Display the option to '93Read Locally'94 in the GUI, and after clicking it the program initiates the readLocally sequence (SRS UC0004).

        }

public String[] registerCustomerGUI() {
        String[] userInfo = {""};
        return userInfo;
        }//launches a form for the customer to fill in customer information and then return that information to registerCustomer(userinfo) above.

        }


        /* Mgren AlMArshood 361111435
        Muthanna AlMohimed 391108661
        Mohammed AlRubayan 351115669*/


class IOImpl implements I_IO {


public void findBook(int bookInfo) {// This operation finds a book through searching the database using the book info provided.
        }


public void borrowBook(int bookID) {//run the borrow book operation using the associated bookID.
        }


public void readLocally(int bookID) {//request the book for local reading, the robot returns to the table that started the request.
        }


public void returnBook(int bookID) {//Initiate the return book sequence discussed further in section.
        }


public String[] registerCustomer() {
        String[] userInfo = {""};
        return userInfo;

        }

        }


        /* Mgren AlMArshood 361111435
        Muthanna AlMohimed 391108661
        Mohammed AlRubayan 351115669*/


interface I_IO {

public void findBook(int bookInfo);

public void borrowBook(int bookID);

public void readLocally(int bookID);

public void returnBook(int bookID);

public String[] registerCustomer();

        }


        /* Mgren AlMArshood 361111435
        Muthanna AlMohimed 391108661
        Mohammed AlRubayan 351115669*/


class customerGUI extends GUI {

public void returnBook(int bookID) {

        }//initiate the return book sequence (SRS UC0005)Inherits the GUI superclass to separate from the customer GUI.

        }

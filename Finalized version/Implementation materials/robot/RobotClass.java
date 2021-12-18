/*Mgren AlMarshood 361111435
Muthanna AlMohaimeed 391108661*/
package robot;
interface iRobot {
    public void moveBook(int BookID);

    public void addBookTray(int BookID);

    public void organizeShlf(int Barcode);

    public void putBookShlf(int Barcode);
}


/*Mgren AlMarshood 361111435
Muthanna AlMohaimeed 391108661*/

class robotlmpl implements iRobot {
    /*Registered location so the robot can return to it later*/
    public int RegisteredLocation = 0;



    public void moveBook(int BookID) {//Invoke hardware to move to a specified shelf/table.

    }


    public void addBookTray(int BookID) {// The robot grabs a book and adds it to storage.

    }


    public void organizeShlf(int Barcode) {//Robot will move books in specific manner.

    }


    public void putBookShlf(int Barcode){//Remove book from storage and put it on the shelf.

    }

    public void RegisterLocation(int BookID,int Barcode){//Registers current location (in order to return to it in case of cleaning interrupt.

    }




}

/*Mgren AlMarshood 361111435
Muthanna AlMohaimeed 391108661*/

class RobotHardware {
    public void move(int direction, int steps){

    }

    public void openTray(){

    }

    public void closeTray(){

    }

    public void pickUp(){

    }

    public void putDown(){

    }

    public void clean(int barcode){//Robot will clean a book

    }

    public void checkBattery(int target){//Check battery level

    }

}

/*Mgren AlMarshood 361111435
Muthanna AlMohaimeed 391108661*/

class ShelfDB {
    private int barcode = 0;
    private int category = 0;

    public void queryShelf(){


    }

    public void findCategory(int barcode){


    }
}

/*Mgren AlMarshood 361111435
Muthanna AlMohaimeed 391108661*/

class BookDB {
    private int bookID = 0;


    public String[] queryBook(int bookID){

        return new String[]{""};
    }

    public void BookTaken(int bookinfo){

    }

    public void BookReturend(int bookID){//customer wishes to return borrowed book.

    }
}

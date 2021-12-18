/*Mgren AlMarshood 361111435
Muthanna AlMohaimeed 391108661*/
package usermanagement;
interface Iusermanagement {
    void promoteUser(int userID);
    void demoteUesr(int userID);
    void deleteCustomer(int userID);
    void editUser(int userID);
    void addUser(int userInfo);
}


/*Mgren AlMarshood 361111435
Muthanna AlMohaimeed 391108661*/

class UserManagementImpl implements Iusermanagement {

    protected int userID =  0;
    protected boolean isAdmin;


    public void promoteUser(int userID)/* increase the level of the user from customer or admin to admin */{

    }


    public void demoteUesr(int userID){//It decrease the level of the user from super admin or admin to admin

    }


    public void deleteCustomer(int userID){//delete a customer and all info associated

    }


    public void editUser(int userID){//Edit the information of a user of the same level or lower

    }


    public void addUser(int userID) {//Add a user through the user management module

    }

    public void signup(int userInfo){ //register customer information


    }





}



/*Mgren AlMarshood 361111435
Muthanna AlMohaimeed 391108661*/

class Auth {

    private int tokenID;


    public void queryDB(int authInfo){

    }

    private void insertDB(int userID){

    }

    private void deleteDB(int userID,int tokenID){

    }

}



/*Mgren AlMarshood 361111435
Muthanna AlMohaimeed 391108661*/

class UserDB {



    public void queryDB(int userID){

    }

    public void insertDB(int userInfo){

    }

    public void deleteDB(int userInfo){

    }

}

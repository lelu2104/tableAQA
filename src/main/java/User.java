public class User {
    private int userId;
    private char name;
    private char adress;

    public User(int userId) {
        this.userId = userId;
        this.name = name;
        this.adress = adress;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }

    public char getAdress() {
        return adress;
    }

    public void setAdress(char adress) {
        this.adress = adress;
    }
}


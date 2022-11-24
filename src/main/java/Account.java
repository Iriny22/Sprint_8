public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
       if (name.length()>=3 && name.length()<20 && (name.contains(" ") == true) && (name.substring(0, 1).isBlank() == false) && (name.substring(name.length()-1, name.length()).isBlank() == false)) {
            return true;
        }
       return false;
    }

}

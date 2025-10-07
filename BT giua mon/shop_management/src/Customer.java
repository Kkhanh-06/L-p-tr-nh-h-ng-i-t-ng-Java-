public class Customer {
    private String nameCustomer, email;

    public Customer(String nameCustomer, String email) {
        this.setNameCustomer(nameCustomer);
        this.setEmail(email);
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public String getEmail() {
        return email;
    }

    public void setNameCustomer(String nameCustomer) {
        nameCustomer = nameCustomer.trim();
        if (nameCustomer.isEmpty()) {
            this.nameCustomer = "";
            return;
        }

        String[] words = nameCustomer.toLowerCase().split("\\s+");
        StringBuilder newNameCustomer = new StringBuilder();

        for (String word: words) {
            if (word.length() > 0) {
                newNameCustomer.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
            }
        }
        this.nameCustomer = newNameCustomer.toString().trim();
    }

    public void setEmail(String email) {
        String regex = "^(?!.*\\.\\.)[A-Za-z0-9]+([._%+-]?[A-Za-z0-9]+)*@[A-Za-z0-9-]+(\\.[A-Za-z]{2,})+$";
        if (email.matches(regex) == true) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Vui lòng nhập đúng định dạng của email!");
        }
    }

}

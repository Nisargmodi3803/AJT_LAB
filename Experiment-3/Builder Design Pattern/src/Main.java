// Main.java

public class Main {
    public static void main(String[] args) {

        User Nisarg = new User
                .UserBuilder()
                .setUSER_EMAIL("nisargmodi03@gmail.com")
                .setUSER_NAME("Nisarg")
                .setUSER_ID("1")
                .build();
        System.out.println(Nisarg);

        User Kajal = new User
                .UserBuilder()
                .setUSER_NAME("Kajal")
                .setUSER_EMAIL("kajalmodi80@gmail,com")
                .setUSER_ID("2")
                .build();
        System.out.println(Kajal);
    }
}
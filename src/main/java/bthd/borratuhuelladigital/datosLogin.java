package bthd.borratuhuelladigital;

public class datosLogin {
    private static String username;
    private static String realName;

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        datosLogin.username = username;
    }

    public static String getNombre() {
        return realName;
    }

    public static void setNombre(String realName) {
        datosLogin.realName = realName;
    }
}
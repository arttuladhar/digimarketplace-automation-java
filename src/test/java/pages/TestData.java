package pages;

import com.google.gson.JsonObject;

public class TestData {
    public String userEmail = null;
    public String userPassword = null;

    public String[] getUserCredentials() {
        String credentials[] = new String[2];
        credentials[0] = this.userEmail;
        credentials[1] = this.userPassword;
        return credentials;
    }

    public void setInvalidUserCredentials() {
        this.setUserCredenials("invalid_email@gmail.com", "invalid_password");
    }

    private void setUserCredenials(String email, String password) {
        this.userEmail = email;
        this.userPassword = password;
    }
}

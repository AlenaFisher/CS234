/*Lance Stott*/
class Communication {
    private String email;
    private String phone;
    private String chat;

    public Communication(String email, String phone, String chat) {
        this.email = email;
        this.phone = phone;
        this.chat = chat;
    }

    public String displayContactInfo() {
        return "Email: " + email + "\nPhone: " + phone + "\nChat: " + chat;
    }
}
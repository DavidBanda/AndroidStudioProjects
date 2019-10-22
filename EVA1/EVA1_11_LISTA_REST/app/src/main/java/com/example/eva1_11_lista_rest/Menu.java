package com.example.eva1_11_lista_rest;

public class Menu {

    private String txtUp;
    private String txtDown;
    private int img;

    public Menu() {
        txtUp = "Café Delicias";
        txtDown = "Café Gourmet";
        img = R.drawable.f1;
    }

    public Menu(String txtUp, String txtDown, int img) {
        this.txtUp = txtUp;
        this.txtDown = txtDown;
        this.img = img;
    }

    public String getTxtUp() {
        return txtUp;
    }

    public void setTxtUp(String txtUp) {
        this.txtUp = txtUp;
    }

    public String getTxtDown() {
        return txtDown;
    }

    public void setTxtDown(String txtDown) {
        this.txtDown = txtDown;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}

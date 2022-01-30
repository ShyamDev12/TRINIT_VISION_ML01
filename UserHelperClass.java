package org.tensorflow.lite.examples.classification;

public class UserHelperClass {
    String name, email, phone, covid, detail,date;

    public UserHelperClass( ) {

    }

    public UserHelperClass(String name, String email, String phone, String covid, String detail,String date) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.covid = covid;
        this.detail = detail;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCovid() {
        return covid;
    }

    public void setCovid(String covid) {
        this.covid = covid;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
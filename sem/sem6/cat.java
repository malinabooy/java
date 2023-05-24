package sem.sem6;
/*
 * 1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
 * а) информационной системой ветеринарной клиники
 * б) архивом выставки котов
 * в) информационной системой Театра кошек Ю. Д. Куклачёва
 * Можно записать в текстовом виде, не обязательно реализовывать в java.
 */

 import java.time.LocalDate;

 
 public class cat {
     private String name;
     private String bread;
     private String color;
     private String ownerName;
     private LocalDate dateOfBirth;
     private String phone;
     //private List<Diagonsis> история болезни
     private char sex; // M, F
 
     // гет и сет-методы
 
     public cat(String name, String bread, String color, String ownerName,
             LocalDate dateOfBirth, String phone, char sex) {
         this.name = name;
         this.bread = bread;
         this.color = color;
         this.ownerName = ownerName;
         this.dateOfBirth = dateOfBirth;
         this.phone = phone;
         this.sex = sex;
     }
 
     public String getName() {
         return name;
     }
 
     public void setName(String name) {
         if (name == null) {
             throw new IllegalStateException("Имя не может быть null");
         }
         this.name = name;
     }
 
     public String getBread() {
         return bread;
     }
 
     public void setBread(String bread) {
         this.bread = bread;
     }
 
     public String getColor() {
         return color;
     }
 
     public void setColor(String color) {
         this.color = color;
     }
 
     public String getOwnerName() {
         return ownerName;
     }
 
     public void setOwnerName(String ownerName) {
         this.ownerName = ownerName;
     }
 
     public LocalDate getDateOfBirth() {
         return dateOfBirth;
     }
 
     public void setDateOfBirth(LocalDate dateOfBirth) {
         this.dateOfBirth = dateOfBirth;
     }
 
     public String getPhone() {
         return phone;
     }
 
     public void setPhone(String phone) {
         this.phone = phone;
     }
 
     public char getSex() {
         return sex;
     }
 
     public void setSex(char sex) {
         this.sex = sex;
     }
 
     @Override
     public String toString() {
         return "VetCat [name=" + name + ", bread=" + bread + ", color=" + color + ", ownerName=" + ownerName
                 + ", dateOfBirth=" + dateOfBirth + ", phone=" + phone + ", sex=" + sex + "]";
     }
 }

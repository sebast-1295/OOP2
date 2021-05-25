package com.company.familia;

public class Martin {

    private int age;
    private String hobby;

    public Martin(String saludo){
        this.age = 55;
        this.hobby = "leer";

        System.out.println(saludo);
    }

    public void setAge(){
        this.age = this.age + 1;
    }

    public int getAge() {
        return this.age;
    }

    public String getHobby() {
        return hobby;
    }

}

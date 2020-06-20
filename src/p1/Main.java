package p1;

import java.util.*;

public class Main {

    String result = "done";

   public static void main(String[] args) {



            List<String> list = new ArrayList<String>();
            list.add("a");
            list.add("SANTE");
            list.add("a");
            list.add("g");
           list.add("SANTE");


           int i = 0 ;
          Etudiant e = new Etudiant();

                  e.setAge(null);



        triCodeRejet(list);

        System.out.println(list);


    }

    public static void triCodeRejet(List<String> list) {

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                Integer o1i;
                Integer o2i;
                int v = 1;
                if (o1.equalsIgnoreCase("SANTE")) {
                    o1i = 1;
                } else {
                    o1i = 2;
                }
                if (o2.equalsIgnoreCase("SANTE")) {
                    o2i = 1;
                } else {
                    o2i = 2;
                }
                return o1i.compareTo(o2i);

            }
        });
    }

}


class Etudiant {

    String nom;
    Integer age;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }




    }


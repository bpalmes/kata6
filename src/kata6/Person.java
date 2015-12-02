/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6;

/**
 *
 * @author usuario
 */
public class Person {
    private final Integer id;
    private final String mail;

    public Person(Integer id, String mail) {
        this.id = id;
        this.mail = mail;
    }

    public Integer getId() {
        return id;
    }

    public String getMail() {
        return mail;
    }
}

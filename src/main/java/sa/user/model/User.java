package sa.user.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
@NamedQueries({@NamedQuery(name = User.FIND_ALL, query = "SELECT u FROM User u")})
public class User {

    public static final String FIND_ALL = "User.findAll";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nameUser;
    private String dirUser;
    private String dirPublication;
    private int idPublication;
    private String namePublication;
    private String date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getDirUser() {
        return dirUser;
    }

    public void setDirUser(String dirUser) {
        this.dirUser = dirUser;
    }

    public String getDirPublication() {
        return dirPublication;
    }

    public void setDirPublication(String dirPublication) {
        this.dirPublication = dirPublication;
    }

    public int getIdPub() {
        return idPublication;
    }

    public void setIdPub(int idPublication) {
        this.idPublication = idPublication;
    }

    public String getNamePublication() {
        return namePublication;
    }

    public void setNamePublication(String namePublication) {
        this.namePublication = namePublication;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}

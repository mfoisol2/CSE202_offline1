package Author_book;

/**
 * Created by User on 9/19/2015.
 */
public class Author {
        private String name;
        private String email;

        Author() {

        }


        Author(String name, String email) {
            this.name = name;
            setEmail(email);
        }


        Author(String name) {
            this.name = name;
        }

        String getName() {
            return name;
        }

        String getEmail() {
            return email;
        }

        void setEmail(String email) {
            this.email = email;
        }

        void print() {
            System.out.println(name + " at " + email);
        }

    }

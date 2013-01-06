package contacts;

/**
 * User: Sam Wright
 * Date: 03/01/2013
 * Time: 16:45
 */
public class ContactImpl implements Contact {
    private final int id;
    private final String name;
    private String notes = "";

    public ContactImpl(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getNotes() {
        return notes;
    }

    @Override
    public void addNotes(String note) {
        if (notes.isEmpty()) {
            notes = note.trim();
        } else {
            notes = notes + '\n' + note.trim();
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Contact) {
            Contact other = (Contact) obj;
            if (other.getId() != id)
                return false;
            if (!other.getNotes().equals(notes))
                return false;
            if (!other.getName().equals(name))
                return false;

            return true;
        }

        return false;
    }
}

package weekly_quiz_02;

public class PersonalContact extends Contact{
    private String relationship;

    public PersonalContact(String name, String phoneNumber, String relationship) {
        super(name,phoneNumber);
        this.relationship=relationship;
    }

    public String getRelationship() {
        return relationship;
    }

    @Override
    public String toString() {
        return super.toString()+", 관계 : " + relationship;
    }
}

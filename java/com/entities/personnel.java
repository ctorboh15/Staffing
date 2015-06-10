package com.entities;

public abstract class personnel
    implements Comparable<personnel> {

    protected Long id;

    protected String firstName;

    protected String lastName;

    protected String startDate;

    protected String endDate;

    protected String email;

    protected String login;

    protected String password;


    @Override
    public int hashCode() throws NullPointerException {

        int hash = 8;
        hash = (int) (hash * id);
        return hash;
    }

    public boolean equals(Object obj) throws NullPointerException {

        if (obj == null) {
            return false;

        }

        if (this.getClass() != obj.getClass()) {
            return false;
        }

        personnel per = (personnel) obj;

        if (this.id == null && per.id == null) {
            return false;
        } else if (this.id == null || per.id == null) {
            return false;

        }

        return this.id.equals(per.id);
    }

    @Override
    public int compareTo(personnel per) {

        int cmpt = this.lastName.compareToIgnoreCase(per.lastName);
        if (cmpt == 0) {
            cmpt = this.firstName.compareToIgnoreCase(per.firstName);
            if (cmpt == 0) {
                cmpt = this.id.compareTo(per.id);
            }
        }
        return cmpt;
    }

    public abstract Long getId();

    public abstract String getFirstName();

    public abstract String getLastName();

    public abstract String getStartDate();

    public abstract String getEndDate();

    public abstract String getEmail();

    public abstract String getLogin();

    public abstract String getPassword();


}

package com.company;
public interface Interface {

    String getModel();
    int getYear();
    int getLength();
    int getPlacesForOwners();
    String toString();
    boolean equals(Object obj);
    int hashCode();

    void setOwners(int i, int value);
    void setModel(String Name);
    void setYear(int InfoPages);
}

package library.members;

public class Member {

    String name;
    int memberId;

    public void registerMember(String n, int id) {
        name = n;
        memberId = id;

        System.out.println("\nMember Registered:");
        System.out.println("Name: " + name);
        System.out.println("Member ID: " + memberId);
    }

}
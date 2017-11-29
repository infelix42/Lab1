package Lab2;

import java.util.*;


class ThirdTask {
    static Scanner in = new Scanner(System.in);
    static ArrayList<User> userList = new ArrayList<>();

    static public boolean contains() {

        System.out.println("Enter user's name: ");
        String name = in.nextLine();

        System.out.println("Enter user's nickname: ");
        String nickname = in.nextLine();

        System.out.println("Enter user's age: ");
        int age = in.nextInt();

        boolean userContains = userList.contains(new User(name, nickname, age));
        return userContains;
    }

    public static User remove(){
        System.out.println("Enter user's index: ");
        int c = in.nextInt();
        return userList.remove(c);
    }

    public static void main(String[] args) {
        userList.add(new User("Alexey", "infelix", 19));
        userList.add(new User("Vitaliy", "ratacat", 20));
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(list1.equals(list2));

        System.out.println(contains());

        System.out.println(remove());
    }
}


class User {

    String name;
    String nickname;
    int age;


    User(String name, String nickname, int age) {
        this.name = name;
        this.nickname = nickname;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;}
        User other = (User) obj;
        if (name.equals(other.name)){
            return true;}
        if (nickname.equals(other.nickname)){
            return true;}
        if (age == other.age){
            return true;}
        return false;
    }
}
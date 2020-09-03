package com.company;

public class Main {
    static String reverse(String s,int no_of_groups)
    {
        for (int i = 0; i < s.length();)
        {
            if (i + no_of_groups > s.length())
                break;
            s = s.substring(0, i) + new String(new StringBuilder(
                    s.substring(i, i + no_of_groups)).reverse()) +
                    s.substring(i + no_of_groups);

            i += no_of_groups;
        }
        return s;
    }
    public static void main(String[] args) {
        String s = "Lorem at";
        int no_of_groups = 4;
        System.out.println(reverse(s, no_of_groups));
    }
}

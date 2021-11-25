package Basic_CF_Package;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CF13_count_keyword_program {

    public static void main(String[] args) throws FileNotFoundException {

        System.out.print("Enter the file name :: ");
        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();

        File file = new File(fileName);

        if (file.exists())
            System.out.println("\n\nThe Number of keyWord in " + fileName + " is " + countKeyword(file));
        else
            System.out.println("No file exists with the name " + fileName);
    }

    public static int countKeyword(File file) throws FileNotFoundException {

        String[] keywordString = {"abstract", "assert", "boolean",
                "break", "byte", "case", "catch", "char", "class", "const",
                "continue", "default", "do", "double", "else", "enum",
                "extends", "for", "final", "finally", "float", "goto",
                "if", "implements", "import", "instanceof", "int",
                "interface", "long", "native", "new", "package", "private",
                "protected", "public", "return", "short", "static",
                "strictfp", "super", "switch", "synchronized", "this",
                "throw", "throws", "transient", "try", "void", "volatile",
                "while", "true", "false", "null"};

        Set<String> set = new HashSet<>(Arrays.asList(keywordString));

        Scanner input = new Scanner(file);

        int count = 0;

        System.out.print("[");

        while (input.hasNext()) {
            String word = input.next();
            if (set.contains(word)){
                count++;

                //just printing the key word found
                System.out.print(word + " ");
            }
        }

        System.out.print("\b]");
        return count;
    }
}

/*
OUTPUT
Enter the file name :: CF1_collection_class.java
[package import import import public class public static void new while new]

The Number of keyWord in CF1_collection_class.java is 12

 */
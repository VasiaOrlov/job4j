package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class SearchAtt {

    public static List<Attachment> filterSize(List<Attachment> list) {
        List<Attachment> rsl = new ArrayList<>();
        for (Attachment att : list) {
            if (att.getSize() > 100) {
                rsl.add(att);
            }
        }
        return rsl;
    }

    public static List<Attachment> filterName(List<Attachment> list) {
        List<Attachment> rsl = new ArrayList<>();
        for (Attachment att : list) {
            if (att.getName().contains("bug")) {
                rsl.add(att);
            }
        }
        return rsl;
    }



    public static List<Attachment> filterSizeInterface(List<Attachment> list, String value) {
        BiPredicate<Attachment, String> func = new BiPredicate<Attachment, String>() {
            @Override
            public boolean test(Attachment attachment, String s) {
                return attachment.getSize() > Integer.parseInt(s);
            }
        };
        return filter(func, list, value);
    }

    public static List<Attachment> filterNameInterface(List<Attachment> list, String value) {
        BiPredicate<Attachment, String> func = new BiPredicate<Attachment, String>() {
            @Override
            public boolean test(Attachment attachment, String s) {
                return attachment.getName().contains(s);
            }
        };
        return filter(func, list, value);
    }

    private static List<Attachment> filter(BiPredicate<Attachment, String> func, List<Attachment> list, String value) {
        List<Attachment> rsl = new ArrayList<>();
        for (Attachment att : list) {
            if (func.test(att, value)) {
                rsl.add(att);
            }
        }
        return rsl;
    }


    public static List<Attachment> filter2(BiPredicate<Attachment, String> func, List<Attachment> list, String value) {
        List<Attachment> rsl = new ArrayList<>();
        for (Attachment att : list) {
            if (func.test(att, value)) {
                rsl.add(att);
            }
        }
        return rsl;
    }

    static BiPredicate<Attachment, String> name = new BiPredicate<Attachment, String>() {
        @Override
        public boolean test(Attachment attachment, String value) {
            return attachment.getName().contains(value);
        }
    };
    static BiPredicate<Attachment, String> size = new BiPredicate<Attachment, String>() {
        @Override
        public boolean test(Attachment attachment, String value) {
            return attachment.getSize() > Integer.parseInt(value);
        }
    };

    public static void main(String[] args) {
        List<Attachment> list = Arrays.asList(
                new Attachment("Vask", 200),
                new Attachment("Vest", 300),
                new Attachment("Vasd", 50),
                new Attachment("Vast", 400)
        );
        System.out.println(filterNameInterface(list, "Vas"));
        System.out.println(filterSizeInterface(list, "100"));
        System.out.println(filter2(name, list, "Vas"));
        System.out.println(filter2(size, list, "100"));

    }
}
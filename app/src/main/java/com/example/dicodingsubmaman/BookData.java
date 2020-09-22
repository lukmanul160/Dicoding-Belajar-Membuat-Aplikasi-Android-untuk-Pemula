package com.example.dicodingsubmaman;

import java.util.ArrayList;

public class BookData {
    private static String[] bookName = {
            "A VISIT FROM THE GOON SQUAD ",
            " THE THOUSAND AUTUMNS OF JACOB DE ZOET",
            "RAIN DREAMS ",
            "THE BUDDHA IN THE ATTIC",
            "THE TIGER’S WIFE",
            " SALVAGE THE BONES",
            "THE FLAMETHROWERS",
            "ALL MY PUNY SORROWS ",
            "DEPT. OF SPECULATION ",
            "THE SELLOUT",
    };

    private static String[] bookDetail={
            "There are some moments from A Visit From the Goon Squad that I won’t forget. In one chapter, a former PR hotshot named Dolly is tasked with reviving the public image of an African dictator known as “The General” with the help of a B-list actress named Kitty Jackson.",
            "It is easier to conjure the intellectual-literary atmosphere of an era when it is 30 years’ past than when it is a mere decade ago. It is hard to see 2010 right now",
            "If I was tasked with proving that literary awards are a cruel joke and that life is nothing but a bleak and meaningless trudge toward the grave, Exhibit A would be what I have dubbed The Great Pulitzer Prize for Fiction Travesty of 2012.",
            "Julie Otsuka’s groundbreaking (and PEN/Faulkner Award-winning) Buddha In the Attic begins: “On the boat we were mostly virgins.",
            "Although it came out in 2011, I read The Tiger’s Wife, the elegant first novel by Téa Obreht, only recently. I found it stunning, so perfectly moving on its many levels.",
            "Most of what remains with me years after reading Jesmyn Ward’s second novel is impressionistic. One of the final images in Salvage the Bones is of the 14-year-old protagonist Esche’s father roughing out the initial impact of Hurricane Katrina in the attic of their flooded house.",
            "Rachel Kushner’s 2013 masterpiece has the advantage of being both epic in its historical sweep and highly, acutely specific in its characterization, observation, and ultimately, its aesthetic goals. ",
            "How rare is it to come across a novel that elicits a physical reaction from its reader? All My Puny Sorrows runs the gamut of emotions. ",
            "It is possible to read Jenny Offill’s second novel, Dept. of Speculation, in a day. In fact, it is more difficult not to, as you will not want to stop reading once you’ve started.",
            "t’s tough to sell me on a novel that’s not funny. To me, fiction without humor is missing an essential part of the human experience. Paul Beatty’s Booker Prize-winning masterpiece is one of the funniest—and most human—novels I’ve ever read.",
    };

    private static String[] yearBook={
            "2001",
            "2003",
            "2004",
            "2005",
            "2002",
            "2004",
            "2007",
            "2001",
            "2002",
            "2003",
    };

    private static String[] authorBook={
            "Charles Darwin",
            "Emmanuel Giga",
            "Giga giga",
            "Shandika Galih",
            "Charles Babbage",
            "Strong Women",
            "Cecilia amelia",
            "Ria Tachibnana",
            "Miyabi",
            "Ai Uehara",
    };

    private static int[] bookImages = {
            R.drawable.gambar_1,
            R.drawable.gambar_2,
            R.drawable.gambar_3,
            R.drawable.gambar_4,
            R.drawable.gambar_5,
            R.drawable.gambar_6,
            R.drawable.gambar_7,
            R.drawable.gambar_8,
            R.drawable.gambar_9,
            R.drawable.gambar_10,
    };


    static ArrayList<Book> getListData() {
        ArrayList<Book> list = new ArrayList<>();
        for (int position = 0; position < bookName.length; position++) {
            Book book = new Book();
            book.setName(bookName[position]);
            book.setDetail(bookDetail[position]);
            book.setPhoto(bookImages[position]);
            book.setAuthor(authorBook[position]);
            book.setYear(yearBook[position]);
            list.add(book);
        }
        return list;
    }





}

package track.M02-Introduction to Java.T06-Constructor And Constructor Overloading.ST-09-Create Default Book.Work;
class Book{
    String title;

    Book(){
        title = "Java Basics";
    }
}

class Main{
    public static void main(String[] args){
        Book b = new Book();
        System.out.println(b.title);
    }
}


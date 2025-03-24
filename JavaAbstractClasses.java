import java.util.*;

public class JavaAbstractClasses {

    public static void main(String[] args) {

        MyBook myBook = new MyBook();

        Scanner scanner = new Scanner(System.in);

        String title = scanner.nextLine();

        scanner.close();

        myBook.setTitle(title);

        System.out.println("The title is: " + myBook.getTitle());
    }
}

abstract class Book {

    String title;

    abstract void setTitle(String title);

    String getTitle(){
        return title;
    }
}

class MyBook extends Book {

    @Override
    public void setTitle(String title) {
        super.title = title;
    }

}



public class AuthorBookComposition {
    public static void main(String[] args) {
        System.out.println("=============================================");
        System.out.println("  Lab 5: Author and Book (Composition)");
        System.out.println("=============================================\n");

        // ----- Section 1: Author Objects -----
        System.out.println("--- Section 1: Creating Authors ---");

        // 3: Create Author objects
        Author author1 = new Author("Ali Sultan", "ali.sultan@suza.ac.tz", 'm');
        Author author2 = new Author("Mwanaisha Bakari", "mwanaisha.b@suza.ac.tz", 'f');
        Author author3 = new Author("Hamad Khamis", "hamad.k@gmail.com", 'm');
        
        System.out.println(author1);
        System.out.println(author2);
        System.out.println(author3);

        // ----- Section 2: Book Objects (Composition) -----
        System.out.println("\n--- Section 2: Creating Books ---");

        // 4: Create Book objects - note how Book CONTAINS an Author
        Book book1 = new Book("Introduction to Java", author1, 35000, 50);
        Book book2 = new Book("Data Structures in Java", author2, 42000, 30);
        
        System.out.println(book1);
        System.out.println(book2);

        // ----- Section 3: Accessing Composed Object -----
        System.out.println("\n--- Section 3: Accessing Through Composition ---");

        // 5: Access author details through the book
        System.out.println("Book: " + book1.getName());
        System.out.println("Author name: " + book1.getAuthorName());     // Delegated
        System.out.println("Author email: " + book1.getAuthorEmail());   // Delegated
        
        // You can also get the Author object directly
        Author bookAuthor = book1.getAuthor();
        System.out.println("Author object: " + bookAuthor);

        // ----- Section 4: Shared References -----
        System.out.println("\n--- Section 4: Shared Author References ---");

        //  6: Same author can write multiple books
        Book book3 = new Book("Advanced Java Programming", author1, 55000, 20);
        System.out.println("Book 1 author: " + book1.getAuthorName());
        System.out.println("Book 3 author: " + book3.getAuthorName());
        System.out.println("Same author? " + (book1.getAuthor() == book3.getAuthor()));
        //
        // // What happens when we change the shared author's email?
        author1.setEmail("ali.sultan.new@suza.ac.tz");
        System.out.println("\nAfter changing author1's email:");
        System.out.println("Book 1 author email: " + book1.getAuthorEmail());
        System.out.println("Book 3 author email: " + book3.getAuthorEmail());
        System.out.println("Both changed! Because they share the same Author object.");

        // ----- Section 5: Anonymous Author -----
        System.out.println("\n--- Section 5: Creating Book with Anonymous Author ---");

        // 7: Create a Book with an anonymous Author (inline construction)
        Book book4 = new Book(
            "Python for Beginners",
            new Author("Salma Haji", "salma.h@suza.ac.tz", 'f'),
            28000,
            100
        );
        System.out.println(book4);
        System.out.println("Author: " + book4.getAuthorName());

        // ----- Section 6: Book Inventory -----
        System.out.println("\n--- Section 6: Book Inventory ---");

        // 8: Manage a collection of books
        Book[] inventory = {book1, book2, book3, book4};
        
        System.out.println("SUZA Bookshop Inventory:");
        System.out.println(String.format("%-30s %-25s %10s %5s",
            "Title", "Author", "Price(TZS)", "Qty"));
        System.out.println("-".repeat(75));
        
        double totalValue = 0;
        for (Book book : inventory) {
            System.out.println(String.format("%-30s %-25s %,10.0f %5d",
                book.getName(), book.getAuthorName(),
                book.getPrice(), book.getQty()));
            totalValue += book.getPrice() * book.getQty();
        }
        System.out.println("-".repeat(75));
        System.out.println(String.format("Total inventory value: TZS %,.0f", totalValue));

        System.out.println("\n=============================================");
        System.out.println("  End of Lab 5");
        System.out.println("=============================================");
    }
    
}


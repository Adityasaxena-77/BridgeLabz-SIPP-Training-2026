/**
 * Smart Library System
 * Scenario: Handle both ArrayIndexOutOfBoundsException and NullPointerException
 * 
 * Books: String books[] = {"Java","Python",null,"C++"};
 * 
 * Method: getBookLength(int index)
 * - Returns the length of book name
 * 
 * Possible Issues:
 * 1. Invalid index (array out of bounds)
 * 2. Book entry is null (null pointer exception)
 */

public class SmartLibrarySystem {
    
    private String[] books = {"Java", "Python", null, "C++", "JavaScript"};
    private int[] bookPages = {300, 450, 350, 280, 520};
    private String[] authors = {"James Gosling", "Guido van Rossum", null, "Bjarne Stroustrup", "Brendan Eich"};
    
    /**
     * Get book length at specific index
     * Handles both InvalidIndex and NullPointer exceptions
     * 
     * @param index - Index of book in array
     * @return Length of book name, or -1 if error occurs
     */
    public int getBookLength(int index) {
        System.out.println("\n--- Getting Book Length at Index " + index + " ---");
        
        try {
            // Check for invalid index
            if (index < 0 || index >= books.length) {
                throw new ArrayIndexOutOfBoundsException(
                    "❌ INVALID INDEX ERROR!"
                );
            }
            
            // Try to get book name
            String bookName = books[index];
            
            // Check if book is null
            if (bookName == null) {
                throw new NullPointerException(
                    "❌ NULL BOOK ERROR!"
                );
            }
            
            int length = bookName.length();
            System.out.println("✓ Book: " + bookName);
            System.out.println("✓ Length: " + length + " characters");
            return length;
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println("   Available indexes: 0 to " + (books.length - 1));
            System.out.println("   Please choose a valid index.");
            return -1;
            
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            System.out.println("   The book at index " + index + " is not available (null)");
            System.out.println("   Please select another book.");
            return -1;
        }
    }
    
    /**
     * Get full book information with separate exception handling
     * 
     * @param index - Index of book
     * @return Book information string
     */
    public String getBookInfo(int index) {
        System.out.println("\n--- Getting Book Information at Index " + index + " ---");
        
        String bookName = null;
        int pages = -1;
        String author = null;
        
        // Try to get book name with separate exception handling
        try {
            if (index < 0 || index >= books.length) {
                throw new ArrayIndexOutOfBoundsException(
                    "Invalid book index: " + index
                );
            }
            bookName = books[index];
            
            if (bookName == null) {
                throw new NullPointerException(
                    "Book at index " + index + " is null"
                );
            }
            System.out.println("✓ Book name retrieved: " + bookName);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("❌ BOOK NAME ERROR: " + e.getMessage());
            System.out.println("   Available range: 0 to " + (books.length - 1));
            return "ERROR"; // Return error status
            
        } catch (NullPointerException e) {
            System.out.println("⚠ BOOK NAME ERROR: " + e.getMessage());
            System.out.println("   This book slot is empty (null)");
            return "NULL_BOOK";
        }
        
        // Try to get pages with separate exception handling
        try {
            if (index < 0 || index >= bookPages.length) {
                throw new ArrayIndexOutOfBoundsException(
                    "Invalid page count index: " + index
                );
            }
            pages = bookPages[index];
            System.out.println("✓ Page count retrieved: " + pages + " pages");
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("⚠ PAGE COUNT ERROR: " + e.getMessage());
            pages = 0;
        }
        
        // Try to get author with separate exception handling
        try {
            if (index < 0 || index >= authors.length) {
                throw new ArrayIndexOutOfBoundsException(
                    "Invalid author index: " + index
                );
            }
            author = authors[index];
            
            if (author == null) {
                throw new NullPointerException(
                    "Author information is not available"
                );
            }
            System.out.println("✓ Author retrieved: " + author);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("⚠ AUTHOR ERROR: " + e.getMessage());
            author = "Unknown";
            
        } catch (NullPointerException e) {
            System.out.println("⚠ AUTHOR ERROR: " + e.getMessage());
            author = "Unknown Author";
        }
        
        // Build result
        return "Book: " + bookName + " | Pages: " + pages + " | Author: " + author;
    }
    
    /**
     * Safe method to search for book by name
     * 
     * @param searchName - Name to search for
     * @return Index of book or -1 if not found
     */
    public int searchBook(String searchName) {
        System.out.println("\n--- Searching for Book: \"" + searchName + "\" ---");
        
        if (searchName == null || searchName.trim().isEmpty()) {
            System.out.println("❌ Search term cannot be null or empty");
            return -1;
        }
        
        try {
            for (int i = 0; i < books.length; i++) {
                try {
                    // Handle null book
                    if (books[i] == null) {
                        System.out.println("Skipping index " + i + " (empty slot)");
                        continue;
                    }
                    
                    // Compare with search term
                    if (books[i].equalsIgnoreCase(searchName)) {
                        System.out.println("✓ Book found at index: " + i);
                        System.out.println("   Book: " + books[i]);
                        System.out.println("   Pages: " + bookPages[i]);
                        System.out.println("   Author: " + 
                                         (authors[i] != null ? authors[i] : "Unknown"));
                        return i;
                    }
                    
                } catch (NullPointerException e) {
                    System.out.println("⚠ Error at index " + i + ": " + e.getMessage());
                    continue;
                }
            }
            
            System.out.println("❌ Book not found in library");
            return -1;
            
        } catch (Exception e) {
            System.out.println("❌ Error during search: " + e.getMessage());
            return -1;
        }
    }
    
    /**
     * Display all books with exception handling
     */
    public void displayAllBooks() {
        System.out.println("\n--- Library Catalog ---\n");
        
        for (int i = 0; i < books.length; i++) {
            try {
                String book = books[i];
                
                if (book == null) {
                    System.out.println("Index " + i + ": [EMPTY SLOT]");
                } else {
                    int pages = (i < bookPages.length) ? bookPages[i] : 0;
                    String author = (i < authors.length && authors[i] != null) ? 
                                   authors[i] : "Unknown";
                    System.out.println("Index " + i + ": " + book + " (" + pages + " pages) by " + author);
                }
                
            } catch (NullPointerException e) {
                System.out.println("Index " + i + ": ERROR - " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Index " + i + ": UNEXPECTED ERROR");
            }
        }
    }
    
    /**
     * Main method to test the library system
     */
    public static void main(String[] args) {
        System.out.println("========== SMART LIBRARY SYSTEM ==========");
        System.out.println("Books: Java, Python, [EMPTY], C++, JavaScript\n");
        
        SmartLibrarySystem library = new SmartLibrarySystem();
        
        // Display all books
        library.displayAllBooks();
        
        // Test Case 1: Get length of valid book
        System.out.println("\n--- TEST 1: Get Length of Valid Book (Index 0 - Java) ---");
        int length = library.getBookLength(0);
        System.out.println("Returned: " + length);
        
        // Test Case 2: Get length of null book
        System.out.println("\n--- TEST 2: Get Length of Null Book (Index 2) ---");
        length = library.getBookLength(2);
        System.out.println("Returned: " + length);
        
        // Test Case 3: Get length with invalid index
        System.out.println("\n--- TEST 3: Get Length with Invalid Index (Index 10) ---");
        length = library.getBookLength(10);
        System.out.println("Returned: " + length);
        
        // Test Case 4: Get length with negative index
        System.out.println("\n--- TEST 4: Get Length with Negative Index (-1) ---");
        length = library.getBookLength(-1);
        System.out.println("Returned: " + length);
        
        // Test Case 5: Get full book info with valid book
        System.out.println("\n--- TEST 5: Get Full Info (Valid Book at Index 1 - Python) ---");
        String info = library.getBookInfo(1);
        System.out.println("Result: " + info);
        
        // Test Case 6: Get full book info with null book
        System.out.println("\n--- TEST 6: Get Full Info (Null Book at Index 2) ---");
        info = library.getBookInfo(2);
        System.out.println("Result: " + info);
        
        // Test Case 7: Get full book info with invalid index
        System.out.println("\n--- TEST 7: Get Full Info (Invalid Index 15) ---");
        info = library.getBookInfo(15);
        System.out.println("Result: " + info);
        
        // Test Case 8: Search for existing book
        System.out.println("\n--- TEST 8: Search for Existing Book (JavaScript) ---");
        int index = library.searchBook("JavaScript");
        System.out.println("Returned index: " + index);
        
        // Test Case 9: Search for non-existing book
        System.out.println("\n--- TEST 9: Search for Non-Existing Book (Ruby) ---");
        index = library.searchBook("Ruby");
        System.out.println("Returned index: " + index);
        
        // Test Case 10: Search for null/empty string
        System.out.println("\n--- TEST 10: Search with Null Input ---");
        index = library.searchBook(null);
        System.out.println("Returned index: " + index);
    }
}

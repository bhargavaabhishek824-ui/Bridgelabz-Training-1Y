package Four;
class Magazine extends LibraryItem implements Reservable {
    private boolean isAvailable = true;
    private String borrowerName;
    public Magazine(int id, String title, String author) {
        super(id, title, author);
    }
    @Override
    public int getLoanDuration() {
        return 7; // 7 days
    }
    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable) {
            this.borrowerName = borrowerName;
            isAvailable = false;
            System.out.println("Magazine reserved by " + borrowerName);
        } else {
            System.out.println("Magazine not available.");
        }
    }
    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}
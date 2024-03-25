class EmailNotification implements Notification {
    @Override
    public void sendNotification(String firstName, String message) {
        // Implementation to send email notification
        System.out.println("Sending email notification to " + firstName + ": " + message);
    }
}

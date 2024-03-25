class SMSNotification implements Notification {
    @Override
    public void sendNotification(String firstName, String message) {
        // Implementation to send SMS notification
        System.out.println("Sending SMS notification to " + firstName + ": " + message);
    }
}

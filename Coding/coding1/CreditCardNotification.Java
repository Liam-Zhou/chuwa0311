// NotificationStrategy.java
public interface NotificationStrategy {
  void sendNotification(User user, String message);
}

// EmailNotificationStrategy.java
public class EmailNotificationStrategy implements NotificationStrategy {
  @Override
  public void sendNotification(User user, String message) {
      System.out.println("Email to " + user.getEmail() + ": " + message);
  }
}

// SMSNotificationStrategy.java
public class SMSNotificationStrategy implements NotificationStrategy {
  @Override
  public void sendNotification(User user, String message) {
      System.out.println("SMS to " + user.getPhoneNumber() + ": " + message);
  }
}

// WhatsAppNotificationStrategy.java
public class WhatsAppNotificationStrategy implements NotificationStrategy {
  @Override
  public void sendNotification(User user, String message) {
      System.out.println("WhatsApp to " + user.getPhoneNumber() + ": " + message);
  }
}

// NotificationPreference.java
public enum NotificationPreference {
  EMAIL, SMS, WHATSAPP
}

// User.java
public class User {
  private String firstName;
  private String email;
  private String phoneNumber;
  private NotificationPreference preference;

  public User() {}

  public User(String firstName, String email, String phoneNumber, NotificationPreference preference) {
      this.firstName = firstName;
      this.email = email;
      this.phoneNumber = phoneNumber;
      this.preference = preference;
  }

  public String getFirstName() {
      return firstName;
  }

  public String getEmail() {
      return email;
  }

  public String getPhoneNumber() {
      return phoneNumber;
  }

  public NotificationPreference getPreference() {
      return preference;
  }

  public void setFirstName(String firstName) {
      this.firstName = firstName;
  }

  public void setEmail(String email) {
      this.email = email;
  }

  public void setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
  }

  public void setPreference(NotificationPreference preference) {
      this.preference = preference;
  }
}


// NotificationFactory.java
public class NotificationFactory {
  public static NotificationStrategy getNotificationStrategy(NotificationPreference preference) throws Exception {
      switch (preference) {
          case EMAIL: return new EmailNotificationStrategy();
          case SMS: return new SMSNotificationStrategy();
          case WHATSAPP: return new WhatsAppNotificationStrategy();
          default: throw new Exception("Unsupported notification preference.");
      }
  }
}

// NotificationService.java
public class NotificationService {
  public void notifyUser(User user, String message) {
      try {
          NotificationStrategy strategy = NotificationFactory.getNotificationStrategy(user.getPreference());
          strategy.sendNotification(user, message);
      } catch (Exception e) {
          System.err.println("Notification failure: " + e.getMessage());
      }
  }
}

// CreditCardNotification.java
public class CreditCardNotification {
  public static void main(String[] args) {
      User user = new User(); // Assume user is properly initialized with preference, email, etc.
      NotificationService service = new NotificationService();
      String message = "Hey " + user.getFirstName() + ", you have successfully registered. Here is your reference for future use.";
      service.notifyUser(user, message);
  }
}

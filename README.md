
## Setup

### Prerequisites

- Java JDK 11 or higher
- Maven
- Appium 2.x
- Android SDK (for Android tests)
- Xcode (for iOS tests)

### Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/your-username/amazon-mobile-automation.git
    cd amazon-mobile-automation
    ```

2. Install dependencies:
    ```sh
    mvn clean install
    ```

3. Start the Appium server:
    ```sh
    appium
    ```

## Running Tests

### Android Tests

1. Connect your Android device or start an Android emulator.
2. Run the tests:
    ```sh
    mvn test -Dtest=HomeTest
    ```

### iOS Tests

1. Connect your iOS device or start an iOS simulator.
2. Run the tests:
    ```sh
    mvn test -Dtest=HomeTest -Dplatform=ios
    ```

## Contributing

1. Fork the repository.
2. Create a new branch (`git checkout -b feature/your-feature`).
3. Make your changes.
4. Commit and push (`git commit -am 'Add new feature'` and `git push origin feature/your-feature`).
5. Create a Pull Request.


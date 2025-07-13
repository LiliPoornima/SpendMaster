## Project Structure

```text
app/
└── src/
    └── main/
        └── java/
            └── com/
                └── example/
                    └── spendmasterr/
                        ├── ui/         # UI components and activities
                        │   └── analytics/  # Analytics-related screens
                        ├── data/       # Data layer: DAOs, entities, converters
                        │   ├── dao/
                        │   ├── converter/
                        │   └── entity/
                        └── utils/      # Utility classes and helpers
        └── res/
            └── mipmap-*                # App icons
            └── layout/                 # Layout XML files
            └── values/                 # Strings, colors, styles
```

### Setup

1. **Clone the repository:**
   ```sh
   git clone https://github.com/yourusername/SpendMaster.git
   cd SpendMaster
   ```

2. **Open in Android Studio:**
   - Select `File > Open` and choose the project directory.

3. **Build the project:**
   - Click "Sync Project with Gradle Files"
   - Build and run on an emulator or physical device.

## Dependencies

- [AndroidX Core](https://developer.android.com/jetpack/androidx/releases/core)
- [AppCompat](https://developer.android.com/jetpack/androidx/releases/appcompat)
- [Material Components](https://material.io/develop/android)
- [ConstraintLayout](https://developer.android.com/jetpack/androidx/releases/constraintlayout)
- [Room Database](https://developer.android.com/jetpack/androidx/releases/room) *(planned)*
- [JUnit](https://junit.org/junit4/) (for unit testing)
- [Espresso](https://developer.android.com/training/testing/espresso) (for UI testing)

## Contributing

Contributions are welcome! Please open issues or submit pull requests for new features, bug fixes, or improvements.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---


#  CHANGELOG

All notable changes to this project will be documented in this file.

### Added
  - Implemented all six creational design patterns in `/creational_patterns`
  - Simple Factory for Desk creation
  - Factory Method for Booking processing
  - Abstract Factory for UI components
  - Builder for Room construction
  - Prototype for Desk cloning
  - Singleton for DatabaseConnection
  - Unit tests for all six creational patterns
  - Manual test verification complete
  - Added unit tests for all patterns in `/tests` directory
  - Linked pattern implementations to project board and issues
 - Updated README with justifications and pattern explanations

### Fixed
- Minor bug in Builder pattern (null Room name)
- Prototype cloning was returning shallow copies — updated to deep copy

### Changed
- Refactored Singleton to use thread-safe lazy initialization

---

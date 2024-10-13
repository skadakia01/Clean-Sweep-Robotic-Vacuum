# Clean-Sweep-Robotic-Vacuum

This project is a part of the SE-359/459 Agile Software Development course. It focuses on developing a control system for the Clean Sweep robotic vacuum cleaner and a sensor simulator. The Clean Sweep is designed to autonomously clean a typical home by navigating obstacles, detecting surfaces, and managing its battery life and dirt capacity.

**Features**
**1. Control System**
**• Navigation:** The system enables the Clean Sweep to traverse a home using directional sensors, avoiding obstacles, and detecting stairs.
**• Dirt Detection and Cleaning:** The vacuum automatically adjusts to different surfaces (bare floors, low-pile, high-pile carpets) and cleans as it moves. It tracks dirt levels and returns to its charging station when its capacity is full.
**• Power Management:** The battery life is managed based on the surface type, and the system ensures that the vacuum returns to its base before running out of power.
**• Diagnostics & Troubleshooting:** A log of activities (sensor checks, movements, cleaning, and power levels) is maintained for debugging and support.

**2. Sensor Simulator**
• **Floor Plan Simulation:** Simulates the sensor array of the Clean Sweep and allows testing on predefined home layouts.
• **Dynamic Environment:** The sensor detects different surfaces and obstacles in real-time, helping the control system navigate and clean efficiently.

**Project Structure**
**• Control System: **Implements the logic for navigation, dirt detection, and power management.
**• Sensor Simulator:** Provides virtual input based on home layouts, simulating real-world conditions for the Clean Sweep.

**Development Approach**
The project follows Agile methodologies, including Scrum ceremonies like sprint planning, daily stand-ups, and retrospectives. Continuous integration, source control (GitHub), and automated testing (JUnit/Mockito) are employed throughout the project.

**Technologies Used**
• Java (JDK)
• Trello for backlog management
• GitHub for version control
• Travis CI for continuous integration

**How to Run**
1. Clone the repository.
2. Follow the setup instructions in the project documentation to run the control system and sensor simulator.

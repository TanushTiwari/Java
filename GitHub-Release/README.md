# 🎓 DSA Learning Hub - Complete Collection

[![Java](https://img.shields.io/badge/Java-17+-orange.svg)](https://www.oracle.com/java/)
[![Platform](https://img.shields.io/badge/Platform-Windows-blue.svg)](https://www.microsoft.com/windows)
[![License](https://img.shields.io/badge/License-MIT-green.svg)](LICENSE)
[![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg)](https://github.com/TanushTiwari/Java/pulls)

> **Complete collection of Data Structures and Algorithms programs for educational purposes**  
> Interactive menu-driven programs for Pattern Advanced and Sorting Algorithms

## 🎯 Overview

This repository contains a comprehensive collection of DSA (Data Structures and Algorithms) programs designed for educational purposes. It includes **Pattern Advanced Programs** and **Sorting Algorithms** with an interactive, menu-driven interface.

## 📸 Screenshots

```
===============================================
         DSA LEARNING HUB - COMPLETE
===============================================
          Pattern Advanced & Sorting
===============================================

🎯 MAIN CATEGORIES:

1. 🎨 Pattern Advanced Programs (9 Types)
2. 🔄 Sorting Algorithms (7 Types)
3. 📚 View Documentation
4. ℹ️  About This Collection
5. 🚪 Exit

===============================================
```

## 🚀 Quick Start

### Prerequisites
- **Java JDK 8+** installed and added to PATH
- **Windows OS** (for .bat files) or any OS with Java support

### Installation & Usage

1. **Clone or Download:**
   ```bash
   git clone https://github.com/TanushTiwari/Java.git
   ```

2. **Navigate to directory:**
   ```bash
   cd "Java"
   ```

3. **Run the main launcher:**
   - **Windows**: Double-click `DSA-Complete-Hub.bat`
   - **Cross-platform**: Run `java PatternAdvanceMenu` or `java SortingMenu`

## 📚 Program Categories

### 🎨 Pattern Advanced Programs (9 Types)

| Pattern | Description | Complexity |
|---------|-------------|------------|
| **Butterfly Pattern** | Creates butterfly shape with stars | O(n²) |
| **Diamond Pattern** | Creates diamond shape | O(n²) |
| **Floyd's Triangle** | Numbers arranged in triangular pattern | O(n²) |
| **Hollow Rhombus** | Rhombus with hollow interior | O(n²) |
| **Hollow Rectangle** | Rectangle with hollow center | O(n×m) |
| **Inverted Half Pyramid** | Inverted triangle of stars | O(n²) |
| **Inverted Rotated Half Pyramid** | Right-aligned inverted triangle | O(n²) |
| **Rhombus Pattern** | Solid rhombus shape | O(n²) |
| **Triangle with 0s and 1s** | Alternating 0 and 1 pattern | O(n²) |

### 🔄 Sorting Algorithms (7 Types)

| Algorithm | Best Case | Average Case | Worst Case | Space | Stable |
|-----------|-----------|--------------|------------|-------|--------|
| **Bubble Sort** | O(n) | O(n²) | O(n²) | O(1) | ✅ |
| **Selection Sort** | O(n²) | O(n²) | O(n²) | O(1) | ❌ |
| **Insertion Sort** | O(n) | O(n²) | O(n²) | O(1) | ✅ |
| **Counting Sort** | O(n+k) | O(n+k) | O(n+k) | O(k) | ✅ |
| **Quick Sort** | O(n log n) | O(n log n) | O(n²) | O(log n) | ❌ |
| **Merge Sort** | O(n log n) | O(n log n) | O(n log n) | O(n) | ✅ |
| **Arrays.sort()** | O(n log n) | O(n log n) | O(n log n) | O(log n) | ✅ |

## 🗂️ File Structure

```
📁 Java/
├── 📄 DSA-Complete-Hub.bat          # 🚀 MAIN LAUNCHER
├── 📄 README.md                     # This file
├── 📄 .gitignore                    # Git ignore rules
├── 📄 PatternAdvanceMenu.java       # Pattern programs source
├── 📄 SortingMenu.java              # Sorting algorithms source
├── 📄 PatternAdvanceMenu.class      # Compiled pattern class
├── 📄 SortingMenu.class             # Compiled sorting class
├── 📁 executables/                  # Ready-to-run files
│   ├── 📄 DSA-Programs.bat          # Executables launcher
│   ├── 📄 PatternAdvance.bat        # Pattern executable
│   ├── 📄 SortingAlgorithms.bat     # Sorting executable
│   ├── 📄 PatternAdvanceMenu.jar    # Pattern JAR file
│   ├── 📄 SortingMenu.jar           # Sorting JAR file
│   └── 📄 README.md                 # Executables documentation
└── 📁 ALPHA5/                       # Individual program files
    ├── 📁 PatternAdvance/           # Individual pattern files
    └── 📁 Sorting/                  # Individual sorting files
```

## 🎮 Usage Guide

### Running Programs

1. **Main Launcher (Recommended)**:
   ```bash
   # Windows
   DSA-Complete-Hub.bat
   
   # Cross-platform
   java -cp . PatternAdvanceMenu
   java -cp . SortingMenu
   ```

2. **Direct Execution**:
   ```bash
   cd executables
   DSA-Programs.bat           # Main menu
   PatternAdvance.bat         # Pattern programs only
   SortingAlgorithms.bat      # Sorting programs only
   ```

### Input Guidelines

- **For Pattern Programs**: Enter the number of lines/rows when prompted
- **For Sorting Programs**: 
  1. Enter array size
  2. Enter array elements separated by spaces
- **Navigation**: Use menu numbers to navigate
- **Exit**: Choose exit option from any menu

## 🛠️ Development

### Building from Source

```bash
# Compile Java files
javac PatternAdvanceMenu.java
javac SortingMenu.java

# Create JAR files
jar cfe PatternAdvanceMenu.jar PatternAdvanceMenu PatternAdvanceMenu.class
jar cfe SortingMenu.jar SortingMenu SortingMenu.class

# Run programs
java PatternAdvanceMenu
java SortingMenu
```

### Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📝 Examples

### Pattern Example - Butterfly
```
*      *
**    **
***  ***
********
********
***  ***
**    **
*      *
```

### Sorting Example - Bubble Sort
```
Original Array: [64, 34, 25, 12, 22, 11, 90]
Sorted Array:   [11, 12, 22, 25, 34, 64, 90]
```

## 🎓 Educational Features

- **Interactive Learning**: Step-by-step execution
- **Visual Output**: Clear pattern displays and sorted arrays
- **Algorithm Analysis**: Time and space complexity information
- **Multiple Approaches**: Different algorithms for comparison
- **Beginner Friendly**: Clear instructions and error handling

## 🔧 System Requirements

- **Java**: JDK/JRE 8 or higher
- **OS**: Windows (for .bat files), Linux/Mac (for Java files)
- **Memory**: Minimal (< 50MB)
- **Disk Space**: < 10MB

## 📜 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🤝 Acknowledgments

- **Educational Purpose**: Designed for DSA learning
- **Student Friendly**: Clear, commented code
- **Open Source**: Free for educational use
- **Community Driven**: Welcome contributions

## 📞 Support

- **Issues**: [GitHub Issues](https://github.com/TanushTiwari/Java/issues)
- **Discussions**: [GitHub Discussions](https://github.com/TanushTiwari/Java/discussions)
- **Email**: [Create an issue for contact]

## 🏷️ Tags

`java` `data-structures` `algorithms` `sorting` `patterns` `educational` `dsa` `learning` `interactive` `menu-driven` `student-friendly` `open-source`

---

<div align="center">

**⭐ Star this repository if it helped you learn DSA concepts! ⭐**

Made with ❤️ for DSA learners

</div>
